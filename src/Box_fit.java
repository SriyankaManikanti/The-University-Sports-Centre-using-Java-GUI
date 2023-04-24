import javax.swing.JOptionPane;
public class Box_fit extends javax.swing.JFrame {
    static String[][] box_array = new String[4][9];
    static int n=0;
    public Box_fit() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        age_t = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        address_t = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        ok = new javax.swing.JButton();
        exercise_t = new javax.swing.JTextField();
        name_t = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        mobile_t = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        time = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        id_t = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fees_t = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        age_t.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel2.setText("Address  :");

        jLabel3.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel3.setText("Name     :");

        address_t.setColumns(20);
        address_t.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        address_t.setRows(5);
        jScrollPane1.setViewportView(address_t);

        jLabel6.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel6.setText("Age      :");

        cancel.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        ok.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        exercise_t.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        exercise_t.setText("Box Fit");
        exercise_t.setEnabled(false);
        exercise_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exercise_tActionPerformed(evt);
            }
        });

        name_t.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        name_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_tActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel4.setText("Mobile   :");

        mobile_t.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel5.setText("Exercise :");

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Appointment For BOX FIT");

        jLabel7.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel7.setText("Timing   :");

        time.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        time.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Morning", "Afternoon", "Evening" }));
        time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel9.setText("Student Id :");

        id_t.setEditable(false);
        id_t.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        id_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_tActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel8.setText("Fees     :");

        fees_t.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        fees_t.setText("1000/-");
        fees_t.setEnabled(false);
        fees_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fees_tActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(exercise_t)
                            .addComponent(mobile_t)
                            .addComponent(name_t)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(age_t)
                            .addComponent(time, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(id_t, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ok)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cancel)
                            .addComponent(fees_t, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_t, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_t, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(mobile_t, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age_t, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exercise_t, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(fees_t, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ok)
                    .addComponent(cancel))
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    // -------- Delete Bookings --------------------------------
    public void set_dlt_5(String vlu)
    {
        boolean jj = false;
        try{
            for(int z1=0;z1<4;z1++)
            {
                if(box_array[z1][0].equals(vlu))
                {
                    n=z1;
                    box_array[z1][0]="";
                    box_array[z1][1]="";
                    box_array[z1][2]="";
                    box_array[z1][3]="";
                    box_array[z1][4]="";
                    box_array[z1][5]="";
                    box_array[z1][6]="";
                    box_array[z1][7]="";
                    box_array[z1][8]="1000";
                    jj=true;
                    break;
                }
                else
                {
                    jj=false;
                }
            }            
        }
        catch(Exception obj)
        {
            jj=false;
        }
        if(jj == false)
        {
            JOptionPane.showMessageDialog(this,"No Slot For deleting");
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Your Slot delete Successfully");
        }
    }
    
// -------- Show Bookings --------------------------------    
    public void set_5(String vlu1)
    {
       boolean jj = false;
        try{
            for(int z1=0;z1<4;z1++)
            {
                if(box_array[z1][0].equals(vlu1))
                {
                    JOptionPane.showMessageDialog(this,"ID     : "+this.box_array[z1][0]+"\n\nName     : "+this.box_array[z1][1]+"\n\nAge      : "+this.box_array[(z1)][2]+"\n\nMobile   : "+this.box_array[(z1)][3]+"\n\nAddress  : "+this.box_array[z1][4]+"\n\nExercise : "+this.box_array[z1][5]+"\n\nDay      : "+this.box_array[z1][6]+"\n\nTiming      : "+this.box_array[(z1)][7]+"\n\n"+"Fees      : "+this.box_array[(z1)][8]+"\n\n");
                    jj=true;
                    break;
                }
                else
                {
                    jj=false;
                }
            }            
        }
        catch(Exception obj)
        {
            jj=false;
        }
        if(jj == false)
        {
            JOptionPane.showMessageDialog(this,"No Slot Available on this ID");
        } 
    }
    
    
    
// -------- set Update values --------------------------------
    public void set_update_values_5(String temp[])
    {
        boolean jj = false;
        try{
            for(int z1=0;z1<4;z1++)
            {
                if(box_array[z1][0].equals(temp[0]))
                {
                    jj=true;
                    this.box_array[z1][0]=temp[0];
                    this.box_array[z1][1]=temp[1];
                    this.box_array[z1][2]=temp[2];
                    this.box_array[z1][3]=temp[3];
                    this.box_array[z1][4]=temp[4];
                    this.box_array[z1][5]=temp[5];
                    this.box_array[z1][6]=temp[6];
                    this.box_array[z1][6]=temp[6];
                    this.box_array[z1][6]=temp[6];
                    this.box_array[z1][7]=temp[7];
                    break;
                }
                else
                {   
                    jj=false;
                }
            }            
        }
        catch(Exception obj)
        {
            jj=false;
        }
        if(jj == false)
        {
            JOptionPane.showMessageDialog(this,"No Slot Available on this ID");
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Data Updated successfully");
        }
    }


// -------- Set Changes --------------------------------
    public void set_change_5(String vlu)
    {
        String[] send = new String[8];
        boolean jj = false;
        try{
            for(int z1=0;z1<4;z1++)
            {
                if(box_array[z1][0].equals(vlu))
                {
                    jj=true;
                    send[0]=vlu;
                    send[1]=this.box_array[z1][1];
                    send[2]=this.box_array[z1][2];
                    send[3]=this.box_array[z1][3];
                    send[4]=this.box_array[z1][4];
                    send[5]=this.box_array[z1][5];
                    send[6]=this.box_array[z1][6];
                    send[7]=this.box_array[z1][7];                    
                    Update_records up= new Update_records();
                    up.setVisible(true);
                    up.update_values_1(send);
                    break;
                }
                else
                {   
                    jj=false;
                }
            }            
        }
        catch(Exception obj)
        {
            jj=false;
        }
        if(jj == false)
        {
            JOptionPane.showMessageDialog(this,"No Slot Available on this ID");
        }
    }
    
    

    
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        name_t.setText("");
        age_t.setText("");
        mobile_t.setText("");
        address_t.setText("");
        time.setSelectedIndex(0);
    }//GEN-LAST:event_cancelActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        String name,age,mobile,address,exercise,timing;
        name = name_t.getText().trim();
        age = age_t.getText().trim();
        mobile = this.mobile_t.getText().trim();
        address = this.address_t.getText().trim();
        exercise = this.exercise_t.getText().trim();
        timing = String.valueOf(this.time.getSelectedItem()).trim();
        if(name.equals("") || age.equals("") || mobile.equals("") || address.equals("") || exercise.equals("") || timing.equals("Select"))
        {
            JOptionPane.showMessageDialog(this,"Something Went Wrong Please Fill all Fields","Alert",JOptionPane.WARNING_MESSAGE);
            this.name_t.setText("");
            this.age_t.setText("");
            this.mobile_t.setText("");
            this.address_t.setText("");
            this.time.setSelectedIndex(0);
        }
        else
        {
            try
            {
                if(Integer.parseInt(age)>0 && Integer.parseInt(mobile)>0 )
                {
                    if(Long.parseLong(mobile)>=100000000 && Long.parseLong(mobile)<=999999999)
                    {
                        this.name_t.setText("");
                        this.age_t.setText("");
                        this.mobile_t.setText("");
                        this.address_t.setText("");            
                        this.time.setSelectedIndex(0);
                        if(n<4)
                        {
                            if(box_array[n][4] == null || box_array[n][4].equals(""))
                            {
                                this.box_array[n][0]="F"+String.valueOf(n);
                                this.box_array[n][1]=name;
                                this.box_array[n][2]=age;
                                this.box_array[n][3]=mobile;
                                this.box_array[n][4]=address;
                                this.box_array[n][5]=exercise;
                                this.box_array[n][6]=timing;
                                this.box_array[n][7]="Sunday";
                                this.box_array[n][7]="1000";
                                JOptionPane.showMessageDialog(this,"Your Slot Booked Successfully");
                            }
                            n++;
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(this,"All Slocts of Sunday are booked Please Try again later","Alert",JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this,"Please Enter Proper Mobile Number","Alert",JOptionPane.WARNING_MESSAGE);
                        this.mobile_t.setText("");
                    }
                }
                else
                {
                    this.age_t.setText("");
                    this.mobile_t.setText("");
                    JOptionPane.showMessageDialog(this,"Please Enter correct data in Mobile & age","Alert",JOptionPane.WARNING_MESSAGE);
                }
            }
            catch(Exception obj)
            {
                JOptionPane.showMessageDialog(this,"There is an Problem in your inserted data So pease feed correct data","Alert",JOptionPane.WARNING_MESSAGE);
                this.name_t.setText("");
                this.age_t.setText("");
                this.mobile_t.setText("");
                this.address_t.setText("");
                this.time.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_okActionPerformed

    private void exercise_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exercise_tActionPerformed

    }//GEN-LAST:event_exercise_tActionPerformed

    private void name_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_tActionPerformed

    }//GEN-LAST:event_name_tActionPerformed

    private void timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeActionPerformed

    private void id_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_tActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.id_t.setText(String.valueOf("F"+String.valueOf(n)));
    }//GEN-LAST:event_formWindowGainedFocus

    private void fees_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fees_tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fees_tActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Box_fit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address_t;
    private javax.swing.JTextField age_t;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField exercise_t;
    private javax.swing.JTextField fees_t;
    private javax.swing.JTextField id_t;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mobile_t;
    private javax.swing.JTextField name_t;
    private javax.swing.JButton ok;
    private javax.swing.JComboBox<String> time;
    // End of variables declaration//GEN-END:variables
}
