/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Koneksi;
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
/**
 *
 * @author bertinfajri
 */
public class Koneksi {
    static Connection con;
    static Statement stm;
	
    public static Connection connection(){
	if (con == null) {
            String DatabaseName = "db_crud";
            String User = "root";
            String Password = "";
            try {
		con = DriverManager.getConnection(DatabaseName,User,Password);
                stm = con.createStatement();
            } catch (Exception ex) {
		System.out.println("tidak konek");
            }
	}
        return con;
    }
}
