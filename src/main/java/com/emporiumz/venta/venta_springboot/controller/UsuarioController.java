/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.controller;

import com.emporiumz.venta.venta_springboot.domain.Usuario;
import com.emporiumz.venta.venta_springboot.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("items", service.listar());
        return "usuarios/list";
    }

    @GetMapping("/nuevo")
    public String createForm(Model model) {
        model.addAttribute("item", new Usuario());
        return "usuarios/form";
    }

    @PostMapping("/guardar")
    public String save(@ModelAttribute("item") Usuario usuario) {
        service.crear(usuario);
        return "redirect:/usuarios";
    }

    @GetMapping("/editar/{id}")
    public String editForm(@PathVariable Integer id, Model model) {
        Usuario u = service.listar().stream()
            .filter(x -> x.getIdUsuario().equals(id))
            .findFirst()
            .orElse(new Usuario());
        model.addAttribute("item", u);
        return "usuarios/form";
    }

    @GetMapping("/eliminar/{id}")
    public String delete(@PathVariable Integer id) {
        service.eliminar(id);
        return "redirect:/usuarios";
    }
}

