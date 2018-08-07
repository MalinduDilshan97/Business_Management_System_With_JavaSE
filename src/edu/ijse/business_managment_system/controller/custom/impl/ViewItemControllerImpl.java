/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.controller.custom.impl;

import edu.ijse.business_managment_system.controller.custom.ViewItemController;
import edu.ijse.business_managment_system.dao.DAOFactory;
import edu.ijse.business_managment_system.dao.custom.ViewItemDAO;
import edu.ijse.business_managment_system.dto.ViewItemDTO;
import java.util.ArrayList;

/**
 *
 * @author Happy Go Lucky
 */
public class ViewItemControllerImpl  implements ViewItemController{
    
    private ViewItemDAO viewItemDAO;
    
    public ViewItemControllerImpl() {
        viewItemDAO = (ViewItemDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.VIEWITEM);        
    }

    @Override
    public boolean add(ViewItemDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ViewItemDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ViewItemDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ViewItemDTO> getAll() throws Exception {
         return viewItemDAO.getAll();
    }
    
}
