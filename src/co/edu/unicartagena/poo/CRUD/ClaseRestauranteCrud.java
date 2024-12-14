/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicartagena.poo.CRUD;

import co.edu.unicartagena.poo.datos.Restaurante;
import co.edu.unicartagena.poo.persistencia.PersistenciaRestaurante;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author zunig
 */
public class ClaseRestauranteCrud {
 

    private final List<Restaurante> restaurantes;
    private final PersistenciaRestaurante persistencia;

    public ClaseRestauranteCrud() {
        this.persistencia = new PersistenciaRestaurante();
        this.restaurantes = persistencia.cargarRestaurantes();
    }

    public void agregarRestaurante(Restaurante restaurante) {
        restaurantes.add(restaurante);
        persistencia.guardarRestaurantes(restaurantes);
        JOptionPane.showMessageDialog(null, "Restaurante agregado correctamente.");
    }

    public List<Restaurante> listarRestaurantes() {
        return restaurantes;
    }

    public boolean actualizarRestaurante(String nombre, Restaurante nuevoRestaurante) {
        for (int i = 0; i < restaurantes.size(); i++) {
            if (restaurantes.get(i).getNombre().equalsIgnoreCase(nombre)) {
                restaurantes.set(i, nuevoRestaurante);
                persistencia.guardarRestaurantes(restaurantes);
                JOptionPane.showMessageDialog(null, "Restaurante actualizado correctamente.");
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "No se encontró un restaurante con el nombre especificado.", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    public boolean eliminarRestaurante(String nombre) {
        boolean eliminado = restaurantes.removeIf(restaurante -> restaurante.getNombre().equalsIgnoreCase(nombre));
        if (eliminado) {
            persistencia.guardarRestaurantes(restaurantes);
            JOptionPane.showMessageDialog(null, "Restaurante eliminado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró un restaurante con el nombre especificado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return eliminado;
    }
}
    
