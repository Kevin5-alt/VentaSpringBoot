/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.controller;

import com.emporiumz.venta.venta_springboot.domain.DatosCliente;
import com.emporiumz.venta.venta_springboot.service.DatosClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/datoscliente")
public class DatosClienteController {

    private final DatosClienteService service;

    public DatosClienteController(DatosClienteService service) {
        this.service = service;
    }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("items", service.listar());
        return "datoscliente/list";
    }

    @GetMapping("/nuevo")
    public String createForm(Model model) {
        model.addAttribute("item", new DatosCliente());
        return "datoscliente/form";
    }

    @PostMapping("/guardar")
    public String save(@ModelAttribute("item") DatosCliente datos) {
        service.crear(datos);
        return "redirect:/datoscliente";
    }

    @GetMapping("/editar/{id}")
    public String editForm(@PathVariable Integer id, Model model) {
        DatosCliente d = service.listar().stream()
            .filter(x -> x.getIdDatosCliente().equals(id))
            .findFirst()
            .orElse(new DatosCliente());
        model.addAttribute("item", d);
        return "datoscliente/form";
    }

    @GetMapping("/eliminar/{id}")
    public String delete(@PathVariable Integer id) {
        service.eliminar(id);
        return "redirect:/datoscliente";
    }
}

