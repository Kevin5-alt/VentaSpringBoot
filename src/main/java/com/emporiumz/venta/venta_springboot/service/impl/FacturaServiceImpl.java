/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.service.impl;

import com.emporiumz.venta.venta_springboot.domain.Factura;
import com.emporiumz.venta.venta_springboot.repository.FacturaRepository;
import com.emporiumz.venta.venta_springboot.service.FacturaService;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Implementación de FacturaService usando JPA.
 */
@Service
public class FacturaServiceImpl implements FacturaService {
    private final FacturaRepository repo;
    public FacturaServiceImpl(FacturaRepository repo) { this.repo = repo; }

    @Override public Factura crear(Factura f)   { return repo.save(f); }
    @Override public List<Factura> listar()      { return repo.findAll(); }
    @Override public Factura actualizar(Factura f){ return repo.save(f); }
    @Override public void eliminar(Integer id)   { repo.deleteById(id); }
}

