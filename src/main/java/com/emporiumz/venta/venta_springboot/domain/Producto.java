/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.domain;

import jakarta.persistence.*;
import java.util.List;

/**
 * Representa un producto disponible para la venta.
 */
@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Producto")
    private Integer idProducto;

    @Column(name = "nombre_Producto", nullable = false, length = 100)
    private String nombreProducto;

    @Column(name = "descripción_Producto", length = 2000)
    private String descripcionProducto;

    @Column(name = "precio_Producto", nullable = false)
    private Float precioProducto;

    @Column(name = "stock_Producto", nullable = false)
    private Integer stockProducto;

    @Lob
    @Column(name = "imagen_Producto")
    private byte[] imagenProducto;

    @ManyToOne
    @JoinColumn(name = "ID_Categoria", nullable = false)
    private Categoria categoria;

    @OneToOne(mappedBy = "producto", cascade = CascadeType.ALL)
    private Inventario inventario;

    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    private List<DetalleFactura> detallesFactura;

    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    private List<ProductoOferta> ofertas;

    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    private List<ProductoEstrategia> estrategias;

    // Getters y setters...
}

