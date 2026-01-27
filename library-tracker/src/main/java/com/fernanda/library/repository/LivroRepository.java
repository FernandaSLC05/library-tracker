package com.fernanda.library.repository;

import com.fernanda.library.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

//extends JpaRepository é para criar automaticamente todos os SQLs deletar, buscar, salvar e atualizar
public interface LivroRepository extends JpaRepository<Livro, Long> {
}
