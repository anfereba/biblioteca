package Vista;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VentanaPrincipalUsuario extends javax.swing.JFrame {

    public VentanaPrincipalUsuario() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label_Id_Lector = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label_name = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        label_cc = new javax.swing.JLabel();
        label_nombre = new javax.swing.JLabel();
        label_apellido = new javax.swing.JLabel();
        label_direccion = new javax.swing.JLabel();
        label_carrera = new javax.swing.JLabel();
        label_fechanac = new javax.swing.JLabel();
        label_telefono = new javax.swing.JLabel();
        label_email = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_Id_Lector.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        label_Id_Lector.setForeground(new java.awt.Color(0, 204, 0));
        jPanel1.add(label_Id_Lector, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, 10));

        jLabel3.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel3.setText("Bienvenido:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        label_name.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        label_name.setForeground(new java.awt.Color(0, 204, 0));
        jPanel1.add(label_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, -1, 20));

        jLabel5.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel5.setText("Id_Lector:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, 10));

        label_cc.setText("CC");
        jPanel1.add(label_cc, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, -1, -1));

        label_nombre.setText("NOMBRE");
        jPanel1.add(label_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));

        label_apellido.setText("APELLIDO");
        jPanel1.add(label_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, -1, -1));

        label_direccion.setText("DIRECCION ");
        jPanel1.add(label_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, -1, -1));

        label_carrera.setText("CARRERA");
        jPanel1.add(label_carrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, -1, -1));

        label_fechanac.setText("FECHA_NAC");
        jPanel1.add(label_fechanac, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, -1, -1));

        label_telefono.setText("TELEFONO");
        jPanel1.add(label_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, -1, -1));

        label_email.setText("EMAIL");
        jPanel1.add(label_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/FondoPrincipalUsuario.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/IconoLibros.png"))); // NOI18N
        jMenu2.setText("Reservar Libro");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/IconoHistorial.png"))); // NOI18N
        jMenu3.setText("Mi Historial");

        jMenuItem1.setText("Mis Libros");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/IconoInicioUsuario.png"))); // NOI18N
        jMenu1.setText("Mi Cuenta");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/IconoDelete.png"))); // NOI18N
        jMenu4.setText("Salir");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        VentanaLogin ventana = new VentanaLogin();
        JOptionPane.showMessageDialog(null, "SU SESION SE HA CERRADO");
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        VentanaReservarLibro_U ventana2 = new VentanaReservarLibro_U();
        ventana2.setVisible(true);

        ventana2.label_nombre.setText(label_name.getText());
        ventana2.label_nombre.setVisible(false);
        ventana2.txt_rId_Lector.setText(label_Id_Lector.getText());

        ventana2.label_cc.setText(label_cc.getText());

        ventana2.label_nombre1.setText(label_nombre.getText());
        ventana2.label_apellido.setText(label_apellido.getText());
        ventana2.label_direccion.setText(label_direccion.getText());
        ventana2.label_carrera.setText(label_carrera.getText());
        ventana2.label_fechanac.setText(label_fechanac.getText());
        ventana2.label_telefono.setText(label_telefono.getText());
        ventana2.label_email.setText(label_email.getText());

        this.dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        VentanaLibrosReservados ventana = new VentanaLibrosReservados();
        ventana.setVisible(true);
        
        ventana.labelnombre.setText(label_name.getText());
        
        ventana.labelid.setText(label_Id_Lector.getText());
        ventana.label_cc.setText(label_cc.getText());
        ventana.label_nombre.setText(label_nombre.getText());
        ventana.label_apellido.setText(label_apellido.getText());
        ventana.label_direccion.setText(label_direccion.getText());
        ventana.label_carrera.setText(label_carrera.getText());
        ventana.label_fechanac.setText(label_fechanac.getText());
        ventana.label_telefono.setText(label_telefono.getText());
        ventana.label_email.setText(label_email.getText());
        
        
        
        ventana.labelid.setVisible(false);
        ventana.labelnombre.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked

    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        VentanaEditarCuenta ventana = new VentanaEditarCuenta();
        ventana.label_name.setText(this.label_name.getText());
        ventana.txt_Id_Lector.setText(label_Id_Lector.getText());
        ventana.txt_Id_Lector.setEditable(false);
        ventana.txt_CC.setText(label_cc.getText());
        ventana.txt_CC.setEditable(false);
        ventana.txt_nombre.setText(label_nombre.getText());
        ventana.txt_nombre.setEditable(false);
        ventana.txt_apellido.setText(label_apellido.getText());
        ventana.txt_apellido.setEditable(false);
        ventana.txt_direccion.setText(label_direccion.getText());
        ventana.txt_carrera.setText(label_carrera.getText());
        ventana.txt_carrera.setEditable(false);
        ventana.txt_fecha_nac.setText(label_fechanac.getText());
        ventana.txt_fecha_nac.setEditable(false);
        ventana.txt_telefono.setText(label_telefono.getText());
        ventana.txt_email.setText(label_email.getText());
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipalUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel label_Id_Lector;
    public javax.swing.JLabel label_apellido;
    public javax.swing.JLabel label_carrera;
    public javax.swing.JLabel label_cc;
    public javax.swing.JLabel label_direccion;
    public javax.swing.JLabel label_email;
    public javax.swing.JLabel label_fechanac;
    public javax.swing.JLabel label_name;
    public javax.swing.JLabel label_nombre;
    public javax.swing.JLabel label_telefono;
    // End of variables declaration//GEN-END:variables
}
