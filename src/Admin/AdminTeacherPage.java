/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import Login.MyConnection;
import Login.Registration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author papon
 */
public class AdminTeacherPage extends javax.swing.JPanel {

    /**
     * Creates new form AdminTeacherPage
     */
    public AdminTeacherPage() {
        initComponents();
        updateTable();
    }
    
    private void updateTable(){
        int count;
        try { 
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/studentdata", "root", "");
            PreparedStatement insert = con.prepareStatement("select * from hod_reg");
            
            ResultSet rs = insert.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();
            count = rss.getColumnCount();
            
            DefaultTableModel df = (DefaultTableModel)jTable1.getModel();
            df.setRowCount(0);
            
            while(rs.next()){
                Vector v2 = new Vector();
                for(int i=1; i<=count; i++){
                    v2.add(rs.getString("h_id"));
                    v2.add(rs.getString("h_name"));
                    v2.add(rs.getString("h_dept"));
                    v2.add(rs.getString("h_username"));
                    v2.add(rs.getString("h_pass"));
                }
             df.addRow(v2);   
            }            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        textId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textName = new javax.swing.JTextField();
        textDept = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textUsername = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textPass = new javax.swing.JPasswordField();
        textRepass = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 0, 204));

        jTable1.setBackground(new java.awt.Color(51, 255, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Dept", "Username", "Pass"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 0));
        jLabel8.setText("Click here to go to student's details");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Teacher's Details");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Add Teacher"));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("ID");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Name");

        textDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDeptActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Dept");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("User Name");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Password");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Re-Password");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/small_buttons/add.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/small_buttons/edit.png"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
        });

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/small_buttons/delete.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/small_buttons/logout.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
        });

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/small_buttons/reset.png"))); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel15MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textId, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(textName)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textDept, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(84, 84, 84))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textPass, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textRepass, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(textUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(textPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(textRepass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel10)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDeptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDeptActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel df = (DefaultTableModel)jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();

        textId.setText(df.getValueAt(selectedIndex, 0).toString());
        textName.setText(df.getValueAt(selectedIndex, 1).toString());
        textDept.setText(df.getValueAt(selectedIndex, 2).toString());
        textUsername.setText(df.getValueAt(selectedIndex, 3).toString());
        textPass.setText(df.getValueAt(selectedIndex, 4).toString());
        textRepass.setText(df.getValueAt(selectedIndex, 4).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
       
        this.setVisible(false);
        Login.MainFrame.adminSPage.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here
        String id = textId.getText();
        String name = textName.getText();
        String dept = textDept.getText();
        String pass = String.valueOf(textPass.getPassword());
        String repass = String.valueOf(textRepass.getPassword());
        String username = textUsername.getText();

        if(!pass.equals(repass)){
            JOptionPane.showMessageDialog(this, "Password Mismatch");
            textPass.setText("");
            textRepass.setText("");
            return ;
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = MyConnection.getConnection();
            PreparedStatement insert;

            insert = con.prepareStatement("insert into hod_reg(h_id, h_name, h_dept, h_username, h_pass)values(?,?,?,?,?)");
            insert.setString(1, id);
            insert.setString(2, name);
            insert.setString(3, dept);
            insert.setString(4, username);
            insert.setString(5, pass);
            insert.executeUpdate();

            JOptionPane.showMessageDialog(this, "Record Added");
            updateTable();

            textId.setText("");
            textDept.setText("");
            textName.setText("");
            textUsername.setText("");
            textPass.setText("");
            textRepass.setText("");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminTeacherPage.class.getName()).log(Level.SEVERE, null, ex);
        }

        catch(SQLException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        // TODO add your handling code here:
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/small_buttons/add_green.png"))); // NOI18N
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        // TODO add your handling code here:
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/small_buttons/add.png"))); // NOI18N
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        DefaultTableModel df = (DefaultTableModel)jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        String roll = df.getValueAt(selectedIndex, 1).toString();

        try {
            String id = textId.getText();
            //String roll = textRoll.getText();
            String name = textName.getText();
            String dept = textDept.getText();
            String pass = String.valueOf(textPass.getPassword());
            String repass = String.valueOf(textRepass.getPassword());
            String username = textUsername.getText();

            if(!pass.equals(repass)){
                JOptionPane.showMessageDialog(this, "Password Mismatch");
                textPass.setText("");
                textRepass.setText("");
                return ;
            }

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = MyConnection.getConnection();
            PreparedStatement insert;
            String query = "update hod_reg set h_name = ?, h_dept=?, h_username=?, h_pass=? where h_id=?";
            insert = con.prepareStatement(query);

            insert.setString(1, name);
            //insert.setString(2, roll);
            insert.setString(2, dept);
            insert.setString(3, username);
            insert.setString(4, pass);
            insert.setString(5, id);

            insert.executeUpdate();

            JOptionPane.showMessageDialog(this, "Record Edited");
            updateTable();

            textId.setText("");
            textDept.setText("");
            textName.setText("");
            textUsername.setText("");
            textPass.setText("");
            textRepass.setText("");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }

        catch(SQLException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        // TODO add your handling code here:
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/small_buttons/edit_green.png"))); // NOI18N
    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
        // TODO add your handling code here:
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/small_buttons/edit.png"))); // NOI18N
    }//GEN-LAST:event_jLabel13MouseExited

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        DefaultTableModel df = (DefaultTableModel)jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        String id = df.getValueAt(selectedIndex, 0).toString();

        int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to delete the record?", "Warning", JOptionPane.YES_NO_OPTION);
        if(dialogResult == JOptionPane.NO_OPTION)
        {
            return ;
        }

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = MyConnection.getConnection();
            PreparedStatement delete;
            String query = "delete from hod_reg where h_id=?";
            delete = con.prepareStatement(query);
            delete.setString(1, id);
            delete.executeUpdate();

            JOptionPane.showMessageDialog(this, "Record Deleted");
            updateTable();

            textId.setText("");
            textDept.setText("");
            textName.setText("");
            textUsername.setText("");
            textPass.setText("");
            textRepass.setText("");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }

        catch(SQLException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        // TODO add your handling code here:
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/small_buttons/delete_green.png"))); // NOI18N
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        // TODO add your handling code here:
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/small_buttons/delete.png"))); // NOI18N
    }//GEN-LAST:event_jLabel12MouseExited

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        Login.EmptyLoginFields.emptyFields();
        Login.MainFrame.logPanel.setVisible(true);

    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        // TODO add your handling code here:
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/small_buttons/logout_green.png"))); // NOI18N
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        // TODO add your handling code here:
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/small_buttons/logout.png"))); // NOI18N
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        textId.setText("");
        textName.setText("");
        textDept.setText("");
        textUsername.setText("");
        textPass.setText("");
        textRepass.setText("");
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseEntered
        // TODO add your handling code here:
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/small_buttons/reset_green.png"))); // NOI18N
    }//GEN-LAST:event_jLabel15MouseEntered

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseExited
        // TODO add your handling code here:
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/small_buttons/reset.png"))); // NOI18N
    }//GEN-LAST:event_jLabel15MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField textDept;
    private javax.swing.JTextField textId;
    private javax.swing.JTextField textName;
    private javax.swing.JPasswordField textPass;
    private javax.swing.JPasswordField textRepass;
    private javax.swing.JTextField textUsername;
    // End of variables declaration//GEN-END:variables
}