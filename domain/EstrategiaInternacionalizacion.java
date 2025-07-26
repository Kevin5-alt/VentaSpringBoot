/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.domain;

import jakarta.persistence.*;
import java.util.List;

/**
 * Define estrategias de internacionalización para productos.
 */
@Entity
@Table(name = "estrateg_Internacionalizacion")
public class EstrategiaInternacionalizacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Estrategia")
    private Integer idEstrategia;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, length = 1000)
    private String descripcion;

    @Column(nullable = false, length = 50)
    private String region;

    @OneToMany(mappedBy = "estrategia", cascade = CascadeType.ALL)
    private List<ProductoEstrategia> productos;

    // Getters y setters...

    public Object getIdEstrategiaInternacionalizacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
