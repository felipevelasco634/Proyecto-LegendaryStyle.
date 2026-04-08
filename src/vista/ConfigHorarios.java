
package vista;

import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

// Configuración de horarios disponibles
public class ConfigHorarios extends javax.swing.JPanel {

    
    public ConfigHorarios() {
        initComponents();
        SpinnerDateModel modeloHora = new SpinnerDateModel();
        spHora2.setModel(modeloHora);
        JSpinner.DateEditor editorHora = new JSpinner.DateEditor(spHora2, "HH:mm");
        spHora2.setEditor(editorHora);
        editorHora.getTextField().setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        SpinnerDateModel modeloHora1 = new SpinnerDateModel();
        spHora3.setModel(modeloHora1);
        JSpinner.DateEditor editorHora1 = new JSpinner.DateEditor(spHora2, "HH:mm");
        spHora3.setEditor(editorHora1);
        editorHora1.getTextField().setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        textRegistrar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        spHora2 = new javax.swing.JSpinner();
        spHora3 = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(212, 175, 55));
        btnBack.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 0, 0));
        btnBack.setText("<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 57, -1, 30));

        textRegistrar.setFont(new java.awt.Font("sansserif", 1, 28)); // NOI18N
        textRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        textRegistrar.setText("Configurar horarios");
        add(textRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 300, 40));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hora fin");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 120, 20));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lunes - Viernes", "Lunes - Sabado", "Lunes - Domingo" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 175, 260, 40));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dias laborales");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 120, 20));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hora de inicio ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 120, 20));
        add(spHora2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 265, 260, 40));
        add(spHora3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 355, 260, 40));

        jLabel5.setText("Duracion por cita");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 150, 20));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "15 MIN", "20 MIN", "30 MIN", "35 MIN" }));
        add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 445, 260, 40));

        jButton2.setBackground(new java.awt.Color(201, 162, 39));
        jButton2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Guardar configuracion");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 520, 200, 45));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo 820X650 SOMBRA.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 650));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);

        javax.swing.SwingUtilities.getWindowAncestor(this).dispose();    
    }//GEN-LAST:event_btnBackActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSpinner spHora2;
    private javax.swing.JSpinner spHora3;
    private javax.swing.JLabel textRegistrar;
    // End of variables declaration//GEN-END:variables
}
