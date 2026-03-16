package com.fernanda.library.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fernanda.library.model.FormatoLivro;
import com.fernanda.library.model.Livro;
import com.fernanda.library.model.StatusLeitura;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GoogleBooksService {

    public Livro buscarLivroNaApi(String tituloDesejado) {
        String url = "https://www.googleapis.com/books/v1/volumes?q=intitle:" + tituloDesejado;

        // O bloco TRY agora protege TUDO, desde a conexão com a internet até a leitura
        try {
            RestTemplate restTemplate = new RestTemplate();
            String respostaGoogle = restTemplate.getForObject(url, String.class);

            ObjectMapper mapper = new ObjectMapper();
            JsonNode raiz = mapper.readTree(respostaGoogle);
            JsonNode itens = raiz.path("items");

            if (itens.isMissingNode() || !itens.isArray() || itens.isEmpty()) {
                return null;
            }

            JsonNode volumeInfo = itens.get(0).path("volumeInfo");

            Livro livro = new Livro();
            livro.setTitulo(volumeInfo.path("title").asText("Título desconhecido"));
            livro.setPaginasTotais(volumeInfo.path("pageCount").asInt(0));
            livro.setStatus(StatusLeitura.QUERO_LER);
            livro.setFormato(FormatoLivro.FISICO);

            JsonNode autores = volumeInfo.path("authors");
            if (autores.isArray() && !autores.isEmpty()) {
                livro.setAutor(autores.get(0).asText());
            } else {
                livro.setAutor("Autor desconhecido");
            }

            return livro;

        } catch (Exception e) {
            // Se o Google bloquear (429) ou der qualquer outro erro, o Java não quebra a tela (Erro 500)
            System.out.println("O Google bloqueou ou deu erro: " + e.getMessage());
            return null;
        }
    }
}
