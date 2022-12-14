/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package online.Deemah.ui;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import online.Deemah.entities.Book;
import online.Deemah.exceptions.BookNotFoundException;
import online.Deemah.exceptions.ServiceException;
import online.Deemah.services.BookService;
import online.Deemah.services.BookServiceImpl;

/**
 *
 * @author Deema
 */
public class showFrame extends javax.swing.JFrame {

    /**
     * Creates new form showFrame
     */
    public showFrame() {
        initComponents();
        bookInfo.setVisible(false);
        ExisButtonInShowFrame.setVisible(false);
        RemoveButtonInShowFrame.setVisible(false);
        this.getContentPane().setBackground(Color.WHITE);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bookInfo = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        BookTitle = new javax.swing.JLabel();
        AuthorName = new javax.swing.JLabel();
        PublishYear = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ShowText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        RemoveButtonInShowFrame = new javax.swing.JButton();
        ExisButtonInShowFrame = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel6.setText("ISBN :");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(650, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("SHOW BY ISBN ..");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 193, 66));

        bookInfo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setText("Book Title :");

        jLabel11.setText("Author Name :");

        jLabel12.setText("Publish Year :");

        BookTitle.setText("- title -");

        AuthorName.setText("- author name -");

        PublishYear.setText("- publish year -");

        javax.swing.GroupLayout bookInfoLayout = new javax.swing.GroupLayout(bookInfo);
        bookInfo.setLayout(bookInfoLayout);
        bookInfoLayout.setHorizontalGroup(
            bookInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookInfoLayout.createSequentialGroup()
                .addGroup(bookInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookInfoLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookInfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(bookInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(bookInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AuthorName)
                    .addComponent(PublishYear)
                    .addComponent(BookTitle))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bookInfoLayout.setVerticalGroup(
            bookInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookInfoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(bookInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(BookTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(bookInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AuthorName)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(bookInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PublishYear)
                    .addComponent(jLabel12))
                .addGap(27, 27, 27))
        );

        getContentPane().add(bookInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 190, 130));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        ShowText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowTextActionPerformed(evt);
            }
        });

        jLabel8.setText("ISBN :");

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Show");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(ShowText, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShowText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 240, 80));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        RemoveButtonInShowFrame.setBackground(new java.awt.Color(102, 102, 102));
        RemoveButtonInShowFrame.setForeground(new java.awt.Color(255, 255, 255));
        RemoveButtonInShowFrame.setIcon(new javax.swing.ImageIcon("C:\\Users\\Deema\\OneDrive\\Pictures\\Saved Pictures\\icons8-cancel-delete.png")); // NOI18N
        RemoveButtonInShowFrame.setText("Remove");
        RemoveButtonInShowFrame.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RemoveButtonInShowFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButtonInShowFrameActionPerformed(evt);
            }
        });

        ExisButtonInShowFrame.setBackground(new java.awt.Color(102, 102, 102));
        ExisButtonInShowFrame.setForeground(new java.awt.Color(255, 255, 255));
        ExisButtonInShowFrame.setIcon(new javax.swing.ImageIcon("C:\\Users\\Deema\\OneDrive\\Pictures\\Saved Pictures\\icons8-back2.png")); // NOI18N
        ExisButtonInShowFrame.setText("Back");
        ExisButtonInShowFrame.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExisButtonInShowFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExisButtonInShowFrameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RemoveButtonInShowFrame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(ExisButtonInShowFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RemoveButtonInShowFrame)
                    .addComponent(ExisButtonInShowFrame))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 260, 70));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BOOK");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("MANAGER");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Deema\\OneDrive\\Pictures\\Saved Pictures\\icon book3.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 430));

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Deema\\OneDrive\\Pictures\\Saved Pictures\\icons8-working-with-a-laptop-15.png")); // NOI18N
        jLabel1.setText("Developed By Deemah Alsalamah");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Deema\\OneDrive\\Pictures\\Saved Pictures\\ce.png")); // NOI18N
        jLabel7.setText("2022 ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1))
                .addContainerGap(474, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 650, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShowTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ShowTextActionPerformed

    private void ExisButtonInShowFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExisButtonInShowFrameActionPerformed
        this.dispose();

    }//GEN-LAST:event_ExisButtonInShowFrameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            BookService service = new BookServiceImpl();
            String isbnVal = ShowText.getText().trim();

            if (isbnVal.equals("")) {
                JOptionPane.showMessageDialog(this.getRootPane(), " ISBN can not be empty ", "New Book", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Long ISBN = Long.parseLong(isbnVal);
            boolean isFound = service.contains(ISBN);

            if (isFound) {
                bookInfo.setVisible(isFound);

                Book book = service.getByISBN(ISBN);

                BookTitle.setText(book.getTitle());
                AuthorName.setText(book.getAuthorName());
                PublishYear.setText(book.getPublishYear().toString());

                ExisButtonInShowFrame.setVisible(true);
                RemoveButtonInShowFrame.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(this.getRootPane(), " ISBN is not exist ", "New Book", JOptionPane.ERROR_MESSAGE);
                return;
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this.getRootPane(), ex.getMessage(), "New Book", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void RemoveButtonInShowFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveButtonInShowFrameActionPerformed
        try {
            BookService service = new BookServiceImpl();
            String isbnVal = ShowText.getText().trim();
            Long ISBN = Long.parseLong(isbnVal);

            service.removeByISBN(ISBN);
            JOptionPane.showMessageDialog(this.getRootPane(), " Book has been removed . ", "New Book", JOptionPane.INFORMATION_MESSAGE);

        } catch (ServiceException ex) {
            Logger.getLogger(showFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BookNotFoundException ex) {
            JOptionPane.showMessageDialog(this.getRootPane(), " ISBN is not exist ", "New Book", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_RemoveButtonInShowFrameActionPerformed

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
            java.util.logging.Logger.getLogger(showFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(showFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(showFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(showFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new showFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AuthorName;
    private javax.swing.JLabel BookTitle;
    private javax.swing.JButton ExisButtonInShowFrame;
    private javax.swing.JLabel PublishYear;
    private javax.swing.JButton RemoveButtonInShowFrame;
    private javax.swing.JTextField ShowText;
    private javax.swing.JPanel bookInfo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
