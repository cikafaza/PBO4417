/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAO;

import mvc.Koneksi.Koneksi;
import mvc.Model.Admin;
import mvc.DAOInterface.IAdmin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author bertinfajri
 */
public class DAOAdmin implements IAdmin{
    Connection connection;
    final String insert = "INSERT INTO Tbl_Pendaftaran (no, nama, jk, tempattinggal, usia, alasan) VALUES (?, ?, ?, ?, ?, ?);";
    final String update = "UPDATE Tbl_Pendaftaran set nama=?, jk=?, tempattinggal=?, usia=?, alasan=? where no=?;";
    final String delete = "DELETE FROM Tbl_Pendaftaran where no=?;";
    final String select = "SELECT * FROM Tbl_Pendaftaran;";
    
    public DAOAdmin() {
        connection = Koneksi.connection();
    }
    
    public List<Admin> getAll() {
	List<Admin> lb = null;
	try {
            lb = new ArrayList<Admin>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
		Admin b = new Admin();
		b.setNo(rs.getInt("no"));
		b.setNama(rs.getString("nama"));
		b.setUsia(rs.getInt("usia"));
                b.setTempattinggal(rs.getString("tempattinggal"));
		b.setJk(rs.getString("jk"));
		b.setAlasan(rs.getString("alasan"));
		lb.add(b);
            }
	} catch (SQLException ex){
            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, null, ex);
	}
	return lb;
    }
    
    public void update(Admin b) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(update);
            statement.setString(1, b.getNama());
            statement.setString(2, b.getJk());
            statement.setString(3, b.getTempattinggal());
            statement.setInt(4, b.getUsia());
            statement.setString(5, b.getAlasan());
            statement.setInt(6, b.getNo());
            statement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Berhasil Update");
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Gagal Update");
            }
        }
    }

    public void delete(int no) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete);
            statement.setInt(1, no);
            statement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Berhasil Delete");
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Gagal Delete");
            }
        }
    }
    
}
