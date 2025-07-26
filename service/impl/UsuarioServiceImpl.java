/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.service.impl;


import com.emporiumz.venta.venta_springboot.domain.Usuario;
import com.emporiumz.venta.venta_springboot.repository.UsuarioRepository;
import com.emporiumz.venta.venta_springboot.service.UsuarioService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository repo;

    public UsuarioServiceImpl(UsuarioRepository repo) {
        this.repo = repo;
    }

    @Override
    public Usuario crear(Usuario usuario) {
        return repo.save(usuario);
    }

    @Override
    public List<Usuario> listar() {
        return repo.findAll();
    }

    @Override
    public Usuario actualizar(Usuario usuario) {
        return repo.save(usuario);
    }

    @Override
    public void eliminar(Integer id) {
        repo.deleteById(id);
    }
}

