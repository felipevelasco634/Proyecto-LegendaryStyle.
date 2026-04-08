package vista;

import java.text.SimpleDateFormat;
import modelo.Cita;
import modelo.CitaDAO;
import javax.swing.SpinnerDateModel;
import javax.swing.JSpinner;

// Ventana para registrar nuevas citas
public class RegistrarCitas extends javax.swing.JPanel {

    private int idCita = 0;
    public RegistrarCitas() {
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

        textRegistrar = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        textNcliente = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbServicio = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnRegistarc = new javax.swing.JButton();
        jDateFecha = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        spHora = new javax.swing.JSpinner();
        fondo = new javax.swing.JLabel();

        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setMinimumSize(new java.awt.Dimension(810, 650));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textRegistrar.setFont(new java.awt.Font("sansserif", 1, 28)); // NOI18N
        textRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        textRegistrar.setText("Registrar cita");
        add(textRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 300, 40));

        btnAtras.setBackground(new java.awt.Color(212, 175, 55));
        btnAtras.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(0, 0, 0));
        btnAtras.setText("<");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 57, -1, 30));

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

        jLabel2.setText("Servicio");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        cmbServicio.setBackground(new java.awt.Color(18, 18, 18));
        cmbServicio.setEditable(true);
        cmbServicio.setForeground(new java.awt.Color(18, 18, 18));
        cmbServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Corte completo", "Barba", "corte sencillo ", " " }));
        cmbServicio.setBorder(null);
        add(cmbServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 260, 40));

        jLabel1.setText("Precio");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, -1));

        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecio.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecio.setText("Ingrese el valor del servcio ");
        txtPrecio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 162, 39), 1, true));
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 260, 40));

        btnRegistarc.setBackground(new java.awt.Color(201, 162, 39));
        btnRegistarc.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnRegistarc.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistarc.setText("Registrar cita");
        btnRegistarc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistarcActionPerformed(evt);
            }
        });
        add(btnRegistarc, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, 200, 45));

        jDateFecha.setBackground(new java.awt.Color(18, 18, 18));
        jDateFecha.setForeground(new java.awt.Color(255, 255, 255));
        add(jDateFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 260, 40));

        jLabel3.setText("Fecha");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));

        jLabel4.setText("Hora");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, -1, -1));
        add(spHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 260, 40));

        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo 820X650 SOMBRA.png"))); // NOI18N
        fondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fondo.setPreferredSize(new java.awt.Dimension(810, 650));
        add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 650));

        getAccessibleContext().setAccessibleName("PanelDerecho");
        getAccessibleContext().setAccessibleDescription("PanelDerecho\n");
    }// </editor-fold>//GEN-END:initComponents

    // Evento del botón regresar
    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);

        javax.swing.SwingUtilities.getWindowAncestor(this).dispose();       

         
    }//GEN-LAST:event_btnAtrasActionPerformed

    // Evento del botón guardar cita
    private void btnRegistarcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistarcActionPerformed
        String nombre = txtNombre.getText();
        String telefono = txtTel.getText();
        String servicio = cmbServicio.getSelectedItem().toString();

        double precio = 0;
        try {
            precio = Double.parseDouble(txtPrecio.getText());
        } catch (Exception e) {
            System.out.println("Precio inválido");
        }

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = formato.format(jDateFecha.getDate());
        String hora = spHora.getValue().toString();

        Cita cita = new Cita(0, nombre, telefono, servicio, precio, fecha, hora);

        CitaDAO dao = new CitaDAO();
        
        // Validar campos antes de guardar
        if (idCita == 0) {
            dao.insertar(cita);
        } else {
            Cita citaEditada = new Cita(idCita, nombre, telefono, servicio, precio, fecha, hora);
            dao.actualizar(citaEditada);
            idCita = 0;
        }
    }//GEN-LAST:event_btnRegistarcActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnRegistarc;
    private javax.swing.JComboBox<String> cmbServicio;
    private javax.swing.JLabel fondo;
    private com.toedter.calendar.JDateChooser jDateFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSpinner spHora;
    private javax.swing.JLabel textNcliente;
    private javax.swing.JLabel textRegistrar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTel;
    private javax.swing.JLabel txtTelefono;
    // End of variables declaration//GEN-END:variables
}
