package com.desafio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.desafio.model.Funcionario;
import com.desafio.repository.FuncionarioRepository;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration
public class DesafioApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner setup(FuncionarioRepository funcionarioRepository) {
		return (args) -> {
			funcionarioRepository.save(new Funcionario("Rafael", "Favaro", 
                                "123455667", new Integer("19"), new Integer("123456"),
                                "desenvolvedor", new Double("11000")));
                        funcionarioRepository.save(new Funcionario("Joao", "Silva", 
                                "123455667", new Integer("19"), new Integer("123456"),
                                "desenvolvedor", new Double("12000")));
		};
	}
}
