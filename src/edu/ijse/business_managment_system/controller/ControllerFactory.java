/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.controller;

import edu.ijse.business_managment_system.controller.custom.impl.BatchControllerImpl;
import edu.ijse.business_managment_system.controller.custom.impl.BrandControllerImpl;
import edu.ijse.business_managment_system.controller.custom.impl.CategoryControllerImpl;
import edu.ijse.business_managment_system.controller.custom.impl.CustomerControllerImpl;
import edu.ijse.business_managment_system.controller.custom.impl.CustomerOrderControllerImpl;
import edu.ijse.business_managment_system.controller.custom.impl.CustomerPaymentControllerImpl;
import edu.ijse.business_managment_system.controller.custom.impl.CustomerPaymentReportControllerImpl;
import edu.ijse.business_managment_system.controller.custom.impl.DailySellsControllerImpl;
import edu.ijse.business_managment_system.controller.custom.impl.GrnControllerImpl;
import edu.ijse.business_managment_system.controller.custom.impl.GrnDetailControllerImpl;
import edu.ijse.business_managment_system.controller.custom.impl.ItemControllerImpl;
import edu.ijse.business_managment_system.controller.custom.impl.SupplierControllerImpl;
import edu.ijse.business_managment_system.controller.custom.impl.SupplierOrderControllerImpl;
import edu.ijse.business_managment_system.controller.custom.impl.SupplierPaymentControllerImpl;
import edu.ijse.business_managment_system.controller.custom.impl.SupplierPaymentReportControllerImpl;
import edu.ijse.business_managment_system.controller.custom.impl.UserControllerImpl;
import edu.ijse.business_managment_system.controller.custom.impl.ViewItemControllerImpl;
import edu.ijse.business_managment_system.controller.custom.impl.ViewStockControllerImpl;

/**
 *
 * @author Happy Go Lucky
 */
public class ControllerFactory {
    
    public enum ControllerTypes{
        CUSTOMER, SUPPLIER, USER, ITEM, BATCH, GRN, GRN_DETAIL, SUPPLIER_ORDER, CUSTOMER_ORDER,  SUPPLIER_PAYMENT, CUSTOMER_PAYMENT  ,CATEGORY ,BRAND ,VIEWITEM ,VIEWSTOCK ,CUSTOMER_PAYMENT_REPORT ,SUPPLIER_PAYMENT_REPORT ,DAILY_SELLS;
    }
    
    private static ControllerFactory ctrlFactory;
    
    private ControllerFactory(){
        
    }
    
    public static ControllerFactory getInstance(){
        if (ctrlFactory == null){
            ctrlFactory = new ControllerFactory();
        }
        return ctrlFactory;
    }
    
    public SuperController getController(ControllerTypes controllerTypes) {
        switch (controllerTypes){
            case CUSTOMER:
                return (SuperController) new CustomerControllerImpl();
             case SUPPLIER:
                return (SuperController) new SupplierControllerImpl();
             case USER:
                return (SuperController) new UserControllerImpl();
             case BATCH:
                return (SuperController) new BatchControllerImpl();
            case ITEM:
                return (SuperController) new ItemControllerImpl();
            case GRN:
                return (SuperController) new GrnControllerImpl();
            case GRN_DETAIL:
                return (SuperController) new GrnDetailControllerImpl();
            case SUPPLIER_ORDER:
                return (SuperController) new SupplierOrderControllerImpl();
            case CUSTOMER_ORDER:
                return (SuperController) new CustomerOrderControllerImpl();
             case SUPPLIER_PAYMENT:
                return (SuperController) new SupplierPaymentControllerImpl();
             case CUSTOMER_PAYMENT:
                return (SuperController) new CustomerPaymentControllerImpl();
             case CATEGORY:
                return (SuperController) new CategoryControllerImpl();
             case BRAND:
                return (SuperController) new BrandControllerImpl();
             case VIEWITEM:
                return (SuperController) new ViewItemControllerImpl();
             case VIEWSTOCK:
                return (SuperController) new ViewStockControllerImpl();
              case CUSTOMER_PAYMENT_REPORT:
                return (SuperController) new CustomerPaymentReportControllerImpl();
              case SUPPLIER_PAYMENT_REPORT:
                return (SuperController) new SupplierPaymentReportControllerImpl();
              case DAILY_SELLS:
                return (SuperController) new DailySellsControllerImpl();
            default:
                return null;
        }
    }
    
    
}
