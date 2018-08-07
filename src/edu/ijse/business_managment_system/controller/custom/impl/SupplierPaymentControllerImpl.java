/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.controller.custom.impl;

import edu.ijse.business_managment_system.controller.custom.SupplierPaymentController;
import edu.ijse.business_managment_system.dao.DAOFactory;
import edu.ijse.business_managment_system.dao.custom.SupplierPaymentDAO;
import edu.ijse.business_managment_system.dto.SupplierPaymentDTO;
import java.util.ArrayList;

/**
 *
 * @author Happy Go Lucky
 */
public class SupplierPaymentControllerImpl implements SupplierPaymentController{
    
    private SupplierPaymentDAO supplierPaymentDAO;
    
    public SupplierPaymentControllerImpl() {
        supplierPaymentDAO = (SupplierPaymentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SUPPLIER_PAYMENT);        
    }

    @Override
    public boolean add(SupplierPaymentDTO supplierPaymentDTO) throws Exception {
         return supplierPaymentDAO.add(supplierPaymentDTO);
    }

    @Override
    public boolean update(SupplierPaymentDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SupplierPaymentDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<SupplierPaymentDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
