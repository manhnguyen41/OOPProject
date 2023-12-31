package views.logscreens;

import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class LogScreen extends JFrame{
    private String header;
    private String titleLabelText;
    private String titleTFText;

    /**
     * Creates new form Form
     */
    public LogScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        initOptionalComponent();
        logPanel = new javax.swing.JPanel();
        lbHeader = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();
        tfTitle = new javax.swing.JTextField();
        tablePane = new javax.swing.JScrollPane();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        logPanel.setBackground(new java.awt.Color(255, 255, 255));
        logPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 5));
        logPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logPanelMouseClicked(evt);
            }
        });

        lbHeader.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbHeader.setForeground(new java.awt.Color(0, 102, 102));
        lbHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHeader.setText(header);

        lbTitle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(0, 102, 102));
        lbTitle.setText(titleLabelText);

        tfTitle.setEditable(false);
        tfTitle.setForeground(new java.awt.Color(0, 102, 102));
        tfTitle.setCaretColor(new java.awt.Color(0, 102, 102));
        tfTitle.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        tfTitle.setMargin(new java.awt.Insets(4, 6, 4, 6));
        tfTitle.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        tfTitle.setSelectionColor(new java.awt.Color(0, 102, 102));

        table = table();
        tablePane.setViewportView(table);

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

        javax.swing.GroupLayout logPanelLayout = new javax.swing.GroupLayout(logPanel);
        logPanel.setLayout(logPanelLayout);
        logPanelLayout.setHorizontalGroup(
                logPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(logPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tablePane, javax.swing.GroupLayout.DEFAULT_SIZE, 1119, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logPanelLayout.createSequentialGroup()
                                .addContainerGap(999, Short.MAX_VALUE)
                                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
                        .addGroup(logPanelLayout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addGroup(logPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(logPanelLayout.createSequentialGroup()
                                                .addComponent(lbTitle)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(tfTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(131, 131, 131))
                                        .addGroup(horizontalOptionalGroup(logPanelLayout))
                                )
                        )
        );
        logPanelLayout.setVerticalGroup(
                logPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(logPanelLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(btnThoat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbHeader)
                                .addGap(18, 18, 18)
                                .addGroup(logPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbTitle)
                                        .addComponent(tfTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(verticalOptionalGroup(logPanelLayout))
                                .addGap(18, 18, 18)
                                .addComponent(tablePane, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1141, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(logPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 630, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(logPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void btnThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnThoatMouseClicked

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThoatActionPerformed

    private void logPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_logPanelMouseClicked

    // ------------ Start to code -------------

    // Table
    public abstract JTable table();

    // Method to init optional components
    public abstract void initOptionalComponent();

    // Group for optional component
    public abstract GroupLayout.SequentialGroup horizontalOptionalGroup(
            GroupLayout logPanelLayout);

    // Group for optional component
    public abstract GroupLayout.ParallelGroup verticalOptionalGroup(
            GroupLayout logPanelLayout);

    //
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
            Logger.getLogger(BlogLogScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(BlogLogScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(BlogLogScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            Logger.getLogger(BlogLogScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BlogLogScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel logPanel;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel lbHeader;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JScrollPane tablePane;
    private javax.swing.JTextField tfTitle;
    private JTable table;
    // End of variables declaration//GEN-END:variables

    public void setHeader(String header) {
        this.header = header;
    }

    public void setTitleLabelText(String titleLabelText) {
        this.titleLabelText = titleLabelText;
    }

    public JTextField getTfTitle() {
        return tfTitle;
    }
}
