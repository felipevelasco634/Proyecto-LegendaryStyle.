package vista;

import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;


public class BotonRenderer extends JPanel implements TableCellRenderer {

    JButton btnDescargar;
    java.awt.Color verde = new java.awt.Color(0,255,0);

    public BotonRenderer() {

        setLayout(new FlowLayout(FlowLayout.CENTER,2,5));

        btnDescargar = new JButton(new ImageIcon(getClass().getResource("/img/icons8-descargar-10 .png")));
        
        btnDescargar.setPreferredSize(new java.awt.Dimension(25,25));
        java.awt.Color verde = new java.awt.Color(0,255,0);

        btnDescargar.setBackground(verde);
       

        add(btnDescargar);
        
        
    }

    @Override
    public Component getTableCellRendererComponent(JTable table,Object value,boolean isSelected,boolean hasFocus,int row,int column){

        return this;
    }
}