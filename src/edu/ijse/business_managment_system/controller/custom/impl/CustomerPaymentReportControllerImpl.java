/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.controller.custom.impl;

import edu.ijse.business_managment_system.controller.custom.CustomerPaymentReportController;
import edu.ijse.business_managment_system.dao.DAOFactory;
import edu.ijse.business_managment_system.dao.custom.CustomerPaymentReportDAO;
import edu.ijse.business_managment_system.dto.CustomerPaymentReportDTO;
import java.util.ArrayList;

/**
 *
 * @author Happy Go Lucky
 */
public class CustomerPaymentReportControllerImpl implements CustomerPaymentReportController {

    private CustomerPaymentReportDAO customerPaymentReportDAO;

    public CustomerPaymentReportControllerImpl() {
        customerPaymentReportDAO = (CustomerPaymentReportDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMER_PAYMENT_REPORT); 
    }

    @Override
    public boolean add(CustomerPaymentReportDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(CustomerPaymentReportDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CustomerPaymentReportDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CustomerPaymentReportDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CustomerPaymentReportDTO> getAll(String cid) {
        ArrayList<CustomerPaymentReportDTO> all = customerPaymentReportDAO.getAll(cid);
        return all;
    }

}
