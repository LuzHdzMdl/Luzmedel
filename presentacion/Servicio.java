/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

/**
 *
 * @author luzme
 */
public class Servicio extends javax.swing.JFrame {

    /**
     * Creates new form reservicios
     */
    public Servicio() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cancelser = new javax.swing.JButton();
        agregarser = new javax.swing.JButton();
        idcliente = new javax.swing.JTextField();
        idservicio = new javax.swing.JTextField();
        fechaser = new javax.swing.JTextField();
        idusuario = new javax.swing.JTextField();
        tiposer = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 2, 18)); // NOI18N
        jLabel2.setText("Id del Cliente:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 120, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 2, 18)); // NOI18N
        jLabel3.setText("Id del Servicio:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 130, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 2, 18)); // NOI18N
        jLabel4.setText("Id del Usuario:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 130, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic Medium", 2, 18)); // NOI18N
        jLabel5.setText("Fecha de Cita:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 130, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic Medium", 2, 18)); // NOI18N
        jLabel6.setText("Tipo de Servicio a Realizar:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 230, -1));

        cancelser.setFont(new java.awt.Font("Yu Gothic Medium", 2, 12)); // NOI18N
        cancelser.setText("Cancelar");
        cancelser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelserMouseClicked(evt);
            }
        });
        jPanel1.add(cancelser, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 90, 30));

        agregarser.setFont(new java.awt.Font("Yu Gothic Medium", 2, 12)); // NOI18N
        agregarser.setText("Agregar");
        jPanel1.add(agregarser, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 90, 30));

        idcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idclienteActionPerformed(evt);
            }
        });
        jPanel1.add(idcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 140, 30));
        jPanel1.add(idservicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 140, 30));
        jPanel1.add(fechaser, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 140, 30));
        jPanel1.add(idusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 140, 30));
        jPanel1.add(tiposer, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 210, 30));

        jButton1.setFont(new java.awt.Font("Yu Gothic Medium", 2, 12)); // NOI18N
        jButton1.setText("Consultar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 90, 30));

        jButton2.setFont(new java.awt.Font("Yu Gothic Medium", 2, 12)); // NOI18N
        jButton2.setText("Modificar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 90, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 520, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idclienteActionPerformed

    private void cancelserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelserMouseClicked
    presentacion.Menu menu= new presentacion.Menu();
    menu.setVisible(true);
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_cancelserMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
presentacion.Moservicios moservicios= new presentacion.Moservicios();
    moservicios.setVisible(true);
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
     presentacion.Conservicios conservicios= new presentacion.Conservicios();
    conservicios.setVisible(true);
    this.dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Servicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Servicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Servicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Servicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Servicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarser;
    private javax.swing.JButton cancelser;
    private javax.swing.JTextField fechaser;
    private javax.swing.JTextField idcliente;
    private javax.swing.JTextField idservicio;
    private javax.swing.JTextField idusuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tiposer;
    // End of variables declaration//GEN-END:variables
}
