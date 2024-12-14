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
public class Restaurante implements Serializable{
    private static final long serialVersionUID = 1L;
   private String nombre;
   private String especialidad;
   private String capacidad;
   public static HashMap<String,Restaurante> RestauranteBD;
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

}
