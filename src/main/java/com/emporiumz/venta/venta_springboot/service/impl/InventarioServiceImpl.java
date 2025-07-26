/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.service.impl;

import com.emporiumz.venta.venta_springboot.domain.Inventario;
import com.emporiumz.venta.venta_springboot.repository.InventarioRepository;
import com.emporiumz.venta.venta_springboot.service.InventarioService;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Implementación de InventarioService con JPA.
 */
@Service
public class InventarioServiceImpl implements InventarioService {
    private final InventarioRepository repo;
    public InventarioServiceImpl(InventarioRepository repo) { this.repo = repo; }

    @Override public Inventario crear(Inventario i)     { return repo.save(i); }
    @Override public List<Inventario> listar()           { return repo.findAll(); }
    @Override public Inventario actualizar(Inventario i){ return repo.save(i); }
    @Override public void eliminar(Integer id)           { repo.deleteById(id); }
}

