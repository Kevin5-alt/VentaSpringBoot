/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.service.impl;

import com.emporiumz.venta.venta_springboot.domain.Oferta;
import com.emporiumz.venta.venta_springboot.repository.OfertaRepository;
import com.emporiumz.venta.venta_springboot.service.OfertaService;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Implementación de OfertaService usando JPA.
 */
@Service
public class OfertaServiceImpl implements OfertaService {
    private final OfertaRepository repo;
    public OfertaServiceImpl(OfertaRepository repo) { this.repo = repo; }

    @Override public Oferta crear(Oferta o)         { return repo.save(o); }
    @Override public List<Oferta> listar()           { return repo.findAll(); }
    @Override public Oferta actualizar(Oferta o)     { return repo.save(o); }
    @Override public void eliminar(Integer id)       { repo.deleteById(id); }
}

