/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.domain;

import jakarta.persistence.*;

/**
 * Detalle de cada producto en una factura.
 */
@Entity
@Table(name = "detalle_Factura")
public class DetalleFactura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_detalleFact")
    private Integer idDetalleFact;

    @Column(nullable = false)
    private Integer cantidad;

    @Column(nullable = false)
    private Float precioUnitario;

    @Column(nullable = false, length = 50)
    private String transportista;

    @Column(nullable = false, length = 50)
    private String metodoPago;

    @ManyToOne
    @JoinColumn(name = "ID_Factura", nullable = false)
    private Factura factura;

    @ManyToOne
    @JoinColumn(name = "ID_Producto", nullable = false)
    private Producto producto;

    // Getters y setters...
}

