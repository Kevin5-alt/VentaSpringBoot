/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.domain;

import jakarta.persistence.*;

/**
 * Contiene información adicional asociada a un usuario.
 */
@Entity
@Table(name = "datosCliente")
public class DatosCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_datosCliente")
    private Integer idDatosCliente;

    @Column(name = "informacionAdicional_datosCliente", length = 1000)
    private String informacionAdicional;

    @OneToOne
    @JoinColumn(name = "ID_Usuario", nullable = false)
    private Usuario usuario;

    // Getters y setters...
}

