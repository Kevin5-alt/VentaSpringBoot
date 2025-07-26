/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.controller;

import com.emporiumz.venta.venta_springboot.domain.EstrategiaInternacionalizacion;
import com.emporiumz.venta.venta_springboot.service.EstrategiaInternacionalizacionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/estrategiainternacionalizacion")
public class EstrategiaInternacionalizacionController {

    private final EstrategiaInternacionalizacionService service;

    public EstrategiaInternacionalizacionController(EstrategiaInternacionalizacionService service) {
        this.service = service;
    }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("items", service.listar());
        return "estrategiainternacionalizacion/list";
    }

    @GetMapping("/nuevo")
    public String createForm(Model model) {
        model.addAttribute("item", new EstrategiaInternacionalizacion());
        return "estrategiainternacionalizacion/form";
    }

    @PostMapping("/guardar")
    public String save(@ModelAttribute("item") EstrategiaInternacionalizacion e) {
        service.crear(e);
        return "redirect:/estrategiainternacionalizacion";
    }

    @GetMapping("/editar/{id}")
    public String editForm(@PathVariable Integer id, Model model) {
        EstrategiaInternacionalizacion e = service.listar().stream()
            .filter(x -> x.getIdEstrategiaInternacionalizacion().equals(id))
            .findFirst()
            .orElse(new EstrategiaInternacionalizacion());
        model.addAttribute("item", e);
        return "estrategiainternacionalizacion/form";
    }

    @GetMapping("/eliminar/{id}")
    public String delete(@PathVariable Integer id) {
        service.eliminar(id);
        return "redirect:/estrategiainternacionalizacion";
    }
}
