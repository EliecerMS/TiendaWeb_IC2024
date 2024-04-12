package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

/**
 *
 * @author eliec
 */

@Data
@Entity
@Table(name="venta")
public class Venta implements Serializable {

    private static final long serialVersionUID = 1L; // creacion de auto incremental
    
    @Id // para representar que es un primery key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // generado como identidad
    @Column(name="id_venta")//apunta a la columnna en la tabla
    private long idVenta;
    private long idFactura;
    private long idProducto;
    private double precio;
    private int cantidad;

    

    public Venta() {
    }


    public Venta(long idFactura, long idProducto, double precio, int cantidad){
        this.idFactura = idFactura;
        this.idProducto = idProducto;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
}
