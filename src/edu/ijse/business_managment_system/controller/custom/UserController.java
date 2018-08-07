/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.controller.custom;

import edu.ijse.business_managment_system.controller.SuperController;
import edu.ijse.business_managment_system.dto.UserDTO;

/**
 *
 * @author Happy Go Lucky
 */
public interface UserController extends SuperController<UserDTO>{

    public UserDTO searchForLogin(String userName);
    
}
