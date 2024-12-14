/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicartagena.poo.persistencia;

/**
 *
 * @author zunig
 */
import co.edu.unicartagena.poo.datos.Restaurante;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersistenciaRestaurante {

    private static final String FILE_NAME = "restaurantes.dat";

    // Guardar todos los restaurantes en un archivo
    public void guardarRestaurantes(List<Restaurante> restaurantes) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(restaurantes);
        } catch (IOException e) {
            System.out.println("Error al guardar los restaurantes: " + e.getMessage());
        }
    }

    // Cargar todos los restaurantes desde un archivo
    @SuppressWarnings("unchecked")
    public List<Restaurante> cargarRestaurantes() {
        List<Restaurante> restaurantes = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            restaurantes = (List<Restaurante>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado, se creará uno nuevo al guardar.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar los restaurantes: " + e.getMessage());
        }
        return restaurantes;
    }
}