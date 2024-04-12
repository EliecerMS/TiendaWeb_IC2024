package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author eliec
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class Item extends Producto{

    
   
    private int cantidad; // almacenar la cantidad de items de un producto



    public Item() {
    }

    public Item(Producto producto) {
        super.setIdProducto(producto.getIdProducto());
        super.setCategoria(producto.getCategoria());
        super.setDescripcion(producto.getDescripcion());
        super.setDetalle(producto.getDetalle());
        super.setPrecio(producto.getPrecio());
        super.setExistencias(producto.getExistencias());
        super.setActivo(producto.isActivo());
        super.setRuta_imagen(producto.getRuta_imagen());
        this.cantidad = 0;
        
        
    }

}
