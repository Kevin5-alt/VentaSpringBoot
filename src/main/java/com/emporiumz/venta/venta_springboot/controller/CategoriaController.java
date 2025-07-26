/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.controller;

import com.emporiumz.venta.venta_springboot.domain.Categoria;
import com.emporiumz.venta.venta_springboot.service.CategoriaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {

    private final CategoriaService service;

    public CategoriaController(CategoriaService service) {
        this.service = service;
    }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("items", service.listar());
        return "categoria/list";
    }

    @GetMapping("/nuevo")
    public String createForm(Model model) {
        model.addAttribute("item", new Categoria());
        return "categoria/form";
    }

    @PostMapping("/guardar")
    public String save(@ModelAttribute("item") Categoria cat) {
        service.crear(cat);
        return "redirect:/categoria";
    }

    @GetMapping("/editar/{id}")
    public String editForm(@PathVariable Integer id, Model model) {
        Categoria c = service.listar().stream()
            .filter(x -> x.getIdCategoria().equals(id))
            .findFirst()
            .orElse(new Categoria());
        model.addAttribute("item", c);
        return "categoria/form";
    }

    @GetMapping("/eliminar/{id}")
    public String delete(@PathVariable Integer id) {
        service.eliminar(id);
        return "redirect:/categoria";
    }
}

