/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.service;

import com.emporiumz.venta.venta_springboot.domain.Inventario;
import java.util.List;

/**
 * CRUD para la entidad Inventario.
 */
public interface InventarioService {
    Inventario crear(Inventario inv);
    List<Inventario> listar();
    Inventario actualizar(Inventario inv);
    void eliminar(Integer id);
}

