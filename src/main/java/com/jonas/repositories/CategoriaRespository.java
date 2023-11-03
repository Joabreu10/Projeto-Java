package com.jonas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jonas.domain.Categoria;

@Repository
public interface CategoriaRespository extends JpaRepository<Categoria, Integer> {

}
