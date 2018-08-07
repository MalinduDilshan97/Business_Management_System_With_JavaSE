/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.dao.custom;

import edu.ijse.business_managment_system.dao.SuperDAO;
import edu.ijse.business_managment_system.dto.DailySellsDTO;
import java.util.ArrayList;

/**
 *
 * @author Happy Go Lucky
 */
public interface DailySellsDAO extends SuperDAO<DailySellsDTO>{

    public ArrayList<DailySellsDTO> getAll(String date);
    
}
