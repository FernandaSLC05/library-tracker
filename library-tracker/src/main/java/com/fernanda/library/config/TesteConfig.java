package com.fernanda.library.config;

import com.fernanda.library.model.FormatoLivro;
import com.fernanda.library.model.Livro;
import com.fernanda.library.model.StatusLeitura;
import com.fernanda.library.repository.LivroRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration //Diz pro spring que isso é uma configuração de teste
public class TesteConfig {
    @Bean
    public CommandLineRunner executar(LivroRepository repository) {
        return args -> {
            Livro livro1 = new Livro();
            livro1.setTitulo("O senhor dos aneis");
            livro1.setAutor("J.R.R Tolkien");
            livro1.setStatus(StatusLeitura.QUERO_LER);
            livro1.setFormato(FormatoLivro.FISICO);
            livro1.setPaginasTotais(1200);

            repository.save(livro1); //salva no banco
        };
    }
}