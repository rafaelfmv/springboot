package com.desafio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.model.Funcionario;
import com.desafio.repository.FuncionarioRepository;
import java.util.HashMap;
import java.util.Map;
import org.springframework.http.ResponseEntity;

@Service("funcionarioService")
public class FuncionarioServiceImpl implements FuncionarioService {

    @Autowired
    FuncionarioRepository funcionarioRepository;

    @Override
    public String getAbout() {
        return "Ola, sou Rafael Favaro Martins Vianna, desenvolvedor de software";
    }

    @Override
    public Funcionario getFuncionario(int id) {
        return funcionarioRepository.findOne(id);
    }

    @Override
    public List<Funcionario> getFuncionarios() {
        return funcionarioRepository.findAll();
    }

    @Override
    public Map<String, Double> getSalario(int id) {
    Map<String, Double> result = new HashMap<>();
        result.put(funcionarioRepository.findOne(id).getNome()
                + " " + funcionarioRepository.findOne(id).getSobrenome(),
                funcionarioRepository.findOne(id).getSalario());
        return result;
    }

    @Override
    public Map<String, Double> getSalarios() {
        Map<String, Double> result = new HashMap<>();

        Double soma = funcionarioRepository.findAll()
                .stream()
                .map(x -> x.getSalario())
                .reduce(0.0, Double::sum);
        
        result.put("Salarios", soma);
        return result;      
    }
}
