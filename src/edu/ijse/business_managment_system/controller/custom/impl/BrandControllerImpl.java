/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.controller.custom.impl;

import edu.ijse.business_managment_system.controller.custom.BrandController;
import edu.ijse.business_managment_system.dao.DAOFactory;
import edu.ijse.business_managment_system.dao.custom.BrandDAO;
import edu.ijse.business_managment_system.dto.BrandDTO;
import java.util.ArrayList;

/**
 *
 * @author Happy Go Lucky
 */
public class BrandControllerImpl implements BrandController{
    
     private BrandDAO brandDAO;
    
    public BrandControllerImpl() {
       brandDAO = (BrandDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.BRAND);        
    }

    @Override
    public boolean add(BrandDTO brandDTO) throws Exception {
        return brandDAO.add(brandDTO);  
    }

    @Override
    public boolean update(BrandDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BrandDTO search(String key) throws Exception {
        return brandDAO.search(key);
    }

    @Override
    public ArrayList<BrandDTO> getAll() throws Exception {
        return brandDAO.getAll(); 
    }
    
}
