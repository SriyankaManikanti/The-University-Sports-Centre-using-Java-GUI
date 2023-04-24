import javax.swing.JOptionPane;

public class Yoga extends javax.swing.JFrame {
    static String[][] yoga_array = new String[4][9];
    static int l=0;
    public Yoga() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ok = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        exercise_t = new javax.swing.JTextField();
        name_t = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        mobile_t = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        age_t = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        address_t = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        time = new javax.swing.JComboBox<>();
        id_t = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        fees_t = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Appointment For YOGA  ");

        jLabel2.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel2.setText("Address  :");

        ok.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel3.setText("Name     :");

        jLabel6.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel6.setText("Age      :");

        cancel.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        exercise_t.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        exercise_t.setText("YOGA");
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

        age_t.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N

        address_t.setColumns(20);
        address_t.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        address_t.setRows(5);
        jScrollPane1.setViewportView(address_t);

        jLabel7.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel7.setText("Timing   :");

        time.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        time.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Morning", "Afternoon", "Evening" }));
        time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeActionPerformed(evt);
            }
        });

        id_t.setEditable(false);
        id_t.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        id_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_tActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel9.setText("Student Id :");

        fees_t.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        fees_t.setText("800/-");
        fees_t.setEnabled(false);
        fees_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fees_tActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel8.setText("Exercise :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel9)
                        .addComponent(jLabel4))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ok, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(exercise_t)
                            .addComponent(mobile_t)
                            .addComponent(name_t)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(time, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(age_t)
                            .addComponent(id_t)
                            .addComponent(fees_t, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap(95, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancel)
                        .addGap(121, 121, 121))))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(name_t, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobile_t, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
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
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(37, 37, 37)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fees_t, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(time, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ok)
                    .addComponent(cancel))
                .addGap(34, 34, 34))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

// -------- Delete Bookings --------------------------------
    public void set_dlt_3(String vlu)
    {
        boolean jj = false;
        try{
            for(int z1=0;z1<4;z1++)
            {
                if(yoga_array[z1][0].equals(vlu))
                {
                    l=z1;
                    yoga_array[z1][0]="";
                    yoga_array[z1][1]="";
                    yoga_array[z1][2]="";
                    yoga_array[z1][3]="";
                    yoga_array[z1][4]="";
                    yoga_array[z1][5]="";
                    yoga_array[z1][6]="";
                    yoga_array[z1][7]="";
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
            JOptionPane.showMessageDialog(this,"No Slot Found");
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Your Slot cancel Successfully");
        }
    }
    
// -------- Show Bookings --------------------------------    
    public void set_3(String vlu1)
    {
       boolean jj = false;
        try{
            for(int z1=0;z1<4;z1++)
            {
                if(yoga_array[z1][0].equals(vlu1))
                {
                    JOptionPane.showMessageDialog(this,"ID     : "+this.yoga_array[z1][0]+"\n\nName     : "+this.yoga_array[z1][1]+"\n\nAge      : "+this.yoga_array[(z1)][2]+"\n\nMobile   : "+this.yoga_array[(z1)][3]+"\n\nAddress  : "+this.yoga_array[z1][4]+"\n\nExercise : "+this.yoga_array[z1][5]+"\n\nDay      : "+this.yoga_array[z1][6]+"\n\nTiming      : "+this.yoga_array[(z1)][7]+"\n\n"+"Fees      : "+this.yoga_array[(z1)][8]+"\n\n");
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
    public void set_update_values_3(String temp[])
    {
        boolean jj = false;
        try{
            for(int z1=0;z1<4;z1++)
            {
                if(yoga_array[z1][0].equals(temp[0]))
                {
                    jj=true;
                    this.yoga_array[z1][0]=temp[0];
                    this.yoga_array[z1][1]=temp[1];
                    this.yoga_array[z1][2]=temp[2];
                    this.yoga_array[z1][3]=temp[3];
                    this.yoga_array[z1][4]=temp[4];
                    this.yoga_array[z1][5]=temp[5];
                    this.yoga_array[z1][6]=temp[6];
                    this.yoga_array[z1][6]=temp[6];
                    this.yoga_array[z1][6]=temp[6];
                    this.yoga_array[z1][7]=temp[7];
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
    public void set_change_3(String vlu)
    {
        String[] send = new String[8];
        boolean jj = false;
        try{
            for(int z1=0;z1<4;z1++)
            {
                if(yoga_array[z1][0].equals(vlu))
                {
                    jj=true;
                    send[0]=vlu;
                    send[1]=this.yoga_array[z1][1];
                    send[2]=this.yoga_array[z1][2];
                    send[3]=this.yoga_array[z1][3];
                    send[4]=this.yoga_array[z1][4];
                    send[5]=this.yoga_array[z1][5];
                    send[6]=this.yoga_array[z1][6];
                    send[7]=this.yoga_array[z1][7];                                        
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
                        if(l<4)
                        {
                            if(yoga_array[l][4] == null || yoga_array[l][4].equals(""))
                            {
                                this.yoga_array[l][0]="Y"+String.valueOf(l);
                                this.yoga_array[l][1]=name;
                                this.yoga_array[l][2]=age;
                                this.yoga_array[l][3]=mobile;
                                this.yoga_array[l][4]=address;
                                this.yoga_array[l][5]=exercise;
                                this.yoga_array[l][6]=timing;
                                this.yoga_array[l][7]="Sunday";
                                this.yoga_array[l][7]="800";
                                JOptionPane.showMessageDialog(this,"Your Slot Booked Successfully");
                            }
                            l++;
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

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        name_t.setText("");
        age_t.setText("");
        mobile_t.setText("");
        address_t.setText("");
        this.time.setSelectedIndex(0);
    }//GEN-LAST:event_cancelActionPerformed

    private void name_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_tActionPerformed

    }//GEN-LAST:event_name_tActionPerformed

    private void exercise_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exercise_tActionPerformed
        
    }//GEN-LAST:event_exercise_tActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        booking_by_fitness_type bbft = new booking_by_fitness_type();
        bbft.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeActionPerformed
        
    }//GEN-LAST:event_timeActionPerformed

    private void id_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_tActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.id_t.setText(String.valueOf("Y"+String.valueOf(l)));
    }//GEN-LAST:event_formWindowGainedFocus

    private void fees_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fees_tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fees_tActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Yoga().setVisible(true);
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
