import javax.swing.JOptionPane;
public class Update_records extends javax.swing.JFrame {
    public Update_records() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id_tt = new javax.swing.JTextField();
        name_tt = new javax.swing.JTextField();
        age_tt = new javax.swing.JTextField();
        mobile_tt = new javax.swing.JTextField();
        exercise_tt = new javax.swing.JTextField();
        address_tt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        time_tt = new javax.swing.JComboBox<>();
        ok_tt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Records");

        jLabel2.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel2.setText("ID");

        id_tt.setEditable(false);
        id_tt.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        id_tt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_ttActionPerformed(evt);
            }
        });

        name_tt.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        name_tt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_ttActionPerformed(evt);
            }
        });

        age_tt.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        age_tt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                age_ttActionPerformed(evt);
            }
        });

        mobile_tt.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        mobile_tt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobile_ttActionPerformed(evt);
            }
        });

        exercise_tt.setEditable(false);
        exercise_tt.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        exercise_tt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exercise_ttActionPerformed(evt);
            }
        });

        address_tt.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        address_tt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address_ttActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel4.setText("Age");

        jLabel5.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel5.setText("Address");

        jLabel6.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel6.setText("Mobile");

        jLabel7.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel7.setText("Time");

        jLabel8.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel8.setText("Exercise");

        time_tt.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        time_tt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Morning", "Afternoon", "Evening" }));
        time_tt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time_ttActionPerformed(evt);
            }
        });

        ok_tt.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        ok_tt.setText("OK");
        ok_tt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok_ttActionPerformed(evt);
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
                    .addComponent(id_tt, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(exercise_tt, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(address_tt, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(mobile_tt, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(age_tt, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(name_tt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(time_tt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
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
                    .addComponent(id_tt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_tt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age_tt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobile_tt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address_tt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exercise_tt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(time_tt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(ok_tt)
                .addGap(16, 16, 16))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void update_values_1(String send[])
    {
        id_tt.setText(send[0]);
        name_tt.setText(send[1]);
        age_tt.setText(send[2]);
        mobile_tt.setText(send[3]);
        address_tt.setText(send[4]);
        exercise_tt.setText(send[5]);
        time_tt.setSelectedItem(String.valueOf(send[6]));
    }
    
        
    private void id_ttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_ttActionPerformed

    }//GEN-LAST:event_id_ttActionPerformed

    private void name_ttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_ttActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_ttActionPerformed

    private void age_ttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_age_ttActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_age_ttActionPerformed

    private void mobile_ttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobile_ttActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobile_ttActionPerformed

    private void exercise_ttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exercise_ttActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exercise_ttActionPerformed

    private void address_ttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address_ttActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_address_ttActionPerformed

    private void time_ttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time_ttActionPerformed

    }//GEN-LAST:event_time_ttActionPerformed

    private void ok_ttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok_ttActionPerformed
           String[] temp = new String[8];
           temp[0]=id_tt.getText().trim();
           temp[1]=name_tt.getText().trim();
           temp[2]=age_tt.getText().trim();
           temp[3]=mobile_tt.getText().trim();
           temp[4]=address_tt.getText().trim();
           temp[5]=exercise_tt.getText().trim();
           temp[6]= String.valueOf(time_tt.getSelectedItem()).trim();
           temp[7]="Saturday";
           
        if(id_tt.getText().equals("") || age_tt.getText().equals("") || mobile_tt.getText().equals("") || address_tt.getText().equals("") || exercise_tt.getText().equals("") || String.valueOf(time_tt.getSelectedItem()).equals("Select"))
        {
            JOptionPane.showMessageDialog(this,"Something Went Wrong Please Fill all Fields","Alert",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            try
            {
                if(Integer.parseInt(age_tt.getText().trim())>0 && Integer.parseInt(mobile_tt.getText().trim())>0 )
                {
                    if(Long.parseLong(mobile_tt.getText().trim())>=100000000 && Long.parseLong(mobile_tt.getText().trim())<=999999999)
                    {
                        char mm = temp[0].charAt(0);
                        switch(mm)
                        {
                            case 'A':
                                Aquacise a = new Aquacise();
                                a.set_update_values_1(temp);
                            break;
                            case 'Z':
                                Zumba z = new Zumba();
                                z.set_update_values_2(temp);
                            break;
                            case 'Y':
                                Yoga y = new Yoga();
                                y.set_update_values_3(temp);
                            break;
                            case 'B':
                                Body_Blitz b = new Body_Blitz();
                                b.set_update_values_4(temp);
                            break;
                            case 'F':
                                Box_fit bf = new Box_fit();
                                bf.set_update_values_5(temp);
                            break;
                        }
                        
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this,"Please Enter Proper Mobile Number","Alert",JOptionPane.WARNING_MESSAGE);
                        this.mobile_tt.setText("");
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
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_records().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address_tt;
    private javax.swing.JTextField age_tt;
    private javax.swing.JTextField exercise_tt;
    private javax.swing.JTextField id_tt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField mobile_tt;
    private javax.swing.JTextField name_tt;
    private javax.swing.JButton ok_tt;
    private javax.swing.JComboBox<String> time_tt;
    // End of variables declaration//GEN-END:variables
}
