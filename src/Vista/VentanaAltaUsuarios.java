/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Atxy2k.CustomTextField.RestrictedTextField;
import Datos.LoginJDBC;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import rojerusan.RSNotifyShadowFade;

/**
 *
 * @author Andres R
 */
public class VentanaAltaUsuarios extends javax.swing.JFrame {

    LoginJDBC dbalta = new LoginJDBC();
    public VentanaAltaUsuarios() {
        initComponents();
        setLocationRelativeTo(null);
        RestrictedTextField telefono = new RestrictedTextField(txt_telefono);
        RestrictedTextField CC = new RestrictedTextField(txt_CI);
        RestrictedTextField nombre = new RestrictedTextField(txt_nombre);
        RestrictedTextField apellido = new RestrictedTextField(txt_apellido);
        RestrictedTextField direccion = new RestrictedTextField(txt_direccion);
        RestrictedTextField carrera= new RestrictedTextField(txt_carrera);
        RestrictedTextField email= new RestrictedTextField(txt_email);
        RestrictedTextField password= new RestrictedTextField(txt_password);
        CC.setLimit(10);
        CC.setOnlyNums(true);
        nombre.setLimit(50);
        nombre.setOnlyText(true);
        apellido.setLimit(50);
        apellido.setOnlyText(true);
        direccion.setLimit(50);
        carrera.setLimit(50);
        telefono.setLimit(10);
        telefono.setOnlyNums(true);
        email.setLimit(50);
        password.setLimit(10);
        password.setOnlyNums(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_CI = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_carrera = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        date_fecha_nacimiento = new com.toedter.calendar.JDateChooser();
        txt_telefono = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        btn_guardar = new javax.swing.JButton();
        bnt_regresar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CC:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOMBRE:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("APELLIDO:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DIRECCION:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CARRERA:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("FECHA NACIMIENTO:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 120, -1));

        jLabel8.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("E-MAIL:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, 20));

        jLabel9.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PASSWORD:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, -1, -1));

        txt_CI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CIActionPerformed(evt);
            }
        });
        getContentPane().add(txt_CI, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 180, 30));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 180, 30));
        getContentPane().add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 180, 30));
        getContentPane().add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 180, 30));
        getContentPane().add(txt_carrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 180, 30));

        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        getContentPane().add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 180, 30));

        date_fecha_nacimiento.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(date_fecha_nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 180, 30));

        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 180, 30));
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 180, 30));

        btn_guardar.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, -1, -1));

        bnt_regresar.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        bnt_regresar.setText("Regresar");
        bnt_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_regresarActionPerformed(evt);
            }
        });
        getContentPane().add(bnt_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, -1, -1));

        jLabel10.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ALTA USUARIOS");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jLabel11.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("TELEFONO:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, 20));

        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/FondoAltaUsuarios.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void bnt_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_regresarActionPerformed
       VentanaMenu ventana = new VentanaMenu();
       ventana.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_bnt_regresarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        long CC=Long.parseLong(txt_CI.getText());
        String Nombre = txt_nombre.getText();
        String Apellido = txt_apellido.getText();
        String Direccion = txt_direccion.getText();
        String Carrera = txt_carrera.getText();
        String Fecha_Nac =  ((JTextField)date_fecha_nacimiento.getDateEditor().getUiComponent()).getText();
        long telefono = Long.parseLong(txt_telefono.getText());
        String email = txt_email.getText();
        String Password = txt_password.getText();
        if(!"".equals(txt_CI.getText()) &&
            !"".equals(txt_nombre.getText()) && !"".equals(txt_apellido.getText())
            && !"".equals(txt_telefono.getText()) && !"".equals(txt_direccion.getText()) && !"".equals(txt_carrera.getText())
            && !"".equals(Fecha_Nac) && !"".equals(email) && !"".equals(Password)){
            dbalta.insert(CC, Nombre, Apellido, Direccion, Carrera, Fecha_Nac, telefono, email, Password);
            if(dbalta.correcto){
                new rojerusan.RSNotifyShadowFade("REGISTRO COMPLETADO","EL ADMINISTRADOR VALIDARA SUS DATOS PARA PODER LOGUEARSE" , 7, RSNotifyShadowFade.PositionNotify.TopLef, RSNotifyShadowFade.TypeNotify.SUCCESS).setVisible(true);
            }
            else
                new rojerusan.RSNotifyShadowFade("ERROR","HA OCURRIDO UN ERROR AL REGISTRARTE" , 7, RSNotifyShadowFade.PositionNotify.TopLef, RSNotifyShadowFade.TypeNotify.ERROR).setVisible(true);
 
        }
        else{
            new rojerusan.RSNotifyShadowFade("ATENCION","POR FAVOR RELLENE TODOS LOS CAMPOS" , 7, RSNotifyShadowFade.PositionNotify.TopLef, RSNotifyShadowFade.TypeNotify.WARNING).setVisible(true);
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        
    }//GEN-LAST:event_txt_telefonoActionPerformed

    private void txt_CIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CIActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAltaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAltaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAltaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAltaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAltaUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt_regresar;
    private javax.swing.JButton btn_guardar;
    private com.toedter.calendar.JDateChooser date_fecha_nacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_CI;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_carrera;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JPasswordField txt_password;
    public javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
