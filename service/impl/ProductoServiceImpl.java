/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.service.impl;

import com.emporiumz.venta.venta_springboot.domain.Producto;
import com.emporiumz.venta.venta_springboot.repository.ProductoRepository;
import com.emporiumz.venta.venta_springboot.service.ProductoService;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Implementación de ProductoService con JPA.
 */
@Service
public class ProductoServiceImpl implements ProductoService {
    private final ProductoRepository repo;
    public ProductoServiceImpl(ProductoRepository repo) { this.repo = repo; }

    @Override public Producto crear(Producto p)      { return repo.save(p); }
    @Override public List<Producto> listar()          { return repo.findAll(); }
    @Override public Producto actualizar(Producto p) { return repo.save(p); }
    @Override public void eliminar(Integer id)        { repo.deleteById(id); }
}

