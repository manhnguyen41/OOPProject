/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.screens;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import controllers.listcontroller.ListOfKeyWords;
import controllers.listcontroller.ListOfRedditPosts;
import models.KeyWord;
import models.RedditPost;
import views.logscreens.RedditPostLogScreen;
import views.Home;

import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nam
 */
public class KeyWordScreen extends Screen {

    /**
     */
    public KeyWordScreen() {
        super();
        display();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    @Override
    public void initOptionalComponent() {
        setHeader("KEYWORD");
        lbCollection = new javax.swing.JLabel();
        lbTrangChu = new javax.swing.JLabel();
        lbKeyWord = new javax.swing.JLabel();
        lbThoat = new javax.swing.JLabel();
        lbHeader = new javax.swing.JLabel();
        btnTim = new javax.swing.JButton();
        tablePane = new javax.swing.JScrollPane();
        tKeyWord = new javax.swing.JTable();
        tfTim = new javax.swing.JTextField();
        btnSapXep = new javax.swing.JButton();
        cbTangDan = new javax.swing.JComboBox<>();
        cbReactBy = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        lbHeader.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbHeader.setForeground(new java.awt.Color(0, 102, 102));
        lbHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHeader.setText("KEY WORDS");
        lbHeader.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

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
                        "Key word", "Number of reacts", "Number of posts"
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
        tablePane.setViewportView(tKeyWord);

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

        cbTangDan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tăng dần theo ngày", "Giảm dần theo ngày", "Tăng dần theo tháng", "Giảm dần theo tháng", "Tăng dần theo năm", "Giảm dần theo năm" }));

        cbReactBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reacts theo ngày", "Reacts theo tháng", "Reacts theo năm" }));
    }// </editor-fold>

    private void tKeyWordMouseClicked(java.awt.event.MouseEvent evt) {
        DefaultTableModel model = (DefaultTableModel)tKeyWord.getModel();
        int indexRow = tKeyWord.getSelectedRow();
        key = String.valueOf(model.getValueAt(indexRow, 0).toString());
        KeyWord keyWord = keyWordList.search(key).get(0);
        RedditPostLogScreen newLogScreen = new RedditPostLogScreen(keyWord);
        newLogScreen.setVisible(true);
    }

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

    }

    private void btnTimMouseClicked(java.awt.event.MouseEvent evt) {
//       TODO add your handling code here:
        String ten = tfTim.getText();
        List<KeyWord> keyWords = keyWordList.search(ten);
        String firstItem = cbTangDan.getSelectedItem().toString();
        int index = 0;
        if(cbReactBy.getSelectedItem().toString().equals("Reacts theo ngày")) {
            index = 0;
        } else if(cbReactBy.getSelectedItem().toString().equals("Reacts theo tháng")){
            index = 1;
        } else if(cbReactBy.getSelectedItem().toString().equals("Reacts theo năm")) {
            index = 2;
        }
        DefaultTableModel defaultTableModel = (DefaultTableModel) tKeyWord.getModel();
        defaultTableModel.getDataVector().removeAllElements();
        defaultTableModel.fireTableDataChanged();

        for (KeyWord keyWord: keyWords) {
            List<RedditPost> redditPostListByKeyWord = redditPostList.getRedditPostByKeyWord(keyWord.getWord());
            String data[] = {keyWord.getWord(), String.valueOf(keyWord.getReact()[index]), String.valueOf(redditPostListByKeyWord.size())};
            defaultTableModel = (DefaultTableModel) tKeyWord.getModel();
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
        CollectionScreen collectionScreen = new CollectionScreen();
        collectionScreen.setVisible(true);
        this.dispose();
    }

    private void lbKeyWordMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:

    }

    private void btnSapXepMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        display();
    }

    private void btnSapXepActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    // ------------ START TO CODE HERE -----------------
    // ------------- DISPLAY ---------------------
    private void display(){
        this.currentKeyWordList = keyWordList;

        String firstItem = cbTangDan.getSelectedItem().toString();
        int index = 0;
        if(cbReactBy.getSelectedItem().toString().equals("Reacts theo ngày")) {
            index = 0;
        } else if(cbReactBy.getSelectedItem().toString().equals("Reacts theo tháng")){
            index = 1;
        } else if(cbReactBy.getSelectedItem().toString().equals("Reacts theo năm")) {
            index = 2;
        }
        DefaultTableModel defaultTableModel = (DefaultTableModel) tKeyWord.getModel();
        defaultTableModel.getDataVector().removeAllElements();
        defaultTableModel.fireTableDataChanged();
        if (firstItem.equals("Tăng dần theo ngày")){
            currentKeyWordList.sortKeyWordByReactInDayIncreasing();
        } else if (firstItem.equals("Giảm dần theo ngày")) {
            currentKeyWordList.sortKeyWordByReactInDayDecreasing();
        } else if (firstItem.equals("Tăng dần theo tháng")) {
            currentKeyWordList.sortKeyWordByReactInMonthIncreasing();
        } else if (firstItem.equals("Giảm dần theo tháng")) {
            currentKeyWordList.sortKeyWordByReactInMonthDecreasing();
        } else if (firstItem.equals("Tăng dần theo năm")) {
            currentKeyWordList.sortKeyWordByReactInYearIncreasing();
        } else if (firstItem.equals("Giảm dần theo năm")) {
            currentKeyWordList.sortKeyWordByReactInYearDecreasing();
        }
        for(KeyWord keyWord: currentKeyWordList.getKeyWordList()) {
            List<RedditPost> redditPostListByKeyWord = redditPostList.getRedditPostByKeyWord(keyWord.getWord());
            String data[] = {keyWord.getWord(), String.valueOf(keyWord.getReact()[index]), String.valueOf(redditPostListByKeyWord.size())};
            defaultTableModel = (DefaultTableModel) tKeyWord.getModel();
            defaultTableModel.addRow(data);
        }
    }

    private final ListOfRedditPosts redditPostList = new ListOfRedditPosts();
    private final ListOfKeyWords keyWordList = new ListOfKeyWords(redditPostList);
    private ListOfKeyWords currentKeyWordList;

    // Pane table
    public JScrollPane tablePane() {
        return tablePane;
    };

    // Group for optional component
    public GroupLayout.SequentialGroup horizontalOptionalGroup(
            GroupLayout mainPanelLayout) {
        return mainPanelLayout.createSequentialGroup()
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
                .addGap(44, 44, 44);
    };

    // Group for optional component
    public GroupLayout.ParallelGroup verticalOptionalGroup(
            GroupLayout mainPanelLayout) {
        return mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(tfTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnTim)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSapXep)
                        .addComponent(cbTangDan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(cbReactBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE);
    };
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
    private javax.swing.JComboBox<String> cbReactBy;
    private javax.swing.JComboBox<String> cbTangDan;
    private javax.swing.JLabel lbHeader;
    private javax.swing.JScrollPane tablePane;
    private javax.swing.JLabel lbCollection;
    private javax.swing.JLabel lbKeyWord;
    private javax.swing.JLabel lbThoat;
    private javax.swing.JLabel lbTrangChu;
    private javax.swing.JTable tKeyWord;
    private javax.swing.JTextField tfTim;
    // End of variables declaration
}