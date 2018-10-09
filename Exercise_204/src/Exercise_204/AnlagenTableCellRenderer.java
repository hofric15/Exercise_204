/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise_204;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Richard Hofmeister
 */
public class AnlagenTableCellRenderer implements TableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Anlage a = (Anlage) value;
        JLabel label = new JLabel();
        label.setOpaque(true);    
        if(a.getBishnd()<0 || a.getAfabish()<0 || a.getWertvorafa()<0 || a.getAfadj()<0 || a.getBw()<0)
        {
           label.setBackground(Color.RED); 
        }
        else
        {
            label.setBackground(Color.LIGHT_GRAY); 
        }
        label.setForeground(Color.white);
        
        switch(column)
        {
            case 0: label.setText(a.getBezeichnung()); break;
            case 1: label.setText(a.getAk()+""); break;
            case 2: label.setText(a.getInbetrnahme()+""); break;
            case 3: label.setText(a.getNd()+""); break;
            case 4: label.setText(a.getBishnd()+""); break;
            case 5: label.setText(a.getAfabish()+""); break;
            case 6: label.setText(a.getWertvorafa()+""); break;
            case 7: label.setText(a.getAfadj()+""); break;
            case 8: label.setText(a.getBw()+""); break;
        }
        
        return label;
    }
    
}
