/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.domain;

import jakarta.persistence.*;
import java.util.List;

/**
 * Representa un usuario registrado en la plataforma.
 */
@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Usuario")
    private Integer idUsuario;

    @Column(name = "nombre_Usuario", nullable = false, length = 80)
    private String nombreUsuario;

    @Column(name = "correoElectronico_Usuario", nullable = false, length = 120)
    private String correoUsuario;

    @Column(name = "telefono_Usuario")
    private Integer telefonoUsuario;

    @Column(name = "contrasena_Usuario", nullable = false, length = 50)
    private String contrasenaUsuario;

    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    private DatosCliente datosCliente;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Factura> facturas;

    // Getters y setters...

    public Object getIdUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

