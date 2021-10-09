/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Cars;
import model.CarsHistory;

/**
 *
 * @author Kiran
 */
public class ViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPanel
     */
    
    CarsHistory history;
    static int updateMouseClicked;
    public ViewPanel(CarsHistory history) {
        initComponents();
        this.history = history;
        
        populateTable();
        tablePopulateSearch();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)viewtablecars.getModel();
        model.setRowCount(0);
        
        for (Cars c : history.getHistory()){
            Object[] row = new Object[4];
            row[0]=c;
            row[1]=c.getManufacturer();
            row[2]=c.getColour();
            row[3]=c.getCarAvailability();
            
            model.addRow(row);
            
        }
    }
    
    public void tablePopulateSearch(){
        DefaultTableModel model = (DefaultTableModel)searchTable.getModel();
        model.setRowCount(0);
        
        for (Cars c : history.getHistory()){
            Object[] row = new Object[9];
            row[0]=c.getCarModelName();
            row[1]=c.getManufacturer();
            row[2]=c.getManufacturingYear();
            row[3]=c.getSeats();
            row[4]=c.getVehicleLicensePlate();
            row[5]=c.getColour();
            row[6]=c.getCarAvailability();
            row[7]=c.getMaintenanceExpiration();
            row[8]=c.getLocation();
            model.addRow(row);
            
        }
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
        jLabel8 = new javax.swing.JLabel();
        txt_expiration = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewtablecars = new javax.swing.JTable();
        updateButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();
        txt_Availability = new javax.swing.JTextField();
        txt_manufacturingyear = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        viewbutton = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_Location = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txt_timestamp = new javax.swing.JTextField();
        timeStampButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 51, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Car Model Name :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Manufacturer:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, -1, -1));

        txt_modelname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_modelname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txt_modelname, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 81, -1));

        txt_manufacturer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_manufacturer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txt_manufacturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 81, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Seats:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, -1, -1));

        txt_seats.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_seats.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txt_seats, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 81, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Vehicle Plate Number:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, -1, 20));

        txt_platenumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_platenumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txt_platenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 81, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Car Colour:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, -1, -1));

        txt_colour.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_colour.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txt_colour, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 80, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Car Availablility:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Maintenance Expired:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, -1, -1));

        txt_expiration.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_expiration.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txt_expiration, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, 80, -1));

        viewtablecars.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Car Model Name", "Manufacturer", "Car Colour", "Car availability"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(viewtablecars);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1220, 101));

        updateButton.setBackground(new java.awt.Color(204, 204, 255));
        updateButton.setText("Update ");
        updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateButtonMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                updateButtonMousePressed(evt);
            }
        });
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 210, -1, -1));

        searchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Model Name", "Manufacturer", "Manufacturing year", "seats", "Plate No.", "color", "Availibility", "Maintenance", "Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(searchTable);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 1220, 101));

        txt_Availability.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_Availability.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txt_Availability, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 80, -1));

        txt_manufacturingyear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_manufacturingyear.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txt_manufacturingyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 81, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Manufacturing Year:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Car Details ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(640, 640, 640)
                .addComponent(jLabel1)
                .addContainerGap(830, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, -1));

        viewbutton.setBackground(new java.awt.Color(204, 204, 255));
        viewbutton.setText("View all Details");
        viewbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbuttonActionPerformed(evt);
            }
        });
        add(viewbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 210, -1, -1));

        txt_search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });
        add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 500, 232, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("SEARCH");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, -1, -1));

        txt_Location.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_Location.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txt_Location, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, 80, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Location:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Last Update Time Stamp:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 19, -1, -1));
        jPanel2.add(txt_timestamp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 188, -1));

        timeStampButton.setBackground(new java.awt.Color(204, 204, 255));
        timeStampButton.setText("Update Time Stamp");
        timeStampButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                timeStampButtonMousePressed(evt);
            }
        });
        timeStampButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeStampButtonActionPerformed(evt);
            }
        });
        jPanel2.add(timeStampButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 280, 335, 131));
    }// </editor-fold>//GEN-END:initComponents

    private void viewbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbuttonActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = viewtablecars.getSelectedRow();
        
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Select a row to view all details");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel)viewtablecars.getModel();
        Cars selectedCars = (Cars)model.getValueAt(selectedRowIndex, 0);
        
        txt_modelname.setText(selectedCars.getCarModelName());
         txt_manufacturer.setText(selectedCars.getManufacturer());
         txt_manufacturingyear.setText(String.valueOf(selectedCars.getManufacturingYear()));
         txt_seats.setText(String.valueOf(selectedCars.getSeats()));
         txt_platenumber.setText(selectedCars.getVehicleLicensePlate());
         txt_Availability.setText(selectedCars.getCarAvailability());
         txt_colour.setText(selectedCars.getColour());
         txt_expiration.setText(selectedCars.getMaintenanceExpiration());
         txt_Location.setText(selectedCars.getLocation());
    }//GEN-LAST:event_viewbuttonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = viewtablecars.getSelectedRow();
        
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Select a row to update any detail.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel)viewtablecars.getModel();
        Cars selectedCars = (Cars)model.getValueAt(selectedRowIndex, 0);
        
        history.deleteCars(selectedCars);
        populateTable();
        
         String carModelName = txt_modelname.getText();
         String manufacturer = txt_manufacturer.getText();
         long manufacturingYear = Integer.parseInt(txt_manufacturingyear.getText());
         int seats = Integer.parseInt(txt_seats.getText());
         String vehicleLicensePlate = txt_platenumber.getText();
         String colour = txt_colour.getText();
         String maintenanceExpiration = txt_expiration.getText();
         String availibility = txt_Availability.getText();
         String location = txt_Location.getText();
         
         Cars c = history.addNewCar();
         
         c.setCarModelName(carModelName);
         c.setManufacturer(manufacturer);
         c.setManufacturingYear(manufacturingYear);
         c.setSeats(seats);
         c.setVehicleLicensePlate(vehicleLicensePlate);
         c.setColour(colour);
         c.setCarAvailability(availibility);
         c.setMaintenanceExpiration(maintenanceExpiration);
         c.setLocation(location);
         JOptionPane.showMessageDialog(this, "Click view on left panle to see updated data in the table");
    }//GEN-LAST:event_updateButtonActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        // TODO add your handling code here:
        
        DefaultTableModel table = (DefaultTableModel)searchTable.getModel();
        String search = txt_search.getText();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<DefaultTableModel>(table);
        searchTable.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_txt_searchKeyReleased

    private void timeStampButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeStampButtonActionPerformed
        // TODO add your handling code here:
        if(updateMouseClicked == 1){
            //System.out.println("inside the function1");
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            txt_timestamp.setText(sdf.format(new Date(System.currentTimeMillis())));
        }
        else
            JOptionPane.showMessageDialog(this, "Update Button has not been clicked yet!!");
    }//GEN-LAST:event_timeStampButtonActionPerformed

    private void updateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_updateButtonMouseClicked

    private void timeStampButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeStampButtonMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeStampButtonMousePressed

    private void updateButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMousePressed
        // TODO add your handling code here:
        //System.out.println("inside the function");
        if(evt.getClickCount()>0){
            updateMouseClicked = 1;
            //System.out.println(updateMouseClicked);
        }
    }//GEN-LAST:event_updateButtonMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable searchTable;
    private javax.swing.JButton timeStampButton;
    private javax.swing.JTextField txt_Availability;
    private javax.swing.JTextField txt_Location;
    private javax.swing.JTextField txt_colour;
    private javax.swing.JTextField txt_expiration;
    private javax.swing.JTextField txt_manufacturer;
    private javax.swing.JTextField txt_manufacturingyear;
    private javax.swing.JTextField txt_modelname;
    private javax.swing.JTextField txt_platenumber;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_seats;
    private javax.swing.JTextField txt_timestamp;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton viewbutton;
    private javax.swing.JTable viewtablecars;
    // End of variables declaration//GEN-END:variables
}
