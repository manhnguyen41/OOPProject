/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.logscreens;

import controllers.listcontroller.ListOfRedditPosts;
import models.KeyWord;
import models.RedditPost;
import views.detailsscreens.RedditPostDetailsForm;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Nam
 */
public class RedditPostLogScreen extends LogScreen {
    String key = "";

    /**
     * Creates new form Form
     */
    public RedditPostLogScreen() {
        super();
    }

    public RedditPostLogScreen(KeyWord keyWord) {
        super();
        this.keyWord = keyWord;
        this.redditPostListByKeyWord.setRedditPostList(redditPostList.getRedditPostByKeyWord(keyWord.getWord()));
        System.out.println(this.keyWord);
        System.out.println(this.redditPostListByKeyWord.getRedditPostList().size());
        getTfTitle().setText(keyWord.getWord());
        display();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    @Override
    public void initOptionalComponent() {
        tRedditPost = new javax.swing.JTable();
        btnSapXep = new javax.swing.JButton();
        cbTangDan = new javax.swing.JComboBox<>();

        setHeader("CÁC REDDIT POST LIÊN QUAN TỚI KEYWORD");

        setTitleLabelText("Keyword");

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

        cbTangDan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lượng reacts tăng dần", "Lượng reacts giảm dần", " " }));
    }// </editor-fold>//GEN-END:initComponents

    private void tRedditPostMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tRedditPostMouseClicked
        DefaultTableModel model = (DefaultTableModel)tRedditPost.getModel();
        int indexRow = tRedditPost.getSelectedRow();
        key = String.valueOf(model.getValueAt(indexRow, 0).toString());
//        System.out.println(this.key);
        RedditPostDetailsForm newDetailsForm = new RedditPostDetailsForm(key);
        newDetailsForm.setVisible(true);
    }

    private void btnSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepActionPerformed
        // TODO add your handling code here:
    }

    
    private void btnSapXepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSapXepMouseClicked
        display();
    }

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

    // Table
    public JTable table() {
        return tRedditPost;
    };

    // Group for optional component
    public GroupLayout.SequentialGroup horizontalOptionalGroup(
            GroupLayout logPanelLayout) {
        return logPanelLayout.createSequentialGroup()
                .addComponent(btnSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbTangDan, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
    };

    // Group for optional component
    public GroupLayout.ParallelGroup verticalOptionalGroup(
            GroupLayout logPanelLayout) {
        return logPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnSapXep)
                .addComponent(cbTangDan);
    };
        
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
    private javax.swing.JButton btnSapXep;
    private javax.swing.JComboBox<String> cbTangDan;
    private javax.swing.JTable tRedditPost;
    // End of variables declaration//GEN-END:variables
}
