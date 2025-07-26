/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.service.impl;

import com.emporiumz.venta.venta_springboot.domain.DatosCliente;
import com.emporiumz.venta.venta_springboot.repository.DatosClienteRepository;
import com.emporiumz.venta.venta_springboot.service.DatosClienteService;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Implementación de DatosClienteService usando JPA.
 */
@Service
public class DatosClienteServiceImpl implements DatosClienteService {
    private final DatosClienteRepository repo;
    public DatosClienteServiceImpl(DatosClienteRepository repo) { this.repo = repo; }

    @Override public DatosCliente crear(DatosCliente d)     { return repo.save(d); }
    @Override public List<DatosCliente> listar()            { return repo.findAll(); }
    @Override public DatosCliente actualizar(DatosCliente d){ return repo.save(d); }
    @Override public void eliminar(Integer id)              { repo.deleteById(id); }
}

