package VIEW;

import DAO.UserDAO;
import java.sql.ResultSet;
import DTO.UserDTO;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        user = new javax.swing.JTextField();
        passwd = new javax.swing.JPasswordField();
        javax.swing.JButton run = new javax.swing.JButton();
        screen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user.setText("SOPORTENS");
        user.setToolTipText("");
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 220, 30));

        passwd.setText("AE1A3538EF48790EAB8C4F13A8D0");
        getContentPane().add(passwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 220, 30));

        run.setContentAreaFilled(false);
        run.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        run.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runActionPerformed(evt);
            }
        });
        getContentPane().add(run, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 80, 40));

        screen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/sources/Sources/Login.png"))); // NOI18N
        getContentPane().add(screen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void runActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runActionPerformed
         log();
    }//GEN-LAST:event_runActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField passwd;
    private javax.swing.JLabel screen;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables

    public UserDTO log() {
        
        String pass = new String(passwd.getPassword());
        UserDTO objuserdto = new UserDTO();
        objuserdto.setUserDB(user.getText());
        objuserdto.setPassDB(pass);
        
        
        
        

        //objuserdto.setPortDB(port.getText());
        try {
            
            UserDAO objuserdao = new UserDAO();
            ResultSet rsuserdao = objuserdao.userAuth(objuserdto);

            if (rsuserdao.next()) {
                MenuView screen = new MenuView();
                screen.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "User or password incorrect");
            }

        } catch (SQLException e) {
            System.err.println("" + e.getMessage());
            JOptionPane.showMessageDialog(null, "User or password incorrect, verify your connection");

        }
        return objuserdto;
        
    }   

   
}
