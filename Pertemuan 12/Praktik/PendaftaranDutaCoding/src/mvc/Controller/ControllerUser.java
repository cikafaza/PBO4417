/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Controller;

import mvc.DAO.DAOUser;
import mvc.DAOInterface.IUser;
import mvc.Model.User;
import mvc.Model.TableModelUser;
import mvc.View.FormUser;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author bertinfajri
 */
public class ControllerUser {
    FormUser frame;
    IUser implUser;
    List<User> lb;
    
    public ControllerUser(FormUser frame) {
	this.frame = frame;
	implUser = new DAOUser();
	lb = implUser.getAll();
    }
    
    public void reset() {
	frame.getTxtNo().setText("");
	frame.getTxtNama().setText("");
	frame.getTxtUsia().setText("");
        frame.getTxtTempattinggal().setText("");
	frame.getTxtJk().setSelectedItem("");
	frame.getTxtAlasan().setText("");
    }

    public void insert() {
	if (!frame.getTxtNo().getText().trim().isEmpty()& !frame.getTxtNama().getText().trim().isEmpty()) {
		User b = new User();
		b.setNo(Integer.parseInt(frame.getTxtNo().getText()));
		b.setNama(frame.getTxtNama().getText());
                b.setUsia(Integer.parseInt(frame.getTxtUsia().getText()));
                b.setTempattinggal(frame.getTxtTempattinggal().getText());
		b.setJk(frame.getTxtJk().getSelectedItem().toString());
		b.setAlasan(frame.getTxtAlasan().getText());
		implUser.insert(b);
		JOptionPane.showMessageDialog(null, "Simpan Data Sukses");
	} else {
		JOptionPane.showMessageDialog(frame, "Data Tidak Boleh Kosong");
	}
    }
}
