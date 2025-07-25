/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.domain;

import jakarta.persistence.*;
import java.util.List;
import java.time.LocalDate;

/**
 * Define promociones aplicables a productos.
 */
@Entity
@Table(name = "oferta")
public class Oferta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Oferta")
    private Integer idOferta;

    @Column(name = "fechaInicio_Oferta", nullable = false)
    private LocalDate fechaInicio;

    @Column(name = "fechaFin_Oferta", nullable = false)
    private LocalDate fechaFin;

    @Column(name = "porcentaje_Oferta", nullable = false)
    private Integer porcentaje;

    @OneToMany(mappedBy = "oferta", cascade = CascadeType.ALL)
    private List<ProductoOferta> productos;

    // Getters y setters...
}

