/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service;

import com.tienda.domain.Item;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eliec
 */
public interface ItemService {
    
    List<Item> listaItems = new ArrayList<>();
    
    
    public List<Item> gets();
    
    //Se recupera el registro ue tiene el idItem pasado por parametro
    public Item get(Item item);
     
   //Se elimina el registro que tiene el idItem pasado por parametro
    public void delete(Item item);
    
    public void save(Item item);
    
    public void actualiza (Item item);
    
    public void facturar();
    
}
