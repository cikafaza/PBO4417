/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Controller;
import mvc.DAO.DAOPendaftar;
import mvc.DAOInterface.IPendaftar;
import mvc.Model.Pendaftar;
import mvc.Model.TabelModelPendaftar;
import mvc.View.FormPendaftaran;
import mvc.View.Admin;

import java.util.List;
import javax.swing.JOptionPane;

public class controllerPendaftar {
    FormPendaftaran frameP;
    Admin frameA;
    IPendaftar ImplPendaftar;
    List<Pendaftar> lb;
    
    public controllerPendaftar(FormPendaftaran frameP){
        this.frameP = frameP;
        ImplPendaftar = new DAOPendaftar();
    }
    
    public controllerPendaftar(Admin frameA){
        this.frameA = frameA;
        ImplPendaftar = new DAOPendaftar();
        lb = ImplPendaftar.getAll();
    }
    
    public void reset(){
        frameP.getTxtID().setText("");
        frameP.getTxtNama().setText("");
        frameP.getTxtNo().setText("");
        frameP.getTxtJk().setSelectedItem("");
        frameP.getTxtTempattinggal().setText("");
        frameP.getTxtUsia().setText("");
        frameP.getTxtAlasan().setText("");
    }
    
    public void isiTable(){
        lb = ImplPendaftar.getAll();
        TabelModelPendaftar tmb = new TabelModelPendaftar(lb);
        frameA.getTableData().setModel(tmb);
    }
    
    public void isiField(int row){
        frameP.getTxtID().setText(lb.get(row).getId().toString());
        frameP.getTxtNama().setText(lb.get(row).getNama());
        frameP.getTxtNo().setText(lb.get(row).getNo());
        frameP.getTxtJk().setSelectedItem(lb.get(row).getJk());
        frameP.getTxtTempattinggal().setText(lb.get(row).getTempattinggal());
        frameP.getTxtUsia().setText(lb.get(row).getUsia());
        frameP.getTxtAlasan().setText(lb.get(row).getAlasan());
    }
    
    public void insert(){
        if(!frameP.getTxtNama().getText().trim().isEmpty() & !frameP.getTxtNo().getText().trim().isEmpty()){
            Pendaftar p = new Pendaftar();
            p.setId(Integer.parseInt(frameP.getTxtID().getText()));
            p.setNama(frameP.getTxtNama().getText());
            p.setNo(frameP.getTxtNo().getText());
            p.setJk(frameP.getTxtJk().getSelectedItem().toString());
            p.setTempattinggal(frameP.getTxtTempattinggal().getText());
            p.setUsia(frameP.getTxtUsia().getText());
            p.setAlasan(frameP.getTxtAlasan().getText());
            ImplPendaftar.insert(p);
            JOptionPane.showMessageDialog(null, "Anda Telah Terdaftar");
        } else{
            JOptionPane.showMessageDialog(frameP, "Data Tidak Boleh Kosong");
        }
    }
    
    public void update(){
      if (!frameA.getTxtID().getText().trim().isEmpty()) {
            Pendaftar p = new Pendaftar();
            p.setNama(frameA.getTxtNama().getText());
            p.setNo(frameA.getTxtNo().getText());
            p.setJk(frameA.getTxtJk().getSelectedItem().toString());
            p.setTempattinggal(frameA.getTxtTempattinggal().getText());
            p.setUsia(frameA.getTxtUsia().getText());
            p.setId(Integer.parseInt(frameA.getTxtID().getText()));
            ImplPendaftar.update(p);
            JOptionPane.showMessageDialog(null, "Update Data Sukses");
	} else {
		JOptionPane.showMessageDialog(frameA, "Pilih data yang akan diubah");
	}
    }
    
    public void delete(){
        if(!frameA.getTxtID().getText().trim().isEmpty()){
            int id = Integer.parseInt(frameA.getTxtID().getText());
            ImplPendaftar.delete(id);
            JOptionPane.showMessageDialog(null, "Hapus Data Sukses");
        } else{
            JOptionPane.showMessageDialog(frameA, "Masukkan ID untuk menghapus");
        }
    }
    
    public void isiTableCariNama(){
        lb = ImplPendaftar.getCariNama(frameA.getTxtCariNama().getText());
        TabelModelPendaftar tmb = new TabelModelPendaftar(lb);
        frameA.getTableData().setModel(tmb);
    }
    
    public void cariNama(){
        if(!frameA.getTxtCariNama().getText().trim().isEmpty()){
            ImplPendaftar.getCariNama(frameA.getTxtCariNama().getText());
            isiTableCariNama();
        } else{
            JOptionPane.showMessageDialog(frameA, "Silakan Masukkan Nama Terlebih Dahulu");
        }
    }
    
}
