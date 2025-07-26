/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.service.impl;

import com.emporiumz.venta.venta_springboot.domain.DetalleFactura;
import com.emporiumz.venta.venta_springboot.repository.DetalleFacturaRepository;
import com.emporiumz.venta.venta_springboot.service.DetalleFacturaService;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Implementación de DetalleFacturaService con JPA.
 */
@Service
public class DetalleFacturaServiceImpl implements DetalleFacturaService {
    private final DetalleFacturaRepository repo;
    public DetalleFacturaServiceImpl(DetalleFacturaRepository repo) { this.repo = repo; }

    @Override public DetalleFactura crear(DetalleFactura d) { return repo.save(d); }
    @Override public List<DetalleFactura> listar()           { return repo.findAll(); }
    @Override public DetalleFactura actualizar(DetalleFactura d){return repo.save(d);}
    @Override public void eliminar(Integer id)               { repo.deleteById(id);}
}
