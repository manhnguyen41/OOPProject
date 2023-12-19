/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.CollectionBoardScreen;

//import com.sun.jdi.connect.spi.Connection;

import controller.listController.ListOfCollections;
import models.Collection;
import views.Home;
import views.KeyWordBoardScreen.KeyWordScreen;

import javax.swing.table.DefaultTableModel;
import java.util.List;


/**
 *
 * @author Nam
 */
public class CollectionScreen extends javax.swing.JFrame {

    /**
     * Creates new form NhanKhauMainPage
     */
    public CollectionScreen() {
        initComponents();
        this.currentCollectionList = this.collectionList;
        display();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        nhanKhauPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbCollection = new javax.swing.JLabel();
        lbTrangChu = new javax.swing.JLabel();
        lbKeyWord = new javax.swing.JLabel();
        lbThoat = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnTim = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tCollection = new javax.swing.JTable();
        tfTim = new javax.swing.JTextField();
        btnSapXep = new javax.swing.JButton();
        cbAscendingDescending = new javax.swing.JComboBox<>();
        cbTheo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nhanKhauPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        lbCollection.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbCollection.setForeground(new java.awt.Color(255, 255, 255));
        lbCollection.setText("Collection");
        lbCollection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCollectionMouseClicked(evt);
            }
        });

        lbTrangChu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTrangChu.setForeground(new java.awt.Color(255, 255, 255));
        lbTrangChu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTrangChu.setText("TRANG CHỦ");
        lbTrangChu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbTrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTrangChuMouseClicked(evt);
            }
        });

        lbKeyWord.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbKeyWord.setForeground(new java.awt.Color(255, 255, 255));
        lbKeyWord.setText("KeyWord");
        lbKeyWord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbKeyWordMouseClicked(evt);
            }
        });

        lbThoat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbThoat.setForeground(new java.awt.Color(255, 255, 255));
        lbThoat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbThoat.setText("Thoát    ");
        lbThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbThoatMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(lbThoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(lbTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                                .addContainerGap())
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbKeyWord)
                                        .addComponent(lbCollection))
                                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(lbTrangChu)
                                .addGap(46, 46, 46)
                                .addComponent(lbCollection)
                                .addGap(18, 18, 18)
                                .addComponent(lbKeyWord)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbThoat)
                                .addGap(33, 33, 33))
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("COLLECTION");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        btnTim.setBackground(new java.awt.Color(0, 51, 51));
        btnTim.setForeground(new java.awt.Color(255, 255, 255));
        btnTim.setText("Tìm theo tên");
        btnTim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimMouseClicked(evt);
            }
        });
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        tCollection.setForeground(new java.awt.Color(0, 102, 102));
        tCollection.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Name", "Volume", "Change", "Floor price", "Owners", "Items"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tCollection.setGridColor(new java.awt.Color(188, 206, 206));
        tCollection.setRowHeight(26);
        tCollection.setSelectionBackground(new java.awt.Color(0, 102, 102));
        tCollection.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tCollection.setShowGrid(true);
        tCollection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tCollectionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tCollection);

        tfTim.setForeground(new java.awt.Color(0, 102, 102));
        tfTim.setText("Nhập thông tin");
        tfTim.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        tfTim.setSelectedTextColor(new java.awt.Color(102, 102, 102));

        btnSapXep.setBackground(new java.awt.Color(0, 51, 51));
        btnSapXep.setForeground(new java.awt.Color(255, 255, 255));
        btnSapXep.setText("Sắp xếp theo");
        btnSapXep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSapXepMouseClicked(evt);
            }
        });
        btnSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepActionPerformed(evt);
            }
        });

        cbAscendingDescending.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascending floor price", "Descending floor price", "Ascending volume", "Descending volume", "Ascending change", "Descending change", " " }));

        cbTheo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Theo 1 giờ", "Theo 6 giờ", "Theo 1 ngày", "Theo 7 ngày", "Theo 1 tháng", "Tất cả", " ", " ", " " }));

        javax.swing.GroupLayout nhanKhauPanelLayout = new javax.swing.GroupLayout(nhanKhauPanel);
        nhanKhauPanel.setLayout(nhanKhauPanelLayout);
        nhanKhauPanelLayout.setHorizontalGroup(
                nhanKhauPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(nhanKhauPanelLayout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(nhanKhauPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(nhanKhauPanelLayout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap())
                                        .addComponent(jScrollPane1)
                                        .addGroup(nhanKhauPanelLayout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(btnSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cbTheo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cbAscendingDescending, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 236, Short.MAX_VALUE)
                                                .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(tfTim, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(44, 44, 44))))
        );
        nhanKhauPanelLayout.setVerticalGroup(
                nhanKhauPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(nhanKhauPanelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addGroup(nhanKhauPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(nhanKhauPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(btnSapXep)
                                                .addComponent(cbAscendingDescending, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(nhanKhauPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(tfTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnTim)
                                                .addComponent(cbTheo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nhanKhauPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nhanKhauPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void btnTrinhBanGhiActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnTrinhBanGhiMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        display();
    }

    private void tCollectionMouseClicked(java.awt.event.MouseEvent evt) {
        DefaultTableModel model = (DefaultTableModel)tCollection.getModel();
        int indexRow = tCollection.getSelectedRow();
        String nameOfCollection = String.valueOf(model.getValueAt(indexRow, 0).toString());
        Collection collectionSelected = this.collectionList.search(nameOfCollection).get(0);
        BlogLogScreen blogLogScreen = new BlogLogScreen(collectionSelected);
        blogLogScreen.setVisible(true);
    }

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnTimMouseClicked(java.awt.event.MouseEvent evt) {
//       TODO add your handling code here:
        // backend search và trả về một list of collection
        List<Collection> collectionListCollectionByName = currentCollectionList.search(tfTim.getText());
        // update currentCollectionList

        // display currentCollectionList
        DefaultTableModel defaultTableModel = (DefaultTableModel) tCollection.getModel();
        defaultTableModel.getDataVector().removeAllElements();
        defaultTableModel.fireTableDataChanged();

        for(Collection collection: collectionListCollectionByName){
            String data[] = {collection.getName(), collection.getVolume(), collection.getChange(), collection.getFloorPrice(), collection.getOwners(), collection.getItems()};
            defaultTableModel.addRow(data);
        }
    }

    // -------------------- BACK TO MAIN FORM ----------------------------
    private void lbThoatMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        this.dispose();
    }

    private void lbTrangChuMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Home newScreen = new Home();
        newScreen.setVisible(true);
        this.dispose();
    }

    private void lbCollectionMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void lbKeyWordMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        KeyWordScreen keyWordScreen = new KeyWordScreen();
        keyWordScreen.setVisible(true);
        this.dispose();
    }

    private void btnSapXepMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        display();
    }

    private void btnSapXepActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

    }


    // ------------ START TO CODE HERE -----------------

    // ------------- DISPLAY PEOPLE ---------------------
    private void display(){
        String firstItem = cbTheo.getSelectedItem().toString();
        String secondItem = cbAscendingDescending.getSelectedItem().toString();
        System.out.println(secondItem);
        // ------- xử lý input first item -------
        int index = 0;
        if (firstItem.equals("Theo 1 giờ")){
            index = 0;
        } else if (firstItem.equals("Theo 6 giờ")){
            index = 1;
        } else if (firstItem.equals("Theo 1 ngày")) {
            index = 2;
        } else if (firstItem.equals("Theo 7 ngày")) {
            index = 3;
        } else if (firstItem.equals("Theo 1 tháng")) {
            index = 4;
        } else if (firstItem.equals("Tất cả")) {
            index = 5;
        }
        this.currentCollectionList.setCollectionList(this.collectionListArray[index]);
        // -----------------------------------

        // -------- xử lý input thứ 2 ---------
        if (secondItem.equals("Ascending floor price")){
            this.currentCollectionList.sortCollectionByFloorPriceASC();
        } else if (secondItem.equals("Descending floor price")){
            this.currentCollectionList.sortCollectionByFloorPriceDES();
        } else if (secondItem.equals("Ascending volume")) {
            this.currentCollectionList.sortCollectionByVolumeASC();
        } else if (secondItem.equals("Descending volume")) {
            this.currentCollectionList.sortCollectionByVolumeDES();
        } else if (secondItem.equals("Ascending change")) {
            this.currentCollectionList.sortCollectionByChangeASC();
        } else if (secondItem.equals("Descending change")) {
            this.currentCollectionList.sortCollectionByChangeDES();
        }
        // ------------------------------------

        // --------- Display section ----------
        DefaultTableModel defaultTableModel = (DefaultTableModel) tCollection.getModel();
        defaultTableModel.getDataVector().removeAllElements();
        defaultTableModel.fireTableDataChanged();

        for(Collection collection: currentCollectionList.getCollectionList()){
            String data[] = {collection.getName(), collection.getVolume(), collection.getChange(), collection.getFloorPrice(), collection.getOwners(), collection.getItems()};
            defaultTableModel.addRow(data);
        }
    }
    private Collection collection;
    private final ListOfCollections collectionList = new ListOfCollections();
    private final List<Collection> []collectionListArray = collectionList.getTop100Collection();
    private ListOfCollections currentCollectionList;

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
            java.util.logging.Logger.getLogger(CollectionScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CollectionScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CollectionScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CollectionScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CollectionScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnSapXep;
    private javax.swing.JButton btnTim;
    private javax.swing.JComboBox<String> cbAscendingDescending;
    private javax.swing.JComboBox<String> cbTheo;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCollection;
    private javax.swing.JLabel lbKeyWord;
    private javax.swing.JLabel lbThoat;
    private javax.swing.JLabel lbTrangChu;
    private javax.swing.JPanel nhanKhauPanel;
    private javax.swing.JTable tCollection;
    private javax.swing.JTextField tfTim;
    // End of variables declaration
}
