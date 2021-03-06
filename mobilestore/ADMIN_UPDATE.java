/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobilestore;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.sql.*;
import java.sql.PreparedStatement;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;
import java.io.InputStream;
import java.util.Random;
import javax.imageio.ImageIO;
import net.proteanit.sql.DbUtils;
public class ADMIN_UPDATE extends javax.swing.JFrame {
    String s;

    /**
     * Creates new form ADMIN_UPDATE
     */
    public ADMIN_UPDATE() {
        super("insert image to database in java");
        this.setUndecorated(true);
        initComponents();
        setSize(1920,1080);
         Random ran=new Random();
       String generatedid = String.format("%04d", ran.nextInt(10000));
       pid.setText(generatedid);
    }
     
 public ImageIcon ResizeImage(String ImagePath){
       ImageIcon MyImage=new ImageIcon(ImagePath);
       Image img=MyImage.getImage();
       Image newImg=img.getScaledInstance(ph.getWidth(),ph.getHeight(),Image.SCALE_SMOOTH);
       ImageIcon image=new ImageIcon(newImg);
       return image;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        pn = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        spe = new javax.swing.JTextArea();
        pri = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        ph = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        quan = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADD NEW PRODUCT");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 10, 520, 58);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PRODUCT NAME:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 170, 270, 35);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FEATURES:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 240, 180, 35);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PRICE:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 530, 120, 37);

        pid.setEditable(false);
        pid.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        pid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pidActionPerformed(evt);
            }
        });
        getContentPane().add(pid);
        pid.setBounds(280, 90, 230, 57);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PRODUCT ID:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(70, 100, 240, 49);

        pn.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        getContentPane().add(pn);
        pn.setBounds(280, 160, 490, 58);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 2, 25)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("SELECT IMAGE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(800, 20, 327, 47);

        spe.setColumns(20);
        spe.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        spe.setRows(5);
        jScrollPane1.setViewportView(spe);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(280, 240, 490, 280);

        pri.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        getContentPane().add(pri);
        pri.setBounds(150, 530, 180, 40);

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("ADD");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(630, 580, 117, 65);
        getContentPane().add(ph);
        ph.setBounds(790, 80, 410, 490);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("QUANTITY:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(350, 530, 180, 40);

        quan.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        getContentPane().add(quan);
        quan.setBounds(530, 530, 180, 40);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mobilestore/1_xDGtplbrOnaKC1ov7t23kA.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 10, 50, 50);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mobilestore/simple_blue__black_wallpaper-wallpaper-1920x1080.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 1880, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pidActionPerformed
        // TODO add your handling code here:
      
      
    }//GEN-LAST:event_pidActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
 try{
        JFileChooser fileChooser=new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter=new FileNameExtensionFilter("*.IMAGE","jpeg","jpg","png");
        fileChooser.addChoosableFileFilter(filter);
        int result=fileChooser.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile=fileChooser.getSelectedFile();
            String path=selectedFile.getAbsolutePath();
            ph.setIcon(ResizeImage(path));
            s=path;
        }
        else if(result==JFileChooser.CANCEL_OPTION){
            System.out.println("No data");
        }
        }catch(Exception e){
            System.out.println("the error is"+e);
        }
        
  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        //empty fields
        String pn1= pn.getText().toString();
              String spe1= spe.getText().toString();
              String pri1= pri.getText().toString();
               String ph1= ph.getText().toString();
               String quan1= quan.getText().toString();
              boolean found=false;
        if( pn.getText().length()==0 ||  spe.getText().length()==0  || pri.getText().length()==0|| quan.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane,"ALL THE FIELDS MUST BE FILLED");
        }
        //changing image location
        BufferedImage bufImage = new BufferedImage(ph.getSize().width,ph.getSize().height,BufferedImage.TYPE_INT_RGB);
        ph.paint(bufImage.createGraphics());
        int jpg = 0;
        File imageFile = new File("D:\\DBMS Proj\\product images\\"+pn1+",jpg");
        try{
            imageFile.createNewFile();
            ImageIO.write(bufImage, "jpg", imageFile);
        }catch(Exception ex){
            System.out.println("the error is");
            JOptionPane.showMessageDialog(rootPane, ex);
             System.out.println("the error is");
        }
       
        String prdid=pid.getText().toString().trim();
        
        if( pn.getText().length()!=0 &&  spe.getText().length()!=0  && pri.getText().length()!=0 && quan.getText().length()!=0){
 
     
  JOptionPane.showMessageDialog(rootPane,"UPDATING......");
  Connection conn=null; 
              try{
        
           try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mobile_store","root","");
            PreparedStatement ps=con.prepareStatement("insert into admin_update (PRODUCT_ID,PRODUCT_NAME,SPECIFICATION,PRICE,IMAGE,QUANTITY)values(?,?,?,?,?,?)");
            InputStream is=new FileInputStream(new File(s));
             ps.setString(1,pid.getText());
            ps.setString(2,pn.getText());
            ps.setString(3,spe.getText());
            ps.setString(4,pri.getText());
             ps.setBlob(5,is);
            ps.setString(6,quan.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data Inserted");
        }catch(Exception e){
            System.out.println(e);
        }
        
         //show existing details using stored procedure
        /* java.sql.ResultSet rsl;
        Connection conn1=null; 
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mobile_store","root","");
            System.out.println("connected at stored procedure");
            Statement stmtl=(Statement) conn1.createStatement();
            String query1="CALL `getAdminupdate`()";
            rsl=stmtl.executeQuery(query1);
            
            
            {
                jTable.SetModel(DbUtils.resultSetToTableModel(rsl));
            }
            
        }catch(Exception e){
             System.out.println(e);
        }
        }*/
            
            
          new ADMIN_DASHBOARD1 ().setVisible(true);
     // ob.show();
  setVisible(false);
           dispose();
     }catch(Exception e){
          JOptionPane.showMessageDialog(rootPane,"Error");
     }
        
    
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         ADMIN_DASHBOARD1 ob=new ADMIN_DASHBOARD1();
        ob.setVisible(true);
        ob.show();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ADMIN_UPDATE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADMIN_UPDATE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADMIN_UPDATE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADMIN_UPDATE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ADMIN_UPDATE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel ph;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField pn;
    private javax.swing.JTextField pri;
    private javax.swing.JTextField quan;
    private javax.swing.JTextArea spe;
    // End of variables declaration//GEN-END:variables

}

