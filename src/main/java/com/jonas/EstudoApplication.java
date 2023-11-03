package com.jonas;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jonas.domain.Categoria;
import com.jonas.repositories.CategoriaRespository;

@SpringBootApplication
public class EstudoApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRespository categoriaRespository;

	public static void main(String[] args) {
		SpringApplication.run(EstudoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null,"Informática");
		Categoria cat2 = new Categoria(null,"Escritório");
		
		categoriaRespository.saveAll(Arrays.asList(cat1, cat2));	
	}
}
