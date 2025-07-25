/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.domain;

import jakarta.persistence.*;
import java.util.List;

/**
 * Clasifica los productos en grupos.
 */
@Entity
@Table(name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_categoria")
    private Integer idCategoria;

    @Column(name = "nombre_Categoria", nullable = false, length = 50)
    private String nombreCategoria;

    @Column(name = "descripción_Categoria", length = 2000)
    private String descripcionCategoria;

    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
    private List<Producto> productos;

    // Getters y setters...
}
