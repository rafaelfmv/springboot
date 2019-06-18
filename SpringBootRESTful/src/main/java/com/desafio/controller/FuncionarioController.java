package com.desafio.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.desafio.model.Funcionario;
import com.desafio.service.FuncionarioService;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@RequestMapping(value = "/desafios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/about", 
            method = RequestMethod.GET)
    public ResponseEntity getAbout() {
        return ResponseEntity.ok(funcionarioService.getAbout());
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/funcionario/{ID}", 
            method = RequestMethod.GET)
    public Funcionario getFuncionario(@PathVariable("id") int id) {
        return funcionarioService.getFuncionario(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/funcionarios", 
            method = RequestMethod.GET)
    public List<Funcionario> getFuncionarios() {
        return funcionarioService.getFuncionarios();
    }
   
    @RequestMapping(value = "/salarios", 
            method = RequestMethod.GET)
    public ResponseEntity<Map<String, Double>> getSalarios() {
        return new ResponseEntity<>(funcionarioService.getSalarios(), 
                HttpStatus.OK);
    }
    
    @RequestMapping(value = "/salario/{ID}", 
            method = RequestMethod.GET)
    public ResponseEntity<Map<String, Double>> getSalario(@PathVariable("id") int id) {
        return new ResponseEntity<>(funcionarioService.getSalario(id), 
                HttpStatus.OK);
    }
}
