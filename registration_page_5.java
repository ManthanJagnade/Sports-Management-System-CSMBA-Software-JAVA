/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author INTEGRAL COMPUTER
 */
public class registration_page_5 extends javax.swing.JFrame {

    /**
     * Creates new form registration_page_5
     */
    public registration_page_5() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtvillage = new javax.swing.JTextField();
        txtlastname = new javax.swing.JTextField();
        txtstate = new javax.swing.JTextField();
        txtplayerid = new javax.swing.JTextField();
        txtmiddelname = new javax.swing.JTextField();
        txtbirthplace = new javax.swing.JTextField();
        txtdateofbirth = new javax.swing.JTextField();
        txtintrested = new javax.swing.JTextField();
        txtpincode = new javax.swing.JTextField();
        txtdistrict = new javax.swing.JTextField();
        txtadmissiondate = new javax.swing.JTextField();
        txtmobile2 = new javax.swing.JTextField();
        txthobbies = new javax.swing.JTextField();
        txtcountry = new javax.swing.JTextField();
        txtmobile1 = new javax.swing.JTextField();
        txtfristname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtcaddraess = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtpaddress = new javax.swing.JTextArea();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        txtgender = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        lval = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("P l a y e r  D e t a i l s");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 270, 40));

        jPanel2.setBackground(new java.awt.Color(255, 51, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 320, 2));

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 390, 2));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setText("Last Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 120, 80, 40));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 730, 230, 40));

        txtvillage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvillageActionPerformed(evt);
            }
        });
        jPanel1.add(txtvillage, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 170, 150, 30));
        jPanel1.add(txtlastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 130, 150, 30));
        jPanel1.add(txtstate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 210, 150, 30));

        txtplayerid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtplayeridActionPerformed(evt);
            }
        });
        txtplayerid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtplayeridKeyReleased(evt);
            }
        });
        jPanel1.add(txtplayerid, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 150, 30));

        txtmiddelname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmiddelnameActionPerformed(evt);
            }
        });
        jPanel1.add(txtmiddelname, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 130, 150, 30));

        txtbirthplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbirthplaceActionPerformed(evt);
            }
        });
        jPanel1.add(txtbirthplace, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 170, 150, 30));
        jPanel1.add(txtdateofbirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 150, 30));
        jPanel1.add(txtintrested, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 380, 150, 30));

        txtpincode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpincodeActionPerformed(evt);
            }
        });
        txtpincode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpincodeKeyReleased(evt);
            }
        });
        jPanel1.add(txtpincode, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 210, 150, 30));
        jPanel1.add(txtdistrict, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 150, 30));
        jPanel1.add(txtadmissiondate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 420, 150, 30));
        jPanel1.add(txtmobile2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 460, 130, 30));
        jPanel1.add(txthobbies, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, 150, 30));
        jPanel1.add(txtcountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, 130, 30));

        txtmobile1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmobile1ActionPerformed(evt);
            }
        });
        txtmobile1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmobile1KeyReleased(evt);
            }
        });
        jPanel1.add(txtmobile1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 460, 140, 30));
        jPanel1.add(txtfristname, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 150, 30));

        txtcaddraess.setColumns(20);
        txtcaddraess.setRows(5);
        jScrollPane1.setViewportView(txtcaddraess);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, 590, 50));

        txtpaddress.setColumns(20);
        txtpaddress.setRows(5);
        jScrollPane2.setViewportView(txtpaddress);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 250, 590, 50));

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(102, 0, 0));
        jCheckBox1.setText("Medals");
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 380, -1, -1));

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(102, 0, 0));
        jCheckBox2.setText("Achievement");
        jPanel1.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 380, -1, -1));

        jCheckBox3.setForeground(new java.awt.Color(0, 102, 204));
        jCheckBox3.setText("I agree to the folling Terms and Services");
        jPanel1.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 530, 230, -1));

        txtgender.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtgender.setForeground(new java.awt.Color(102, 0, 0));
        txtgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.Female", "2.Male", "3.Others" }));
        txtgender.setBorder(null);
        jPanel1.add(txtgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, 170, 30));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 590, 310, 50));

        lval.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lval.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lval, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 524, 500, 40));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 0, 0));
        jLabel22.setText("Player Id");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 80, 40));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setIcon(new javax.swing.ImageIcon("C:\\Users\\INTEGRAL COMPUTER\\Downloads\\arrow-117-48.png")); // NOI18N
        jLabel21.setText("Back");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, 40));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 0, 0));
        jLabel20.setText("Mobile number 1");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 450, 120, 40));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 0, 0));
        jLabel19.setText("Country");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 70, 40));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 0, 0));
        jLabel18.setText("Gender");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 410, 70, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 0, 0));
        jLabel17.setText("Mobile number 2");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 450, -1, 40));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setText("Hobbies");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 70, 40));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 0));
        jLabel15.setText("Admission Date");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 410, 130, 40));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 0));
        jLabel14.setText("Current Address");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, 120, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setText("Permanent Address");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 150, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setText("District");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 90, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 0));
        jLabel11.setText("Pin code");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 200, 70, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setText("Intrested");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 370, 80, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setText("Birth place");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 160, 80, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 0));
        jLabel8.setText("State");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 200, 70, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 0));
        jLabel6.setText("First Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 80, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 0));
        jLabel7.setText("Middel Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 120, 90, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 0));
        jLabel5.setText("D/O/B");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 80, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("Village/Town");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 160, 100, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\INTEGRAL COMPUTER\\Downloads\\Webp.net-resizeimage.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtvillageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvillageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvillageActionPerformed

    private void txtmiddelnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmiddelnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmiddelnameActionPerformed

    private void txtbirthplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbirthplaceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbirthplaceActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(txtplayerid.getText().trim().isEmpty()  &&  txtfristname.getText().trim().isEmpty()  &&  txtmiddelname.getText().trim().isEmpty()  &&  txtlastname.getText().trim().isEmpty()&&  txtdateofbirth.getText().trim().isEmpty()  &&  txtbirthplace.getText().trim().isEmpty()  &&  txtvillage.getText().trim().isEmpty()  &&  txtdistrict.getText().trim().isEmpty()  &&  txtpincode.getText().trim().isEmpty()  &&  txtstate.getText().trim().isEmpty()  &&  txtpaddress.getText().trim().isEmpty()  &&  txtcaddraess.getText().trim().isEmpty()  &&  txthobbies.getText().trim().isEmpty() &&  txtintrested.getText().trim().isEmpty()  &&  txtadmissiondate.getText().trim().isEmpty()  &&  txtcountry.getText().trim().isEmpty()  &&  txtmobile1.getText().trim().isEmpty())
            
        {
            lval.setText("Some Field,s are Empty ");
        }
        
        else if (txtplayerid.getText().trim().isEmpty())
        {
            lval.setText("Player Field is Empty enter only Numbers");
        }
        
         else if (txtfristname.getText().trim().isEmpty())
        {
            lval.setText("First Name Field is Empty");
        }
        
         else if (txtmiddelname.getText().trim().isEmpty())
        {
            lval.setText("Middel Name Field is Empty");
        }
        
         else if (txtlastname.getText().trim().isEmpty())
        {
            lval.setText("Last Name Field is Empty");
        }
        
         else if (txtdateofbirth.getText().trim().isEmpty())
        {
            lval.setText("Date Of Birth Field is Empty");
        }
        
         else if (txtbirthplace.getText().trim().isEmpty())
        {
            lval.setText("Birth Place Field is Empty");
        }
        
         else if (txtvillage.getText().trim().isEmpty())
        {
            lval.setText("Village Field is Empty");
        }
        
         else if (txtdistrict.getText().trim().isEmpty())
        {
            lval.setText("District Field is Empthy");
        }
        
         else if (txtpincode.getText().trim().isEmpty())
        {
            lval.setText("Pin code Field is Empty");
        }
        
         else if (txtstate.getText().trim().isEmpty())
        {
            lval.setText("State Field is Empty");
        }
        
         else if (txtpaddress.getText().trim().isEmpty())
        {
            lval.setText("Permeant address Field is Empty");
        }
        
         else if (txthobbies.getText().trim().isEmpty())
        {
            lval.setText("Hobbies Field is Empty");
        }
        
         else if (txtintrested.getText().trim().isEmpty())
        {
            lval.setText("Intrested Field is Empty");
        }
        
         else if (txtadmissiondate.getText().trim().isEmpty())
        {
            lval.setText("Adimisson Field is Empty");
        }
        
         else if (txtcountry.getText().trim().isEmpty())
        {
            lval.setText("Country Field is Empty");
        }
        
         else if( txtmobile1.getText().trim().isEmpty())
        {
            lval.setText("Mobile Number Field is Empty enter only Numbers");
        }
        else
         {
             
         }
        
         
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registerdetails","root","");
            Statement st = con.createStatement();
            String PlayerId,FirstName, LastName, MiddelName,BirthPlace,VillageTown,District,State,PermanentAddress,CurrentAddress,Hobbies,Intrested,Gender,Country,DateOfBirth,Pincode,AdmissionDate,Mobilenumber1,Mobilenumber2;
           
            PlayerId=txtplayerid.getText();
            FirstName = txtfristname.getText();
            MiddelName = txtmiddelname.getText();
            LastName = txtlastname.getText();
            DateOfBirth=txtdateofbirth.getText();
            BirthPlace = txtbirthplace.getText();
            VillageTown=txtvillage.getText();
            District=txtdistrict.getText();
            Pincode=txtpincode.getText();
            State=txtstate.getText();
            PermanentAddress=txtpaddress.getText();
            CurrentAddress=txtcaddraess.getText();
            Hobbies=txthobbies.getText(); 
            Intrested=txtintrested.getText();
            Gender=txtgender.getSelectedItem().toString();
            AdmissionDate=txtadmissiondate.getText();
            Country=txtcountry.getText();
            Mobilenumber1=txtmobile1.getText();
            Mobilenumber2=txtmobile2.getText();
            st.executeUpdate("insert into register1 values ('" + PlayerId +"','"+ FirstName + "','" + MiddelName + "','" + LastName + "','" + DateOfBirth + "','" + BirthPlace + "','"+ VillageTown +"','"+ District + "','" + Pincode +"','" + State +"','"+ PermanentAddress + "','"+ CurrentAddress +"','"+ Hobbies + "','"+ Intrested +"','"+ Gender +"','"+ AdmissionDate +"','"+Country+"','"+Mobilenumber1+"','"+Mobilenumber2+"')");
            con.close();
        } catch (SQLException qw) {
            System.out.println(qw);
        }
                                            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtplayeridKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtplayeridKeyReleased
        // TODO add your handling code here:
        String PlayerId=txtplayerid.getText();
        if (PlayerId.matches("^[0-9]*$") && PlayerId.length()==5)
        {
            txtplayerid.setBackground(Color.green);
        }
        else
        {
            txtplayerid.setBackground(new Color(255,102,102));
        }
    }//GEN-LAST:event_txtplayeridKeyReleased

    private void txtpincodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpincodeActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_txtpincodeActionPerformed

    private void txtmobile1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmobile1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmobile1ActionPerformed

    private void txtpincodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpincodeKeyReleased
        // TODO add your handling code here:
         String PlayerId=txtpincode.getText();
        if (PlayerId.matches("^[0-9]*$") && PlayerId.length()==6)
        {
            txtpincode.setBackground(Color.green);
        }
        else
        {
            txtpincode.setBackground(new Color(255,102,102));
        }
    }//GEN-LAST:event_txtpincodeKeyReleased

    private void txtmobile1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmobile1KeyReleased
        // TODO add your handling code here:
        String PlayerId=txtmobile1.getText();
        if (PlayerId.matches("^[0-9]*$") && PlayerId.length()==10)
        {
            txtmobile1.setBackground(Color.green);
        }
        else
        {
            txtmobile1.setBackground(new Color(255,102,102));
        }
    }//GEN-LAST:event_txtmobile1KeyReleased

    private void txtplayeridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtplayeridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtplayeridActionPerformed

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
        this.dispose();
        // new Main_Dashboard_4().setVisible(true);
    }//GEN-LAST:event_jLabel21MouseClicked

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
            java.util.logging.Logger.getLogger(registration_page_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registration_page_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registration_page_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registration_page_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registration_page_5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lval;
    private javax.swing.JTextField txtadmissiondate;
    private javax.swing.JTextField txtbirthplace;
    private javax.swing.JTextArea txtcaddraess;
    private javax.swing.JTextField txtcountry;
    private javax.swing.JTextField txtdateofbirth;
    private javax.swing.JTextField txtdistrict;
    private javax.swing.JTextField txtfristname;
    private javax.swing.JComboBox<String> txtgender;
    private javax.swing.JTextField txthobbies;
    private javax.swing.JTextField txtintrested;
    private javax.swing.JTextField txtlastname;
    private javax.swing.JTextField txtmiddelname;
    private javax.swing.JTextField txtmobile1;
    private javax.swing.JTextField txtmobile2;
    private javax.swing.JTextArea txtpaddress;
    private javax.swing.JTextField txtpincode;
    private javax.swing.JTextField txtplayerid;
    private javax.swing.JTextField txtstate;
    private javax.swing.JTextField txtvillage;
    // End of variables declaration//GEN-END:variables
}
