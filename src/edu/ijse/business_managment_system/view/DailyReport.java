/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.view;

import edu.ijse.business_managment_system.controller.ControllerFactory;
import edu.ijse.business_managment_system.controller.custom.DailySellsController;
import edu.ijse.business_managment_system.dto.DailySellsDTO;
import edu.ijse.business_managment_system.view.ViewReport;
import java.awt.KeyEventPostProcessor;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Happy Go Lucky
 */

 

public class DailyReport extends javax.swing.JFrame {

    private DailySellsController ctrlDailySells;
     private Timer tmrTime;
    
    /**
     * Creates new form Ratings
     */
    public DailyReport() {
        ctrlDailySells = (DailySellsController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.DAILY_SELLS);
        initComponents();
        setTime();
        loadKeyListener();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblViewReport = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblExit = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        txtIncome = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtProfit = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReport = new javax.swing.JTable();
        pnlTime = new javax.swing.JPanel();
        lblTime = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Daily Sells Report");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 360, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 420, 50));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("YYYY - MM - DD");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 100, 20));

        lblViewReport.setBackground(new java.awt.Color(255, 255, 255));
        lblViewReport.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblViewReport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblViewReport.setText("View Report");
        lblViewReport.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        lblViewReport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblViewReport.setOpaque(true);
        lblViewReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblViewReportMouseClicked(evt);
            }
        });
        jPanel1.add(lblViewReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 150, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Inuput Date :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 140, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Income Of The Day :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 190, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setMinimumSize(new java.awt.Dimension(100, 40));
        jPanel3.setPreferredSize(new java.awt.Dimension(1300, 40));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblExit.setBackground(new java.awt.Color(0, 0, 0));
        lblExit.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblExit.setForeground(new java.awt.Color(255, 255, 255));
        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setText("Ecs");
        lblExit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExit.setOpaque(true);
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });
        jPanel3.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 11, 50, 20));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Back");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 30, 20));

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Enter");
        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel23.setOpaque(true);
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 50, 20));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Select");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 50, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 690, 1280, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 1350, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 1366, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 1366, 10));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Profit Of The Day :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 620, 190, 30));

        txtIncome.setEditable(false);
        txtIncome.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtIncome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtIncome, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 620, 210, 30));

        txtDate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 350, 30));

        txtProfit.setEditable(false);
        txtProfit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtProfit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtProfit, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 620, 210, 30));

        tblReport.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tblReport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Model", "Selling Price", "Buying Price", "Porfit"
            }
        ));
        jScrollPane1.setViewportView(tblReport);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 1280, 340));

        pnlTime.setBackground(new java.awt.Color(255, 255, 255));
        pnlTime.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTime.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        lblTime.setForeground(new java.awt.Color(0, 0, 204));
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlTime.add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 50));

        jPanel1.add(pnlTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 20, 290, 50));

        lblBack.setBackground(new java.awt.Color(102, 102, 102));
        lblBack.setOpaque(true);
        jPanel1.add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        
        Back();
      
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblViewReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewReportMouseClicked
        DefaultTableModel dtm = (DefaultTableModel) tblReport.getModel();
        dtm.setRowCount(0);
        String date = txtDate.getText();
       

        try {
            ArrayList<DailySellsDTO> allreport = ctrlDailySells.getAll(date);

            if (allreport == null) {
                return;
            }

            for (DailySellsDTO report : allreport) {
                Object[] rowData = {
                    report.getOid(),
                    report.getModel(),
                    report.getSellingPrice(),
                    report.getBuyingPrice(),
                    report.getProfit()

                };
                dtm.addRow(rowData);
            }
            Income();
            Profit();
        } catch (Exception ex) {
            Logger.getLogger(DailyReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lblViewReportMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DailyReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DailyReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DailyReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DailyReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DailyReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblViewReport;
    private javax.swing.JPanel pnlTime;
    private javax.swing.JTable tblReport;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtIncome;
    private javax.swing.JTextField txtProfit;
    // End of variables declaration//GEN-END:variables

    private void setTime() {
          tmrTime=new Timer(0, new ActionListener() {

           
            public void actionPerformed(ActionEvent e) {
                Date dt = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("hh: mm: ss");
                lblTime.setText(sdf.format(dt));
            }

        } );
         tmrTime.start();
    }

    private void Income() {
         DefaultTableModel dtm = (DefaultTableModel) tblReport.getModel();
        double income=0;
        double inc;
         for(int i=0;i<dtm.getRowCount();i++){
           
            inc=Double.parseDouble(dtm.getValueAt(i, 2).toString()); 
            income=income+inc;    
        }
         txtIncome.setText(""+income);
    }

    private void Profit() {
         DefaultTableModel dtm = (DefaultTableModel) tblReport.getModel();
        double profit=0;
        double pro;
         for(int i=0;i<dtm.getRowCount();i++){
           
            pro=Double.parseDouble(dtm.getValueAt(i, 4).toString()); 
            profit=profit+pro;    
        }
         txtProfit.setText(""+profit);
    }

    private void loadKeyListener() {
          KeyboardFocusManager manger = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        manger.addKeyEventPostProcessor(new KeyEventPostProcessor() {

            @Override
            public boolean postProcessKeyEvent(KeyEvent e) {
                if(e.getID()== KeyEvent.KEY_PRESSED){
                    switch(e.getKeyCode()){
                        case KeyEvent.VK_ESCAPE:
                            Back();break;
                        
                    }
                }
                return false;
            }
        });
    }

    private void Back() {
          new ViewReport().setVisible(true);
        this.dispose();
        tmrTime.stop();
    }
}