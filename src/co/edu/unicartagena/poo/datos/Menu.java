/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicartagena.poo.datos;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author zunig
 */
public class Menu implements Serializable{
    private static final long serialVersionUID = 1L;
    private String nombre;
    private String tipo;
    private double precio;
    public static HashMap<String,Menu> menuBD;
   
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }
   
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

 
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
    

