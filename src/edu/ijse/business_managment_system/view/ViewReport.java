/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.view;

import java.awt.KeyEventPostProcessor;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author Happy Go Lucky
 */
public class ViewReport extends javax.swing.JFrame {
    
    private Timer tmrTime;

    /**
     * Creates new form ViewReport
     */
    public ViewReport() {
        initComponents();
        loadKeyListener();
        setTime();
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
        jPanel3 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pnlTime = new javax.swing.JPanel();
        lblTime = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("View Reports");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 360, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 420, 50));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(100, 40));
        jPanel3.setPreferredSize(new java.awt.Dimension(1300, 40));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Ecs");
        jLabel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel24.setOpaque(true);
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 11, 50, 20));

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

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Daily Sells Reports");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 540, 280, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Supplier Payment Reports");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 540, 280, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Customer payments Reports");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 280, 30));

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/business_managment_system/view/pics/payment-icon-5646nn.png"))); // NOI18N
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 300, 300));

        jLabel3.setBackground(new java.awt.Color(255, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/business_managment_system/view/pics/ratings1600vv.png"))); // NOI18N
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 230, 300, 300));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 320, 360));

        jLabel7.setBackground(new java.awt.Color(255, 0, 0));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/business_managment_system/view/pics/payment-icon-5655kk.png"))); // NOI18N
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 300, 300));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.setOpaque(true);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 220, 320, 360));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 320, 360));

        pnlTime.setBackground(new java.awt.Color(255, 255, 255));
        pnlTime.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTime.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        lblTime.setForeground(new java.awt.Color(0, 0, 204));
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlTime.add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 50));

        jPanel1.add(pnlTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 20, 290, 50));

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/business_managment_system/view/pics/4hgiRFC copy.jpg"))); // NOI18N
        jPanel1.add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
         Back();
        
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        new CustomerPaymentReports().setVisible(true);
        this.dispose();
        tmrTime.stop();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        new SupplierPaymentReport().setVisible(true);
        this.dispose();
        tmrTime.stop();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
       new DailyReport().setVisible(true);
        this.dispose();
        tmrTime.stop();
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(ViewReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblTime;
    private javax.swing.JPanel pnlTime;
    // End of variables declaration//GEN-END:variables

    private void Back() {
        this.dispose();
        tmrTime.stop();
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
}