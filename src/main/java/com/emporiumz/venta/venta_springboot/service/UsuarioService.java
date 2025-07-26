/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.service;

import com.emporiumz.venta.venta_springboot.domain.Usuario;
import java.util.List;

/**
 * CRUD para la entidad Usuario.
 */
public interface UsuarioService {
    Usuario crear(Usuario usuario);
    List<Usuario> listar();
    Usuario actualizar(Usuario usuario);
    void eliminar(Integer id);
}

