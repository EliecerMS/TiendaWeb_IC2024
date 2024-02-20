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
@Table(name="categoria")
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L; // creacion de auto incremental
    
    @Id // para representar que es un primery key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // generado como identidad
    @Column(name="id_categoria")//apunta a la columnna en la tabla
    private long idCategoria;
    
    private String descripcion;
    private String ruta_imagen;
    private boolean activo;

    public Categoria() {
    }

    
    public Categoria(String descriptcion, boolean activo) {
        this.descripcion = descriptcion;
        this.activo = activo;
    }
    
    

}
