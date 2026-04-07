
package vista;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
public class Reportes extends javax.swing.JPanel {

    
    public Reportes() {
        initComponents();
        crearGraficaCitas();
        
        tablaReportes.getColumnModel().getColumn(3).setCellRenderer(new BotonRenderer());
        tablaReportes.setRowHeight(35);
        
    }
private void crearGraficaCitas(){

    DefaultCategoryDataset datos = new DefaultCategoryDataset();

    // Datos de ejemplo del mes
    datos.addValue(20,"Citas","Semana 1");
    datos.addValue(35,"Citas","Semana 2");
    datos.addValue(28,"Citas","Semana 3");
    datos.addValue(40,"Citas","Semana 4");

    JFreeChart grafica = ChartFactory.createLineChart(
            "Citas del mes",
            "Semanas",
            "Cantidad de citas",
            datos
    );

    ChartPanel panel = new ChartPanel(grafica);

    PanelGrafica.setLayout(new java.awt.BorderLayout());
    PanelGrafica.removeAll();
    PanelGrafica.add(panel, java.awt.BorderLayout.CENTER);
    PanelGrafica.validate();
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        textRegistrar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReportes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        PanelGrafica = new javax.swing.JPanel();
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
        textRegistrar.setText("Reportes");
        add(textRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 300, 40));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccionar mes ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 120, 20));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 165, 170, 40));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Seleccionar Año");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 120, 20));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 165, 160, 40));

        tablaReportes.setBackground(new java.awt.Color(255, 255, 255));
        tablaReportes.setForeground(new java.awt.Color(255, 255, 255));
        tablaReportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Total de citas", "Total ingresos", "Servicio más solicitado", "Exportar"
            }
        ));
        tablaReportes.setMinimumSize(new java.awt.Dimension(60, 50));
        tablaReportes.setPreferredSize(new java.awt.Dimension(300, 35));
        jScrollPane1.setViewportView(tablaReportes);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 610, 60));

        jButton1.setBackground(new java.awt.Color(212, 175, 55));
        jButton1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Generar ");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 165, 180, 40));

        PanelGrafica.setBackground(new java.awt.Color(37, 37, 38));

        javax.swing.GroupLayout PanelGraficaLayout = new javax.swing.GroupLayout(PanelGrafica);
        PanelGrafica.setLayout(PanelGraficaLayout);
        PanelGraficaLayout.setHorizontalGroup(
            PanelGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        PanelGraficaLayout.setVerticalGroup(
            PanelGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        add(PanelGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 610, 250));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo 820X650 SOMBRA.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);

        javax.swing.SwingUtilities.getWindowAncestor(this).dispose();    
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelGrafica;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaReportes;
    private javax.swing.JLabel textRegistrar;
    // End of variables declaration//GEN-END:variables
}
