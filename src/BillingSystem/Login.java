/*
 * Module 1
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BillingSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JOptionPane;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.border.BevelBorder;

/**
 *

 */
public class Login extends javax.swing.JFrame {

   
    public Login() {super("Login Page");
setPreferredSize(new Dimension(1920, 1080));
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        jPanel1.setBackground(new Color(204, 204, 204));
        jLabel4 = new javax.swing.JLabel();
        jUsername1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPassword1 = new javax.swing.JPasswordField();
        Cancel = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        Login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Password");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 130, 140, 30);

        jUsername1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jUsername1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jUsername1.setText(" ");
        jUsername1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUsername1ActionPerformed(evt);
            }
        });
        jPanel1.add(jUsername1);
        jUsername1.setBounds(210, 50, 190, 30);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Username");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 50, 140, 30);

        jPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPassword1ActionPerformed(evt);
            }
        });
        jPanel1.add(jPassword1);
        jPassword1.setBounds(210, 130, 190, 30);

        Cancel.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        jPanel1.add(Cancel);
        Cancel.setBounds(230, 230, 100, 40);

        Exit.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit);
        Exit.setBounds(420, 230, 100, 40);

        Login.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					LoginActionPerformed(evt);
				} catch (Exception e) {
					
					e.printStackTrace();
				}
            }
        });
        jPanel1.add(Login);
        Login.setBounds(50, 230, 100, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(349, 188, 560, 330);

        pack();
    }
    private void jUsername1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUsername1ActionPerformed

    }
    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
         
         
         jUsername1.setText("");
         jPassword1.setText("");
    }

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
       System.exit(0);
    }
    private void LoginActionPerformed(java.awt.event.ActionEvent evt) throws Exception {//GEN-FIRST:event_LoginActionPerformed
                                               
        String Username = jUsername1.getText();
        String Password = jPassword1.getText();
        
        if(Username.contains("IT")&&(Password.contains("RAIT")))
        {
         
           Registrationform  RF= new Registrationform();
           insertDataIntoDB();
            RF.setVisible(true);
           
}
           
        else if(!(Username.contains("IT")&&(Password.contains("RAIT"))))
        {
          jUsername1.setText("");
          jPassword1.setText("");
          JOptionPane.showMessageDialog(null, "Invalid login");
          setVisible(false);
}

    }//GEN-LAST:event_LoginActionPerformed

    private void jPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPassword1ActionPerformed
        
    }//GEN-LAST:event_jPassword1ActionPerformed

   
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
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true); //thread
            }
        });
    }

    // Variables declaration 
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Login;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPassword1;
    private javax.swing.JTextField jUsername1;
    // End of variables declaration
    public void insertDataIntoDB() throws Exception
    {
    	Connection con;
    	Statement stat;
    	Class.forName("com.mysql.jdbc.Driver");
    	 con =DriverManager.getConnection("jdbc:mysql://localhost:3306/test3","root","");  
     	stat=  con.createStatement();
     	
     	String query2 = null;
     	System.out.println(jUsername1.getText());
     	System.out.println(jPassword1.getText());
    		query2 = "insert into login values('"+ jUsername1.getText() + "','"+ jPassword1.getText() +"')";
    		
    		stat.executeUpdate(query2);
    		
    		con.close();
    }
}
