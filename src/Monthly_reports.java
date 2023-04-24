public class Monthly_reports extends javax.swing.JFrame {
    public Monthly_reports() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ok_tt = new javax.swing.JButton();
        ok_tt1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ok_tt.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        ok_tt.setText("Monthly Exercise report");
        ok_tt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok_ttActionPerformed(evt);
            }
        });

        ok_tt1.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        ok_tt1.setText("Champion fitness type report");
        ok_tt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok_tt1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select Report Type");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ok_tt1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                    .addComponent(ok_tt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(ok_tt)
                .addGap(50, 50, 50)
                .addComponent(ok_tt1)
                .addGap(50, 50, 50))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ok_ttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok_ttActionPerformed
        lesson_report lr = new lesson_report();
        lr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ok_ttActionPerformed

    private void ok_tt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok_tt1ActionPerformed
        champion_report cr = new champion_report();
        cr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ok_tt1ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Monthly_reports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton ok_tt;
    private javax.swing.JButton ok_tt1;
    // End of variables declaration//GEN-END:variables
}
