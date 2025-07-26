/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.service.impl;

import com.emporiumz.venta.venta_springboot.domain.Logistica;
import com.emporiumz.venta.venta_springboot.repository.LogisticaRepository;
import com.emporiumz.venta.venta_springboot.service.LogisticaService;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Implementación de LogisticaService usando JPA.
 */
@Service
public class LogisticaServiceImpl implements LogisticaService {
    private final LogisticaRepository repo;
    public LogisticaServiceImpl(LogisticaRepository repo) { this.repo = repo; }

    @Override public Logistica crear(Logistica l)    { return repo.save(l); }
    @Override public List<Logistica> listar()        { return repo.findAll(); }
    @Override public Logistica actualizar(Logistica l){ return repo.save(l); }
    @Override public void eliminar(Integer id)       { repo.deleteById(id); }
}

