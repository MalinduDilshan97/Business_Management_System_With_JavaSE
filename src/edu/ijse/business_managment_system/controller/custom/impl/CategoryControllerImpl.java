/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.controller.custom.impl;

import edu.ijse.business_managment_system.controller.custom.CategoryController;
import edu.ijse.business_managment_system.dao.DAOFactory;
import edu.ijse.business_managment_system.dao.custom.CategoryDAO;
import edu.ijse.business_managment_system.dto.CategoryDTO;
import java.util.ArrayList;

/**
 *
 * @author Happy Go Lucky
 */
public class CategoryControllerImpl implements CategoryController{
    
    private CategoryDAO categoryDAO;
    
    public CategoryControllerImpl() {
       categoryDAO = (CategoryDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CATEGORY);        
    }

    @Override
    public boolean add(CategoryDTO categoryDTO) throws Exception {
        return categoryDAO.add(categoryDTO);  
    }

    @Override
    public boolean update(CategoryDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CategoryDTO search(String key) throws Exception {
        return categoryDAO.search(key);
    }

    @Override
    public ArrayList<CategoryDTO> getAll() throws Exception {
         return categoryDAO.getAll(); 
    }

    
    
}
