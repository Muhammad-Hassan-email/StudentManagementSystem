
package Student_mamagment_System;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author KK
 */
public class Quiz_question extends javax.swing.JFrame {

    /**
     * Creates new form Quiz_question
     */
    public Quiz_question() {
        initComponents();
        
    }
  private void insert(  String QUES1 ,String QUES2,String QUES3,String QUES4,String QUES5,String QUES6,String QUES7,String QUES8,String QUES9,String QUES10,String QUES11,String QUES12,String QUES13,String QUES14,String QUES15) throws SQLException{
      initComponents();
      Connection conn = connection.connect();
      PreparedStatement ps=null ;
      
      String sql = "INSERT INTO QuizQuestion (Semester,Q1,Q2,Q3,Q4,Q5,Q6,Q7,Q8,Q9,Q10,Q11,Q12,Q13,Q14,Q15) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
       ps= conn.prepareStatement(sql);
      ps.setString(1, (String) ComboBox.getSelectedItem());
      ps.setString(2, QUES1 );
      ps.setString(3, QUES2 );
      ps.setString(4, QUES3 );
      ps.setString(5, QUES4 );
      ps.setString(6, QUES5 );
      ps.setString(7, QUES6 );
      ps.setString(8, QUES7 );
      ps.setString(9, QUES8 );
      ps.setString(10, QUES9 );
      ps.setString(11, QUES10 );
      ps.setString(12, QUES11 );
      ps.setString(13, QUES12 );
      ps.setString(14, QUES13 );
      ps.setString(15, QUES14 );
      ps.setString(16, QUES15 );
      ps.execute();
      ps.close();
      conn.close();
      JOptionPane.showMessageDialog(null, "Record has Been Updeted new Student");
       
        
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        ComboBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        Q3 = new javax.swing.JTextField();
        Q4 = new javax.swing.JTextField();
        Q1 = new javax.swing.JTextField();
        Q2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Q15 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Q5 = new javax.swing.JTextField();
        Q6 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Q7 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Q8 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Q9 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Q10 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Q11 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Q12 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        Q13 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        Q14 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ComboBox.setBackground(new java.awt.Color(51, 51, 51));
        ComboBox.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S1", "S2", "S3", "S4", "S5", "S6", "S7", "S8" }));
        ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxActionPerformed(evt);
            }
        });
        jPanel5.add(ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 50, 99, 29));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel8.setText("QUIZ QUESTIONS");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 44, 300, 34));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 467));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 433, -1, -1));

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 0, -1, -1));

        Q3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Q3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Q3ActionPerformed(evt);
            }
        });
        jPanel5.add(Q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 710, 60));

        Q4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Q4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Q4ActionPerformed(evt);
            }
        });
        jPanel5.add(Q4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 710, 60));

        Q1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Q1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Q1ActionPerformed(evt);
            }
        });
        jPanel5.add(Q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 710, 60));

        Q2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Q2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Q2ActionPerformed(evt);
            }
        });
        jPanel5.add(Q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 710, 60));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Question no 1:");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 110, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Question no 3:");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 110, 20));

        Q15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Q15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Q15ActionPerformed(evt);
            }
        });
        jPanel5.add(Q15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1380, 710, 60));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Question no 4:");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 110, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Question no 15:");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1400, 120, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Question no 2:");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 110, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Question no 5:");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 110, -1));

        Q5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Q5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Q5ActionPerformed(evt);
            }
        });
        jPanel5.add(Q5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 710, 60));

        Q6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Q6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Q6ActionPerformed(evt);
            }
        });
        jPanel5.add(Q6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, 710, 60));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Question no 6:");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 110, -1));

        Q7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Q7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Q7ActionPerformed(evt);
            }
        });
        jPanel5.add(Q7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 650, 710, 60));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Question no 7:");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 660, 110, 30));

        Q8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Q8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Q8ActionPerformed(evt);
            }
        });
        jPanel5.add(Q8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 750, 710, 60));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Question no 8:");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 750, 110, 30));

        Q9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Q9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Q9ActionPerformed(evt);
            }
        });
        jPanel5.add(Q9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 840, 710, 60));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Question no 9:");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 840, 110, 30));

        Q10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Q10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Q10ActionPerformed(evt);
            }
        });
        jPanel5.add(Q10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 930, 710, 60));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Question no 10:");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 940, 120, 30));

        Q11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Q11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Q11ActionPerformed(evt);
            }
        });
        jPanel5.add(Q11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1030, 710, 60));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Question no 11:");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1040, 120, 30));

        Q12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Q12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Q12ActionPerformed(evt);
            }
        });
        jPanel5.add(Q12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1120, 710, 60));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Question no 12:");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1140, 120, 30));

        Q13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Q13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Q13ActionPerformed(evt);
            }
        });
        jPanel5.add(Q13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1210, 710, 60));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Question no 13:");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1230, 120, 30));

        Q14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Q14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Q14ActionPerformed(evt);
            }
        });
        jPanel5.add(Q14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1290, 710, 60));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Question no 14:");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1310, 120, 30));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jButton1.setText("UPDATE ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 1480, 90, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jScrollPane1.setViewportView(jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1088, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ComboBoxActionPerformed

    private void Q3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Q3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Q3ActionPerformed

    private void Q4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Q4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Q4ActionPerformed

    private void Q1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Q1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Q1ActionPerformed

    private void Q2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Q2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Q2ActionPerformed

    private void Q15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Q15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Q15ActionPerformed

    private void Q5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Q5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Q5ActionPerformed

    private void Q6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Q6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Q6ActionPerformed

    private void Q7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Q7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Q7ActionPerformed

    private void Q8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Q8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Q8ActionPerformed

    private void Q9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Q9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Q9ActionPerformed

    private void Q10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Q10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Q10ActionPerformed

    private void Q11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Q11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Q11ActionPerformed

    private void Q12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Q12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Q12ActionPerformed

    private void Q13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Q13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Q13ActionPerformed

    private void Q14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Q14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Q14ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
   //     String semes = Semester
        String QUES1  = Q1.getText();
        String QUES2  = Q2.getText();
        String QUES3  = Q3.getText();
        String QUES4  = Q4.getText();
        String QUES5  = Q5.getText();
        String QUES6  = Q6.getText();
        String QUES7  = Q7.getText();
        String QUES8  = Q8.getText();
        String QUES9  = Q9.getText();
        String QUES10 = Q10.getText();
        String QUES11 = Q11.getText();
        String QUES12 = Q12.getText();
        String QUES13 = Q13.getText();
        String QUES14 = Q14.getText();
        String QUES15 = Q15.getText();
    
        try {
            insert(QUES1,QUES2,QUES3,QUES4,QUES5,QUES6,QUES7,QUES8,QUES9,QUES10,QUES11,QUES12,QUES13,QUES14,QUES15);
        } catch (SQLException ex) {
            Logger.getLogger(Quiz_question.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         Quiz_question SR;
                   SR = new  Quiz_question();
                   SR.setVisible(false);
                        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Quiz_question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quiz_question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quiz_question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quiz_question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quiz_question().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JTextField Q1;
    private javax.swing.JTextField Q10;
    private javax.swing.JTextField Q11;
    private javax.swing.JTextField Q12;
    private javax.swing.JTextField Q13;
    private javax.swing.JTextField Q14;
    private javax.swing.JTextField Q15;
    private javax.swing.JTextField Q2;
    private javax.swing.JTextField Q3;
    private javax.swing.JTextField Q4;
    private javax.swing.JTextField Q5;
    private javax.swing.JTextField Q6;
    private javax.swing.JTextField Q7;
    private javax.swing.JTextField Q8;
    private javax.swing.JTextField Q9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
