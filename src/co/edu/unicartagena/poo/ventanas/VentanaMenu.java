/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package co.edu.unicartagena.poo.ventanas;

import co.edu.unicartagena.poo.CRUD.ClaseMenuCrud;
import co.edu.unicartagena.poo.datos.Menu;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author zunig
 */
public class VentanaMenu extends javax.swing.JDialog {

    /**
     * Creates new form VentanaMenu
     */
    public VentanaMenu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CampoNombre = new javax.swing.JTextField();
        CampoTipo = new javax.swing.JTextField();
        CampoPrecio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BotonCancelar = new javax.swing.JButton();
        BotonGuardar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        BotonEditar = new javax.swing.JButton();
        BotonBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario para agregar menú");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 0), 2, true), "Datos del menú:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 1, 14), new java.awt.Color(153, 153, 0))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel4.setText("Tipo:");

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel5.setText("Precio:");

        CampoNombre.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N

        CampoTipo.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        CampoTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoTipoActionPerformed(evt);
            }
        });

        CampoPrecio.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CampoNombre)
                    .addComponent(CampoTipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                    .addComponent(CampoPrecio, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(CampoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CampoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CampoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicartagena/poo/ventanas/Iconos/menu128pixeles.png"))); // NOI18N

        BotonCancelar.setText("CANCELAR");
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });

        BotonGuardar.setText("GUARDAR");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });

        BotonEliminar.setText("ELIMINAR");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        BotonEditar.setText("EDITAR");
        BotonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEditarActionPerformed(evt);
            }
        });

        BotonBuscar.setText("BUSCAR");
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonCancelar)
                        .addGap(3, 3, 3)
                        .addComponent(BotonGuardar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonCancelar)
                    .addComponent(BotonGuardar)
                    .addComponent(BotonEliminar)
                    .addComponent(BotonEditar)
                    .addComponent(BotonBuscar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoTipoActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        // TODO add your handling code here:
        int confirmacion = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro de que desea cancelar y salir del formulario?", 
            "Confirmación", JOptionPane.YES_NO_OPTION);

    if (confirmacion == JOptionPane.YES_OPTION) {
        // Cierra la ventana del formulario
        this.dispose();
    } else {
        JOptionPane.showMessageDialog(rootPane, "Continúe llenando el formulario.");
    }
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        // TODO add your handling code here:
        ClaseMenuCrud controlador = new ClaseMenuCrud();

    String nombre = CampoNombre.getText();
    String tipo = CampoTipo.getText();
    String precioStr = CampoPrecio.getText();

    if (nombre.isEmpty() || tipo.isEmpty() || precioStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    boolean menuExiste = controlador.listarMenus()
                                    .stream()
                                    .anyMatch(menu -> menu.getNombre().equalsIgnoreCase(nombre));

    if (menuExiste) {
        JOptionPane.showMessageDialog(this, "Ya existe un menú con el mismo nombre.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        double precio = Double.parseDouble(precioStr);

        Menu nuevoMenu = new Menu();
        nuevoMenu.setNombre(nombre);
        nuevoMenu.setTipo(tipo);
        nuevoMenu.setPrecio(precio);

        controlador.agregarMenu(nuevoMenu);
        JOptionPane.showMessageDialog(this, "Menú guardado correctamente.");
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El precio debe ser un valor numérico.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        // TODO add your handling code here:
            ClaseMenuCrud controlador = new ClaseMenuCrud();

    String nombre = CampoNombre.getText();

    if (nombre.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Debe ingresar el nombre del menú a eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    boolean eliminado = controlador.eliminarMenu(nombre);

    if (eliminado) {
        JOptionPane.showMessageDialog(this, "Menú eliminado correctamente.");
    } else {
        JOptionPane.showMessageDialog(this, "No se encontró un menú con el nombre especificado.", "Error", JOptionPane.ERROR_MESSAGE);
    }
   
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        // TODO add your handling code here:
        ClaseMenuCrud controlador = new ClaseMenuCrud();
    List<Menu> menus = controlador.listarMenus();

    if (menus.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No hay menús registrados.", "Información", JOptionPane.INFORMATION_MESSAGE);
        return;
    }

    StringBuilder mensaje = new StringBuilder("Menús registrados:\n");
    for (Menu menu : menus) {
        mensaje.append("- Nombre: ").append(menu.getNombre()).append("\n")
               .append("  Tipo: ").append(menu.getTipo()).append("\n")
               .append("  Precio: ").append(menu.getPrecio()).append("\n\n");
    }

    JOptionPane.showMessageDialog(this, mensaje.toString(), "Menús Registrados", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void BotonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEditarActionPerformed
        // TODO add your handling code here:
         ClaseMenuCrud controlador = new ClaseMenuCrud();

    String nombre = CampoNombre.getText();

    if (nombre.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Debe ingresar el nombre del menú a editar.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    Menu menuExistente = controlador.listarMenus()
                                     .stream()
                                     .filter(menu -> menu.getNombre().equalsIgnoreCase(nombre))
                                     .findFirst()
                                     .orElse(null);

    if (menuExistente == null) {
        JOptionPane.showMessageDialog(this, "No se encontró un menú con el nombre especificado.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    menuExistente.setTipo(CampoTipo.getText());
    try {
        double nuevoPrecio = Double.parseDouble(CampoPrecio.getText());
        menuExistente.setPrecio(nuevoPrecio);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El precio debe ser un valor numérico.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    controlador.actualizarMenu(nombre, menuExistente);
    JOptionPane.showMessageDialog(this, "Menú actualizado correctamente.");

    
    }//GEN-LAST:event_BotonEditarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaMenu dialog = new VentanaMenu(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonEditar;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JTextField CampoNombre;
    private javax.swing.JTextField CampoPrecio;
    private javax.swing.JTextField CampoTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}