/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.service.impl;

import com.emporiumz.venta.venta_springboot.domain.ProductoEstrategia;
import com.emporiumz.venta.venta_springboot.repository.ProductoEstrategiaRepository;
import com.emporiumz.venta.venta_springboot.service.ProductoEstrategiaService;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Implementación de ProductoEstrategiaService con JPA.
 */
@Service
public class ProductoEstrategiaServiceImpl implements ProductoEstrategiaService {
    private final ProductoEstrategiaRepository repo;
    public ProductoEstrategiaServiceImpl(ProductoEstrategiaRepository repo) { this.repo = repo; }

    @Override public ProductoEstrategia crear(ProductoEstrategia p){return repo.save(p);}
    @Override public List<ProductoEstrategia> listar()               {return repo.findAll();}
    @Override public ProductoEstrategia actualizar(ProductoEstrategia p){return repo.save(p);}
    @Override public void eliminar(Integer id)                       {repo.deleteById(id);}
}

