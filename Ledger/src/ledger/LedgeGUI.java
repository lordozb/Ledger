
package ledger;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class LedgeGUI extends javax.swing.JFrame {
    
    // GLOBAL OBJECT FOR ALL FUNCTIONS.
    Ledger lg = new Ledger();
    
    // FOR JTABLE
    String[] cols = {"ID", "Name", "Trade Mark", "Item", "Quantity", "Price"};
    public LedgeGUI() {
        initComponents();
        
        // FOR JCOMBOBOX
        String[] cbox = {"Name", "TM", "Item"};
        data_search_cbox.setModel(new DefaultComboBoxModel(cbox));       
                        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        data_tab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        tf_name = new javax.swing.JTextField();
        tf_tmark = new javax.swing.JTextField();
        newentry = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_item = new javax.swing.JTextField();
        tf_quantity = new javax.swing.JTextField();
        tf_price = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        data_search_tf = new javax.swing.JTextField();
        data_search_btn = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        data_name_tf = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        data_tmark_tf = new javax.swing.JTextField();
        data_item_tf = new javax.swing.JTextField();
        data_quantity_tf = new javax.swing.JTextField();
        data_price_tf = new javax.swing.JTextField();
        data_delete_btn = new javax.swing.JButton();
        data_update_btn = new javax.swing.JButton();
        data_refresh_btn = new javax.swing.JButton();
        data_search_cbox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        data_edit_tf = new javax.swing.JTextField();
        data_edit_btn = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        contact = new javax.swing.JMenuItem();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ledger");
        setResizable(false);

        data_tab.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        data_tab.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        data_tab.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        tf_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nameActionPerformed(evt);
            }
        });

        newentry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ledger/Images/new-file.png"))); // NOI18N
        newentry.setText("New");
        newentry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newentryActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Item                 ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Quantity (Kg)   ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Total Price        ");

        tf_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_itemActionPerformed(evt);
            }
        });

        tf_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_priceActionPerformed(evt);
            }
        });

        submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ledger/Images/document-pixel.png"))); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Trade Mark");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Name");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(495, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(newentry)
                    .addComponent(submit)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_price, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_tmark, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_item, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(101, 101, 101))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tf_name, tf_tmark});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_tmark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(newentry)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(tf_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(submit)
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
        );

        data_tab.addTab("New Entry", jPanel1);

        data_search_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ledger/Images/magnifier.png"))); // NOI18N
        data_search_btn.setText("Search");
        data_search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_search_btnActionPerformed(evt);
            }
        });

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Trade Mark", "Item", "Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Name");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Trade Mark");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Item");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Quantity");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Price");

        data_tmark_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_tmark_tfActionPerformed(evt);
            }
        });

        data_delete_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ledger/Images/delete-button.png"))); // NOI18N
        data_delete_btn.setText("Delete");
        data_delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_delete_btnActionPerformed(evt);
            }
        });

        data_update_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ledger/Images/document-pixel.png"))); // NOI18N
        data_update_btn.setText("Update");
        data_update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_update_btnActionPerformed(evt);
            }
        });

        data_refresh_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ledger/Images/refresh-buttons.png"))); // NOI18N
        data_refresh_btn.setText("Refresh");
        data_refresh_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_refresh_btnActionPerformed(evt);
            }
        });

        data_search_cbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("ID");

        data_edit_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ledger/Images/edit-tool.png"))); // NOI18N
        data_edit_btn.setText("Edit");
        data_edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_edit_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(data_refresh_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(data_update_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(data_delete_btn))
                    .addComponent(jLabel12)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(data_search_tf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(data_edit_tf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(data_name_tf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(data_tmark_tf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(data_item_tf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(data_quantity_tf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(data_price_tf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(data_search_btn, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(data_edit_btn, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(data_search_cbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {data_delete_btn, data_refresh_btn, data_update_btn});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {data_edit_tf, data_item_tf, data_name_tf, data_price_tf, data_quantity_tf, data_search_tf, data_tmark_tf});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(data_search_cbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(data_search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(data_search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(data_edit_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(data_edit_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(data_name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(data_tmark_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(data_item_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(data_quantity_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(data_price_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(data_update_btn)
                    .addComponent(data_refresh_btn)
                    .addComponent(data_delete_btn))
                .addContainerGap())
            .addComponent(jSeparator3)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {data_edit_tf, data_item_tf, data_name_tf, data_price_tf, data_quantity_tf, data_search_tf, data_tmark_tf});

        data_tab.addTab("Data", jPanel2);

        jMenu3.setText("Help");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ledger/Images/about-us.png"))); // NOI18N
        jMenuItem4.setText("About");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        contact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ledger/Images/email-with-at.png"))); // NOI18N
        contact.setText("Contact");
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        jMenu3.add(contact);

        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(data_tab, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(data_tab))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void data_search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_search_btnActionPerformed
        
        if(data_search_tf.getText().equals(""))
            JOptionPane.showMessageDialog(null,"Enter Name/Trade_Mark/Item");
        
        if(data_search_cbox.getSelectedItem().toString().equals("Item"))
            try {
                jTable1.setModel(new DefaultTableModel(lg.searchItem(data_search_tf.getText().toUpperCase()), cols){
                    @Override
                    public boolean isCellEditable(int row, int column) {
                        //all cells false
                        return false;
                    }
                });
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Name/Item/Tmark not found");
        }
        if(data_search_cbox.getSelectedItem().toString().equals("Name"))
            try {
                jTable1.setModel(new DefaultTableModel(lg.searchName(data_search_tf.getText().toUpperCase()), cols){
                    @Override
                    public boolean isCellEditable(int row, int column) {
                        //all cells false
                        return false;
                    }
                });
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Name/Item/Tmark not found");
        }
        
        if(data_search_cbox.getSelectedItem().toString().equals("TM"))
            try {
                jTable1.setModel(new DefaultTableModel(lg.searchTM(data_search_tf.getText().toUpperCase()), cols){
                    @Override
                    public boolean isCellEditable(int row, int column) {
                        //all cells false
                        return false;
                    }
                });
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Name/Item/Tmark not found");
        }
        finally{
                data_search_tf.setText("");
            }
        
    }//GEN-LAST:event_data_search_btnActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
      new ContactGUI().setVisible(true);  
    }//GEN-LAST:event_contactActionPerformed

    private void tf_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_priceActionPerformed

    private void tf_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_itemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_itemActionPerformed
    
    // Clears all the data in the textfields of Entry tab.
    private void newentryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newentryActionPerformed
        tf_name.setText("");
        tf_tmark.setText("");
        tf_item.setText("");
        tf_quantity.setText("");
        tf_price.setText("");
        
    }//GEN-LAST:event_newentryActionPerformed

    private void tf_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nameActionPerformed

    private void data_tmark_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_tmark_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_data_tmark_tfActionPerformed
    
    // Adds data into the database using the functions defined in the package ledger.
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        if((((tf_name.getText().equals("") || (tf_tmark.getText().equals(""))) || (tf_item.getText().equals(""))) || tf_quantity.getText().equals("")) || tf_price.getText().equals("")) 
            JOptionPane.showMessageDialog(null, "Don't keep any field empty");
     
        else{
          
            try{
                String name = tf_name.getText();
                String tmark = tf_tmark.getText();
                String item = tf_item.getText();
                int quantity = Integer.parseInt(tf_quantity.getText());
                int price = Integer.parseInt(tf_price.getText());
                
                lg.insertToDb(name.toUpperCase(), tmark.toUpperCase(), item.toUpperCase(), quantity, price);
                tf_item.setText("");
                tf_quantity.setText("");
                tf_price.setText("");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Check Input Fiels");
            }
           
        }
                     
            
    }//GEN-LAST:event_submitActionPerformed

    private void data_refresh_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_refresh_btnActionPerformed
        
        try {
            jTable1.setModel(new DefaultTableModel(lg.getAll(), cols){
                @Override
                public boolean isCellEditable(int row, int column) {
                    //all cells false
                    return false;
                    
                }
                
            });
        } catch (Exception ex) {
            Logger.getLogger(LedgeGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }//GEN-LAST:event_data_refresh_btnActionPerformed

    private void data_edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_edit_btnActionPerformed
        try{
            String id = data_edit_tf.getText();
            if(id.equals("")){
                JOptionPane.showMessageDialog(null,"Enter ID");
            }
            else{
                
                String[] values = lg.editItem(id);
                data_name_tf.setText(values[0]);
                data_tmark_tf.setText(values[1]);
                data_item_tf.setText(values[2]);
                data_quantity_tf.setText(values[3]);
                data_price_tf.setText(values[4]);                
            }
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,"ID not found");    
        }
    }//GEN-LAST:event_data_edit_btnActionPerformed

    private void data_update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_update_btnActionPerformed
        try{
            String id = data_edit_tf.getText();
            String name = data_name_tf.getText();
            String tm = data_tmark_tf.getText();
            String item = data_item_tf.getText();
            String quantity = data_quantity_tf.getText();
            String price = data_price_tf.getText();
            if(id.equals("") || name.equals("") || tm.equals("") || item.equals("") || quantity.equals("") || price.equals(""))
                JOptionPane.showMessageDialog(null, "Enter all Fields");
            
            else
                lg.updateDb(name.toUpperCase(), tm.toUpperCase(), item.toUpperCase(), Integer.parseInt(quantity), Integer.parseInt(price), Integer.parseInt(id));
            
            data_edit_tf.setText("");
            data_name_tf.setText("");
            data_tmark_tf.setText("");
            data_item_tf.setText("");
            data_quantity_tf.setText("");
            data_price_tf.setText("");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "ID not found");    
        }
    }//GEN-LAST:event_data_update_btnActionPerformed

    private void data_delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_delete_btnActionPerformed
        try{
            String id = data_edit_tf.getText();
            if(id.equals(""))
                JOptionPane.showMessageDialog(null, "Enter ID");
            
            else{
                lg.deleteFromDb(Integer.parseInt(id));
            
                data_edit_tf.setText("");
                data_name_tf.setText("");
                data_tmark_tf.setText("");
                data_item_tf.setText("");
                data_quantity_tf.setText("");
                data_price_tf.setText("");
                JOptionPane.showMessageDialog(null, "Successfully Deleted");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "ID not found");
        }
    }//GEN-LAST:event_data_delete_btnActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new AboutGUI().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(LedgeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LedgeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LedgeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LedgeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LedgeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuItem contact;
    private javax.swing.JButton data_delete_btn;
    private javax.swing.JButton data_edit_btn;
    private javax.swing.JTextField data_edit_tf;
    private javax.swing.JTextField data_item_tf;
    private javax.swing.JTextField data_name_tf;
    private javax.swing.JTextField data_price_tf;
    private javax.swing.JTextField data_quantity_tf;
    private javax.swing.JButton data_refresh_btn;
    private javax.swing.JButton data_search_btn;
    private javax.swing.JComboBox<String> data_search_cbox;
    private javax.swing.JTextField data_search_tf;
    private javax.swing.JTabbedPane data_tab;
    private javax.swing.JTextField data_tmark_tf;
    private javax.swing.JButton data_update_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton newentry;
    private javax.swing.JButton submit;
    private javax.swing.JTextField tf_item;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_price;
    private javax.swing.JTextField tf_quantity;
    private javax.swing.JTextField tf_tmark;
    // End of variables declaration//GEN-END:variables
}
