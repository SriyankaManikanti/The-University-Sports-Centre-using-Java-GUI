import javax.swing.JOptionPane;
public class Aquacise extends javax.swing.JFrame {
    static String[][] aquacise_array = new String[4][9];
    static int k=0;
    
    public Aquacise() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        time = new javax.swing.JComboBox<>();
        name_t = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        mobile_t = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        age_t = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        address_t = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ok = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        exercise_t = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        time1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        id_t = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        fees_t = new javax.swing.JTextField();

        jLabel7.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel7.setText("Timing   :");

        time.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        time.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Morning", "Afternoon", "Evening" }));
        time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeActionPerformed(evt);
            }
        });

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

        name_t.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        name_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_tActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel4.setText("Student Mobile");

        mobile_t.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel5.setText("Exercise");

        age_t.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N

        address_t.setColumns(20);
        address_t.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        address_t.setRows(5);
        jScrollPane1.setViewportView(address_t);

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Appointment For Aquacise");

        jLabel2.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel2.setText("Student Address");

        ok.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel3.setText("Student Name");

        jLabel6.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel6.setText("Student Age");

        cancel.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        exercise_t.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        exercise_t.setText("AQUACISE");
        exercise_t.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel8.setText("Timing");

        time1.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        time1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Morning", "Afternoon", "Evening" }));
        time1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel9.setText("Student Id");

        id_t.setEditable(false);
        id_t.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        id_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_tActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel10.setText("Fees");

        fees_t.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        fees_t.setText("900/-");
        fees_t.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(ok))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(120, 120, 120)
                                        .addComponent(cancel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(id_t, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(name_t, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(exercise_t, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(time1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fees_t, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(age_t, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mobile_t, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel10))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_t, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_t, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
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
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(exercise_t, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(fees_t, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(time1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ok)
                    .addComponent(cancel))
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void name_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_tActionPerformed

    }//GEN-LAST:event_name_tActionPerformed
    
// -------- Delete Bookings --------------------------------
    public void set_dlt_1(String vlu)
    {
        boolean jj = false;
        try{
            for(int z1=0;z1<4;z1++)
            {
                if(aquacise_array[z1][0].equals(vlu))
                {
                    k=z1;
                    aquacise_array[z1][0]="";
                    aquacise_array[z1][1]="";
                    aquacise_array[z1][2]="";
                    aquacise_array[z1][3]="";
                    aquacise_array[z1][4]="";
                    aquacise_array[z1][5]="";
                    aquacise_array[z1][6]="";
                    aquacise_array[z1][7]="";
                    aquacise_array[z1][8]="900";
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
    public void set_1(String vlu1)
    {
        boolean jj = false;
        try{
            for(int z1=0;z1<4;z1++)
            {
                if(aquacise_array[z1][0].equals(vlu1))
                {
                    JOptionPane.showMessageDialog(this,"ID     : "+this.aquacise_array[z1][0]+"\n\nName     : "+this.aquacise_array[z1][1]+"\n\nAge      : "+this.aquacise_array[(z1)][2]+"\n\nMobile   : "+this.aquacise_array[(z1)][3]+"\n\nAddress  : "+this.aquacise_array[z1][4]+"\n\nExercise : "+this.aquacise_array[z1][5]+"\n\nDay      : "+this.aquacise_array[z1][6]+"\n\nTiming      : "+this.aquacise_array[(z1)][7]+"\n\n"+"Rate      : "+this.aquacise_array[(z1)][8]+"\n\n");
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
    public void set_update_values_1(String temp[])
    {
        boolean jj = false;
        try{
            for(int z1=0;z1<4;z1++)
            {
                if(aquacise_array[z1][0].equals(temp[0]))
                {
                    jj=true;
                    this.aquacise_array[z1][0]=temp[0];
                    this.aquacise_array[z1][1]=temp[1];
                    this.aquacise_array[z1][2]=temp[2];
                    this.aquacise_array[z1][3]=temp[3];
                    this.aquacise_array[z1][4]=temp[4];
                    this.aquacise_array[z1][5]=temp[5];
                    this.aquacise_array[z1][6]=temp[6];
                    this.aquacise_array[z1][7]=temp[7];
                    this.aquacise_array[z1][7]="900";
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
    public void set_change_1(String vlu)
    {
        String[] send = new String[8];
        boolean jj = false;
        try{
            for(int z1=0;z1<4;z1++)
            {
                if(aquacise_array[z1][0].equals(vlu))
                {
                    jj=true;
                    send[0]=vlu;
                    send[1]=this.aquacise_array[z1][1];
                    send[2]=this.aquacise_array[z1][2];
                    send[3]=this.aquacise_array[z1][3];
                    send[4]=this.aquacise_array[z1][4];
                    send[5]=this.aquacise_array[z1][5];
                    send[6]=this.aquacise_array[z1][6];
                    send[7]=this.aquacise_array[z1][7];   
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
    
// -------- Ok button --------------------------------
    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        
        String name,age,mobile,address,exercise,timing;
        name = this.name_t.getText().trim();
        age = this.age_t.getText().trim();
        mobile = this.mobile_t.getText().trim();
        address = this.address_t.getText().trim();
        exercise = "AQUACISE";
        timing = String.valueOf(this.time1.getSelectedItem()).trim();
        
        if(name.equals("") || age.equals("") || mobile.equals("") || address.equals("") || exercise.equals("") || timing.equals("Select"))
        {
            JOptionPane.showMessageDialog(this,"Something Went Wrong Please Fill all Fields","Alert",JOptionPane.WARNING_MESSAGE);
            this.name_t.setText("");
            this.age_t.setText("");
            this.mobile_t.setText("");
            this.address_t.setText("");
            this.time1.setSelectedIndex(0);
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
                        this.time1.setSelectedIndex(0);
                        if(k<4)
                        {
                            if(aquacise_array[k][4] == null || aquacise_array[k][4].equals(""))
                            {
                                this.aquacise_array[k][0]="A"+String.valueOf(k);
                                this.aquacise_array[k][1]=name;
                                this.aquacise_array[k][2]=age;
                                this.aquacise_array[k][3]=mobile;
                                this.aquacise_array[k][4]=address;
                                this.aquacise_array[k][5]=exercise;
                                this.aquacise_array[k][6]=timing;
                                this.aquacise_array[k][7]="Saturday";
                                this.aquacise_array[k][8]="900";
                                JOptionPane.showMessageDialog(this,"Your Slot Booked Successfully");
                            }
                            k++;
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
                this.time1.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_okActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.name_t.setText("");
        this.age_t.setText("");
        this.mobile_t.setText("");
        this.address_t.setText("");
        this.time1.setSelectedIndex(0);
    }//GEN-LAST:event_cancelActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        booking_by_fitness_type bbft = new booking_by_fitness_type();
        bbft.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeActionPerformed
        
    }//GEN-LAST:event_timeActionPerformed

    private void time1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time1ActionPerformed
        
    }//GEN-LAST:event_time1ActionPerformed

    private void id_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_tActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.id_t.setText(String.valueOf("A"+String.valueOf(k)));
    }//GEN-LAST:event_formWindowGainedFocus

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aquacise().setVisible(true);
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
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JComboBox<String> time1;
    // End of variables declaration//GEN-END:variables
}
