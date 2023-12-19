/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasi_rumahmakan;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


/**
 *
 * @author Kiwiltech
 */
public class Login extends javax.swing.JFrame {
    private PreparedStatement stat;
    private ResultSet rs;
    
    koneksi k = new koneksi();
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        k.connect();
    }
    
    class user {
        int id_user,id_level;
        String username,password,nama_user; 
        
        public user(){
            this.id_user = 0;
            this.username = text_username.getText();
            this.password = text_password.getText();
            this.nama_user = "";
            this.id_user = 0;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        text_username = new javax.swing.JTextField();
        text_password = new javax.swing.JPasswordField();
        button_login = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(720, 480));
        setSize(new java.awt.Dimension(1280, 720));

        jLabel1.setFont(new java.awt.Font("Poppins Black", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");

        jLabel2.setFont(new java.awt.Font("Poppins ExtraBold", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("USERNAME");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Poppins ExtraBold", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PASSWORD");

        text_username.setFont(new java.awt.Font("Poppins Light", 0, 24)); // NOI18N
        text_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_usernameActionPerformed(evt);
            }
        });

        button_login.setBackground(new java.awt.Color(204, 204, 204));
        button_login.setFont(new java.awt.Font("Poppins Light", 0, 24)); // NOI18N
        button_login.setText("LOGIN");
        button_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_loginActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Open Sans Medium", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Selamat Datang Di RestaResto");
        jLabel4.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text_username, javax.swing.GroupLayout.DEFAULT_SIZE, 849, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_password)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button_login, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(text_username, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(text_password, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(button_login)
                .addGap(246, 246, 246))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_usernameActionPerformed

    private void button_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_loginActionPerformed
        // TODO add your handling code here:
        user u = new user();
        try {
            this.stat = k.getCon().prepareStatement("select * from user where "
                    + "username = '"+u.username+"' and password = '"+u.password+"';");
            this.rs = this.stat.executeQuery();
            while (rs.next()) {
               u.id_level = rs.getInt("id_level");
            }
            if (u.id_level == 0) {
                JOptionPane.showMessageDialog(null, "AKUN TIDAK DITEMUKAN");
            } else {
                switch(u.id_level){
                    case 1:
                        Menu_Registrasi reg = new Menu_Registrasi();
                        reg.setVisible(true);
                        this.setVisible(false);
                        break;
                    case 2:
                        Menu_Transaksi tran = new Menu_Transaksi();
                        tran.setVisible(true);
                        this.setVisible(false);
                        break;
                    case 3:
                        Menu_Transaksi tran2 = new Menu_Transaksi();
                        tran2.setVisible(true);
                        this.setVisible(false);
                      
                        break;
                    case 4:
                        Menu_Makanan makan = new Menu_Makanan();
                        makan.setVisible(true);
                        this.setVisible(false);
                        makan.button_logout.setEnabled(true);
                        break;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_button_loginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField text_password;
    private javax.swing.JTextField text_username;
    // End of variables declaration//GEN-END:variables
}
