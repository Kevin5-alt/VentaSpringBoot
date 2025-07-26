/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.service;

import com.emporiumz.venta.venta_springboot.domain.Categoria;
import java.util.List;

/**
 * CRUD para la entidad Categoria.
 */
public interface CategoriaService {
    Categoria crear(Categoria cat);
    List<Categoria> listar();
    Categoria actualizar(Categoria cat);
    void eliminar(Integer id);
}

