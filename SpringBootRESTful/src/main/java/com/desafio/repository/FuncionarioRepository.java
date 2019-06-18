package com.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.model.Funcionario;

@Repository("funcionarioRepository")
public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {
}
