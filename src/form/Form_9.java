/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package form;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import model.Author;

public class Form_9 extends javax.swing.JPanel {

    model.Author author = new model.Author();

    public Form_9() {
        initComponents();
        
        // connected class
        model.Func_Class func = new model.Func_Class();

        // Hide warning
        lbEmptyFirstName.setVisible(false);
        lbEmptyLastName.setVisible(false);

        // customize the table
        func.customTable(authorTable);
//        authorTable.setSelectionBackground(new Color(153, 153, 153));
//        authorTable.setSelectionForeground(new Color(40, 40, 40));
//        authorTable.setRowHeight(40);
//        authorTable.setShowGrid(true);
//        authorTable.setGridColor(new Color(230, 230, 230));
//        authorTable.setBackground(new Color(248, 248, 248));

        // Set custom cell renderer to make the selected row bold
        authorTable.setDefaultRenderer(Object.class, new CustomTableCellRenderer());

        // customize the table header row
        JTableHeader header = authorTable.getTableHeader();
        header.setPreferredSize(new Dimension(header.getPreferredSize().width, 40));
        header.setDefaultRenderer(new HeaderRenderer(authorTable));
        header.setOpaque(false);

        // populate Jtable With Authors
        populateJTableWithAuthors();
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
        panelBorder1 = new swing.PanelBorder();
        lbStudentNumber = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lbFullName = new javax.swing.JLabel();
        tfFirstName = new javax.swing.JTextField();
        lbEmptyFirstName = new javax.swing.JLabel();
        lbFullName1 = new javax.swing.JLabel();
        tfLastName = new javax.swing.JTextField();
        lbEmptyLastName = new javax.swing.JLabel();
        tfExpertise = new javax.swing.JTextField();
        lbAbout = new javax.swing.JLabel();
        lbExpertise = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taAbout = new javax.swing.JTextArea();
        panelBorder2 = new swing.PanelBorder();
        jScrollPane1 = new javax.swing.JScrollPane();
        authorTable = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(242, 242, 242));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Manage Authors");

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder1.setForeground(new java.awt.Color(255, 102, 0));

        lbStudentNumber.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbStudentNumber.setForeground(new java.awt.Color(0, 0, 0));
        lbStudentNumber.setText("ID:");

        tfID.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tfID.setForeground(new java.awt.Color(102, 102, 102));

        btnUpdate.setBackground(new java.awt.Color(51, 51, 51));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(51, 51, 51));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(51, 51, 51));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(51, 51, 51));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lbFullName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbFullName.setForeground(new java.awt.Color(0, 0, 0));
        lbFullName.setText("First Name:");

        tfFirstName.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tfFirstName.setForeground(new java.awt.Color(102, 102, 102));

        lbEmptyFirstName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbEmptyFirstName.setForeground(new java.awt.Color(255, 0, 51));
        lbEmptyFirstName.setText("* enter the first name");

        lbFullName1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbFullName1.setForeground(new java.awt.Color(0, 0, 0));
        lbFullName1.setText("Last Name:");

        tfLastName.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tfLastName.setForeground(new java.awt.Color(102, 102, 102));

        lbEmptyLastName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbEmptyLastName.setForeground(new java.awt.Color(255, 0, 51));
        lbEmptyLastName.setText("* enter the last name");

        tfExpertise.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tfExpertise.setForeground(new java.awt.Color(102, 102, 102));

        lbAbout.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbAbout.setForeground(new java.awt.Color(0, 0, 0));
        lbAbout.setText("About:");

        lbExpertise.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbExpertise.setForeground(new java.awt.Color(0, 0, 0));
        lbExpertise.setText("Expertise:");

        taAbout.setColumns(20);
        taAbout.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        taAbout.setForeground(new java.awt.Color(102, 102, 102));
        taAbout.setLineWrap(true);
        taAbout.setRows(5);
        jScrollPane2.setViewportView(taAbout);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbStudentNumber)
                            .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(lbFullName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbEmptyFirstName))
                            .addComponent(tfFirstName)
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(lbFullName1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbEmptyLastName))
                            .addComponent(tfLastName)
                            .addComponent(lbAbout)
                            .addComponent(tfExpertise)
                            .addComponent(lbExpertise)
                            .addComponent(jScrollPane2))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbStudentNumber)
                .addGap(0, 0, 0)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbFullName))
                    .addComponent(lbEmptyFirstName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFullName1)
                    .addComponent(lbEmptyLastName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbExpertise)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfExpertise, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbAbout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        panelBorder2.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder2.setForeground(new java.awt.Color(255, 153, 0));

        authorTable.setBackground(new java.awt.Color(30, 30, 30));
        authorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        authorTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                authorTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(authorTable);

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 881, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(panelBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );
    }// </editor-fold>//GEN-END:initComponents

    // add new author
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String firstName = tfFirstName.getText();
        String lastName = tfLastName.getText();
        String expertise = tfExpertise.getText();
        String about = taAbout.getText();

        // check if the textfield is empty
        if (firstName.isEmpty() || lastName.isEmpty()) {
            lbEmptyFirstName.setVisible(true);
            lbEmptyLastName.setVisible(true);
        } else if (firstName.isEmpty()) {
            lbEmptyFirstName.setVisible(true);
        } else if (lastName.isEmpty()) {
            lbEmptyFirstName.setVisible(false);
            lbEmptyLastName.setVisible(true);
        } else {
            lbEmptyFirstName.setVisible(false);
            lbEmptyLastName.setVisible(false);
            author.addAuthor(firstName, lastName, expertise, about);

            // refresh the table with Authors
            populateJTableWithAuthors();

            // clear the name textfield            
            tfFirstName.setText("");
            tfLastName.setText("");
            tfExpertise.setText("");
            taAbout.setText("");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    // edit the selected author
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String firstname = tfFirstName.getText();
        String lastname = tfLastName.getText();
        String expertise = tfExpertise.getText();
        String about = taAbout.getText();

        // check if the textfield is empty
        if (firstname.isEmpty()) {
            lbEmptyFirstName.setVisible(true);
        } else if (lastname.isEmpty()) {
            lbEmptyLastName.setVisible(true);
        } else {
            try {
                int id = Integer.parseInt(tfID.getText());
                lbEmptyFirstName.setVisible(false);
                lbEmptyLastName.setVisible(false);
                author.updateAuthor(id, firstname, lastname, expertise, about);

                // refresh the table with Authors
                populateJTableWithAuthors();

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid Author ID - " + e.getMessage(), "error", 0);
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    // clear the textfield
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        tfID.setText("");
        tfFirstName.setText("");
        tfLastName.setText("");
        tfExpertise.setText("");
        taAbout.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    // delete the selected author
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            int id = Integer.parseInt(tfID.getText());
            author.removeAuthor(id);

            // refresh the table with Genres
            populateJTableWithAuthors();

            // clear the textfields
            tfID.setText("");
            tfFirstName.setText("");
            tfLastName.setText("");
            tfExpertise.setText("");
            taAbout.setText("");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid Author ID - " + e.getMessage(), "error", 0);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    // customize table header
    private class HeaderRenderer implements TableCellRenderer {

        private final JTable table;

        public HeaderRenderer(JTable table) {
            this.table = table;
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            JLabel label = new JLabel(value.toString());
            label.setForeground(Color.WHITE);
            label.setFont(new Font("Segoe UI", Font.BOLD, 16));
            label.setOpaque(true);
            label.setBackground(new Color(247, 183, 51));
            label.setHorizontalAlignment(SwingConstants.LEADING);
            return label;
        }
    }

    // customize table selection model
    private class CustomTableCellRenderer extends DefaultTableCellRenderer {

        private final Font boldFont = new Font("Segoe UI", Font.BOLD, 14);
        private final Font normalFont = new Font("Segoe UI", Font.PLAIN, 12);

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            if (isSelected) {
                component.setFont(boldFont);
            } else {
                component.setFont(normalFont);
            }
            return component;
        }
    }

    // display the selected genre
    private void authorTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_authorTableMouseClicked
        // get the selected row index
        int index = authorTable.getSelectedRow();

        // get values
        String id = authorTable.getValueAt(index, 0).toString();
        String fname = authorTable.getValueAt(index, 1).toString();
        String lname = authorTable.getValueAt(index, 2).toString();
        String expertise = authorTable.getValueAt(index, 3).toString();
        String about = authorTable.getValueAt(index, 4).toString();

        // show data in textfields
        tfID.setText(id);
        tfFirstName.setText(fname);
        tfLastName.setText(lname);
        tfExpertise.setText(expertise);
        taAbout.setText(about);
    }//GEN-LAST:event_authorTableMouseClicked

    // function to populate the jtable with authors
    public void populateJTableWithAuthors() {
        ArrayList<model.Author> authorList = author.authorList();

        // jtable columns
        String[] colNames = {"ID", "First Name", "Last Name", "Expertise", "About"};

        // row
        Object[][] rows = new Object[authorList.size()][colNames.length];

        for (int i = 0; i < authorList.size(); i++) {
            rows[i][0] = authorList.get(i).getId();
            rows[i][1] = authorList.get(i).getFirstName();
            rows[i][2] = authorList.get(i).getLastName();
            rows[i][3] = authorList.get(i).getFieldOfExpertise();
            rows[i][4] = authorList.get(i).getAbout();
        }

        DefaultTableModel model = new DefaultTableModel(rows, colNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        authorTable.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable authorTable;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbAbout;
    private javax.swing.JLabel lbEmptyFirstName;
    private javax.swing.JLabel lbEmptyLastName;
    private javax.swing.JLabel lbExpertise;
    private javax.swing.JLabel lbFullName;
    private javax.swing.JLabel lbFullName1;
    private javax.swing.JLabel lbStudentNumber;
    private swing.PanelBorder panelBorder1;
    private swing.PanelBorder panelBorder2;
    private javax.swing.JTextArea taAbout;
    private javax.swing.JTextField tfExpertise;
    private javax.swing.JTextField tfFirstName;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfLastName;
    // End of variables declaration//GEN-END:variables
}
