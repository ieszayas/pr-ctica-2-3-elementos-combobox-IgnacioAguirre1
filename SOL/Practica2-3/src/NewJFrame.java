
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.String;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Ignacio
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
    /**
     * Creates new form NewJFrame
     */
    private enum DAM1 {
        Bases, Entornos, FOL, Lenguaje, Programacion, Sistemas
    };

    private enum DAM2 {
        Acceso, Interfaces, Procesos, Android, Gestion, TFG, Practicas
    };

    public NewJFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InfoElem = new javax.swing.JLabel();
        TextoAsig = new javax.swing.JTextField();
        ComboAsig = new javax.swing.JComboBox<>();
        BotonAñadir = new javax.swing.JButton();
        BotonAñadirTodo = new javax.swing.JButton();
        BotonBorrarTodos = new javax.swing.JButton();
        ComboCursos = new javax.swing.JComboBox<>();
        BotonBasura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agregar Elementos Combox");

        InfoElem.setText("Añade el nombre de los modulos de los que estés matriculado:");

        BotonAñadir.setText("Añadir");
        BotonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAñadirActionPerformed(evt);
            }
        });

        BotonAñadirTodo.setText("Añadir Todos");
        BotonAñadirTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAñadirTodoActionPerformed(evt);
            }
        });

        BotonBorrarTodos.setText("Borrar Todos");
        BotonBorrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBorrarTodosActionPerformed(evt);
            }
        });

        ComboCursos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DAM1", "DAM2" }));

        BotonBasura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/trash.png"))); // NOI18N
        BotonBasura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBasuraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InfoElem)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextoAsig, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonAñadir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ComboAsig, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonBasura, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(BotonBorrarTodos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotonAñadirTodo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(ComboCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(InfoElem)
                .addGap(34, 34, 34)
                .addComponent(ComboCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoAsig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboAsig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBasura, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAñadirTodo)
                    .addComponent(BotonAñadir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonBorrarTodos)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void existe(String modulo) {
        boolean existe = false;

        for (int i = 0; i < ComboAsig.getItemCount(); i++) {
            if (modulo.equals(ComboAsig.getItemAt(i))) {
                existe = true;
                break;
            }
        }

            ComboAsig.addItem(modulo);

    }
    
    private void BotonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAñadirActionPerformed
        // TODO add your handling code here:
         String asig = TextoAsig.getText().trim();

        if (!asig.isEmpty()) {
            existe(asig);
            TextoAsig.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "El campo de texto está vacío.");
        }
    }//GEN-LAST:event_BotonAñadirActionPerformed

    private void BotonAñadirTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAñadirTodoActionPerformed
        // TODO add your handling code here:
        String cursoSeleccionado = ComboCursos.getSelectedItem().toString();

        if (cursoSeleccionado.equals("DAM1")) {
            for (DAM1 modulo : DAM1.values()) {
                existe(modulo.toString());
            }
        } else if (cursoSeleccionado.equals("DAM2")) {
            for (DAM2 modulo : DAM2.values()) {
                existe(modulo.toString());
            }
        }
    }//GEN-LAST:event_BotonAñadirTodoActionPerformed

    private void BotonBorrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBorrarTodosActionPerformed
        // TODO add your handling code here:
        ComboAsig.removeAllItems();
    }//GEN-LAST:event_BotonBorrarTodosActionPerformed

    private void BotonBasuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBasuraActionPerformed
        // TODO add your handling code here:
        int selectedIndex = ComboAsig.getSelectedIndex();
        if (selectedIndex != -1) {
            ComboAsig.removeItemAt(selectedIndex);
        } else {
            JOptionPane.showMessageDialog(null, "No hay ningún elemento seleccionado para eliminar.");
        }
    }//GEN-LAST:event_BotonBasuraActionPerformed
   
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
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    System.out.println("Look and Feel de Windows aplicado correctamente.");
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error al aplicar el Look and Feel de Windows.");
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAñadir;
    private javax.swing.JButton BotonAñadirTodo;
    private javax.swing.JButton BotonBasura;
    private javax.swing.JButton BotonBorrarTodos;
    private javax.swing.JComboBox<String> ComboAsig;
    private javax.swing.JComboBox<String> ComboCursos;
    private javax.swing.JLabel InfoElem;
    private javax.swing.JTextField TextoAsig;
    // End of variables declaration//GEN-END:variables
}
