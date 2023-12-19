/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.KeyWordBoardScreen;

import controller.listController.ListOfRedditPosts;
import models.KeyWord;
import models.RedditPost;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nam
 */
public class RedditPostLogScreen extends javax.swing.JFrame {
    
    String key = "";

    /**
     * Creates new form Form
     */
    public RedditPostLogScreen() {
        initComponents();
    }

    public RedditPostLogScreen(KeyWord keyWord) {
        initComponents();
        this.keyWord = keyWord;
        this.redditPostListByKeyWord.setRedditPostList(redditPostList.getRedditPostByKeyWord(keyWord.getWord()));
        System.out.println(this.keyWord);
        System.out.println(this.redditPostListByKeyWord.getRedditPostList().size());
        tfKeyWord.setText(keyWord.getWord());
        display();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        redditPostPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfKeyWord = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tRedditPost = new javax.swing.JTable();
        btnSapXep = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        cbTangDan = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        redditPostPanel.setBackground(new java.awt.Color(255, 255, 255));
        redditPostPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 5));
        redditPostPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redditPostPanelMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CÁC REDDIT POST LIÊN QUAN TỚI KEYWORD");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Keyword");

        tfKeyWord.setEditable(false);
        tfKeyWord.setForeground(new java.awt.Color(0, 102, 102));
        tfKeyWord.setCaretColor(new java.awt.Color(0, 102, 102));
        tfKeyWord.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        tfKeyWord.setMargin(new java.awt.Insets(4, 6, 4, 6));
        tfKeyWord.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        tfKeyWord.setSelectionColor(new java.awt.Color(0, 102, 102));

        tRedditPost.setForeground(new java.awt.Color(0, 102, 102));
        tRedditPost.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Author", "Ups", "Downs", "Number of comments", "Created at"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tRedditPost.setGridColor(new java.awt.Color(188, 206, 206));
        tRedditPost.setRowHeight(26);
        tRedditPost.setSelectionBackground(new java.awt.Color(0, 102, 102));
        tRedditPost.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tRedditPost.setShowGrid(true);
        tRedditPost.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tRedditPostMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tRedditPost);

        btnSapXep.setBackground(new java.awt.Color(0, 51, 51));
        btnSapXep.setForeground(new java.awt.Color(255, 255, 255));
        btnSapXep.setText("Sắp xếp theo");
        btnSapXep.setMargin(new java.awt.Insets(4, 5, 4, 5));
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

        btnThoat.setBackground(new java.awt.Color(102, 0, 0));
        btnThoat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(255, 255, 255));
        btnThoat.setText("THOÁT");
        btnThoat.setBorderPainted(false);
        btnThoat.setMargin(new java.awt.Insets(4, 10, 4, 10));
        btnThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThoatMouseClicked(evt);
            }
        });
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        cbTangDan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lượng reacts tăng dần", "Lượng reacts giảm dần", " " }));

        javax.swing.GroupLayout redditPostPanelLayout = new javax.swing.GroupLayout(redditPostPanel);
        redditPostPanel.setLayout(redditPostPanelLayout);
        redditPostPanelLayout.setHorizontalGroup(
            redditPostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(redditPostPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1119, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, redditPostPanelLayout.createSequentialGroup()
                .addContainerGap(999, Short.MAX_VALUE)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(redditPostPanelLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(redditPostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(redditPostPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfKeyWord, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131))
                    .addGroup(redditPostPanelLayout.createSequentialGroup()
                        .addComponent(btnSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbTangDan, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        redditPostPanelLayout.setVerticalGroup(
            redditPostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(redditPostPanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(btnThoat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(redditPostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfKeyWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(redditPostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSapXep)
                    .addComponent(cbTangDan))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1141, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(redditPostPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(redditPostPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tRedditPostMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tRedditPostMouseClicked
        DefaultTableModel model = (DefaultTableModel)tRedditPost.getModel();
        int indexRow = tRedditPost.getSelectedRow();
        key = String.valueOf(model.getValueAt(indexRow, 0).toString());
//        System.out.println(this.key);
        RedditPostDetailsForm newDetailsForm = new RedditPostDetailsForm(key);
        newDetailsForm.setVisible(true);
    }//GEN-LAST:event_tRedditPostMouseClicked

    private void btnSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSapXepActionPerformed

    
    private void btnSapXepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSapXepMouseClicked
        display();
    }//GEN-LAST:event_btnSapXepMouseClicked

    private void btnThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnThoatMouseClicked

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThoatActionPerformed

    private void redditPostPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redditPostPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_redditPostPanelMouseClicked

    // ---------------------- START TO CODE HERE ---------------------
    private KeyWord keyWord = null;
    private final ListOfRedditPosts redditPostList = new ListOfRedditPosts();
    private ListOfRedditPosts redditPostListByKeyWord = new ListOfRedditPosts();
    private ListOfRedditPosts currentRedditPostListByKeyWord;
    // ----------- display ----------
    private void display() {
        this.currentRedditPostListByKeyWord = redditPostListByKeyWord;
        if(cbTangDan.getSelectedItem().toString().equals("Lượng reacts tăng dần")) {
            currentRedditPostListByKeyWord.sortByPostReactASC();
        } else if (cbTangDan.getSelectedItem().toString().equals("Lượng reacts giảm dần")) {
            currentRedditPostListByKeyWord.sortByPostReactDES();
        }
//        RedditPostController.sortByPostReactASC(currentRedditPostListByKeyWord);
        DefaultTableModel defaultTableModel = (DefaultTableModel) tRedditPost.getModel();
        defaultTableModel.getDataVector().removeAllElements();
        defaultTableModel.fireTableDataChanged();
        for (RedditPost redditPost : currentRedditPostListByKeyWord.getRedditPostList()) {
            String data[] = {redditPost.getTitle(), redditPost.getAuthor(), String.valueOf(redditPost.getUps()), String.valueOf(redditPost.getDowns()), String.valueOf(redditPost.getNumComments()), redditPost.getCreated()};
            defaultTableModel = (DefaultTableModel) tRedditPost.getModel();
            defaultTableModel.addRow(data);
        }
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RedditPostLogScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel redditPostPanel;
    private javax.swing.JButton btnSapXep;
    private javax.swing.JButton btnThoat;
    private javax.swing.JComboBox<String> cbTangDan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tRedditPost;
    private javax.swing.JTextField tfKeyWord;
    // End of variables declaration//GEN-END:variables
}
