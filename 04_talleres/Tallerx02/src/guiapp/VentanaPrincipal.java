/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapp;

/**
 *
 * @author jsepulveda
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    /*
    Global - Arreglo de 2 Carreras y 10 Matriculas
    */

    
    /**
     * Creates new form NewJFrame
     */
    public VentanaPrincipal() {
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

        Button_Ingresar = new javax.swing.JButton();
        Button_ListarMatricula = new javax.swing.JButton();
        Button_CantidadMatriculas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BCerrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Button_Ingresar.setText("Ingresar Matricula");
        Button_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_IngresarActionPerformed(evt);
            }
        });

        Button_ListarMatricula.setText("Listar Detalles por Matricula");
        Button_ListarMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ListarMatriculaActionPerformed(evt);
            }
        });

        Button_CantidadMatriculas.setText("Listar cantidad de Alumnos por Matricula");
        Button_CantidadMatriculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CantidadMatriculasActionPerformed(evt);
            }
        });

        jLabel1.setText("Menu Principal");

        BCerrar.setText("Cerrar");
        BCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCerrarActionPerformed(evt);
            }
        });

        jButton1.setText("Ingresar Valores Carrera");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BCerrar)
                .addGap(187, 187, 187))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button_Ingresar)
                            .addComponent(jButton1)
                            .addComponent(Button_ListarMatricula)
                            .addComponent(Button_CantidadMatriculas))))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(Button_Ingresar)
                .addGap(18, 18, 18)
                .addComponent(Button_ListarMatricula)
                .addGap(18, 18, 18)
                .addComponent(Button_CantidadMatriculas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(BCerrar)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Obtener Objetos desde otras ventanas
    
    
    private void Button_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_IngresarActionPerformed
        // TODO add your handling code here:
        new IngresarMatricula().setVisible(true);
    }//GEN-LAST:event_Button_IngresarActionPerformed

    private void Button_ListarMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ListarMatriculaActionPerformed
        // TODO add your handling code here:
        new ListarDetallePorMatricula().setVisible(true);
    }//GEN-LAST:event_Button_ListarMatriculaActionPerformed

    private void BCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCerrarActionPerformed
        // TODO add your handling code here:
       System.exit(0);
    }//GEN-LAST:event_BCerrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new IngresarValoresCarreras().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Button_CantidadMatriculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CantidadMatriculasActionPerformed
        // TODO add your handling code here:
        new ListarTotalesAlumnos().setVisible(true);
    }//GEN-LAST:event_Button_CantidadMatriculasActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCerrar;
    private javax.swing.JButton Button_CantidadMatriculas;
    private javax.swing.JButton Button_Ingresar;
    private javax.swing.JButton Button_ListarMatricula;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
