/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.controller.custom.impl;

import edu.ijse.business_managment_system.controller.custom.SupplierPaymentReportController;
import edu.ijse.business_managment_system.dao.DAOFactory;
import edu.ijse.business_managment_system.dao.custom.SupplierPaymentReportDAO;
import edu.ijse.business_managment_system.dto.SupplierPaymentReportDTO;
import java.util.ArrayList;

/**
 *
 * @author Happy Go Lucky
 */
public class SupplierPaymentReportControllerImpl implements SupplierPaymentReportController{
    
     private SupplierPaymentReportDAO supplierPaymentReportDAO;

    public SupplierPaymentReportControllerImpl() {
        supplierPaymentReportDAO = (SupplierPaymentReportDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SUPPLIER_PAYMENT_REPORT); 
    }

    @Override
    public boolean add(SupplierPaymentReportDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(SupplierPaymentReportDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SupplierPaymentReportDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<SupplierPaymentReportDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<SupplierPaymentReportDTO> getAll(String sid) {
         ArrayList<SupplierPaymentReportDTO> all = supplierPaymentReportDAO.getAll(sid);
        return all;
    }
    
}
