/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.controller;

import com.emporiumz.venta.venta_springboot.domain.ProductoEstrategia;
import com.emporiumz.venta.venta_springboot.service.ProductoEstrategiaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/productoestrategia")
public class ProductoEstrategiaController {

    private final ProductoEstrategiaService service;

    public ProductoEstrategiaController(ProductoEstrategiaService service) {
        this.service = service;
    }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("items", service.listar());
        return "productoestrategia/list";
    }

    @GetMapping("/nuevo")
    public String createForm(Model model) {
        model.addAttribute("item", new ProductoEstrategia());
        return "productoestrategia/form";
    }

    @PostMapping("/guardar")
    public String save(@ModelAttribute("item") ProductoEstrategia pe) {
        service.crear(pe);
        return "redirect:/productoestrategia";
    }

    @GetMapping("/editar/{id}")
    public String editForm(@PathVariable Integer id, Model model) {
        ProductoEstrategia pe = service.listar().stream()
            .filter(x -> x.getIdProductoEstrategia().equals(id))
            .findFirst()
            .orElse(new ProductoEstrategia());
        model.addAttribute("item", pe);
        return "productoestrategia/form";
    }

    @GetMapping("/eliminar/{id}")
    public String delete(@PathVariable Integer id) {
        service.eliminar(id);
        return "redirect:/productoestrategia";
    }
}


