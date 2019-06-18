package com.desafio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Funcionario")
public class Funcionario {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;    
    private String nome;
    private String sobrenome;
    private String cpf;
    private Integer ddd;
    private Integer celular;
    private String cargo;
    private Double salario;

    public Funcionario() {
        super();
    }

    public Funcionario(String nome, String sobrenome, String cpf, Integer ddd,
            Integer celular, String cargo, Double salario) {
        super();
        this.sobrenome = sobrenome;
        this.cpf = sobrenome;
        this.ddd = ddd;
        this.celular = celular;
        this.cargo = cargo;
        this.salario = salario;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getDdd() {
        return ddd;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    public Integer getCelular() {
        return celular;
    }

    public void setCelular(Integer celular) {
        this.celular = celular;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

}
