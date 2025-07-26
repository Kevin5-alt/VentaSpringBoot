/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.service;

import com.emporiumz.venta.venta_springboot.domain.DatosCliente;
import java.util.List;

/**
 * CRUD para la entidad DatosCliente.
 */
public interface DatosClienteService {
    DatosCliente crear(DatosCliente datos);
    List<DatosCliente> listar();
    DatosCliente actualizar(DatosCliente datos);
    void eliminar(Integer id);
}

