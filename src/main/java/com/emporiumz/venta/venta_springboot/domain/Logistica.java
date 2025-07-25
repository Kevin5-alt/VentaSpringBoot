/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.domain;

import jakarta.persistence.*;
import java.time.LocalDate;

/**
 * Rastrea el envío de cada factura.
 */
@Entity
@Table(name = "logistica")
public class Logistica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Logistica")
    private Integer idLogistica;

    @Column(name = "dirección_Logistica", nullable = false, length = 200)
    private String direccion;

    @Column(name = "fecha_Logistica", nullable = false)
    private LocalDate fecha;

    @Column(name = "estado_Logistica", nullable = false, length = 40)
    private String estado;

    @OneToOne
    @JoinColumn(name = "ID_Factura", nullable = false)
    private Factura factura;

    // Getters y setters...
}

