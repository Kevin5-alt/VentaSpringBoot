/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.controller;

import com.emporiumz.venta.venta_springboot.domain.DetalleFactura;
import com.emporiumz.venta.venta_springboot.service.DetalleFacturaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/detallefactura")
public class DetalleFacturaController {

    private final DetalleFacturaService service;

    public DetalleFacturaController(DetalleFacturaService service) {
        this.service = service;
    }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("items", service.listar());
        return "detallefactura/list";
    }

    @GetMapping("/nuevo")
    public String createForm(Model model) {
        model.addAttribute("item", new DetalleFactura());
        return "detallefactura/form";
    }

    @PostMapping("/guardar")
    public String save(@ModelAttribute("item") DetalleFactura df) {
        service.crear(df);
        return "redirect:/detallefactura";
    }

    @GetMapping("/editar/{id}")
    public String editForm(@PathVariable Integer id, Model model) {
        DetalleFactura df = service.listar().stream()
            .filter(x -> x.getIdDetalleFactura().equals(id))
            .findFirst()
            .orElse(new DetalleFactura());
        model.addAttribute("item", df);
        return "detallefactura/form";
    }

    @GetMapping("/eliminar/{id}")
    public String delete(@PathVariable Integer id) {
        service.eliminar(id);
        return "redirect:/detallefactura";
    }
}

