/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.controller.custom;

import edu.ijse.business_managment_system.controller.SuperController;
import edu.ijse.business_managment_system.dto.BatchDTO;
import edu.ijse.business_managment_system.dto.GRNDTO;
import edu.ijse.business_managment_system.dto.GRNDetailDTO;
import java.util.ArrayList;

/**
 *
 * @author Happy Go Lucky
 */
public interface GRNController extends SuperController<GRNDTO>{

    public boolean add(GRNDTO grnDTO, ArrayList<GRNDetailDTO> allGRNDetails, ArrayList<BatchDTO> allBatch);

    
    
}
