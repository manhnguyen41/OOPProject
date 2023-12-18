/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.KeyWordBoardScreen;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import connector.KeyWordConnector;
import connector.RedditPostConnector;
import controller.KeyWordController;
import controller.RedditPostController;
import models.KeyWord;
import models.RedditPost;
import views.CollectionBoardScreen.CollectionScreen;
import views.Home;

import java.util.List;
import javax.swing.table.DefaultTableModel;




/**
 *
 * @author Nam
 */
public class KeyWordScreen extends javax.swing.JFrame {

    /**
     * Creates new form NhanKhauMainPage
     */
    public KeyWordScreen() {
        initComponents();
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
        tKeyWord = new javax.swing.JTable();
        tfTim = new javax.swing.JTextField();
        btnSapXep = new javax.swing.JButton();
        cbTangDan = new javax.swing.JComboBox<>();
        cbReactBy = new javax.swing.JComboBox<>();

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
        jLabel6.setText("KEY WORDS");
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

        tKeyWord.setForeground(new java.awt.Color(0, 102, 102));
        tKeyWord.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Key word", "React", "Number of posts"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tKeyWord.setGridColor(new java.awt.Color(188, 206, 206));
        tKeyWord.setRowHeight(26);
        tKeyWord.setSelectionBackground(new java.awt.Color(0, 102, 102));
        tKeyWord.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tKeyWord.setShowGrid(true);
        tKeyWord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tKeyWordMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tKeyWord);

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

        cbTangDan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tăng dần theo ngày", "Giảm dần theo ngày", " " }));

        cbReactBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reacts by day", "Reacts by month", "Reacts by year", " ", " " }));

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
                                                .addComponent(cbReactBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cbTangDan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
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
                                .addGroup(nhanKhauPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tfTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnTim)
                                        .addGroup(nhanKhauPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(btnSapXep)
                                                .addComponent(cbTangDan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(cbReactBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    }// </editor-fold>

    private void btnTrinhBanGhiActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnTrinhBanGhiMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        display();
    }

    private void tKeyWordMouseClicked(java.awt.event.MouseEvent evt) {
        DefaultTableModel model = (DefaultTableModel)tKeyWord.getModel();
        int indexRow = tKeyWord.getSelectedRow();
        key = String.valueOf(model.getValueAt(indexRow, 0).toString());
//        System.out.println(this.key);
        RedditPostLogScreen newLogScreen = new RedditPostLogScreen(key);
        newLogScreen.setVisible(true);
    }

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

    }

    private void btnTimMouseClicked(java.awt.event.MouseEvent evt) {
//       TODO add your handling code here:
        String ten = tfTim.getText();
        KeyWord keyWord = KeyWordController.getKeyWord(ten, keyWordList);
        String firstItem = cbTangDan.getSelectedItem().toString();
        int index = 0;
        if(cbReactBy.getSelectedItem().toString().equals("Reacts by day")) {
            index = 0;
        } else if(cbReactBy.getSelectedItem().toString().equals("Reacts by month")){
            index = 1;
        } else if(cbReactBy.getSelectedItem().toString().equals("Reacts by year")) {
            index = 2;
        }
        DefaultTableModel defaultTableModel = (DefaultTableModel) tKeyWord.getModel();
        defaultTableModel.getDataVector().removeAllElements();
        defaultTableModel.fireTableDataChanged();
        List<RedditPost> redditPostListByKeyWord = RedditPostController.getRedditPostByKeyWord(redditPostList,keyWord.getWord());
        String data[] = {keyWord.getWord(), String.valueOf(keyWord.getReact()[index]), String.valueOf(redditPostListByKeyWord.size())};
        defaultTableModel = (DefaultTableModel) tKeyWord.getModel();
        defaultTableModel.addRow(data);
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
        CollectionScreen collectionScreen = new CollectionScreen();
        collectionScreen.setVisible(true);
        this.dispose();
    }

    private void lbKeyWordMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:

    }

    private void btnSapXepMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        this.currentKeyWordList = keyWordList;

        String firstItem = cbTangDan.getSelectedItem().toString();
        int index = 0;
        if(cbReactBy.getSelectedItem().toString().equals("Reacts by day")) {
            index = 0;
        } else if(cbReactBy.getSelectedItem().toString().equals("Reacts by month")){
            index = 1;
        } else if(cbReactBy.getSelectedItem().toString().equals("Reacts by year")) {
            index = 2;
        }
        DefaultTableModel defaultTableModel = (DefaultTableModel) tKeyWord.getModel();
        defaultTableModel.getDataVector().removeAllElements();
        defaultTableModel.fireTableDataChanged();
        if (firstItem.equals("Tăng dần theo ngày")){
            KeyWordController.sortKeyWordByReactInDayIncreasing(currentKeyWordList);
        } else if (firstItem.equals("Giảm dần theo ngày")) {
            KeyWordController.sortKeyWordByReactInDayDecreasing(currentKeyWordList);
        }
        for(KeyWord keyWord: currentKeyWordList) {
            List<RedditPost> redditPostListByKeyWord = RedditPostController.getRedditPostByKeyWord(redditPostList,keyWord.getWord());
            String data[] = {keyWord.getWord(), String.valueOf(keyWord.getReact()[index]), String.valueOf(redditPostListByKeyWord.size())};
            defaultTableModel = (DefaultTableModel) tKeyWord.getModel();
            defaultTableModel.addRow(data);
        }
    }

    private void btnSapXepActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    // ------------ START TO CODE HERE -----------------
    // ------------- User parameter --------------------
    // ------------- CONNECTION SQL PARAMETER---------------

    // ------------- DISPLAY PEOPLE ---------------------
    private void display(){
        this.currentKeyWordList = keyWordList;

        int index = 0;
        if(cbReactBy.getSelectedItem().toString().equals("Reacts by day")) {
            index = 0;
        } else if(cbReactBy.getSelectedItem().toString().equals("Reacts by month")){
            index = 1;
        } else if(cbReactBy.getSelectedItem().toString().equals("Reacts by year")) {
            index = 2;
        }
        KeyWordController.sortKeyWordByReactInDayIncreasing(currentKeyWordList);
        DefaultTableModel defaultTableModel = (DefaultTableModel) tKeyWord.getModel();
        defaultTableModel.getDataVector().removeAllElements();
        defaultTableModel.fireTableDataChanged();
        System.out.println(index);
        for(KeyWord keyWord: currentKeyWordList){
            List<RedditPost> redditPostListByKeyWord = RedditPostController.getRedditPostByKeyWord(redditPostList,keyWord.getWord());
            String data[] = {keyWord.getWord(), String.valueOf(keyWord.getReact()[index]), String.valueOf(redditPostListByKeyWord.size())};
            defaultTableModel = (DefaultTableModel) tKeyWord.getModel();
            defaultTableModel.addRow(data);
//            System.out.println(data[0]);
        }
    }

    private static final List<RedditPost> redditPostList = RedditPostConnector.readRedditPostsFromJson("D:\\HUST\\2023.1\\OOP\\OOPProject\\data\\RedditPost.json");
    private static final List<KeyWord> keyWordList = KeyWordConnector.getAllKeyWords(redditPostList);
    private List<KeyWord> currentKeyWordList;
    String key = "";
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
            java.util.logging.Logger.getLogger(KeyWordScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KeyWordScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KeyWordScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KeyWordScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KeyWordScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnSapXep;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnTrinhBanGhi;
    private javax.swing.JComboBox<String> cbReactBy;
    private javax.swing.JComboBox<String> cbTangDan;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCollection;
    private javax.swing.JLabel lbKeyWord;
    private javax.swing.JLabel lbThoat;
    private javax.swing.JLabel lbTrangChu;
    private javax.swing.JPanel nhanKhauPanel;
    private javax.swing.JTable tKeyWord;
    private javax.swing.JTextField tfTim;
    // End of variables declaration
}
