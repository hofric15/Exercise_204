/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise_204;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Alex
 */
public class AnlagenModel extends AbstractTableModel{
    private ArrayList<Anlage> list = new ArrayList<>();
    
    private String[] colNames = {"Bezeichnung", "AK", "Inbetriebnahme", "ND", "bish. ND", "Afa bisher", "Wert vor Afa", "Afa d.J.", "BW 31.12."};
    
    public double bishND(int index, int jahr)
    {
        Anlage an = list.get(index);
        Double nutzD = an.getNd();
        Double bishND = an.getInbetrnahme() + nutzD;
        return bishND;
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Anlage anlage = list.get(i);
        return anlage;
    }
    
}
