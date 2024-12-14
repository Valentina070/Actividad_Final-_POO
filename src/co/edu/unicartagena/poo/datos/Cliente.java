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
public class Cliente implements Serializable{
    private static final long serialVersionUID = 1L;
    private String nombre;
    private String preferencias;
    private String edad;
    public static HashMap<String,Cliente> clienteBD;
    
    public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getPreferencias() {
    return preferencias;
}

public void setPreferencias(String preferencias) {
    this.preferencias = preferencias;
}

public String getEdad() {
    return edad;
}

public void setEdad(String edad) {
    this.edad = edad;
}
}
