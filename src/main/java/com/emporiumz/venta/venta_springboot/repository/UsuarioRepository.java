/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.repository;

import com.emporiumz.venta.venta_springboot.domain.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Proporciona operaciones CRUD, paginación y consultas derivadas sobre usuarios.
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    /**
     * Busca un usuario por su correo electrónico.
     */
    Optional<Usuario> findByEmail(String email);

    /**
     * Devuelve una página de usuarios ordenados.
     */
    Page<Usuario> findAll(Pageable pageable);
}


