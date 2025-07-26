/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.service.impl;

import com.emporiumz.venta.venta_springboot.domain.ProductoOferta;
import com.emporiumz.venta.venta_springboot.repository.ProductoOfertaRepository;
import com.emporiumz.venta.venta_springboot.service.ProductoOfertaService;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Implementación de ProductoOfertaService con JPA.
 */
@Service
public class ProductoOfertaServiceImpl implements ProductoOfertaService {
    private final ProductoOfertaRepository repo;
    public ProductoOfertaServiceImpl(ProductoOfertaRepository repo) { this.repo = repo; }

    @Override public ProductoOferta crear(ProductoOferta p) { return repo.save(p); }
    @Override public List<ProductoOferta> listar()           { return repo.findAll(); }
    @Override public ProductoOferta actualizar(ProductoOferta p){return repo.save(p);}
    @Override public void eliminar(Integer id)               { repo.deleteById(id);}
}
