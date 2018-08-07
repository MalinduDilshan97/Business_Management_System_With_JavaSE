/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.dao;

import edu.ijse.business_managment_system.dao.custom.impl.BatchDAOImpl;
import edu.ijse.business_managment_system.dao.custom.impl.BrandDAOImpl;
import edu.ijse.business_managment_system.dao.custom.impl.CategoryDAOImpl;
import edu.ijse.business_managment_system.dao.custom.impl.CustomerDAOImpl;
import edu.ijse.business_managment_system.dao.custom.impl.CustomerOrderDAOImpl;
import edu.ijse.business_managment_system.dao.custom.impl.CustomerOrderDetailDAOImpl;
import edu.ijse.business_managment_system.dao.custom.impl.CustomerPaymentDAOImpl;
import edu.ijse.business_managment_system.dao.custom.impl.CustomerPaymentReportDAOImpl;
import edu.ijse.business_managment_system.dao.custom.impl.DailySellsDAOImpl;
import edu.ijse.business_managment_system.dao.custom.impl.GrnDAOImpl;
import edu.ijse.business_managment_system.dao.custom.impl.GrnDetailDAOImpl;
import edu.ijse.business_managment_system.dao.custom.impl.ItemDAOImpl;
import edu.ijse.business_managment_system.dao.custom.impl.SupplierDAOImpl;
import edu.ijse.business_managment_system.dao.custom.impl.SupplierOrderDAOImpl;
import edu.ijse.business_managment_system.dao.custom.impl.SupplierOrderDetailDAOImpl;
import edu.ijse.business_managment_system.dao.custom.impl.SupplierPaymentDAOImpl;
import edu.ijse.business_managment_system.dao.custom.impl.SupplierPaymentReportDAOImpl;
import edu.ijse.business_managment_system.dao.custom.impl.UserDAOImpl;
import edu.ijse.business_managment_system.dao.custom.impl.ViewItemDAOImpl;
import edu.ijse.business_managment_system.dao.custom.impl.ViewStockDAOImpl;

/**
 *
 * @author Happy Go Lucky
 */
public class DAOFactory {
    
     public enum DAOTypes{
         CUSTOMER, SUPPLIER, USER, ITEM, BATCH, GRN, GRN_DETAIL, SUPPLIER_ORDER, SUPPLIER_ORDER_DETAIL, CUSTOMER_ORDER, CUSTOMER_ORDER_DETAIL, SUPPLIER_PAYMENT, CUSTOMER_PAYMENT  ,CATEGORY ,BRAND ,VIEWITEM ,VIEWSTOCK ,CUSTOMER_PAYMENT_REPORT ,SUPPLIER_PAYMENT_REPORT ,DAILY_SELLS;
    }
    
    private static DAOFactory daoFactory;
    
    private DAOFactory(){
        
    }
    
    public static DAOFactory getInstance(){
        if (daoFactory == null){
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }
    
    public SuperDAO getDAO(DAOTypes daoType) {
        switch(daoType){
             case CUSTOMER:
                return (SuperDAO) new CustomerDAOImpl();
             case SUPPLIER:
                return  (SuperDAO) new SupplierDAOImpl();
             case USER:
                return  (SuperDAO) new UserDAOImpl();
             case BATCH:
                return  (SuperDAO) new BatchDAOImpl();
            case ITEM:
                return (SuperDAO) new ItemDAOImpl();
            case GRN:
                return (SuperDAO) new GrnDAOImpl();
            case GRN_DETAIL:
                return (SuperDAO) new GrnDetailDAOImpl();
            case SUPPLIER_ORDER:
                return (SuperDAO) new SupplierOrderDAOImpl();
            case SUPPLIER_ORDER_DETAIL:
                return (SuperDAO) new SupplierOrderDetailDAOImpl();
            case CUSTOMER_ORDER:
                return (SuperDAO) new CustomerOrderDAOImpl();
            case CUSTOMER_ORDER_DETAIL:
                return (SuperDAO) new CustomerOrderDetailDAOImpl();
             case SUPPLIER_PAYMENT:
                return (SuperDAO) new SupplierPaymentDAOImpl();
             case CUSTOMER_PAYMENT:
                return (SuperDAO) new CustomerPaymentDAOImpl();
              case CATEGORY:
                return  (SuperDAO) new CategoryDAOImpl();
             case BRAND:
                return  (SuperDAO) new BrandDAOImpl();
              case VIEWITEM:
                return  (SuperDAO) new ViewItemDAOImpl();
             case VIEWSTOCK:
                return  (SuperDAO) new ViewStockDAOImpl();
             case CUSTOMER_PAYMENT_REPORT:
                return  (SuperDAO) new CustomerPaymentReportDAOImpl();
              case SUPPLIER_PAYMENT_REPORT:
                return  (SuperDAO) new SupplierPaymentReportDAOImpl();
             case DAILY_SELLS:
                return  (SuperDAO) new DailySellsDAOImpl();
            default:
                return null;
        }
    }
    
    
}
