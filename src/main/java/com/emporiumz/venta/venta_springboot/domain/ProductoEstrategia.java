/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.domain;

import jakarta.persistence.*;

/**
 * Entidad intermedia para la relación N–N Producto–Estrategia.
 */
@Entity
@Table(name = "producto_Estrategia")
public class ProductoEstrategia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_producto_Estrategia")
    private Integer idProductoEstrategia;

    @ManyToOne
    @JoinColumn(name = "ID_Producto", nullable = false)
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "ID_Estrategia", nullable = false)
    private EstrategiaInternacionalizacion estrategia;

    // Getters y setters...
}
