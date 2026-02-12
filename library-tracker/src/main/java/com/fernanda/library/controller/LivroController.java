package com.fernanda.library.controller;

import com.fernanda.library.model.Livro;
import com.fernanda.library.repository.LivroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
@CrossOrigin //Permite que o react converse com o java

//Essa classe serve para receber os "pedidos" do front
public class LivroController {

    @Autowired // injeção automatica de dependencia e Evita o new
    private LivroRepository repository;

    //Listar todos os livros
    @GetMapping
    public List<Livro> listarTodos(){
        return repository.findAll(); //busca tudo no banco
    }

    @PostMapping
    public Livro cadastrar(@RequestBody Livro livro) {
        return repository.save(livro); //salvar no banco
    }


}
