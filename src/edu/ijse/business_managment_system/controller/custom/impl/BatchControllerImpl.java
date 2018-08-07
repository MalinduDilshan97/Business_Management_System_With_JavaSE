/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.controller.custom.impl;

import edu.ijse.business_managment_system.controller.custom.BatchController;
import edu.ijse.business_managment_system.dao.DAOFactory;
import edu.ijse.business_managment_system.dao.custom.BatchDAO;
import edu.ijse.business_managment_system.dto.BatchDTO;
import java.util.ArrayList;

/**
 *
 * @author Happy Go Lucky
 */
public class BatchControllerImpl implements BatchController{
    
     private BatchDAO batchDAO;
    
    public BatchControllerImpl() {
        batchDAO = (BatchDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.BATCH);        
    }

    @Override
    public boolean add(BatchDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(BatchDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        return batchDAO.delete(key);
    }

    @Override
    public BatchDTO search(String key) throws Exception {
        return batchDAO.search(key);
    }

    @Override
    public ArrayList<BatchDTO> getAll() throws Exception {
        return batchDAO.getAll();
    }
    
}
