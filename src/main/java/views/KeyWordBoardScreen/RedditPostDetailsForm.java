/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.KeyWordBoardScreen;

import connector.RedditPostConnector;
import controller.ListOfRedditPosts;
import models.RedditPost;

import java.util.List;


/**
 *
 * @author Nam
 */
public class RedditPostDetailsForm extends javax.swing.JFrame {

    
    /**
     * Creates new form Form
     */
    public RedditPostDetailsForm() {
        initComponents();
    }

    public RedditPostDetailsForm(String title) {
        initComponents();
        this.title = title;
        ListOfRedditPosts redditPostList = new ListOfRedditPosts();
        RedditPost redditPost = redditPostList.getRedditPostByTitle(this.title).getFirst();

        if (redditPost != null) {
            tfTitle.setText(redditPost.getTitle());
            tfAuthor.setText(redditPost.getAuthor());
            tfLink.setText(redditPost.getLink());
            taContent.setText(redditPost.getSumContent());
            tfUps.setText(String.valueOf(redditPost.getUps()));
            tfDowns.setText(String.valueOf(redditPost.getDowns()));
            tfNumComments.setText(String.valueOf(redditPost.getNumComments()));
            tfTimeFrame.setText(redditPost.getTimeFrame());
            tfCreated.setText(redditPost.getCreated());
            tfKeyWord.setText(redditPost.getKeyword());
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

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfTitle = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        tfUps = new javax.swing.JTextField();
        btnThoat = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tfAuthor = new javax.swing.JTextField();
        tfLink = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taContent = new javax.swing.JTextArea();
        tfDowns = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfNumComments = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfCreated = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tfTimeFrame = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tfKeyWord = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("THÔNG TIN VỀ REDDIT POST");

        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Title");

        tfTitle.setForeground(new java.awt.Color(0, 102, 102));
        tfTitle.setCaretColor(new java.awt.Color(0, 102, 102));
        tfTitle.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        tfTitle.setMargin(new java.awt.Insets(4, 6, 4, 6));
        tfTitle.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        tfTitle.setSelectionColor(new java.awt.Color(0, 102, 102));
        tfTitle.setEditable(false);

        jLabel19.setForeground(new java.awt.Color(0, 102, 102));
        jLabel19.setText("Ups");

        tfUps.setForeground(new java.awt.Color(0, 102, 102));
        tfUps.setCaretColor(new java.awt.Color(0, 102, 102));
        tfUps.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        tfUps.setMargin(new java.awt.Insets(4, 6, 4, 6));
        tfUps.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        tfUps.setSelectionColor(new java.awt.Color(0, 102, 102));
        tfUps.setEditable(false);
        tfUps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUpsActionPerformed(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(102, 0, 0));
        btnThoat.setForeground(new java.awt.Color(255, 255, 255));
        btnThoat.setText("Thoát");
        btnThoat.setMargin(new java.awt.Insets(3, 14, 3, 14));
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

        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Author");

        tfAuthor.setForeground(new java.awt.Color(0, 102, 102));
        tfAuthor.setCaretColor(new java.awt.Color(0, 102, 102));
        tfAuthor.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        tfAuthor.setMargin(new java.awt.Insets(4, 6, 4, 6));
        tfAuthor.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        tfAuthor.setSelectionColor(new java.awt.Color(0, 102, 102));
        tfAuthor.setEditable(false);

        tfLink.setForeground(new java.awt.Color(0, 102, 102));
        tfLink.setCaretColor(new java.awt.Color(0, 102, 102));
        tfLink.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        tfLink.setMargin(new java.awt.Insets(4, 6, 4, 6));
        tfLink.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        tfLink.setSelectionColor(new java.awt.Color(0, 102, 102));
        tfLink.setEditable(false);

        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Link");

        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Content");

        taContent.setColumns(20);
        taContent.setForeground(new java.awt.Color(0, 102, 102));
        taContent.setRows(5);
        taContent.setEditable(false);
        taContent.setLineWrap(true);
        jScrollPane1.setViewportView(taContent);

        tfDowns.setForeground(new java.awt.Color(0, 102, 102));
        tfDowns.setCaretColor(new java.awt.Color(0, 102, 102));
        tfDowns.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        tfDowns.setMargin(new java.awt.Insets(4, 6, 4, 6));
        tfDowns.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        tfDowns.setSelectionColor(new java.awt.Color(0, 102, 102));
        tfDowns.setEditable(false);
        tfDowns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDownsActionPerformed(evt);
            }
        });

        jLabel21.setForeground(new java.awt.Color(0, 102, 102));
        jLabel21.setText("Downs");

        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Number of comments");

        tfNumComments.setForeground(new java.awt.Color(0, 102, 102));
        tfNumComments.setCaretColor(new java.awt.Color(0, 102, 102));
        tfNumComments.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        tfNumComments.setMargin(new java.awt.Insets(4, 6, 4, 6));
        tfNumComments.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        tfNumComments.setSelectionColor(new java.awt.Color(0, 102, 102));
        tfNumComments.setEditable(false);

        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("Created at");

        tfCreated.setForeground(new java.awt.Color(0, 102, 102));
        tfCreated.setCaretColor(new java.awt.Color(0, 102, 102));
        tfCreated.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        tfCreated.setMargin(new java.awt.Insets(4, 6, 4, 6));
        tfCreated.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        tfCreated.setSelectionColor(new java.awt.Color(0, 102, 102));
        tfCreated.setEditable(false);

        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setText("Time Frame");

        tfTimeFrame.setForeground(new java.awt.Color(0, 102, 102));
        tfTimeFrame.setCaretColor(new java.awt.Color(0, 102, 102));
        tfTimeFrame.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        tfTimeFrame.setMargin(new java.awt.Insets(4, 6, 4, 6));
        tfTimeFrame.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        tfTimeFrame.setSelectionColor(new java.awt.Color(0, 102, 102));
        tfTimeFrame.setEditable(false);

        jLabel14.setForeground(new java.awt.Color(0, 102, 102));
        jLabel14.setText("Key word");

        tfKeyWord.setForeground(new java.awt.Color(0, 102, 102));
        tfKeyWord.setCaretColor(new java.awt.Color(0, 102, 102));
        tfKeyWord.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        tfKeyWord.setMargin(new java.awt.Insets(4, 6, 4, 6));
        tfKeyWord.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        tfKeyWord.setSelectionColor(new java.awt.Color(0, 102, 102));
        tfKeyWord.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfTitle)
                                    .addComponent(tfAuthor)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel19))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfLink)
                                    .addComponent(jScrollPane1)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(tfUps, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                        .addComponent(jLabel21)
                                        .addGap(35, 35, 35)
                                        .addComponent(tfDowns, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfKeyWord, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                                    .addComponent(tfTimeFrame)
                                    .addComponent(tfCreated)
                                    .addComponent(tfNumComments))))
                        .addGap(64, 64, 64)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(btnThoat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(tfUps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfDowns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tfNumComments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tfCreated, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tfTimeFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tfKeyWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnThoat)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThoatActionPerformed

    private void tfUpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUpsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUpsActionPerformed

    private void btnThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnThoatMouseClicked

    private void tfDownsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDownsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDownsActionPerformed

    // ---------- START TO CODE HERE -----------
    private String title;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RedditPostDetailsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taContent;
    private javax.swing.JTextField tfAuthor;
    private javax.swing.JTextField tfCreated;
    private javax.swing.JTextField tfDowns;
    private javax.swing.JTextField tfKeyWord;
    private javax.swing.JTextField tfLink;
    private javax.swing.JTextField tfNumComments;
    private javax.swing.JTextField tfTimeFrame;
    private javax.swing.JTextField tfTitle;
    private javax.swing.JTextField tfUps;
    // End of variables declaration//GEN-END:variables
}
