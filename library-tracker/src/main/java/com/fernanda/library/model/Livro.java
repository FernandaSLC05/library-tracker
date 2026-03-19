package com.fernanda.library.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_livros")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String autor;
    private int paginasTotais;

    // NOVO: Campo para guardar o link da imagem da capa
    // Usamos Column(length = 500) porque links do Google podem ser bem grandes.
    @Column(length = 500)
    private String capaUrl;

    @Enumerated(EnumType.STRING)
    private StatusLeitura status;

    @Enumerated(EnumType.STRING)
    private FormatoLivro formato;

    public Livro() {
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginasTotais() {
        return paginasTotais;
    }

    public void setPaginasTotais(int paginasTotais) {
        this.paginasTotais = paginasTotais;
    }

    public String getCapaUrl() {
        return capaUrl;
    }

    public void setCapaUrl(String capaUrl) {
        this.capaUrl = capaUrl;
    }

    public StatusLeitura getStatus() {
        return status;
    }

    public void setStatus(StatusLeitura status) {
        this.status = status;
    }

    public FormatoLivro getFormato() {
        return formato;
    }

    public void setFormato(FormatoLivro formato) {
        this.formato = formato;
    }
}
