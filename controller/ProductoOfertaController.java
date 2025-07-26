/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.controller;

import com.emporiumz.venta.venta_springboot.domain.ProductoOferta;
import com.emporiumz.venta.venta_springboot.service.ProductoOfertaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/productooferta")
public class ProductoOfertaController {

    private final ProductoOfertaService service;

    public ProductoOfertaController(ProductoOfertaService service) {
        this.service = service;
    }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("items", service.listar());
        return "productooferta/list";
    }

    @GetMapping("/nuevo")
    public String createForm(Model model) {
        model.addAttribute("item", new ProductoOferta());
        return "productooferta/form";
    }

    @PostMapping("/guardar")
    public String save(@ModelAttribute("item") ProductoOferta po) {
        service.crear(po);
        return "redirect:/productooferta";
    }

    @GetMapping("/editar/{id}")
    public String editForm(@PathVariable Integer id, Model model) {
        ProductoOferta po = service.listar().stream()
            .filter(x -> x.getIdProductoOferta().equals(id))
            .findFirst()
            .orElse(new ProductoOferta());
        model.addAttribute("item", po);
        return "productooferta/form";
    }

    @GetMapping("/eliminar/{id}")
    public String delete(@PathVariable Integer id) {
        service.eliminar(id);
        return "redirect:/productooferta";
    }
}

