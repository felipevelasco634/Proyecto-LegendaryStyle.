package vista;

import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;


public class BotonesRenderer extends JPanel implements TableCellRenderer {

    JButton btnVer;
    JButton btnEditar;
    JButton btnEliminar;
    java.awt.Color dorado = new java.awt.Color(201,162,39);
    java.awt.Color verde = new java.awt.Color(46,204,113);
    java.awt.Color rojo = new java.awt.Color(231,76,60);

    public BotonesRenderer() {

        setLayout(new FlowLayout(FlowLayout.CENTER,2,5));

        btnVer = new JButton(new ImageIcon(getClass().getResource("/img/icons8-visible-10.png")));
        btnEditar = new JButton(new ImageIcon(getClass().getResource("/img/icons8-crear-nuevo-10.png")));
        btnEliminar = new JButton(new ImageIcon(getClass().getResource("/img/icons8-basura-llena-10.png")));
        btnVer.setPreferredSize(new java.awt.Dimension(25,25));
        btnEditar.setPreferredSize(new java.awt.Dimension(25,25));
        btnEliminar.setPreferredSize(new java.awt.Dimension(25,25));
        java.awt.Color dorado = new java.awt.Color(201,162,39);

        btnVer.setBackground(dorado);
        btnEditar.setBackground(verde);
        btnEliminar.setBackground(rojo);

        add(btnVer);
        add(btnEditar);
        add(btnEliminar);
        
    }

    @Override
    public Component getTableCellRendererComponent(JTable table,Object value,boolean isSelected,boolean hasFocus,int row,int column){

        return this;
    }
}