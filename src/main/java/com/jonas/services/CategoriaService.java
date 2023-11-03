package com.jonas.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jonas.domain.Categoria;
import com.jonas.repositories.CategoriaRespository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRespository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id); 
		return obj.orElse(null); 
	}
	
//	public Categoria salvar(Integer id) {
//		Optional<Categoria> obj = repo.saveAll(id);
//		return obj.orElse(null);
//	}

}
