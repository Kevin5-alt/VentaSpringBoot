/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.service.impl;

import com.emporiumz.venta.venta_springboot.domain.EstrategiaInternacionalizacion;
import com.emporiumz.venta.venta_springboot.repository.EstrategiaInternacionalizacionRepository;
import com.emporiumz.venta.venta_springboot.service.EstrategiaInternacionalizacionService;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Implementación de EstrategiaInternacionalizacionService con JPA.
 */
@Service
public class EstrategiaInternacionalizacionServiceImpl implements EstrategiaInternacionalizacionService {
    private final EstrategiaInternacionalizacionRepository repo;
    public EstrategiaInternacionalizacionServiceImpl(EstrategiaInternacionalizacionRepository repo) {
        this.repo = repo;
    }

    public EstrategiaInternacionalizacion crear(EstrategiaInternacionalizacion e){return repo.save(e);}
    public List<EstrategiaInternacionalizacion> listar()                      {return repo.findAll();}
    public EstrategiaInternacionalizacion actualizar(EstrategiaInternacionalizacion e){return repo.save(e);}
    public void eliminar(Integer id)                                          {repo.deleteById(id);}
}


