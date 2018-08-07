/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.controller.custom.impl;

import edu.ijse.business_managment_system.controller.custom.SupplierController;
import edu.ijse.business_managment_system.dao.DAOFactory;
import edu.ijse.business_managment_system.dao.custom.SupplierDAO;
import edu.ijse.business_managment_system.dto.SupplierDTO;
import java.util.ArrayList;

/**
 *
 * @author Happy Go Lucky
 */
public class SupplierControllerImpl implements SupplierController{
    
     private SupplierDAO supplierDAO;
    
    public SupplierControllerImpl() {
        supplierDAO = (SupplierDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SUPPLIER);        
    }

    @Override
    public boolean add(SupplierDTO supplierDTO) throws Exception {
         return supplierDAO.add(supplierDTO);
    }

    @Override
    public boolean update(SupplierDTO supplierDTO) throws Exception {
        return supplierDAO.update(supplierDTO);
    }

    @Override
    public boolean delete(String key) throws Exception {
         return supplierDAO.delete(key);
    }

    @Override
    public SupplierDTO search(String key) throws Exception {
        return supplierDAO.search(key);
    }

    @Override
    public ArrayList<SupplierDTO> getAll() throws Exception {
         return supplierDAO.getAll();
    }
    
}
