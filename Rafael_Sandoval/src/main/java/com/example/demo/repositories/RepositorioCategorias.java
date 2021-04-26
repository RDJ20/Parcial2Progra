package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Categoria;


public interface RepositorioCategorias extends CrudRepository<Categoria, Long>{

}
