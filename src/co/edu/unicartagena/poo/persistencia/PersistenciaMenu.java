/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicartagena.poo.persistencia;

/**
 *
 * @author zunig
 */
import co.edu.unicartagena.poo.datos.Menu;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersistenciaMenu {

    private static final String FILE_NAME = "menus.dat";

    // Guardar todos los menús en un archivo
    public void guardarMenus(List<Menu> menus) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(menus);
        } catch (IOException e) {
            System.out.println("Error al guardar los menús: " + e.getMessage());
        }
    }

    // Cargar todos los menús desde un archivo
    @SuppressWarnings("unchecked")
    public List<Menu> cargarMenus() {
        List<Menu> menus = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            menus = (List<Menu>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado, se creará uno nuevo al guardar.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar los menús: " + e.getMessage());
        }
        return menus;
    }
}
