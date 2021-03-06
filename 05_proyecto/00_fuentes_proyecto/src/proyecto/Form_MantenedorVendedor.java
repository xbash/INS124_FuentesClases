/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author rgonzalez
 */
public class Form_MantenedorVendedor extends javax.swing.JFrame {

    /**
     * Creates new form Form_MantenedorVendedor
     */
    public Form_MantenedorVendedor() {
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

        btn_CrearVendedor = new javax.swing.JButton();
        btnActualizarVendedor = new javax.swing.JButton();
        btn_EliminarVendedor = new javax.swing.JButton();
        btn_MostrarVendedores = new javax.swing.JButton();
        btn_Cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_CrearVendedor.setText("Crear Vendedor");
        btn_CrearVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CrearVendedorActionPerformed(evt);
            }
        });

        btnActualizarVendedor.setText("Actualizar Vendedor");
        btnActualizarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarVendedorActionPerformed(evt);
            }
        });

        btn_EliminarVendedor.setText("Eliminar Vendedor");
        btn_EliminarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarVendedorActionPerformed(evt);
            }
        });

        btn_MostrarVendedores.setText("Mostrar Vendedores");
        btn_MostrarVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MostrarVendedoresActionPerformed(evt);
            }
        });

        btn_Cerrar.setText("Cerrar");
        btn_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualizarVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_CrearVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_EliminarVendedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_MostrarVendedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(1, 1, 1)))
                .addGap(101, 101, 101))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(btn_Cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btn_CrearVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizarVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(btn_MostrarVendedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_EliminarVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Cerrar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CrearVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CrearVendedorActionPerformed
        // TODO add your handling code here:
        new Form_IngresarVendedor().setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_btn_CrearVendedorActionPerformed

    private void btn_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CerrarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_CerrarActionPerformed

    private void btnActualizarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarVendedorActionPerformed
        // TODO add your handling code here:
        new Form_actualizarVendedor().setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_btnActualizarVendedorActionPerformed

    private void btn_MostrarVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MostrarVendedoresActionPerformed
        // TODO add your handling code here:
        new tbl_MostrarVendedores().setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_btn_MostrarVendedoresActionPerformed

    private void btn_EliminarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarVendedorActionPerformed
        // TODO add your handling code here:
        new Form_EliminarVendedor().setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_btn_EliminarVendedorActionPerformed

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
            java.util.logging.Logger.getLogger(Form_MantenedorVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_MantenedorVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_MantenedorVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_MantenedorVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_MantenedorVendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarVendedor;
    private javax.swing.JButton btn_Cerrar;
    private javax.swing.JButton btn_CrearVendedor;
    private javax.swing.JButton btn_EliminarVendedor;
    private javax.swing.JButton btn_MostrarVendedores;
    // End of variables declaration//GEN-END:variables
}
