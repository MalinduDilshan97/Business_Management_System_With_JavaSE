/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.controller.custom.impl;

import edu.ijse.business_managment_system.controller.custom.GRNController;
import edu.ijse.business_managment_system.dao.DAOFactory;
import edu.ijse.business_managment_system.dao.custom.BatchDAO;
import edu.ijse.business_managment_system.dao.custom.GRNDAO;
import edu.ijse.business_managment_system.dao.custom.GRNDetailDAO;
import edu.ijse.business_managment_system.db.ConnectionFactory;
import edu.ijse.business_managment_system.dto.BatchDTO;
import edu.ijse.business_managment_system.dto.GRNDTO;
import edu.ijse.business_managment_system.dto.GRNDetailDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Happy Go Lucky
 */
public class GrnControllerImpl implements GRNController{
    
    private GRNDAO grnDAO;
    private GRNDetailDAO grnDetailDAO;
    private BatchDAO batchDAO;

    public GrnControllerImpl() {
        grnDAO = (GRNDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.GRN);
        grnDetailDAO = (GRNDetailDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.GRN_DETAIL);
        batchDAO = (BatchDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.BATCH);
        
    }
    
    

    @Override
    public boolean add(GRNDTO grnDTO, ArrayList<GRNDetailDTO> allGRNDetails, ArrayList<BatchDTO> allBatch) {
        try {
            Connection connection = ConnectionFactory.getInstance().getConnection();
            
            connection.setAutoCommit(false);
            
            boolean result = grnDAO.add(grnDTO);
            
            if (result){
                
                for (GRNDetailDTO allGRNDetail : allGRNDetails) {
                    result = grnDetailDAO.add(allGRNDetail);
                    
                    if (!result){
                        connection.rollback();
                        connection.setAutoCommit(true);
                        return false;
                    }
                }
                
                for (BatchDTO batch : allBatch) {
                    result = batchDAO.add(batch);
                    if (!result){
                        connection.rollback();
                        connection.setAutoCommit(true);
                        return false;
                    }
                }
                
                connection.setAutoCommit(true);
                return true;
                
            }else{
                connection.setAutoCommit(true);
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SupplierOrderControllerImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(SupplierOrderControllerImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        
    }

    @Override
    public boolean add(GRNDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(GRNDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GRNDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<GRNDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
