/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAOInterface;

import java.util.List;
import mvc.Model.Admin;
/**
 *
 * @author bertinfajri
 */
public interface IAdmin {
    public void update(Admin b);
    public void delete(int no);
    public List<Admin> getAll();
}
