package com.fernanda.library.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity         //Vira uma tabela no banco
@Data           //cria geters e seters automaticamente

public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String autor;

    //Avisa o banco para salvar o texto como "LENDO" e não 0.
    @Enumerated(EnumType.STRING)
    private StatusLeitura status;

    @Enumerated(EnumType.STRING)
    private FormatoLivro formato;

    private Integer paginasTotais;
    private Integer paginasLidas;

}
