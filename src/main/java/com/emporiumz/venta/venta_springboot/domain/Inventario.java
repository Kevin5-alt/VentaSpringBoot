/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.domain;

import jakarta.persistence.*;

/**
 * Controla existencias disponibles de cada producto.
 */
@Entity
@Table(name = "inventario")
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Inventario")
    private Integer idInventario;

    @Column(name = "cantidadDisponible_Inventario", nullable = false)
    private Integer cantidadDisponible;

    @OneToOne
    @JoinColumn(name = "ID_Producto", nullable = false)
    private Producto producto;

    // Getters y setters...
}

