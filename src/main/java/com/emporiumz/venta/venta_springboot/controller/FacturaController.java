/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.controller;

import com.emporiumz.venta.venta_springboot.domain.Factura;
import com.emporiumz.venta.venta_springboot.service.FacturaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/facturas")
public class FacturaController {

    private final FacturaService service;

    public FacturaController(FacturaService service) {
        this.service = service;
    }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("items", service.listar());
        return "factura/list";
    }

    @GetMapping("/nuevo")
    public String createForm(Model model) {
        model.addAttribute("item", new Factura());
        return "factura/form";
    }

    @PostMapping("/guardar")
    public String save(@ModelAttribute("item") Factura f) {
        service.crear(f);
        return "redirect:/facturas";
    }

    @GetMapping("/editar/{id}")
    public String editForm(@PathVariable Integer id, Model model) {
        Factura f = service.listar().stream()
            .filter(x -> x.getIdFactura().equals(id))
            .findFirst()
            .orElse(new Factura());
        model.addAttribute("item", f);
        return "factura/form";
    }

    @GetMapping("/eliminar/{id}")
    public String delete(@PathVariable Integer id) {
        service.eliminar(id);
        return "redirect:/facturas";
    }
}

