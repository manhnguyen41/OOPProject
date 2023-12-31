/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.detailsscreens;

import controllers.listcontroller.ListOfRedditPosts;
import models.RedditPost;

import javax.swing.*;

/**
 *
 * @author Nam
 */
public class RedditPostDetailsForm extends PostDetailsForm {

    
    /**
     * Creates new form Form
     */
    public RedditPostDetailsForm() {
        super();
    }

    private String author;
    private String content;
    private String ups;
    private String downs;
    private String numComments;
    private String timeFrame;
    private String created;
    private String keyWord;

    public RedditPostDetailsForm(String title) {
        super(title);
        tfAuthor.setText(author);
        taContent.setText(content);
        tfUps.setText(ups);
        tfDowns.setText(downs);
        tfNumComments.setText(numComments);
        tfTimeFrame.setText(timeFrame);
        tfCreated.setText(created);
        tfKeyWord.setText(keyWord);
    }

    @Override
    public void getPostDetails(String title) {
        ListOfRedditPosts redditPosts = new ListOfRedditPosts();
        RedditPost redditPost = redditPosts.search(title).get(0);
        setTitle(redditPost.getTitle());
        setLink(redditPost.getLink());
        author = redditPost.getAuthor();
        content = redditPost.getSumContent();
        ups = String.valueOf(redditPost.getUps());
        downs = String.valueOf(redditPost.getDowns());
        numComments = String.valueOf(redditPost.getNumComments());
        timeFrame = redditPost.getTimeFrame();
        created = redditPost.getCreated();
        keyWord = redditPost.getKeyword();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
//    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
//    private void initComponents() {

//
//        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//        getContentPane().setLayout(layout);
//        layout.setHorizontalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addComponent(panelPostDetailsForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//        );
//        layout.setVerticalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addComponent(panelPostDetailsForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//        );
//
//        pack();
//    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void initOptionalComponent() {
        setHeader("THÔNG TIN VỀ REDDIT POST");
        lbUps = new javax.swing.JLabel();
        tfUps = new javax.swing.JTextField();
        lbAuthor = new javax.swing.JLabel();
        tfAuthor = new javax.swing.JTextField();
        lbContent = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taContent = new javax.swing.JTextArea();
        tfDowns = new javax.swing.JTextField();
        lbDowns = new javax.swing.JLabel();
        lbNumberOfComments = new javax.swing.JLabel();
        tfNumComments = new javax.swing.JTextField();
        lbCreatedAt = new javax.swing.JLabel();
        tfCreated = new javax.swing.JTextField();
        lbTimeFrame = new javax.swing.JLabel();
        tfTimeFrame = new javax.swing.JTextField();
        lbKeyWord = new javax.swing.JLabel();
        tfKeyWord = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbUps.setForeground(new java.awt.Color(0, 102, 102));
        lbUps.setText("Ups");

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

        lbAuthor.setForeground(new java.awt.Color(0, 102, 102));
        lbAuthor.setText("Author");

        tfAuthor.setForeground(new java.awt.Color(0, 102, 102));
        tfAuthor.setCaretColor(new java.awt.Color(0, 102, 102));
        tfAuthor.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        tfAuthor.setMargin(new java.awt.Insets(4, 6, 4, 6));
        tfAuthor.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        tfAuthor.setSelectionColor(new java.awt.Color(0, 102, 102));
        tfAuthor.setEditable(false);

        lbContent.setForeground(new java.awt.Color(0, 102, 102));
        lbContent.setText("Content");

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

        lbDowns.setForeground(new java.awt.Color(0, 102, 102));
        lbDowns.setText("Downs");

        lbNumberOfComments.setForeground(new java.awt.Color(0, 102, 102));
        lbNumberOfComments.setText("Number of comments");

        tfNumComments.setForeground(new java.awt.Color(0, 102, 102));
        tfNumComments.setCaretColor(new java.awt.Color(0, 102, 102));
        tfNumComments.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        tfNumComments.setMargin(new java.awt.Insets(4, 6, 4, 6));
        tfNumComments.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        tfNumComments.setSelectionColor(new java.awt.Color(0, 102, 102));
        tfNumComments.setEditable(false);

        lbCreatedAt.setForeground(new java.awt.Color(0, 102, 102));
        lbCreatedAt.setText("Created at");

        tfCreated.setForeground(new java.awt.Color(0, 102, 102));
        tfCreated.setCaretColor(new java.awt.Color(0, 102, 102));
        tfCreated.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        tfCreated.setMargin(new java.awt.Insets(4, 6, 4, 6));
        tfCreated.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        tfCreated.setSelectionColor(new java.awt.Color(0, 102, 102));
        tfCreated.setEditable(false);

        lbTimeFrame.setForeground(new java.awt.Color(0, 102, 102));
        lbTimeFrame.setText("Time Frame");

        tfTimeFrame.setForeground(new java.awt.Color(0, 102, 102));
        tfTimeFrame.setCaretColor(new java.awt.Color(0, 102, 102));
        tfTimeFrame.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        tfTimeFrame.setMargin(new java.awt.Insets(4, 6, 4, 6));
        tfTimeFrame.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        tfTimeFrame.setSelectionColor(new java.awt.Color(0, 102, 102));
        tfTimeFrame.setEditable(false);

        lbKeyWord.setForeground(new java.awt.Color(0, 102, 102));
        lbKeyWord.setText("Key word");

        tfKeyWord.setForeground(new java.awt.Color(0, 102, 102));
        tfKeyWord.setCaretColor(new java.awt.Color(0, 102, 102));
        tfKeyWord.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        tfKeyWord.setMargin(new java.awt.Insets(4, 6, 4, 6));
        tfKeyWord.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        tfKeyWord.setSelectionColor(new java.awt.Color(0, 102, 102));
        tfKeyWord.setEditable(false);

    }

    @Override
    public GroupLayout.SequentialGroup horizontalOptionalGroup(GroupLayout panelPostDetailsFormLayout) {
        return panelPostDetailsFormLayout.createSequentialGroup()
                .addGroup(panelPostDetailsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelPostDetailsFormLayout.createSequentialGroup()
                                .addGroup(panelPostDetailsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelPostDetailsFormLayout.createSequentialGroup()
                                                .addGroup(panelPostDetailsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lbAuthor)))
                                        .addComponent(lbContent)
                                        .addComponent(lbUps))
                                .addGap(40, 40, 40)
                                .addGroup(panelPostDetailsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfAuthor)
                                        .addComponent(jScrollPane1)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPostDetailsFormLayout.createSequentialGroup()
                                                .addComponent(tfUps, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                                .addComponent(lbDowns)
                                                .addGap(35, 35, 35)
                                                .addComponent(tfDowns, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPostDetailsFormLayout.createSequentialGroup()
                                .addGroup(panelPostDetailsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbNumberOfComments)
                                        .addComponent(lbCreatedAt)
                                        .addComponent(lbTimeFrame)
                                        .addComponent(lbKeyWord))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelPostDetailsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tfKeyWord, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                                        .addComponent(tfTimeFrame)
                                        .addComponent(tfCreated)
                                        .addComponent(tfNumComments)))
                );
    }

    @Override
    public GroupLayout.SequentialGroup verticalOptionalGroup(GroupLayout panelPostDetailsFormLayout) {
        return panelPostDetailsFormLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelPostDetailsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbAuthor)
                        .addComponent(tfAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelPostDetailsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbContent)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelPostDetailsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelPostDetailsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbUps)
                                .addComponent(tfUps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelPostDetailsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfDowns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbDowns)))
                .addGap(10, 10, 10)
                .addGroup(panelPostDetailsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbNumberOfComments)
                        .addComponent(tfNumComments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelPostDetailsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbCreatedAt)
                        .addComponent(tfCreated, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelPostDetailsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbTimeFrame)
                        .addComponent(tfTimeFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelPostDetailsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbKeyWord)
                        .addComponent(tfKeyWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10);
    }

    private void tfUpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUpsActionPerformed
        // TODO add your handling code here:
    }

    private void tfDownsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDownsActionPerformed
        // TODO add your handling code here:
    }

    // ---------- START TO CODE HERE -----------
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RedditPostDetailsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbContent;
    private javax.swing.JLabel lbNumberOfComments;
    private javax.swing.JLabel lbCreatedAt;
    private javax.swing.JLabel lbTimeFrame;
    private javax.swing.JLabel lbKeyWord;
    private javax.swing.JLabel lbUps;
    private javax.swing.JLabel lbDowns;
    private javax.swing.JLabel lbAuthor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taContent;
    private javax.swing.JTextField tfAuthor;
    private javax.swing.JTextField tfCreated;
    private javax.swing.JTextField tfDowns;
    private javax.swing.JTextField tfKeyWord;
    private javax.swing.JTextField tfNumComments;
    private javax.swing.JTextField tfTimeFrame;
    private javax.swing.JTextField tfUps;
    // End of variables declaration//GEN-END:variables
}
