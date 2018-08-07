/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.controller.custom.impl;

import edu.ijse.business_managment_system.controller.custom.ViewStockController;
import edu.ijse.business_managment_system.dao.DAOFactory;
import edu.ijse.business_managment_system.dao.custom.ViewStockDAO;
import edu.ijse.business_managment_system.dto.ViewStockDTO;
import java.util.ArrayList;

/**
 *
 * @author Happy Go Lucky
 */
public class ViewStockControllerImpl implements ViewStockController{
    
     private ViewStockDAO viewStockDAO;
    
    public ViewStockControllerImpl() {
        viewStockDAO = (ViewStockDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.VIEWSTOCK);        
    }

    @Override
    public boolean add(ViewStockDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ViewStockDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ViewStockDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ViewStockDTO> getAll() throws Exception {
        return viewStockDAO.getAll();
    }
    
}
