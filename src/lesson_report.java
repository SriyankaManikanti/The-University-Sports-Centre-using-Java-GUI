public class lesson_report extends javax.swing.JFrame {
    public lesson_report() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Monthly Lessons Report");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"SA0", "Lora", "22", "YOGA", "OK", "12-7-2023"},
                {"SA0", "Lora", "22", "YOGA", "OK", "12-7-2023"},
                {"SA0", "Lora", "22", "YOGA", "OK", "12-7-2023"},
                {"SA0", "Lora", "22", "YOGA", "OK", "12-7-2023"},
                {"SA0", "Lora", "22", "YOGA", "OK", "12-7-2023"},
                {"SA0", "Lora", "22", "YOGA", "OK", "12-7-2023"},
                {"SA0", "Lora", "22", "YOGA", "OK", "12-7-2023"},
                {"SA0", "Lora", "22", "YOGA", "OK", "12-7-2023"},
                {"SA0", "Lora", "22", "YOGA", "OK", "12-7-2023"},
                {"SA0", "Lora", "22", "YOGA", "OK", "12-7-2023"},
                {"SA0", "Lora", "22", "YOGA", "OK", "12-7-2023"},
                {"SA0", "Lora", "22", "YOGA", "OK", "12-7-2023"},
                {"SA0", "Lora", "22", "YOGA", "OK", "12-7-2023"},
                {"SA0", "Lora", "22", "YOGA", "OK", "12-7-2023"},
                {"SA0", "Lora", "22", "YOGA", "OK", "12-7-2023"},
                {"SA0", "Lora", "22", "YOGA", "OK", "12-7-2023"},
                {"SA0", "Lora", "22", "YOGA", "OK", "12-7-2023"},
                {"SA0", "Lora", "22", "YOGA", "OK", "12-7-2023"},
                {"SA0", "Lora", "22", "YOGA", "OK", "12-7-2023"},
                {"SA0", "Lora", "22", "YOGA", "OK", "12-7-2023"},
                {"SA0", "Lora", "22", "YOGA", "OK", "12-7-2023"},
                {"SA0", "Lora", "22", "YOGA", "OK", "12-7-2023"},
                {"SA0", "Lora", "22", "YOGA", "OK", "12-7-2023"},
                {"SA0", "Lora", "22", "YOGA", "OK", "12-7-2023"},
                {"SA0", "Lora", "22", "YOGA", "OK", "12-7-2023"},
                {"SA0", "Lora", "22", "YOGA", "OK", "12-7-2023"},
                {"SA0", "Lora", "22", "YOGA", "OK", "12-7-2023"},
                {"SA0", "Lora", "22", "YOGA", "OK", "12-7-2023"},
                {"SA0", "Lora", "22", "YOGA", "OK", "12-7-2023"},
                {"SA0", "Lora", "22", "YOGA", "OK", "12-7-2023"},
                {"SA0", "Lora", "22", "YOGA", "OK", "12-7-2023"},
                {"SA0", "Lora", "22", "YOGA", "OK", "12-7-2023"},
            },
            new String [] {
                "ID", "Name", "Age", "Exercise", "Riview", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Monthly_reports mr = new Monthly_reports();
        mr.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lesson_report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
