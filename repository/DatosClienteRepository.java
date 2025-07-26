/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.repository;

import com.emporiumz.venta.venta_springboot.domain.DatosCliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Maneja persistencia de información de contacto y perfil de usuario.
 */
public interface DatosClienteRepository extends JpaRepository<DatosCliente, Integer> {

    /**
     * Recupera todos los datos de cliente de un usuario específico.
     * @param usuarioId
     * @return 
     */
    List<DatosCliente> findByUsuarioId(Integer usuarioId);
}

