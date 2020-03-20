package proyectobdd1;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu_reg = new javax.swing.JDialog();
        panel1 = new java.awt.Panel();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        tf_regUser = new javax.swing.JTextField();
        tf_regPass1 = new javax.swing.JTextField();
        tf_regPass2 = new javax.swing.JTextField();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        jButton1 = new javax.swing.JButton();
        btnReg = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lbl_Verif = new javax.swing.JTextField();
        tipoUser1 = new javax.swing.JRadioButton();
        tipoUser2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        tipoUser3 = new javax.swing.JRadioButton();
        tipoUser4 = new javax.swing.JRadioButton();
        jTextField2 = new javax.swing.JTextField();
        btnUsers = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lbl_signup = new java.awt.Label();
        btn_login = new java.awt.Button();
        textField1 = new java.awt.TextField();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        jPasswordField1 = new javax.swing.JPasswordField();

        panel1.setBackground(new java.awt.Color(51, 204, 255));

        label4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label4.setForeground(new java.awt.Color(0, 51, 255));
        label4.setText("Registro");

        label5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label5.setForeground(new java.awt.Color(0, 51, 255));
        label5.setText("Contraseña");

        tf_regUser.setBackground(new java.awt.Color(255, 255, 255));
        tf_regUser.setForeground(new java.awt.Color(0, 0, 0));

        tf_regPass1.setBackground(new java.awt.Color(255, 255, 255));
        tf_regPass1.setForeground(new java.awt.Color(0, 0, 0));

        tf_regPass2.setBackground(new java.awt.Color(255, 255, 255));
        tf_regPass2.setForeground(new java.awt.Color(0, 0, 0));

        label6.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        label6.setForeground(new java.awt.Color(0, 51, 255));
        label6.setText("Reingrese Contraseña");

        label7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label7.setForeground(new java.awt.Color(0, 51, 255));
        label7.setText("Usuario");

        jButton1.setText("Verificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnReg.setText("Registrarse");
        btnReg.setEnabled(false);
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });

        jButton3.setText("Volver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        lbl_Verif.setBackground(new java.awt.Color(204, 51, 0));
        lbl_Verif.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Verif.setText("X");

        btnUsers.add(tipoUser1);
        tipoUser1.setText("Admin");

        btnUsers.add(tipoUser2);
        tipoUser2.setText("Servicio de Localización de Vehículos");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Registrar Como:");

        btnUsers.add(tipoUser3);
        tipoUser3.setText("Cliente");

        btnUsers.add(tipoUser4);
        tipoUser4.setText("Depto. Marketing");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReg)
                .addGap(195, 195, 195))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(29, 29, 29)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_regPass1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf_regPass2)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(tf_regUser, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tipoUser2)
                                    .addComponent(tipoUser1)
                                    .addComponent(tipoUser3)
                                    .addComponent(tipoUser4))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Verif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_regUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_regPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_regPass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)
                        .addComponent(lbl_Verif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipoUser1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipoUser2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipoUser3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipoUser4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReg)
                    .addComponent(jButton3))
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout menu_regLayout = new javax.swing.GroupLayout(menu_reg.getContentPane());
        menu_reg.getContentPane().setLayout(menu_regLayout);
        menu_regLayout.setHorizontalGroup(
            menu_regLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menu_regLayout.setVerticalGroup(
            menu_regLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTextField2.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.setForeground(new java.awt.Color(51, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_signup.setBackground(new java.awt.Color(51, 204, 255));
        lbl_signup.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lbl_signup.setForeground(new java.awt.Color(255, 102, 0));
        lbl_signup.setText("Registrate Ya");
        lbl_signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_signupMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, -1));

        btn_login.setForeground(new java.awt.Color(0, 51, 255));
        btn_login.setLabel("Iniciar Sesión");
        jPanel1.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 271, -1, -1));
        jPanel1.add(textField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 168, 220, -1));

        label1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 51, 255));
        label1.setText("Usuario");
        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 138, -1, -1));

        label2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 51, 255));
        label2.setText("Contraseña");
        jPanel1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 198, -1, -1));

        label3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label3.setForeground(new java.awt.Color(0, 51, 255));
        label3.setText("Menu Compañia Vehiculos");
        jPanel1.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 67, -1, -1));

        jPasswordField1.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 228, 220, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_signupMouseClicked
        this.dispose();
        menu_reg.pack();
        menu_reg.setLocationRelativeTo(this);
        menu_reg.setVisible(true);
    }//GEN-LAST:event_lbl_signupMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        menu_reg.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (tf_regPass2.getText().equals(tf_regPass1.getText()) && (tf_regPass1.getText().length() > 0) && (tf_regPass2.getText().length() > 0)) {
            //Si es correcta la password
            lbl_Verif.setText("✓");
            lbl_Verif.setBackground(Color.green);
            verificacionPass = true;
            btnReg.setEnabled(true);
        }else{
            lbl_Verif.setText("X");
            lbl_Verif.setBackground(Color.red);
            verificacionPass = false;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegActionPerformed
        if (verificacionPass == false  || (tf_regPass1.getText().length() <= 0) || (tf_regPass2.getText().length() <= 0) || (tf_regUser.getText().length() <= 0)) {
            JOptionPane.showMessageDialog(null, "No se ha podido registrar!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        btnReg.setEnabled(false);
    }//GEN-LAST:event_btnRegActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReg;
    private javax.swing.ButtonGroup btnUsers;
    private java.awt.Button btn_login;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private javax.swing.JTextField lbl_Verif;
    private java.awt.Label lbl_signup;
    private javax.swing.JDialog menu_reg;
    private java.awt.Panel panel1;
    private java.awt.TextField textField1;
    private javax.swing.JTextField tf_regPass1;
    private javax.swing.JTextField tf_regPass2;
    private javax.swing.JTextField tf_regUser;
    private javax.swing.JRadioButton tipoUser1;
    private javax.swing.JRadioButton tipoUser2;
    private javax.swing.JRadioButton tipoUser3;
    private javax.swing.JRadioButton tipoUser4;
    // End of variables declaration//GEN-END:variables
boolean verificacionPass = false;
}
