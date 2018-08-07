/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.controller.custom.impl;

import edu.ijse.business_managment_system.controller.custom.UserController;
import edu.ijse.business_managment_system.dao.DAOFactory;
import edu.ijse.business_managment_system.dao.custom.UserDAO;
import edu.ijse.business_managment_system.dto.UserDTO;
import java.util.ArrayList;

/**
 *
 * @author Happy Go Lucky
 */
public class UserControllerImpl implements UserController{
    
     private UserDAO userDAO;
    
    public UserControllerImpl() {
        userDAO = (UserDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.USER);        
    }

    @Override
    public boolean add(UserDTO userDTO) throws Exception {
        return userDAO.add(userDTO);
    }

    @Override
    public boolean update(UserDTO userDTO) throws Exception {
        return userDAO.update(userDTO);
    }

    @Override
    public boolean delete(String key) throws Exception {
       return userDAO.delete(key);
    }

    @Override
    public UserDTO search(String key) throws Exception {
        return userDAO.search(key);
    }

    @Override
    public ArrayList<UserDTO> getAll() throws Exception {
        return userDAO.getAll();
    }

    @Override
    public UserDTO searchForLogin(String userName) {
         return userDAO.searchForLogin(userName);
    }
    
}
