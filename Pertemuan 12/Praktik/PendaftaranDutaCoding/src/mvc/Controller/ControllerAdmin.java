/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Controller;

import mvc.DAO.DAOAdmin;
import mvc.DAOInterface.IAdmin;
import mvc.Model.Admin;
import mvc.Model.TableModelAdmin;
import mvc.View.FormAdmin;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author bertinfajri
 */
public class ControllerAdmin {
    FormAdmin frame;
    IAdmin implAdmin;
    List<Admin> lb;

    public ControllerAdmin(FormAdmin frame) {
	this.frame = frame;
	implAdmin = new DAOAdmin();
	lb = implAdmin.getAll();
    }
    
    public void update() {
	if (!frame.getTxtNo().getText().trim().isEmpty()) {
            Admin b = new Admin();
            b.setNama(frame.getTxtNama().getText());
            b.setJk(frame.getTxtJk().getSelectedItem().toString());
            b.setTempattinggal(frame.getTxtTempattinggal().getText());
            b.setUsia(Integer.parseInt(frame.getTxtUsia().getText()));
            b.setAlasan(frame.getTxtAlasan().getText());
            implAdmin.update(b);
            JOptionPane.showMessageDialog(null, "Update Data Sukses");
	} else {
            JOptionPane.showMessageDialog(frame, "Pilih data yang akan diubah");
	}
    }

    public void delete() {
	if (!frame.getTxtNo().getText().trim().isEmpty()) {
            int no = Integer.parseInt(frame.getTxtNo().getText());
            implAdmin.delete(no);
            JOptionPane.showMessageDialog(null, "Hapus Data Sukses");
	} else {
            JOptionPane.showMessageDialog(frame, "Pilih data yang akan dihapus");
	}
    }
    
    public void reset() {
	frame.getTxtNo().setText("");
	frame.getTxtNama().setText("");
	frame.getTxtUsia().setText("");
        frame.getTxtTempattinggal().setText("");
	frame.getTxtJk().setSelectedItem("");
	frame.getTxtAlasan().setText("");
    }
}
