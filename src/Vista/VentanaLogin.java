/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Datos.LoginJDBC;
import javax.swing.JOptionPane;
import rojerusan.RSNotifyFade;
import rojerusan.RSNotifyShadowFade;

/**
 *
 * @author Andres R
 */
public class VentanaLogin extends javax.swing.JFrame {

    LoginJDBC MetodosJDBC = new LoginJDBC();

    public VentanaLogin() {
        initComponents();
        setLocationRelativeTo(null);
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
        txt_email = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        btn_entrar = new javax.swing.JButton();
        bnt_regresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("INICIAR SESION");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("E-MAIL:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PASSWORD:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));
        getContentPane().add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 130, 30));
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 130, 30));

        btn_entrar.setBackground(new java.awt.Color(153, 153, 255));
        btn_entrar.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        btn_entrar.setText("ENTRAR");
        btn_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, -1, -1));

        bnt_regresar.setBackground(new java.awt.Color(153, 153, 255));
        bnt_regresar.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        bnt_regresar.setText("REGRESAR");
        bnt_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_regresarActionPerformed(evt);
            }
        });
        getContentPane().add(bnt_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, -1, -1));

        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/FondoRojo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnt_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_regresarActionPerformed
        VentanaMenu ventana = new VentanaMenu();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bnt_regresarActionPerformed

    private void btn_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entrarActionPerformed
        String BusquedaDatos = MetodosJDBC.SearchRegistredUser(txt_email.getText(), txt_password.getText());
        if (txt_email.getText().equals("root") && txt_password.getText().equals("admin")) {
            new rojerusan.RSNotifyShadowFade("SESION INICIADA","ACABAS DE INICIAR SESION COMO ROOT" , 7, RSNotifyShadowFade.PositionNotify.TopLef, RSNotifyShadowFade.TypeNotify.SUCCESS).setVisible(true);
            VentanaPrincipal window = new VentanaPrincipal();
            window.label_nombre.setText("root");

            window.setVisible(true);
            this.dispose();
        } 
        else if(txt_email.getText().equals("bibliotecologo") && txt_password.getText().equals("bibliotecologo")){
            new rojerusan.RSNotifyShadowFade("SESION INICIADA","ACABAS DE INICIAR SESION COMO BIBLIOTECOLOGO" , 7, RSNotifyShadowFade.PositionNotify.TopLef, RSNotifyShadowFade.TypeNotify.SUCCESS).setVisible(true);
            VentanaPrincipalBibliotecologo window = new VentanaPrincipalBibliotecologo();
            window.label_usuario.setText("bibliotecologo");

            window.setVisible(true);
            this.dispose();
        }
        
        
        
        else if (BusquedaDatos.equals("Usuario encontrado")) {
            String Busqueda_Name = MetodosJDBC.searchName(txt_email.getText());
            String Busqueda_Id = MetodosJDBC.searchIdLector(txt_email.getText());
            String BusquedaCC = MetodosJDBC.searchCC(txt_email.getText());
            String BusquedaNombre = MetodosJDBC.searchNombre(txt_email.getText());
            String BusquedaApellido = MetodosJDBC.searchApellido(txt_email.getText());
            String BusquedaDireccion = MetodosJDBC.searchDireccion(txt_email.getText());
            String BusquedaCarrera = MetodosJDBC.searchCarrera(txt_email.getText());
            String BusquedaFechaNac = MetodosJDBC.searchFechaNac(txt_email.getText());
            String BusquedaTelefono = MetodosJDBC.searchTelefono(txt_email.getText());
            new rojerusan.RSNotifyShadowFade("SESION INICIADA","Bienvenido(a) \n" + Busqueda_Name , 7, RSNotifyShadowFade.PositionNotify.TopLef, RSNotifyShadowFade.TypeNotify.SUCCESS).setVisible(true);
            VentanaPrincipalUsuario ventana = new VentanaPrincipalUsuario();
            ventana.label_name.setText(Busqueda_Name);
            ventana.label_Id_Lector.setText(Busqueda_Id);
            ventana.label_cc.setText(BusquedaCC);
            ventana.label_nombre.setText(BusquedaNombre);
            ventana.label_apellido.setText(BusquedaApellido);
            ventana.label_direccion.setText(BusquedaDireccion);
            ventana.label_carrera.setText(BusquedaCarrera);
            ventana.label_fechanac.setText(BusquedaFechaNac);
            ventana.label_telefono.setText(BusquedaTelefono);
            ventana.label_email.setText(txt_email.getText());
            ventana.setSize(800, 600);
            ventana.setResizable(false);

            ventana.setVisible(true);
            this.dispose();
        } else {
            new rojerusan.RSNotifyShadowFade("ERROR AL INICIAR SESION","USUARIO NO REGISTRADO O DATOS INVALIDOS" , 7, RSNotifyShadowFade.PositionNotify.TopLef, RSNotifyShadowFade.TypeNotify.ERROR).setVisible(true);
        }

    }//GEN-LAST:event_btn_entrarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt_regresar;
    private javax.swing.JButton btn_entrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JTextField txt_email;
    private javax.swing.JPasswordField txt_password;
    // End of variables declaration//GEN-END:variables
}
