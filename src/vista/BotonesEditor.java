package vista;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.TableCellEditor;
import modelo.CitaDAO;
import javax.swing.table.DefaultTableModel;


public class BotonesEditor extends AbstractCellEditor implements TableCellEditor {

    JPanel panel;
    JButton btnVer;
    JButton btnEditar;
    JButton btnEliminar;
    JTable tabla;

    public BotonesEditor(JTable tabla) {

        this.tabla = tabla;

        panel = new JPanel(new FlowLayout(FlowLayout.CENTER,2,5));

        btnVer = new JButton(new ImageIcon(getClass().getResource("/img/icons8-visible-10.png")));
        btnEditar = new JButton(new ImageIcon(getClass().getResource("/img/icons8-crear-nuevo-10.png")));
        btnEliminar = new JButton(new ImageIcon(getClass().getResource("/img/icons8-basura-llena-10.png")));

        panel.add(btnVer);
        panel.add(btnEditar);
        panel.add(btnEliminar);

   
        btnEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int fila = tabla.getSelectedRow();

                if (fila >= 0) {
 
                    int id = Integer.parseInt(tabla.getValueAt(fila, 0).toString());
                    String nombre = tabla.getValueAt(fila, 1).toString();
                    String servicio = tabla.getValueAt(fila, 2).toString();
                    String fechaHora = tabla.getValueAt(fila, 3).toString();
                    String telefono = tabla.getValueAt(fila, 4).toString();

                    ModificarCita panelModificar = new ModificarCita();

            
                    panelModificar.txtTel.setText(telefono);
                    panelModificar.cmbServicio.setSelectedItem(servicio);
                    panelModificar.idCita = id;
                    panelModificar.txtNombre.setText(nombre);

                    panelModificar.setSize(810,650);
                    panelModificar.setLocation(0,0);

                    MenuPrincipal.PanelDerecho.removeAll();
                    MenuPrincipal.PanelDerecho.add(panelModificar);
                    MenuPrincipal.PanelDerecho.revalidate();
                    MenuPrincipal.PanelDerecho.repaint();
                }
            }
        });
        btnEliminar.addActionListener(e -> {

            int fila = tabla.getSelectedRow();

            int id = Integer.parseInt(tabla.getValueAt(fila, 0).toString());

            CitaDAO dao = new CitaDAO();
            dao.eliminar(id);

   
            ((DefaultTableModel) tabla.getModel()).removeRow(fila);
         });

    }

    @Override
    public Component getTableCellEditorComponent(JTable table,Object value,boolean isSelected,int row,int column) {

        return panel;
    }

    @Override
    public Object getCellEditorValue() {
        return "";
    }

}