/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.view;

import edu.ijse.business_managment_system.controller.ControllerFactory;
import edu.ijse.business_managment_system.controller.custom.UserController;
import edu.ijse.business_managment_system.dto.UserDTO;
import edu.ijse.business_managment_system.view.Admin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Happy Go Lucky
 */
public class Login extends javax.swing.JFrame {
        
    
     private UserController ctrlUser;
     private Timer tmrTime;
    /**
     * Creates new form Login
     */
    public Login() {
        ctrlUser = (UserController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.USER);
        initComponents();
        setTime();
        lblErrorUser.setVisible(false);
        lblErrorpsw.setVisible(false);
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
        pswPassword = new javax.swing.JPasswordField();
        txtUserName = new javax.swing.JTextField();
        lblErrorUser = new javax.swing.JLabel();
        lblErrorpsw = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        lblWelcome = new javax.swing.JLabel();
        lblWelcome2 = new javax.swing.JLabel();
        lblBack2 = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pswPassword.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        pswPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pswPassword.setBorder(null);
        jPanel1.add(pswPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 460, 40));

        txtUserName.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtUserName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUserName.setBorder(null);
        jPanel1.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 460, 40));

        lblErrorUser.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblErrorUser.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblErrorUser.setText("UserName Dosen't Match");
        jPanel1.add(lblErrorUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 254, 270, 20));

        lblErrorpsw.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblErrorpsw.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorpsw.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblErrorpsw.setText("Password Dosen't Match");
        jPanel1.add(lblErrorpsw, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 370, 270, 20));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 1366, 10));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 1366, 10));

        lblExit.setBackground(new java.awt.Color(255, 0, 0));
        lblExit.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        lblExit.setForeground(new java.awt.Color(255, 255, 255));
        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setText("Exit");
        lblExit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 4));
        lblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });
        jPanel1.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 700, 100, 60));

        lblLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoginMouseClicked(evt);
            }
        });
        lblLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblLoginKeyPressed(evt);
            }
        });
        jPanel1.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, 500, 40));

        lblWelcome.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome.setText("Welcome ,");
        jPanel1.add(lblWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 300, 60));

        lblWelcome2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        lblWelcome2.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcome2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome2.setText("... Let's Get Started ...");
        jPanel1.add(lblWelcome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 320, 60));

        lblBack2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/business_managment_system/view/Pics/login.jpg"))); // NOI18N
        lblBack2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(lblBack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 540, 340));

        lblTime.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 20, 300, 60));

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/business_managment_system/view/Pics/home copy.jpg"))); // NOI18N
        jPanel1.add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseClicked
            String userName=txtUserName.getText();
            String userN;
            String password=pswPassword.getText();
            String psw;
		try{
                    //System.out.println(password);
		UserDTO user=ctrlUser.searchForLogin(userName);
		if(user!=null){
                        if(password.equals(user.getPassword())){
                            new Admin().setVisible(true);
                            this.dispose();
                        }else{
                            lblErrorpsw.setVisible(true);
                        }
			
		}else{
			lblErrorUser.setVisible(true);
		}
		} catch (Exception ex) {	
                    Logger.getLogger(ManageUser.class.getName()).log(Level.SEVERE, null, ex);
                }	 
    }//GEN-LAST:event_lblLoginMouseClicked

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        this.dispose();
        tmrTime.stop();
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblLoginKeyPressed
      new Admin().setVisible(true);
        this.dispose();
        tmrTime.stop();
    }//GEN-LAST:event_lblLoginKeyPressed
    
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBack2;
    private javax.swing.JLabel lblErrorUser;
    private javax.swing.JLabel lblErrorpsw;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel lblWelcome2;
    private javax.swing.JPasswordField pswPassword;
    private javax.swing.JTextField txtUserName;
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
}

