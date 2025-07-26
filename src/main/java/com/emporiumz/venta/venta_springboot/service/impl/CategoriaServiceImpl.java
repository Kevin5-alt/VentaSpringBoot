/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.service.impl;

import com.emporiumz.venta.venta_springboot.domain.Categoria;
import com.emporiumz.venta.venta_springboot.repository.CategoriaRepository;
import com.emporiumz.venta.venta_springboot.service.CategoriaService;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Implementación de CategoriaService con Spring Data.
 */
@Service
public class CategoriaServiceImpl implements CategoriaService {
    private final CategoriaRepository repo;
    public CategoriaServiceImpl(CategoriaRepository repo) { this.repo = repo; }

    @Override public Categoria crear(Categoria c)    { return repo.save(c); }
    @Override public List<Categoria> listar()         { return repo.findAll(); }
    @Override public Categoria actualizar(Categoria c){ return repo.save(c); }
    @Override public void eliminar(Integer id)        { repo.deleteById(id); }
}
