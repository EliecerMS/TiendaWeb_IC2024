package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import lombok.Data;

/**
 *
 * @author eliec
 */

@Data
@Entity
@Table(name="factura")
public class Factura implements Serializable {

    private static final long serialVersionUID = 1L; // creacion de auto incremental
    
    @Id // para representar que es un primery key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // generado como identidad
    @Column(name="id_factura")//apunta a la columnna en la tabla
    private long idFactura;
    
    private long idUsuario;
    private Date fecha;
    private double total;
    private int estado;


    public Factura() {
    }


    public Factura(long idUsuario){
        this.idUsuario = idUsuario;
        this.fecha = Calendar.getInstance().getTime();
        this.estado = 1;
    }
    
}
