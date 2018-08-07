/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.controller.custom.impl;

import edu.ijse.business_managment_system.controller.custom.DailySellsController;
import edu.ijse.business_managment_system.dao.DAOFactory;
import edu.ijse.business_managment_system.dao.custom.DailySellsDAO;
import edu.ijse.business_managment_system.dto.DailySellsDTO;
import java.util.ArrayList;

/**
 *
 * @author Happy Go Lucky
 */
public class DailySellsControllerImpl implements DailySellsController{
    
     private DailySellsDAO dailySellsDAO;
    
    public DailySellsControllerImpl() {
        dailySellsDAO = (DailySellsDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.DAILY_SELLS);        
    }

    @Override
    public boolean add(DailySellsDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(DailySellsDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DailySellsDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<DailySellsDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<DailySellsDTO> getAll(String date) {
         ArrayList<DailySellsDTO> all = dailySellsDAO.getAll(date);
        return all;
    }
    
}
