/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author bertinfajri
 */
public class TableModelAdmin extends AbstractTableModel {
    List<Admin> lb;
    
    public TableModelAdmin(List<Admin> lb) {
        this.lb = lb;
    }
    
    @Override
    public int getColumnCount() {
        return 6;
    }
    
    public int getRowCount() {
        return lb.size();
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nomor KTP/NIK";
            case 1:
                return "Nama";
            case 2:
                return "Jenis Kelamin";
            case 3:
                return "Tempat Tinggal";
            case 4:
                return "Usia";
            case 5:
                return "Alasan";
            default:
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return lb.get(row).getNo();
            case 1:
                return lb.get(row).getNama();
            case 2:
                return lb.get(row).getJk();
            case 3:
                return lb.get(row).getTempattinggal();
            case 4:
                return lb.get(row).getUsia();
            case 5:
                return lb.get(row).getAlasan();
            default:
                return null; 
        }
    }
    
}
