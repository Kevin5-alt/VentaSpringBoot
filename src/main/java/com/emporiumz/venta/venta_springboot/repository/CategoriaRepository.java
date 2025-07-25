/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.repository;

import com.emporiumz.venta.venta_springboot.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Permite CRUD y búsquedas automáticas por nombre de categoría.
 */
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

    /**
     * Encuentra categorías cuyo nombre contenga el texto dado.
     * @param nombre
     * @return 
     */
    List<Categoria> findByNombreCategoriaContaining(String nombre);
}

