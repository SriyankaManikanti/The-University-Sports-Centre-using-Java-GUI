import javax.swing.JOptionPane;
public class Zumba extends javax.swing.JFrame {
    static String[][] zumba_array = new String[4][9];
    static int m=0;
    public Zumba() {
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
        exercise_t1 = new javax.swing.JTextField();

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
        exercise_t.setText("ZUMBA");
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
        jLabel1.setText("Appointment For YOGA  ");

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
        jLabel8.setText("Exercise :");

        exercise_t1.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        exercise_t1.setText("800/-");
        exercise_t1.setEnabled(false);
        exercise_t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exercise_t1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(ok)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(exercise_t)
                                    .addComponent(mobile_t)
                                    .addComponent(name_t)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                    .addComponent(time, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(id_t)
                                    .addComponent(age_t)
                                    .addComponent(exercise_t1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(cancel))))
                    .addComponent(jLabel4))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_t, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(name_t, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age_t, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(mobile_t, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(exercise_t, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(exercise_t1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ok)
                    .addComponent(cancel))
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        name_t.setText("");
        age_t.setText("");
        mobile_t.setText("");
        address_t.setText("");
        this.time.setSelectedIndex(0);
    }//GEN-LAST:event_cancelActionPerformed
    
    
    
// -------- Delete Bookings --------------------------------    
    public void set_dlt_2(String vlu)
    {
        boolean jj = false;
        try{
            for(int z1=0;z1<4;z1++)
            {
                if(zumba_array[z1][0].equals(vlu))
                {
                    m=z1;
                    zumba_array[z1][0]="";
                    zumba_array[z1][1]="";
                    zumba_array[z1][2]="";
                    zumba_array[z1][3]="";
                    zumba_array[z1][4]="";
                    zumba_array[z1][5]="";
                    zumba_array[z1][6]="";
                    zumba_array[z1][7]="";
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
            JOptionPane.showMessageDialog(this,"False");
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Your Slot delete Successfully");
        }
    }
    
    
    
// --------show Bookings --------------------------------
    public void set_2(String vlu1)
    {
       boolean jj = false;
        try{
            for(int z1=0;z1<4;z1++)
            {
                if(zumba_array[z1][0].equals(vlu1))
                {
                    JOptionPane.showMessageDialog(this,"ID     : "+this.zumba_array[z1][0]+"\n\nName     : "+this.zumba_array[z1][1]+"\n\nAge      : "+this.zumba_array[(z1)][2]+"\n\nMobile   : "+this.zumba_array[(z1)][3]+"\n\nAddress  : "+this.zumba_array[z1][4]+"\n\nExercise : "+this.zumba_array[z1][5]+"\n\nDay      : "+this.zumba_array[z1][6]+"\n\nTiming      : "+this.zumba_array[(z1)][7]+"\n\n"+"Fees      : "+this.zumba_array[(z1)][8]+"\n\n");
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
    public void set_update_values_2(String temp[])
    {
        boolean jj = false;
        try{
            for(int z1=0;z1<4;z1++)
            {
                if(zumba_array[z1][0].equals(temp[0]))
                {
                    jj=true;
                    this.zumba_array[z1][0]=temp[0];
                    this.zumba_array[z1][1]=temp[1];
                    this.zumba_array[z1][2]=temp[2];
                    this.zumba_array[z1][3]=temp[3];
                    this.zumba_array[z1][4]=temp[4];
                    this.zumba_array[z1][5]=temp[5];
                    this.zumba_array[z1][6]=temp[6];
                    this.zumba_array[z1][7]=temp[7];
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
    public void set_change_2(String vlu)
    {
        String[] send = new String[8];
        boolean jj = false;
        try{
            for(int z1=0;z1<4;z1++)
            {
                if(zumba_array[z1][0].equals(vlu))
                {
                    jj=true;
                    send[0]=vlu;
                    send[1]=this.zumba_array[z1][1];
                    send[2]=this.zumba_array[z1][2];
                    send[3]=this.zumba_array[z1][3];
                    send[4]=this.zumba_array[z1][4];
                    send[5]=this.zumba_array[z1][5];
                    send[6]=this.zumba_array[z1][6];
                    send[7]=this.zumba_array[z1][7];                    
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


    private void exercise_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exercise_tActionPerformed
        
    }//GEN-LAST:event_exercise_tActionPerformed

    private void name_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_tActionPerformed

    }//GEN-LAST:event_name_tActionPerformed

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
                        if(m<4)
                        {
                            if(zumba_array[m][4] == null || zumba_array[m][4].equals(""))
                            {
                                this.zumba_array[m][0]="Z"+String.valueOf(m);
                                this.zumba_array[m][1]=name;
                                this.zumba_array[m][2]=age;
                                this.zumba_array[m][3]=mobile;
                                this.zumba_array[m][4]=address;
                                this.zumba_array[m][5]=exercise;
                                this.zumba_array[m][6]=timing;
                                this.zumba_array[m][7]="Sunday";
                                this.zumba_array[m][8]="800";
                                JOptionPane.showMessageDialog(this,"Your Slot Booked Successfully");
                            }
                            m++;
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
        this.id_t.setText(String.valueOf("Z"+String.valueOf(m)));
    }//GEN-LAST:event_formWindowGainedFocus

    private void exercise_t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exercise_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exercise_t1ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Zumba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address_t;
    private javax.swing.JTextField age_t;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField exercise_t;
    private javax.swing.JTextField exercise_t1;
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