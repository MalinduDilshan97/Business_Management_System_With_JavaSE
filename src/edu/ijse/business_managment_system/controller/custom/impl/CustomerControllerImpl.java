/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.controller.custom.impl;

import edu.ijse.business_managment_system.controller.custom.CustomerController;
import edu.ijse.business_managment_system.dao.DAOFactory;
import edu.ijse.business_managment_system.dao.custom.CustomerDAO;
import edu.ijse.business_managment_system.dto.CustomerDTO;
import java.util.ArrayList;

/**
 *
 * @author Happy Go Lucky
 */
public class CustomerControllerImpl implements CustomerController{
    
     private CustomerDAO customerDAO;
    
    public CustomerControllerImpl() {
        customerDAO = (CustomerDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMER);        
    }

    @Override
    public boolean add(CustomerDTO customerDTO) throws Exception {
        return customerDAO.add(customerDTO);
    }

    @Override
    public boolean update(CustomerDTO customerDTO) throws Exception {
        return customerDAO.update(customerDTO);
    }

    @Override
    public boolean delete(String key) throws Exception {
       return customerDAO.delete(key);
    }

    @Override
    public CustomerDTO search(String key) throws Exception {
        return customerDAO.search(key);
    }

    @Override
    public ArrayList<CustomerDTO> getAll() throws Exception {
        return customerDAO.getAll();
    }
    
}
