package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;

import lombok.Data;

/**
 *
 * @author eliec
 */

@Data
@Entity
@Table(name="rol")
public class Rol implements Serializable {

    private static final long serialVersionUID = 1L; // creacion de auto incremental
    
    @Id // para representar que es un primery key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // generado como identidad
    @Column(name="id_rol")//apunta a la columnna en la tabla
    private long idRol;
    private String nombre;
    @Column(name="id_usuario")//apunta a la columnna en la tabla
    private long idUsuario;

    

}
