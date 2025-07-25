/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.domain;

import jakarta.persistence.*;

/**
 * Entidad intermedia para la relación N–N Producto–Oferta.
 */
@Entity
@Table(name = "producto_Oferta")
public class ProductoOferta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_producto_Oferta")
    private Integer idProductoOferta;

    @ManyToOne
    @JoinColumn(name = "ID_Producto", nullable = false)
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "ID_Oferta", nullable = false)
    private Oferta oferta;

    // Getters y setters...
}
