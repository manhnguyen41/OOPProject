/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.logscreens;

import controllers.listcontroller.ListOfBlogs;
import models.Blog;
import models.Collection;
import views.detailsscreens.BlogDetailsForm;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Nam
 */
public class BlogLogScreen extends LogScreen {
    String key = "";

    /**
     * Creates new form Form
     */
    public BlogLogScreen() {
        super();
    }

    public BlogLogScreen(Collection collection) {
        super();
        this.blogListByCollection.setBlogList(collection.getBlogByCollection(blogList.getBlogList()));
        getTfTitle().setText(collection.getName());
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
        tBlog = new javax.swing.JTable();
        setHeader("CÁC BLOG LIÊN QUAN TỚI COLLECTION");
        setTitleLabelText("Collection");

        tBlog.setForeground(new java.awt.Color(0, 102, 102));
        tBlog.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Title", "Description", "Link"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tBlog.setGridColor(new java.awt.Color(188, 206, 206));
        tBlog.setRowHeight(26);
        tBlog.setSelectionBackground(new java.awt.Color(0, 102, 102));
        tBlog.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tBlog.setShowGrid(true);
        tBlog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tBlogMouseClicked(evt);
            }
        });
    }

    private void tBlogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tBlogMouseClicked
        DefaultTableModel model = (DefaultTableModel)tBlog.getModel();
        int indexRow = tBlog.getSelectedRow();
        key = String.valueOf(model.getValueAt(indexRow, 0).toString());

        BlogDetailsForm newDetailsForm = new BlogDetailsForm(key);
        newDetailsForm.setVisible(true);
    }


    private void btnThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }

    // ------------ Start to code -------------
    private void display() {
        this.currentBlogListByCollection = blogListByCollection;

        DefaultTableModel defaultTableModel = (DefaultTableModel) tBlog.getModel();
        defaultTableModel.getDataVector().removeAllElements();
        defaultTableModel.fireTableDataChanged();
        for (Blog blog : currentBlogListByCollection.getBlogList()) {
            String data[] = {blog.getTitle(), blog.getDescription(), blog.getLink()};
            defaultTableModel = (DefaultTableModel) tBlog.getModel();
            defaultTableModel.addRow(data);
        }
    }

    private  final ListOfBlogs blogList = new ListOfBlogs();
    private ListOfBlogs blogListByCollection = new ListOfBlogs();
    private ListOfBlogs currentBlogListByCollection;

    // Table
    public JTable table() {
        return tBlog;
    };

    // Group for optional component
    public GroupLayout.SequentialGroup horizontalOptionalGroup(
            GroupLayout logPanelLayout) {
        return logPanelLayout.createSequentialGroup();
    };

    // Group for optional component
    public GroupLayout.ParallelGroup verticalOptionalGroup(
            GroupLayout logPanelLayout) {
        return logPanelLayout.createParallelGroup();
    };
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BlogLogScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable tBlog;
    // End of variables declaration//GEN-END:variables
}
