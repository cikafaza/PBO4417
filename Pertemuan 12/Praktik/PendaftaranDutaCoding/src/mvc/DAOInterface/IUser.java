/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAOInterface;

import java.util.List;
import mvc.Model.User;
/**
 *
 * @author bertinfajri
 */
public interface IUser {
    public void insert(User b);
    public List<User> getAll();
}
