/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package payroll;

/**
 *
 * @author njugush
 */


public class PayrollSystem extends javax.swing.JFrame {

    /**
     * Creates new form PayrollSystem
     */
    public PayrollSystem() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtEmployeeName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtRate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtHoursPerDay = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtDays = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtxtTax = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtxtPhil = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtxtSSS = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtxtGross2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtxtGross = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jtxtTotalDeduct = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jtxtNet = new javax.swing.JTextField();
        jbtnCompute = new javax.swing.JButton();
        jtxtDeduct = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setText("Simple Payroll System");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jLabel2.setText("Employee Name");

        jtxtEmployeeName.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jtxtEmployeeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtEmployeeNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jLabel3.setText("Rate Per Hour");

        jtxtRate.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jtxtRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtRateActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jLabel4.setText("Hour Per Day");

        jtxtHoursPerDay.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jtxtHoursPerDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtHoursPerDayActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jLabel5.setText("Number of days worked");

        jtxtDays.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jtxtDays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDaysActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("DEDUCTION OF SALARY");

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jLabel7.setText("TAX 15% of Monthly Wage");

        jtxtTax.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jtxtTax.setEnabled(false);
        jtxtTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTaxActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jLabel8.setText("Philheath 5%");

        jtxtPhil.setFont(jtxtPhil.getFont().deriveFont((jtxtPhil.getFont().getStyle() & ~java.awt.Font.ITALIC)));
        jtxtPhil.setEnabled(false);
        jtxtPhil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtPhilActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jLabel9.setText("SSS 2%");

        jtxtSSS.setFont(jtxtSSS.getFont());
        jtxtSSS.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jLabel10.setText("Gross Salary");

        jtxtGross2.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jtxtGross2.setEnabled(false);
        jtxtGross2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtGross2ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jLabel11.setText("Deduction");

        jLabel12.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel12.setText("GROSS SALARY :");

        jtxtGross.setEditable(false);
        jtxtGross.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jtxtGross.setEnabled(false);
        jtxtGross.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtGrossActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel13.setText("TOTAL DEDUCTION :");

        jtxtTotalDeduct.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jtxtTotalDeduct.setEnabled(false);
        jtxtTotalDeduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTotalDeductActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel14.setText("NET SALARY :");

        jtxtNet.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jtxtNet.setEnabled(false);
        jtxtNet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNetActionPerformed(evt);
            }
        });

        jbtnCompute.setBackground(new java.awt.Color(0, 51, 51));
        jbtnCompute.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jbtnCompute.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCompute.setText("Compute");
        jbtnCompute.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153), 2));
        jbtnCompute.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnCompute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnComputeActionPerformed(evt);
            }
        });

        jtxtDeduct.setFont(jtxtDeduct.getFont().deriveFont((jtxtDeduct.getFont().getStyle() & ~java.awt.Font.ITALIC) & ~java.awt.Font.BOLD, 15));
        jtxtDeduct.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(15, 15, 15))
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtxtDays, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(jtxtHoursPerDay, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtRate, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtEmployeeName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtGross))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7)
                                .addComponent(jLabel9))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtxtTax, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                .addComponent(jtxtPhil)
                                .addComponent(jtxtSSS)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtxtTotalDeduct, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtNet, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(jtxtGross2)
                    .addComponent(jtxtDeduct))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnCompute, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(393, 393, 393))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtxtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jtxtRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jtxtTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jtxtGross2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jtxtHoursPerDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(jtxtPhil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jtxtDeduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jtxtDays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jtxtSSS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jtxtGross, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jtxtTotalDeduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jtxtNet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnCompute, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtRateActionPerformed
      
    }//GEN-LAST:event_jtxtRateActionPerformed

    private void jtxtDaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDaysActionPerformed
       
    }//GEN-LAST:event_jtxtDaysActionPerformed

    private void jtxtTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTaxActionPerformed
        
    }//GEN-LAST:event_jtxtTaxActionPerformed

    private void jtxtGross2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtGross2ActionPerformed
        
    }//GEN-LAST:event_jtxtGross2ActionPerformed

    private void jtxtNetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNetActionPerformed

    private void jtxtGrossActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtGrossActionPerformed
                  
          
    }//GEN-LAST:event_jtxtGrossActionPerformed

    private void jtxtHoursPerDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtHoursPerDayActionPerformed
         
    }//GEN-LAST:event_jtxtHoursPerDayActionPerformed

    private void jbtnComputeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnComputeActionPerformed
    String employeeName = jtxtEmployeeName.getText();
    double ratePerHour = Double.parseDouble(jtxtRate.getText());
    double hoursPerDay = Double.parseDouble(jtxtHoursPerDay.getText());
    int daysWorked = Integer.parseInt(jtxtDays.getText());

    // Calculate the gross salary
    int grossSalary = (int) (ratePerHour * hoursPerDay * daysWorked);
    jtxtGross.setText(String.valueOf(grossSalary));
    jtxtGross2.setText(String.valueOf(grossSalary));

    // Calculate the deductions
    int tax = (int) (0.15 * grossSalary);
    int philHealth = (int) (0.05 * grossSalary);
    int sss = (int) (0.02 * grossSalary);

    jtxtTax.setText(String.valueOf(tax));
    jtxtPhil.setText(String.valueOf(philHealth));
    jtxtSSS.setText(String.valueOf(sss));

    int totalDeduction = tax + philHealth + sss;
    jtxtDeduct.setText(String.valueOf(totalDeduction));
    jtxtTotalDeduct.setText(String.valueOf(totalDeduction));
    
    

    // Calculate the net salary
    int netSalary = grossSalary - totalDeduction;
    jtxtNet.setText(String.valueOf(netSalary));
    }//GEN-LAST:event_jbtnComputeActionPerformed

    private void jtxtEmployeeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtEmployeeNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtEmployeeNameActionPerformed

    private void jtxtPhilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtPhilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtPhilActionPerformed

    private void jtxtTotalDeductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTotalDeductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtTotalDeductActionPerformed

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
            java.util.logging.Logger.getLogger(PayrollSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PayrollSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PayrollSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PayrollSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PayrollSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbtnCompute;
    private javax.swing.JTextField jtxtDays;
    private javax.swing.JTextField jtxtDeduct;
    private javax.swing.JTextField jtxtEmployeeName;
    private javax.swing.JTextField jtxtGross;
    private javax.swing.JTextField jtxtGross2;
    private javax.swing.JTextField jtxtHoursPerDay;
    private javax.swing.JTextField jtxtNet;
    private javax.swing.JTextField jtxtPhil;
    private javax.swing.JTextField jtxtRate;
    private javax.swing.JTextField jtxtSSS;
    private javax.swing.JTextField jtxtTax;
    private javax.swing.JTextField jtxtTotalDeduct;
    // End of variables declaration//GEN-END:variables
}
