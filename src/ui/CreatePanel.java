/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.Cars;
import model.CarsHistory;

/**
 *
 * @author Kiran
 */
public class CreatePanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePanel
     */
    CarsHistory history;
    public String availibility;
    public String maintenanceExpiration;
    public CreatePanel(CarsHistory history) {
        initComponents();
        this.history = history;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_modelname = new javax.swing.JTextField();
        txt_manufacturer = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_seats = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_platenumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_colour = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        checkBox_Availability_yes = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        txt_manufacturingyear = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        labelname = new javax.swing.JLabel();
        labelmanufacturer = new javax.swing.JLabel();
        labelmanuyear = new javax.swing.JLabel();
        labelseats = new javax.swing.JLabel();
        labelvehicleplate = new javax.swing.JLabel();
        labelcarcolor = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        checkBox_Availability_no = new javax.swing.JCheckBox();
        radioButton_Expired = new javax.swing.JRadioButton();
        radioButton_NotExpired = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        comboBox_Location = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(0, 0, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Car Model Name :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Manufacturer:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, -1, -1));

        txt_modelname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_modelnameKeyReleased(evt);
            }
        });
        add(txt_modelname, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 220, 80, -1));

        txt_manufacturer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_manufacturerKeyReleased(evt);
            }
        });
        add(txt_manufacturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, 80, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Seats:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, -1, -1));

        txt_seats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_seatsActionPerformed(evt);
            }
        });
        txt_seats.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_seatsKeyReleased(evt);
            }
        });
        add(txt_seats, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 330, 80, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Vehicle Plate Number:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, -1, -1));

        txt_platenumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_platenumberKeyReleased(evt);
            }
        });
        add(txt_platenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 370, 80, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Car Colour:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, -1, -1));

        txt_colour.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_colourKeyReleased(evt);
            }
        });
        add(txt_colour, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 400, 80, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Car Availablility:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, -1, -1));

        checkBox_Availability_yes.setForeground(new java.awt.Color(255, 255, 255));
        checkBox_Availability_yes.setText("available");
        checkBox_Availability_yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBox_Availability_yesActionPerformed(evt);
            }
        });
        add(checkBox_Availability_yes, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 440, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Maintenance :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, -1, -1));

        saveButton.setBackground(new java.awt.Color(204, 204, 255));
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 560, -1, -1));

        txt_manufacturingyear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_manufacturingyearKeyReleased(evt);
            }
        });
        add(txt_manufacturingyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, 80, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Manufacturing Year:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, -1, -1));

        labelname.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        labelname.setForeground(new java.awt.Color(255, 255, 0));
        add(labelname, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 220, -1, -1));

        labelmanufacturer.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        labelmanufacturer.setForeground(new java.awt.Color(255, 255, 0));
        add(labelmanufacturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 260, -1, -1));

        labelmanuyear.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        labelmanuyear.setForeground(new java.awt.Color(255, 255, 0));
        add(labelmanuyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 300, -1, -1));

        labelseats.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        labelseats.setForeground(new java.awt.Color(255, 255, 0));
        add(labelseats, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 330, -1, -1));

        labelvehicleplate.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        labelvehicleplate.setForeground(new java.awt.Color(255, 255, 0));
        add(labelvehicleplate, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 370, -1, -1));

        labelcarcolor.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        labelcarcolor.setForeground(new java.awt.Color(255, 255, 0));
        add(labelcarcolor, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 400, -1, 30));

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Insert Car Details");
        jPanel1.add(jLabel1);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 100));

        checkBox_Availability_no.setForeground(new java.awt.Color(255, 255, 255));
        checkBox_Availability_no.setText("inaccessible");
        checkBox_Availability_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBox_Availability_noActionPerformed(evt);
            }
        });
        add(checkBox_Availability_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 440, 120, -1));

        radioButton_Expired.setForeground(new java.awt.Color(255, 255, 255));
        radioButton_Expired.setText("expired");
        radioButton_Expired.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton_ExpiredActionPerformed(evt);
            }
        });
        add(radioButton_Expired, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 510, -1, -1));

        radioButton_NotExpired.setForeground(new java.awt.Color(255, 255, 255));
        radioButton_NotExpired.setText("exists");
        radioButton_NotExpired.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton_NotExpiredActionPerformed(evt);
            }
        });
        add(radioButton_NotExpired, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 510, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Location:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, -1, -1));

        comboBox_Location.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        comboBox_Location.setForeground(new java.awt.Color(255, 255, 255));
        comboBox_Location.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boston", "Seattle", "NewYork", "Charlotte" }));
        comboBox_Location.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_LocationActionPerformed(evt);
            }
        });
        add(comboBox_Location, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 480, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txt_modelnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_modelnameKeyReleased
        // TODO add your handling code here:
        String PATTERN="^[a-zA-Z0-9 ]{0,30}$";//pattern for name text field         
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match =patt.matcher(txt_modelname.getText());
        if(!match.matches()){ //if pattern does't match display below message and disable save button 
            labelname.setText("Something went wrong!!");
            saveButton.setEnabled(false);
        }
        else{ //if pattern matches do not display any message and enable the save button
            labelname.setText(null);
            saveButton.setEnabled(true);
        }
    }//GEN-LAST:event_txt_modelnameKeyReleased

    private void txt_manufacturerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_manufacturerKeyReleased
        // TODO add your handling code here:
        String PATTERN="^[a-zA-Z]{0,30}$";//pattern for name text field         
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match =patt.matcher(txt_manufacturer.getText());
        if(!match.matches()){ //if pattern does't match display below message and disable save button 
            labelmanufacturer.setText("Something went wrong!!");
            saveButton.setEnabled(false);
        }
        else{ //if pattern matches do not display any message and enable the save button
            labelmanufacturer.setText(null);
            saveButton.setEnabled(true);
        }
    }//GEN-LAST:event_txt_manufacturerKeyReleased

    private void txt_manufacturingyearKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_manufacturingyearKeyReleased
        // TODO add your handling code here:
        String PATTERN="^[0-9]{4}$";//pattern for name text field         
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match =patt.matcher(txt_manufacturingyear.getText());
        if(!match.matches()){ //if pattern does't match display below message and disable save button 
            labelmanuyear.setText("Something went wrong!!");
            saveButton.setEnabled(false);
        }
        else{ //if pattern matches do not display any message and enable the save button
            labelmanuyear.setText(null);
            saveButton.setEnabled(true);
        }
    }//GEN-LAST:event_txt_manufacturingyearKeyReleased

    private void txt_seatsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_seatsKeyReleased
        // TODO add your handling code here:
        String PATTERN="^[0-9]{0,2}$";//pattern for name text field         
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match =patt.matcher(txt_seats.getText());
        if(!match.matches()){ //if pattern does't match display below message and disable save button 
            labelseats.setText("Something went wrong!!");
            saveButton.setEnabled(false);
        }
        else{ //if pattern matches do not display any message and enable the save button
            labelseats.setText(null);
            saveButton.setEnabled(true);
        }
    }//GEN-LAST:event_txt_seatsKeyReleased

    private void txt_platenumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_platenumberKeyReleased
        // TODO add your handling code here:
        String PATTERN="^[a-zA-Z0-9]{0,10}$";//pattern for name text field         
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match =patt.matcher(txt_platenumber.getText());
        if(!match.matches()){ //if pattern does't match display below message and disable save button 
            labelvehicleplate.setText("Something went wrong!!");
            saveButton.setEnabled(false);
        }
        else{ //if pattern matches do not display any message and enable the save button
            labelvehicleplate.setText(null);
            saveButton.setEnabled(true);
        }
    }//GEN-LAST:event_txt_platenumberKeyReleased

    private void txt_colourKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_colourKeyReleased
        // TODO add your handling code here:
        String PATTERN="^[a-zA-Z]{0,10}$";//pattern for name text field         
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match =patt.matcher(txt_colour.getText());
        if(!match.matches()){ //if pattern does't match display below message and disable save button 
            labelcarcolor.setText("Something went wrong!!");
            saveButton.setEnabled(false);
        }
        else{ //if pattern matches do not display any message and enable the save button
            labelcarcolor.setText(null);
            saveButton.setEnabled(true);
        }
    }//GEN-LAST:event_txt_colourKeyReleased

    private void txt_seatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_seatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_seatsActionPerformed

    private void checkBox_Availability_yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBox_Availability_yesActionPerformed
        // TODO add your handling code here:
        if(checkBox_Availability_yes.isSelected()){
        checkBox_Availability_no.setSelected(false);
        }
    }//GEN-LAST:event_checkBox_Availability_yesActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
         String vehicleLicensePlate = txt_platenumber.getText();
         
        if(checkBox_Availability_yes.isSelected()){
             availibility = checkBox_Availability_yes.getText();
         }
         else if(checkBox_Availability_no.isSelected()){
             availibility = checkBox_Availability_no.getText();
         }
         if(radioButton_Expired.isSelected()){
             maintenanceExpiration = radioButton_Expired.getText();
         }
         else if(radioButton_NotExpired.isSelected()){
             
             maintenanceExpiration = radioButton_NotExpired.getText();
         }
         for(Cars c : history.getHistory()){
              if(c.getVehicleLicensePlate().contains(vehicleLicensePlate)){
                  JOptionPane.showMessageDialog(this,"Vehicle License Plate already exists. Please enter another vehicle license plate");
                  return;
              }
              else
                  break;
         }  
        savemethod();
              
          
          
            
          
    }//GEN-LAST:event_saveButtonActionPerformed

    private void checkBox_Availability_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBox_Availability_noActionPerformed
        // TODO add your handling code here:
        
         if(checkBox_Availability_no.isSelected()){
        checkBox_Availability_yes.setSelected(false);
        }
    }//GEN-LAST:event_checkBox_Availability_noActionPerformed

    private void radioButton_ExpiredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton_ExpiredActionPerformed
        // TODO add your handling code here:
        if(radioButton_Expired.isSelected()){
        radioButton_NotExpired.setSelected(false);
        }
    }//GEN-LAST:event_radioButton_ExpiredActionPerformed

    private void radioButton_NotExpiredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton_NotExpiredActionPerformed
        // TODO add your handling code here:
        if(radioButton_NotExpired.isSelected()){
        radioButton_Expired.setSelected(false);
        }
    }//GEN-LAST:event_radioButton_NotExpiredActionPerformed

    private void comboBox_LocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_LocationActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_comboBox_LocationActionPerformed

private void savemethod(){
    
    

         String carModelName = txt_modelname.getText();
         String manufacturer = txt_manufacturer.getText();
         long manufacturingYear = Integer.parseInt(txt_manufacturingyear.getText());
         int seats = Integer.parseInt(txt_seats.getText());
         String vehicleLicensePlate = txt_platenumber.getText();
         String colour = txt_colour.getText();
         String selectedValue = comboBox_Location.getSelectedItem().toString();
         
         
         Cars c = history.addNewCar();
         
         c.setCarModelName(carModelName);
         c.setManufacturer(manufacturer);
         c.setManufacturingYear(manufacturingYear);
         c.setSeats(seats);
         c.setVehicleLicensePlate(vehicleLicensePlate);
         c.setColour(colour);
         c.setCarAvailability(availibility);
         c.setMaintenanceExpiration(maintenanceExpiration);
         c.setLocation(selectedValue);
                 
         JOptionPane.showMessageDialog(this, "New Car details added!!");
         txt_modelname.setText("");
         txt_manufacturer.setText("");
         txt_manufacturingyear.setText("");
         txt_seats.setText("");
         txt_platenumber.setText("");
         txt_colour.setText("");
         comboBox_Location.setSelectedItem(false);
         radioButton_NotExpired.setSelected(false);
         radioButton_Expired.setSelected(false);
         checkBox_Availability_yes.setSelected(false);
         checkBox_Availability_no.setSelected(false);
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkBox_Availability_no;
    private javax.swing.JCheckBox checkBox_Availability_yes;
    private javax.swing.JComboBox<String> comboBox_Location;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelcarcolor;
    private javax.swing.JLabel labelmanufacturer;
    private javax.swing.JLabel labelmanuyear;
    private javax.swing.JLabel labelname;
    private javax.swing.JLabel labelseats;
    private javax.swing.JLabel labelvehicleplate;
    private javax.swing.JRadioButton radioButton_Expired;
    private javax.swing.JRadioButton radioButton_NotExpired;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField txt_colour;
    private javax.swing.JTextField txt_manufacturer;
    private javax.swing.JTextField txt_manufacturingyear;
    private javax.swing.JTextField txt_modelname;
    private javax.swing.JTextField txt_platenumber;
    private javax.swing.JTextField txt_seats;
    // End of variables declaration//GEN-END:variables
}
