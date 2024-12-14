/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicartagena.poo.CRUD;

import co.edu.unicartagena.poo.datos.Cliente;
import co.edu.unicartagena.poo.persistencia.PersistenciaCliente;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author zunig
 */
public class ClaseClienteCrud {
 
    private final List<Cliente> clientes;
    private final PersistenciaCliente persistencia;

    public ClaseClienteCrud() {
        this.persistencia = new PersistenciaCliente();
        this.clientes = persistencia.cargarClientes();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
        persistencia.guardarClientes(clientes);
        JOptionPane.showMessageDialog(null, "Cliente agregado correctamente.");
    }

    public List<Cliente> listarClientes() {
        return clientes;
    }

    public boolean actualizarCliente(String nombre, Cliente nuevoCliente) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getNombre().equalsIgnoreCase(nombre)) {
                clientes.set(i, nuevoCliente);
                persistencia.guardarClientes(clientes);
                JOptionPane.showMessageDialog(null, "Cliente actualizado correctamente.");
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "No se encontró un cliente con el nombre especificado.", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    public boolean eliminarCliente(String nombre) {
        boolean eliminado = clientes.removeIf(cliente -> cliente.getNombre().equalsIgnoreCase(nombre));
        if (eliminado) {
            persistencia.guardarClientes(clientes);
            JOptionPane.showMessageDialog(null, "Cliente eliminado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró un cliente con el nombre especificado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return eliminado;
    }
}
