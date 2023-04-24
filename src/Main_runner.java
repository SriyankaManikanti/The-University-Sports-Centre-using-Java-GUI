import javax.swing.JOptionPane;
public class Main_runner extends javax.swing.JFrame {
    static int allinone=0;
    public Main_runner() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_heading_label = new javax.swing.JLabel();
        Booking__Lessons = new javax.swing.JButton();
        Show__Booking = new javax.swing.JButton();
        Cancel__Booking = new javax.swing.JButton();
        Change__Booking = new javax.swing.JButton();
        atend_lesson = new javax.swing.JButton();
        atend_lesson1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        main_heading_label.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        main_heading_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        main_heading_label.setText("Welcome  To University Sports Center ");

        Booking__Lessons.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        Booking__Lessons.setText("1. Book a Exercise");
        Booking__Lessons.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        Booking__Lessons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Booking__LessonsActionPerformed(evt);
            }
        });

        Show__Booking.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        Show__Booking.setText("2. See Your Bookings");
        Show__Booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Show__BookingActionPerformed(evt);
            }
        });

        Cancel__Booking.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        Cancel__Booking.setText("4. Cancel Booking");
        Cancel__Booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel__BookingActionPerformed(evt);
            }
        });

        Change__Booking.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        Change__Booking.setText("3. Change Booking");
        Change__Booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Change__BookingActionPerformed(evt);
            }
        });

        atend_lesson.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        atend_lesson.setText("5. Attend a Exercise");
        atend_lesson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atend_lessonActionPerformed(evt);
            }
        });

        atend_lesson1.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        atend_lesson1.setText("6. Monthly Report");
        atend_lesson1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atend_lesson1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_heading_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(atend_lesson1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancel__Booking, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Change__Booking, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Show__Booking, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Booking__Lessons, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atend_lesson, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(main_heading_label, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(Booking__Lessons)
                .addGap(30, 30, 30)
                .addComponent(Show__Booking)
                .addGap(30, 30, 30)
                .addComponent(Change__Booking)
                .addGap(30, 30, 30)
                .addComponent(Cancel__Booking)
                .addGap(30, 30, 30)
                .addComponent(atend_lesson)
                .addGap(30, 30, 30)
                .addComponent(atend_lesson1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
//-------------------- Booking Button -----------------------------------
    private void Booking__LessonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Booking__LessonsActionPerformed
        By_showing_days bsd = new By_showing_days();
        bsd.setVisible(true);
    }//GEN-LAST:event_Booking__LessonsActionPerformed

public int amount(String name)
{
    int rate=0;
    switch(name)
    {
        case "Yoga":
          rate = 500;  
        break;
        case "Zumba":
            rate = 700;
        break;
        case "Box Fit":
            rate = 400;
        break;
        case "Aquacise":
            rate = 1700;
        break;
    }
    return rate;
}
    
//-------------------- Show Button -----------------------------------
    private void Show__BookingActionPerformed(java.awt.event.ActionEvent evt) {                                              
        String selected = JOptionPane.showInputDialog(this,"1.BY LESSON'S\n\n2. BY DAY'S\n").trim();
        if(selected.equals("1"))
        {
            String answer = JOptionPane.showInputDialog(this,"Enter Your id").trim();
            if(answer.equals("") || answer.length() != 2)
            {
                JOptionPane.showMessageDialog(this,"Enter id ????","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                char st = answer.charAt(0);
                switch(st)
                {
                    case 'A':
                        Aquacise a = new Aquacise();
                        a.set_1(answer);
                    break;
                    case 'Z':
                        Zumba z = new Zumba();
                        z.set_2(answer);
                    break;
                    case 'Y':
                        Yoga y = new Yoga();
                        y.set_3(answer);
                    break;
                    case 'B':
                        Body_Blitz bb = new Body_Blitz();
                        bb.set_4(answer);
                    break;
                    case 'F':
                        Box_fit bf = new Box_fit();
                        bf.set_5(answer);
                    break;
                    default:
                        JOptionPane.showMessageDialog(this,"There is no record at this time for Delete","Alert",JOptionPane.WARNING_MESSAGE);
                }
            }
        }
        else if(selected.equals(null))
        {
            JOptionPane.showMessageDialog(this,"Enter a Value","Alert",JOptionPane.WARNING_MESSAGE);
        }
        else if(selected.equals("2"))
        {
            String answer11 = JOptionPane.showInputDialog(this,"Enter Your id").trim();
            if(answer11.equals("") || answer11.length() != 3)
            {
                JOptionPane.showMessageDialog(this,"Enter id ????","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                char st = answer11.charAt(1);
                switch(st)
                {
                    case 'A':
                        saturday_day sd = new saturday_day();
                        sd.set_6(answer11);
                    break;
                    case 'U':
                        sunday_day su = new sunday_day();
                        su.set_7(answer11);
                    break;
                    default:
                        JOptionPane.showMessageDialog(this,"There is no record at this time for Delete","Alert",JOptionPane.WARNING_MESSAGE);
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Wrong Value Insert","Alert",JOptionPane.WARNING_MESSAGE);
        }
    }

    
    
//-------------------- Cancel Booking -----------------------------------    
    private void Cancel__BookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel__BookingActionPerformed

        String selected = JOptionPane.showInputDialog(this,"1.BY LESSON'S\n\n2. BY DAY'S\n").trim();
        if(selected.equals("1"))
        {
            String answer = JOptionPane.showInputDialog(this,"Enter Your id").trim();
            if(answer.equals("") || answer.length() != 2)
            {
                JOptionPane.showMessageDialog(this,"Enter id ????","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                char st = answer.charAt(0);
                switch(st)
                {
                    case 'A':
                        Aquacise a = new Aquacise();
                        a.set_dlt_1(answer);
                    break;
                    case 'Z':
                        Zumba z = new Zumba();
                        z.set_dlt_2(answer);
                    break;
                    case 'Y':
                        Yoga y = new Yoga();
                        y.set_dlt_3(answer);
                    break;
                    case 'B':
                        Body_Blitz bb = new Body_Blitz();
                        bb.set_dlt_4(answer);
                    break;
                    case 'F':
                        Box_fit bf = new Box_fit();
                        bf.set_dlt_5(answer);
                    break;
                    default:
                        JOptionPane.showMessageDialog(this,"There is no record at this time for Delete","Alert",JOptionPane.WARNING_MESSAGE);
                }
            }
        }
        else if(selected.equals(null))
        {
            JOptionPane.showMessageDialog(this,"Enter a Value","Alert",JOptionPane.WARNING_MESSAGE);
        }
        else if(selected.equals("2"))
        {
            String answer11 = JOptionPane.showInputDialog(this,"Enter Your id").trim();
            if(answer11.equals("") || answer11.length() != 3)
            {
                JOptionPane.showMessageDialog(this,"Enter id ????","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                char st = answer11.charAt(1);
                switch(st)
                {
                    case 'A':
                        saturday_day sd = new saturday_day();
                        sd.set_dlt_6(answer11);
                    break;
                    case 'U':
                        sunday_day su = new sunday_day();
                        su.set_dlt_7(answer11);
                    break;
                    default:
                        JOptionPane.showMessageDialog(this,"There is no record at this time for Delete","Alert",JOptionPane.WARNING_MESSAGE);
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Wrong Value Insert","Alert",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_Cancel__BookingActionPerformed


//-------------------- Close Button -----------------------------------
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing
    
    
    
//-------------------- Change Booking -----------------------------------
    private void Change__BookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Change__BookingActionPerformed
        String selected = JOptionPane.showInputDialog(this,"1.BY LESSON'S\n\n2. BY DAY'S\n").trim();
        if(selected.equals("1"))
        {
            String answer = JOptionPane.showInputDialog(this,"Enter Your id").trim();
            if(answer.equals("") || answer.length() != 2)
            {
                JOptionPane.showMessageDialog(this,"Enter id ????","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                char st = answer.charAt(0);
                switch(st)
                {
                    case 'A':
                        Aquacise a = new Aquacise();
                        a.set_change_1(answer);
                    break;
                    case 'Z':
                        Zumba z = new Zumba();
                        z.set_change_2(answer);
                    break;
                    case 'Y':
                        Yoga y = new Yoga();
                        y.set_change_3(answer);
                    break;
                    case 'B':
                        Body_Blitz bb = new Body_Blitz();
                        bb.set_change_4(answer);
                    break;
                    case 'F':
                        Box_fit bf = new Box_fit();
                        bf.set_change_5(answer);
                    break;
                    default:
                        JOptionPane.showMessageDialog(this,"There is no record at this time for Delete","Alert",JOptionPane.WARNING_MESSAGE);
                }
            }
        }
        else if(selected.equals(null))
        {
            JOptionPane.showMessageDialog(this,"Enter a Value","Alert",JOptionPane.WARNING_MESSAGE);
        }
        else if(selected.equals("2"))
        {
            String answer11 = JOptionPane.showInputDialog(this,"Enter Your id").trim();
            if(answer11.equals("") || answer11.length() != 3)
            {
                JOptionPane.showMessageDialog(this,"Enter id ????","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                char st = answer11.charAt(1);
                switch(st)
                {
                    case 'A':
                        saturday_day sd = new saturday_day();
                        sd.set_change_6(answer11);
                    break;
                    case 'U':
                        sunday_day su = new sunday_day();
                        su.set_change_7(answer11);
                    break;
                    default:
                        JOptionPane.showMessageDialog(this,"There is no record at this time for Delete","Alert",JOptionPane.WARNING_MESSAGE);
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Wrong Value Insert","Alert",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_Change__BookingActionPerformed


//-------------------- Attend Button -----------------------------------
    private void atend_lessonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atend_lessonActionPerformed
            String a = JOptionPane.showInputDialog(this,"1:  Very dissatisfied\n2:  Dissatisfied\n3:  Ok\n4:  Satisfied\n5:  Very Satisfied\nPlease Enter Your Feed Back");
    }//GEN-LAST:event_atend_lessonActionPerformed

    private void atend_lesson1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atend_lesson1ActionPerformed
        Monthly_reports mr = new Monthly_reports();
        mr.setVisible(true);
    }//GEN-LAST:event_atend_lesson1ActionPerformed

//-------------------- Show Button -----------------------------------
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_runner().setVisible(true);
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Booking__Lessons;
    private javax.swing.JButton Cancel__Booking;
    private javax.swing.JButton Change__Booking;
    private javax.swing.JButton Show__Booking;
    private javax.swing.JButton atend_lesson;
    private javax.swing.JButton atend_lesson1;
    private javax.swing.JLabel main_heading_label;
    // End of variables declaration//GEN-END:variables
}
