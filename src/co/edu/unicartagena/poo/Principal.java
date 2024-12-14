/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.unicartagena.poo;

import co.edu.unicartagena.poo.ventanas.VentanaPrincipal;

/**
 *
 * @author zunig
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setExtendedState(VentanaPrincipal.MAXIMIZED_BOTH);
        ventana.setVisible(true);
    }
    
}
