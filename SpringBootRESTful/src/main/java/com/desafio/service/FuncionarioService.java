package com.desafio.service;

import java.util.List;

import com.desafio.model.Funcionario;
import java.util.Map;
import org.springframework.http.ResponseEntity;

public interface FuncionarioService {

    String getAbout();
    Funcionario getFuncionario(int id);
    List<Funcionario> getFuncionarios();
    Map<String, Double> getSalarios();
    Map<String, Double> getSalario(int id);
}
