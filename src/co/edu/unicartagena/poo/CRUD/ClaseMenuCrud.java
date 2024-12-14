/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicartagena.poo.CRUD;

import co.edu.unicartagena.poo.datos.Menu;
import co.edu.unicartagena.poo.persistencia.PersistenciaMenu;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author zunig
 */
public class ClaseMenuCrud {

    private final List<Menu> menus;
    private final PersistenciaMenu persistencia;

    public ClaseMenuCrud() {
        this.persistencia = new PersistenciaMenu();
        this.menus = persistencia.cargarMenus();
    }

    public void agregarMenu(Menu menu) {
        menus.add(menu);
        persistencia.guardarMenus(menus);
        JOptionPane.showMessageDialog(null, "Menú agregado correctamente.");
    }

    public List<Menu> listarMenus() {
        return menus;
    }

    public boolean actualizarMenu(String nombre, Menu nuevoMenu) {
        for (int i = 0; i < menus.size(); i++) {
            if (menus.get(i).getNombre().equalsIgnoreCase(nombre)) {
                menus.set(i, nuevoMenu);
                persistencia.guardarMenus(menus);
                JOptionPane.showMessageDialog(null, "Menú actualizado correctamente.");
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "No se encontró un menú con el nombre especificado.", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    public boolean eliminarMenu(String nombre) {
        boolean eliminado = menus.removeIf(menu -> menu.getNombre().equalsIgnoreCase(nombre));
        if (eliminado) {
            persistencia.guardarMenus(menus);
            JOptionPane.showMessageDialog(null, "Menú eliminado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró un menú con el nombre especificado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return eliminado;
    }
    
}
