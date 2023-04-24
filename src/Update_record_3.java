
import javax.swing.JOptionPane;

public class Update_record_3 extends javax.swing.JFrame {
    public Update_record_3() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        address_tt2 = new javax.swing.JTextField();
        exercise_tt2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        id_tt2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        name_tt2 = new javax.swing.JTextField();
        time_tt2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        age_tt2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ok_tt = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        mobile_tt2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Sunday Records");

        jLabel6.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel6.setText("Mobile");

        address_tt2.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        address_tt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address_tt2ActionPerformed(evt);
            }
        });

        exercise_tt2.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        exercise_tt2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Aquacise", "Box Fit", "Body Blitz" }));
        exercise_tt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exercise_tt2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel2.setText("ID");

        jLabel7.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel7.setText("Time");

        id_tt2.setEditable(false);
        id_tt2.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        id_tt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_tt2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel8.setText("Exercise");

        name_tt2.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        name_tt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_tt2ActionPerformed(evt);
            }
        });

        time_tt2.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        time_tt2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Morning", "Afternoon", "Evening" }));
        time_tt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time_tt2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel3.setText("Name");

        age_tt2.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        age_tt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                age_tt2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel4.setText("Age");

        ok_tt.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        ok_tt.setText("OK");
        ok_tt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok_ttActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel5.setText("Address");

        mobile_tt2.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        mobile_tt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobile_tt2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id_tt2)
                    .addComponent(address_tt2)
                    .addComponent(mobile_tt2)
                    .addComponent(age_tt2)
                    .addComponent(name_tt2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(time_tt2, 0, 209, Short.MAX_VALUE)
                    .addComponent(exercise_tt2, 0, 209, Short.MAX_VALUE))
                .addGap(64, 64, 64))
            .addGroup(layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(ok_tt, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id_tt2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_tt2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age_tt2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobile_tt2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address_tt2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(exercise_tt2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(time_tt2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(ok_tt)
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    public void update_values_sunday(String send[])
    {
        id_tt2.setText(send[0]);
        name_tt2.setText(send[1]);
        age_tt2.setText(send[2]);
        mobile_tt2.setText(send[3]);
        address_tt2.setText(send[4]);
        exercise_tt2.setSelectedItem(String.valueOf(send[5]));
        time_tt2.setSelectedItem(String.valueOf(send[6]));
    }
    private void address_tt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address_tt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_address_tt2ActionPerformed

    private void exercise_tt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exercise_tt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exercise_tt2ActionPerformed

    private void id_tt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_tt2ActionPerformed

    }//GEN-LAST:event_id_tt2ActionPerformed

    private void name_tt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_tt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_tt2ActionPerformed

    private void time_tt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time_tt2ActionPerformed

    }//GEN-LAST:event_time_tt2ActionPerformed

    private void age_tt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_age_tt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_age_tt2ActionPerformed

    private void ok_ttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok_ttActionPerformed
        String[] temp = new String[8];
        temp[0]=id_tt2.getText().trim();
        temp[1]=name_tt2.getText().trim();
        temp[2]=age_tt2.getText().trim();
        temp[3]=mobile_tt2.getText().trim();
        temp[4]=address_tt2.getText().trim();
        temp[5]=String.valueOf(exercise_tt2.getSelectedItem()).trim();
        temp[6]= String.valueOf(time_tt2.getSelectedItem()).trim();
        temp[7]="Saturday";

        if(id_tt2.getText().equals("") || age_tt2.getText().equals("") || mobile_tt2.getText().equals("") || address_tt2.getText().equals("") || String.valueOf(exercise_tt2.getSelectedItem()).equals("Select") || String.valueOf(time_tt2.getSelectedItem()).equals("Select"))
        {
            JOptionPane.showMessageDialog(this,"Something Went Wrong Please Fill all Fields","Alert",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            try
            {
                if(Integer.parseInt(age_tt2.getText().trim())>0 && Integer.parseInt(mobile_tt2.getText().trim())>0 )
                {
                    if(Long.parseLong(mobile_tt2.getText().trim())>=100000000 && Long.parseLong(mobile_tt2.getText().trim())<=999999999)
                    {
                        sunday_day sd = new sunday_day();
                        sd.set_update_values_7(temp);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this,"Please Enter Proper Mobile Number","Alert",JOptionPane.WARNING_MESSAGE);
                        this.mobile_tt2.setText("");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"Please Enter correct data in Mobile & age","Alert",JOptionPane.WARNING_MESSAGE);
                }
            }
            catch(Exception obj)
            {
                JOptionPane.showMessageDialog(this,"There is an Problem in your inserted data So pease feed correct data","Alert",JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_ok_ttActionPerformed

    private void mobile_tt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobile_tt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobile_tt2ActionPerformed

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
            java.util.logging.Logger.getLogger(Update_record_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_record_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_record_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_record_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_record_3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address_tt2;
    private javax.swing.JTextField age_tt2;
    private javax.swing.JComboBox<String> exercise_tt2;
    private javax.swing.JTextField id_tt2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField mobile_tt2;
    private javax.swing.JTextField name_tt2;
    private javax.swing.JButton ok_tt;
    private javax.swing.JComboBox<String> time_tt2;
    // End of variables declaration//GEN-END:variables
}
