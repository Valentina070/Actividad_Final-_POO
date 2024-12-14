/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicartagena.poo.persistencia;

/**
 *
 * @author zunig
 */
import co.edu.unicartagena.poo.datos.Cliente;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersistenciaCliente {

    private static final String FILE_NAME = "clientes.dat";

    // Guardar todos los clientes en un archivo
    public void guardarClientes(List<Cliente> clientes) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(clientes);
        } catch (IOException e) {
            System.out.println("Error al guardar los clientes: " + e.getMessage());
        }
    }

    // Cargar todos los clientes desde un archivo
    @SuppressWarnings("unchecked")
    public List<Cliente> cargarClientes() {
        List<Cliente> clientes = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            clientes = (List<Cliente>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado, se creará uno nuevo al guardar.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar los clientes: " + e.getMessage());
        }
        return clientes;
    }
}