/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.detailsscreens;

import controllers.listcontroller.ListOfBlogs;
import models.Blog;

import javax.swing.*;


/**
 *
 * @author Nam
 */
public class BlogDetailsForm extends PostDetailsForm {
    private String collection;
    private String description;
    
    /**
     * Creates new form Form
     */
    public BlogDetailsForm() {
        super();
    }
    public BlogDetailsForm(String title) {
        super(title);
        tfCollection.setText(collection);
        tfDescription.setText(description);
    }

    public void getPostDetails(String title) {
        ListOfBlogs listOfBlogs = new ListOfBlogs();
        Blog blog = listOfBlogs.search(title).get(0);
        setTitle(blog.getTitle());
        setLink(blog.getLink());
        collection = blog.getCollection();
        description = blog.getDescription();
    }


    // ----------------- start to code --------------------

    @Override
    public void initOptionalComponent() {
        setHeader("THÔNG TIN VỀ BLOG");
        tfCollection = new javax.swing.JTextField();
        lbCollection = new javax.swing.JLabel();
        lbDescription = new javax.swing.JLabel();
        spDescription = new javax.swing.JScrollPane();
        tfDescription = new javax.swing.JTextArea();

        tfCollection.setEditable(false);
        tfCollection.setForeground(new java.awt.Color(0, 102, 102));
        tfCollection.setCaretColor(new java.awt.Color(0, 102, 102));
        tfCollection.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        tfCollection.setMargin(new java.awt.Insets(4, 6, 4, 6));
        tfCollection.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        tfCollection.setSelectionColor(new java.awt.Color(0, 102, 102));

        lbCollection.setForeground(new java.awt.Color(0, 102, 102));
        lbCollection.setText("Collection");

        lbDescription.setForeground(new java.awt.Color(0, 102, 102));
        lbDescription.setText("Description");

        tfDescription.setEditable(false);
        tfDescription.setColumns(20);
        tfDescription.setForeground(new java.awt.Color(0, 102, 102));
        tfDescription.setRows(5);
        tfDescription.setLineWrap(true);
        spDescription.setViewportView(tfDescription);
    }

    @Override
    public GroupLayout.SequentialGroup horizontalOptionalGroup(
            GroupLayout panelPostDetailsFormLayout) {
        return panelPostDetailsFormLayout.createSequentialGroup()
                .addGroup(panelPostDetailsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbCollection)
                        .addComponent(lbDescription))
                .addGap(22, 22, 22)
                .addGroup(panelPostDetailsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfCollection)
                        .addComponent(spDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE));
    }

    @Override
    public GroupLayout.SequentialGroup verticalOptionalGroup(
            GroupLayout panelPostDetailsFormLayout) {
        return panelPostDetailsFormLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelPostDetailsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbCollection)
                        .addComponent(tfCollection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPostDetailsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(spDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelPostDetailsFormLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(lbDescription)));
    };

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BlogDetailsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BlogDetailsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BlogDetailsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BlogDetailsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BlogDetailsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField tfCollection;
    private javax.swing.JTextArea tfDescription;
    private javax.swing.JLabel lbDescription;
    private javax.swing.JLabel lbCollection;
    private javax.swing.JScrollPane spDescription;
    // End of variables declaration//GEN-END:variables
}
