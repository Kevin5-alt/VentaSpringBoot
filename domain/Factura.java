/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.domain;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

/**
 * Registra la compra de productos por un usuario.
 */
@Entity
@Table(name = "factura")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Factura")
    private Integer idFactura;

    @Column(name = "fechaCompra_Factura", nullable = false)
    private LocalDate fechaCompra;

    @Column(name = "fechaLlegada_Factura", nullable = false)
    private LocalDate fechaLlegada;

    @Column(name = "estado_Factura", nullable = false, length = 40)
    private String estado;

    @Column(name = "dirección_Factura", nullable = false, length = 200)
    private String direccion;

    @ManyToOne
    @JoinColumn(name = "ID_Usuario", nullable = false)
    private Usuario usuario;

    @OneToMany(mappedBy = "factura", cascade = CascadeType.ALL)
    private List<DetalleFactura> detalles;

    @OneToOne(mappedBy = "factura", cascade = CascadeType.ALL)
    private Logistica logistica;

    // Getters y setters...

    public Object getIdFactura() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
