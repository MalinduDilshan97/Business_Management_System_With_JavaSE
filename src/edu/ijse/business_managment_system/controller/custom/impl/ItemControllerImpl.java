/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.controller.custom.impl;

import edu.ijse.business_managment_system.controller.custom.ItemController;
import edu.ijse.business_managment_system.dao.DAOFactory;
import edu.ijse.business_managment_system.dao.custom.ItemDAO;
import edu.ijse.business_managment_system.dto.ItemDTO;
import java.util.ArrayList;

/**
 *
 * @author Happy Go Lucky
 */
public class ItemControllerImpl implements ItemController{
    
    private ItemDAO itemDAO;
    
    public ItemControllerImpl() {
        itemDAO = (ItemDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ITEM);        
    }

    @Override
    public boolean add(ItemDTO itemDTO) throws Exception {
        return itemDAO.add(itemDTO); 
    }

    @Override
    public boolean update(ItemDTO itemDTO) throws Exception {
        return itemDAO.update(itemDTO);
    }

    @Override
    public boolean delete(String key) throws Exception {
        return itemDAO.delete(key);
    }

    @Override
    public ItemDTO search(String key) throws Exception {
        return itemDAO.search(key);
    }

    @Override
    public ArrayList<ItemDTO> getAll() throws Exception {
       return itemDAO.getAll();
    }
    
    
    
}
