
package vista;

import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import modelo.CitaDAO;
import modelo.Cita;

public class ModificarCita extends javax.swing.JPanel {

    public int idCita = 0;
    public ModificarCita() {
        initComponents();
        SpinnerDateModel modeloHora = new SpinnerDateModel();
        spHora.setModel(modeloHora);
        JSpinner.DateEditor editorHora = new JSpinner.DateEditor(spHora, "HH:mm");
        spHora.setEditor(editorHora);
        editorHora.getTextField().setHorizontalAlignment(javax.swing.JTextField.CENTER);
    }
   

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        textRegistrar = new javax.swing.JLabel();
        textNcliente = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbServicio = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jDateFecha = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        spHora = new javax.swing.JSpinner();
        botonCancelar = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
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
        textRegistrar.setText("Modificar cita");
        add(textRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 300, 40));

        textNcliente.setForeground(new java.awt.Color(255, 255, 255));
        textNcliente.setText("Nombre del cliente");
        add(textNcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setText("Ingresa el nombre ");
        txtNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 162, 39), 1, true));
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 260, 40));

        txtTelefono.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefono.setText("Teléfono");
        add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));

        txtTel.setBackground(new java.awt.Color(255, 255, 255));
        txtTel.setForeground(new java.awt.Color(0, 0, 0));
        txtTel.setText("Ingresa el telefono ");
        txtTel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 162, 39), 1, true));
        add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 260, 40));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Servicio");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        cmbServicio.setBackground(new java.awt.Color(18, 18, 18));
        cmbServicio.setEditable(true);
        cmbServicio.setForeground(new java.awt.Color(18, 18, 18));
        cmbServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Corte completo", "Barba", "corte sencillo ", " " }));
        cmbServicio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 162, 39), 1, true));
        add(cmbServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 260, 40));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Precio");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, -1));

        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecio.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecio.setText("Ingrese el valor del servcio ");
        txtPrecio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 162, 39), 1, true));
        add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 260, 40));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));

        jDateFecha.setBackground(new java.awt.Color(18, 18, 18));
        jDateFecha.setForeground(new java.awt.Color(255, 255, 255));
        add(jDateFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 260, 40));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hora");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, -1, -1));
        add(spHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 260, 40));

        botonCancelar.setBackground(new java.awt.Color(201, 162, 39));
        botonCancelar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        botonCancelar.setForeground(new java.awt.Color(0, 0, 0));
        botonCancelar.setText("cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, 200, 45));

        botonGuardar.setBackground(new java.awt.Color(201, 162, 39));
        botonGuardar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        botonGuardar.setForeground(new java.awt.Color(0, 0, 0));
        botonGuardar.setText("Guardar cambios");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, 200, 45));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo 820X650 SOMBRA.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 650));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       ConsultarCitas panel = new ConsultarCitas();

        panel.setSize(810,650);
        panel.setLocation(0,0);
        MenuPrincipal.PanelDerecho.removeAll();
        MenuPrincipal.PanelDerecho.add(panel);
        MenuPrincipal.PanelDerecho.revalidate();
        MenuPrincipal.PanelDerecho.repaint();  
    }//GEN-LAST:event_btnBackActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        CitaDAO dao = new CitaDAO();


        String nombre = txtNombre.getText();
        String telefono = txtTelefono.getText();
        String servicio = cmbServicio.getSelectedItem().toString();

 
        double precio = 0;
           try {
               precio = Double.parseDouble(txtPrecio.getText());
            } catch (Exception e) {
               System.out.println("Precio inválido");
            }


        String fecha = "";
           try {
               java.text.SimpleDateFormat formato = new java.text.SimpleDateFormat("yyyy-MM-dd");
               fecha = formato.format(jDateFecha.getDate());
            } catch (Exception e) {
               System.out.println("Fecha inválida");
            }


        String hora = spHora.getValue().toString();


        Cita cita = new Cita(idCita, nombre, telefono, servicio, precio, fecha, hora);

        dao.actualizar(cita);

        System.out.println("Cita actualizada");
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        ConsultarCitas panel = new ConsultarCitas();

        panel.setSize(810,650);
        panel.setLocation(0,0);

        MenuPrincipal.PanelDerecho.removeAll();
        MenuPrincipal.PanelDerecho.add(panel);
        MenuPrincipal.PanelDerecho.revalidate();
        MenuPrincipal.PanelDerecho.repaint();
    }//GEN-LAST:event_botonCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton btnBack;
    public javax.swing.JComboBox<String> cmbServicio;
    public com.toedter.calendar.JDateChooser jDateFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JSpinner spHora;
    private javax.swing.JLabel textNcliente;
    private javax.swing.JLabel textRegistrar;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtPrecio;
    public javax.swing.JTextField txtTel;
    private javax.swing.JLabel txtTelefono;
    // End of variables declaration//GEN-END:variables
}
