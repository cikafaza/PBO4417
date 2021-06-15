/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAO;
import mvc.Koneksi.Koneksi;
import mvc.Model.Pendaftar;
import mvc.DAOInterface.IPendaftar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOPendaftar implements IPendaftar{
    Connection connection;
    
    final String insert = "INSERT INTO tbl_pendaftaran(id, nama, no, jk, tempattinggal, usia, alasan) VALUES (?,?,?,?,?,?,?);";
    final String update = "UPDATE tbl_pendaftaran SET nama=?, no=?, jk=?, tempattinggal=?, usia=?, alasan=? WHERE id=?;";
    final String delete = "DELETE FROM tbl_pendaftaran WHERE id=?;";
    final String select = "SELECT * FROM tbl_pendaftaran;";
    final String carinama = "SELECT * FROM tbl_pendaftaran WHERE nama LIKE?;";
    
    public DAOPendaftar(){
        connection = Koneksi.connection();
    }
    
    @Override
    public void insert(Pendaftar p) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(insert);
            statement.setInt(1, p.getId());
            statement.setString(2, p.getNama());
            statement.setString(3, p.getNo());
            statement.setString(4, p.getJk());
            statement.setString(5, p.getTempattinggal());
            statement.setString(6, p.getUsia());
            statement.setString(7, p.getAlasan());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while(rs.next()){
                p.setId(rs.getInt(1));
            }
        } catch(SQLException ex){
            System.out.println("Berhasil input");
        } finally{
            try{
                statement.close();
            } catch(SQLException ex){
                System.out.println("Gagal Input");
            }
        }
        
    }

    @Override
    public void update(Pendaftar p) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(update);     
            statement.setString(1, p.getNama());
            statement.setString(2, p.getNo());
            statement.setString(3, p.getJk());
            statement.setString(4, p.getTempattinggal());
            statement.setString(5, p.getUsia());
            statement.setString(6, p.getAlasan());
            statement.setInt(7, p.getId());
            statement.executeUpdate();
        } catch(SQLException ex){
            System.out.println("Berhasil Update");
        } finally{
            try{
                statement.close();
            } catch(SQLException ex){
                System.out.println("Gagal Update");
            }
        }

    }

    @Override
    public void delete(int id) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(delete);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch(SQLException ex){
            System.out.println("Berhasil Delete");
        } finally{
            try{
                statement.close();
            }catch(SQLException ex){
                System.out.println("Gagal Delete");
            }
        }
    }

    @Override
    public List<Pendaftar> getAll() {
        List<Pendaftar> lb = null;
        try{
            lb = new ArrayList<Pendaftar>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while(rs.next()){
                Pendaftar p = new Pendaftar();
                p.setId(rs.getInt("id"));
                p.setNama(rs.getString("nama"));
                p.setNo(rs.getString("no"));
                p.setJk(rs.getString("jk"));
                p.setTempattinggal(rs.getString("tempattinggal"));
                p.setUsia(rs.getString("usia"));
                p.setAlasan(rs.getString("alasan"));
                lb.add(p);
            }
        } catch(SQLException ex){
            Logger.getLogger(DAOPendaftar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lb;
    }

    @Override
    public List<Pendaftar> getCariNama(String nama) {
        List<Pendaftar> lb = null;
        try{
            lb = new ArrayList<Pendaftar>();
            PreparedStatement st = connection.prepareStatement(carinama);
            st.setString(1, "%" + nama + "%");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Pendaftar p = new Pendaftar();
                p.setId(rs.getInt("id"));
                p.setNama(rs.getString("nama"));
                p.setNo(rs.getString("no"));
                p.setJk(rs.getString("jk"));
                p.setTempattinggal(rs.getString("tempattinggal"));
                p.setUsia(rs.getString("usia"));
                p.setAlasan(rs.getString("alasan"));
                lb.add(p);
            }
        } catch(SQLException ex){
            Logger.getLogger(DAOPendaftar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lb;
    }
}
