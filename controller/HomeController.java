/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controlador para la página de inicio de EmporiumZ.
 */
@Controller
public class HomeController {

    /**
     * Mapea GET "/" y devuelve la vista index.html.
     * @return 
     */
    @GetMapping("/")
    public String home() {
        return "index";
    }
}

