/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobilestore;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sahana
 */
public class Mobiles extends javax.swing.JDialog {

    /**
     * Creates new form IPHONES
     */
     public Mobiles() {
            this.setUndecorated(true);    
            initComponents();
              
        setSize(1920,1080);
     }
     

    public Mobiles(String id) {
       
       this.setUndecorated(true);
        initComponents();
        setSize(1920,1080);
   name1.setText(id);
      Connection conn=null;
     java.sql.ResultSet rs;
  try{ 
    conn=java.sql.DriverManager.getConnection( "jdbc:mysql://localhost:3306/mobile_store","root","");
          System.out.println("Connected");
           Statement stmt=(Statement) conn.createStatement();
         String query="SELECT * FROM mobile_store.admin_update";
          rs=stmt.executeQuery(query);
   if(rs.isBeforeFirst()){
             while(rs.next()){
              drop.addItem(rs.getString(2));
                }
        
  }}catch(Exception e){
                 System.out.println(e);       
                    }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        drop = new javax.swing.JComboBox<>();
        pppp = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        des = new javax.swing.JTextArea();
        ref = new javax.swing.JTextField();
        ph1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Button = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        name1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pr = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        qua = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        delete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 51, 255));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("                      Products");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(90, 10, 800, 50);

        drop.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        drop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropActionPerformed(evt);
            }
        });
        getContentPane().add(drop);
        drop.setBounds(360, 120, 510, 64);

        pppp.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        getContentPane().add(pppp);
        pppp.setBounds(360, 190, 220, 50);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SELECT YOUR Product:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 120, 340, 60);

        des.setColumns(20);
        des.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        des.setRows(5);
        jScrollPane1.setViewportView(des);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(360, 330, 530, 190);

        ref.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        getContentPane().add(ref);
        ref.setBounds(360, 260, 480, 50);
        getContentPane().add(ph1);
        ph1.setBounds(910, 50, 410, 500);

        jButton1.setBackground(new java.awt.Color(255, 102, 51));
        jButton1.setFont(new java.awt.Font("Agency FB", 1, 50)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BUY ");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(470, 610, 220, 70);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SPECIFICATION:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 310, 270, 80);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mobilestore/1_xDGtplbrOnaKC1ov7t23kA.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 10, 50, 50);

        Button.setBackground(new java.awt.Color(0, 0, 0));
        Button.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        Button.setForeground(new java.awt.Color(255, 255, 255));
        Button.setText("VIEW");
        Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Button);
        Button.setBounds(1010, 10, 160, 30);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("YOUR  CUSTOMER_ID :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 70, 312, 50);

        name1.setEditable(false);
        name1.setBackground(new java.awt.Color(153, 153, 153));
        name1.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        name1.setForeground(new java.awt.Color(255, 255, 255));
        name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name1ActionPerformed(evt);
            }
        });
        getContentPane().add(name1);
        name1.setBounds(360, 70, 180, 40);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("YOU SELECTED:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 250, 260, 70);

        pr.setEditable(false);
        pr.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        pr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prActionPerformed(evt);
            }
        });
        getContentPane().add(pr);
        pr.setBounds(120, 540, 210, 50);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PRICE:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 540, 120, 40);

        add.setBackground(new java.awt.Color(0, 255, 153));
        add.setFont(new java.awt.Font("Agency FB", 0, 40)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("ADD TO CART");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add);
        add.setBounds(120, 610, 290, 50);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("QUANTITY:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(350, 540, 190, 38);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PRODUCT_ID:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 190, 240, 47);

        qua.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        getContentPane().add(qua);
        qua.setBounds(530, 540, 140, 50);

        Table.setBackground(new java.awt.Color(0, 0, 153));
        Table.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        Table.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        Table.setForeground(new java.awt.Color(255, 255, 255));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "customer_id", "Phone", "PRICE", "QUANTITY", "PRODUCT_ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.setToolTipText("");
        Table.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(Table);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(720, 580, 470, 170);

        delete.setBackground(new java.awt.Color(255, 102, 0));
        delete.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        delete.setText("EMPTY  CART");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete);
        delete.setBounds(120, 680, 290, 50);

        jLabel7.setBackground(new java.awt.Color(0, 0, 51));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mobilestore/mobile-on-emi.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, -20, 1920, 1120);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropActionPerformed
        // TODO add your handling code here:
       ref.setText((String) drop.getSelectedItem());
        String val=ref.getText().trim();
         Connection conn=null;
     java.sql.ResultSet rs;
  try{ 
    conn=java.sql.DriverManager.getConnection( "jdbc:mysql://localhost:3306/mobile_store","root","");
          System.out.println("Connected  1");
           Statement stmt=(Statement) conn.createStatement();
         String query="SELECT * FROM mobile_store.admin_update WHERE PRODUCT_NAME='"+val+"'";
          rs=stmt.executeQuery(query);
          System.out.println(rs);
   if(rs.isBeforeFirst()){
             while(rs.next()){
           String h=rs.getString(3);
           String i=rs.getString(4); 
           String toi=rs.getString(1);
           des.setText(h);
             pr.setText(i);
             pppp.setText(toi);
                }
        
  }}catch(Exception e){
                 System.out.println(e);       
                    }
  
  
  
  
  
  
        
    }//GEN-LAST:event_dropActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          
          String id=name1.getText();
         String x= pr.getText();
           String y= ref.getText();
        BILLING ob=new BILLING(id,y,x);
        ob.setVisible(true);
        ob.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String id=name1.getText();
         PRODUCT_LOGIN ob=new PRODUCT_LOGIN(id);
        ob.setVisible(true);
        ob.show();
        dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActionPerformed
        // TODO add your handling code here:
          ref.setText(drop.getSelectedItem().toString());
         try{
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/mobile_store","root","");
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("select * from admin_update where PRODUCT_NAME = '"+ref.getText()+"'");
            if(rs.next()){
                byte[] img = rs.getBytes("IMAGE");
                ImageIcon image=new ImageIcon(img);
                Image im=image.getImage();
                Image myImg=im.getScaledInstance(ph1.getWidth(),ph1.getHeight(),Image.SCALE_SMOOTH);
                ImageIcon newImage=new ImageIcon(myImg);
                ph1.setIcon(newImage);
            }
                else
                {
                        JOptionPane.showMessageDialog(null, "No data");
                        }
                
            
        }catch(Exception e){
            System.out.println("error"+e);
        }
        
    }//GEN-LAST:event_ButtonActionPerformed

    private void prActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane,"PRODUCT IS ADDED TO CART");
       Connection conn=null; 
              try{
            //CONNECTION ESTABLISH
            conn=DriverManager.getConnection( "jdbc:mysql://localhost:3306/mobile_store","root","");
          System.out.println("Connected here");
            Statement stmt=(Statement) conn.createStatement();
            //INSERTION 
              String qty=qua.getText();
        int qut=Integer.parseInt(qty);
         String pri=pr.getText();
        int ppp=Integer.parseInt(pri);
        
        int vall=qut*ppp;
        String value=Integer.toString(vall);
  stmt.executeUpdate("INSERT INTO mobile_store.logs(customer_id,PRODUCT_ID,PHONE,PRICE,QUANTITY) VALUES ('"+name1.getText()+"','"+pppp.getText()+"','"+ref.getText()+"','"+value+"','"+qua.getText()+"')");
            
        }catch(Exception e){
              System.out.println(e);
        }
        DefaultTableModel model=(DefaultTableModel) Table.getModel();
        model.addRow(new Object[]{name1.getText(),ref.getText(),pr.getText(),qua.getText(),pppp.getText()});
    }//GEN-LAST:event_addActionPerformed

    private void name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model= (DefaultTableModel) Table.getModel();
        Connection conn=null;
        try{
            model.setRowCount(0);
            //CONNECTION ESTABLISH
            conn=DriverManager.getConnection( "jdbc:mysql://localhost:3306/mobile_store","root","");
          System.out.println("Connected 2");
           Statement stmt=(Statement) conn.createStatement();
         
      stmt.executeUpdate("DELETE FROM mobile_store.logs");
        }catch(Exception e){
              System.out.println(e);
        }
    }//GEN-LAST:event_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(Mobiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mobiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mobiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mobiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mobiles().setVisible(true);
            } 
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button;
    private javax.swing.JTable Table;
    private javax.swing.JButton add;
    private javax.swing.JButton delete;
    private javax.swing.JTextArea des;
    private javax.swing.JComboBox<String> drop;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField name1;
    private javax.swing.JLabel ph1;
    private javax.swing.JTextField pppp;
    private javax.swing.JTextField pr;
    private javax.swing.JTextField qua;
    private javax.swing.JTextField ref;
    // End of variables declaration//GEN-END:variables

}
