import javax.swing.JOptionPane;
public class Body_Blitz extends javax.swing.JFrame {
    static String[][] body_array = new String[4][9];
    static int n=0;
    public Body_Blitz() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        exercise_t = new javax.swing.JTextField();
        name_t = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        mobile_t = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        age_t = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        address_t = new javax.swing.JTextArea();
        ok = new javax.swing.JButton();
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
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
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
        exercise_t.setText("BODY BLITZ");
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
        jLabel1.setText("Appointment For BODY BLITZ");

        age_t.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel2.setText("Address  :");

        address_t.setColumns(20);
        address_t.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        address_t.setRows(5);
        jScrollPane1.setViewportView(address_t);

        ok.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

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
        fees_t.setText("600/-");
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
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ok)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(cancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(age_t)
                            .addComponent(exercise_t)
                            .addComponent(mobile_t)
                            .addComponent(name_t)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(time, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(id_t)
                            .addComponent(fees_t))))
                .addContainerGap(77, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mobile_t, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(age_t, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exercise_t, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fees_t, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ok)
                    .addComponent(cancel))
                .addGap(28, 28, 28))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    // -------- Delete Bookings --------------------------------
    public void set_dlt_4(String vlu)
    {
        boolean jj = false;
        try{
            for(int z1=0;z1<4;z1++)
            {
                if(body_array[z1][0].equals(vlu))
                {
                    n=z1;
                    body_array[z1][0]="";
                    body_array[z1][1]="";
                    body_array[z1][2]="";
                    body_array[z1][3]="";
                    body_array[z1][4]="";
                    body_array[z1][5]="";
                    body_array[z1][6]="";
                    body_array[z1][7]="";
                    body_array[z1][8]="600";
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
    public void set_4(String vlu1)
    {
       boolean jj = false;
        try{
            for(int z1=0;z1<4;z1++)
            {
                if(body_array[z1][0].equals(vlu1))
                {
                    JOptionPane.showMessageDialog(this,"ID     : "+this.body_array[z1][0]+"\n\nName     : "+this.body_array[z1][1]+"\n\nAge      : "+this.body_array[(z1)][2]+"\n\nMobile   : "+this.body_array[(z1)][3]+"\n\nAddress  : "+this.body_array[z1][4]+"\n\nExercise : "+this.body_array[z1][5]+"\n\nDay      : "+this.body_array[z1][6]+"\n\nTiming      : "+this.body_array[(z1)][7]+"\n\n"+"Fees      : "+this.body_array[(z1)][8]+"\n\n");
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
    public void set_update_values_4(String temp[])
    {
        boolean jj = false;
        try{
            for(int z1=0;z1<4;z1++)
            {
                if(body_array[z1][0].equals(temp[0]))
                {
                    jj=true;
                    this.body_array[z1][0]=temp[0];
                    this.body_array[z1][1]=temp[1];
                    this.body_array[z1][2]=temp[2];
                    this.body_array[z1][3]=temp[3];
                    this.body_array[z1][4]=temp[4];
                    this.body_array[z1][5]=temp[5];
                    this.body_array[z1][6]=temp[6];
                    this.body_array[z1][6]=temp[6];
                    this.body_array[z1][6]=temp[6];
                    this.body_array[z1][7]=temp[7];
                    this.body_array[z1][7]="600";
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
    public void set_change_4(String vlu)
    {
        String[] send = new String[8];
        boolean jj = false;
        try{
            for(int z1=0;z1<4;z1++)
            {
                if(body_array[z1][0].equals(vlu))
                {
                    jj=true;
                    send[0]=vlu;
                    send[1]=this.body_array[z1][1];
                    send[2]=this.body_array[z1][2];
                    send[3]=this.body_array[z1][3];
                    send[4]=this.body_array[z1][4];
                    send[5]=this.body_array[z1][5];
                    send[6]=this.body_array[z1][6];
                    send[7]=this.body_array[z1][7];                    
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
    private void exercise_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exercise_tActionPerformed

    }//GEN-LAST:event_exercise_tActionPerformed
    private void name_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_tActionPerformed

    }//GEN-LAST:event_name_tActionPerformed
    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        String timee,name,age,mobile,address,exercise;
        name = name_t.getText().trim();
        age = age_t.getText().trim();
        mobile = this.mobile_t.getText().trim();
        address = this.address_t.getText().trim();
        exercise = this.exercise_t.getText().trim();
        timee = String.valueOf(this.time.getSelectedItem());
        if(name.equals("") || age.equals("") || mobile.equals("") || address.equals("") || exercise.equals(""))
        {
            JOptionPane.showMessageDialog(this,"Something Went Wrong Please Fill all Fields");
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
                            if(body_array[n][4] == null || body_array[n][4].equals(""))
                            {
                                this.body_array[n][0]="B"+String.valueOf(n);
                                this.body_array[n][1]=name;
                                this.body_array[n][2]=age;
                                this.body_array[n][3]=mobile;
                                this.body_array[n][4]=address;
                                this.body_array[n][5]=exercise;
                                this.body_array[n][6]=timee;
                                this.body_array[n][7]="Sunday";
                                JOptionPane.showMessageDialog(this,"Your Slot Booked Successfully");
                            }
                            n++;
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(this,"All Slocts of Sunday are booked Please Try again later");
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this,"Please Enter Proper Mobile Number");
                        this.mobile_t.setText("");
                    }
                }
                else
                {
                    this.age_t.setText("");
                    this.mobile_t.setText("");
                    JOptionPane.showMessageDialog(this,"Please Enter correct data in Mobile & age");
                }
            }
            catch(Exception obj)
            {
                JOptionPane.showMessageDialog(this,"There is an Problem in your inserted data So pease feed correct data");
                this.name_t.setText("");
                this.age_t.setText("");
                this.mobile_t.setText("");
                this.address_t.setText("");
                this.time.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_okActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        booking_by_fitness_type bbft = new booking_by_fitness_type();
        bbft.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeActionPerformed

    private void id_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_tActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.id_t.setText(String.valueOf("B"+String.valueOf(n)));
    }//GEN-LAST:event_formWindowGainedFocus

    private void fees_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fees_tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fees_tActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Body_Blitz().setVisible(true);
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
