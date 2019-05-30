package Vista;
import Vista.Animaciones.*;
import Domain.*;
import Datos.*;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class VentanaPrincipal extends javax.swing.JFrame {
    List<Atributos> autores;
    AutorJDBC au = new AutorJDBC();
    VentanaAutor v = new VentanaAutor();

    VentanaLibros vl = new VentanaLibros();

    


    public VentanaPrincipal() {
        
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        label_nombre = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemEstudiante = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sesion Iniciada Como:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        label_nombre.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        label_nombre.setForeground(new java.awt.Color(0, 204, 0));
        jPanel1.add(label_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 364, 170, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Exit.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/FondoVentanaPrincipal.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 720, 460));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 730, 470));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/IconoEscritor.png"))); // NOI18N
        jMenu1.setText("Autores");
        jMenu1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });

        itemEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/IconoGestionarAutor.png"))); // NOI18N
        itemEstudiante.setText("Gestionar Autores");
        itemEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemEstudianteMouseClicked(evt);
            }
        });
        itemEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEstudianteActionPerformed(evt);
            }
        });
        jMenu1.add(itemEstudiante);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/IconoUsuario.png"))); // NOI18N
        jMenu2.setText("Estudiantes");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/IconoGestionarEstudiante.png"))); // NOI18N
        jMenuItem1.setText("Gestionar Estudiantes");
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
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/IconoLibros.png"))); // NOI18N
        jMenu3.setText("Libros");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/IconoGestionarLibro.png"))); // NOI18N
        jMenuItem2.setText("Gestionar Libros");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem5.setText("Asignar Libro con Autor");
        jMenuItem5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem5MouseClicked(evt);
            }
        });
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/IconoPrestamo.png"))); // NOI18N
        jMenu4.setText("Prestamo");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/IconoGestionarPrestamo.png"))); // NOI18N
        jMenuItem3.setText("Gestionar Prestamos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuItem4.setText("Devolver un Libro");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuItem6.setText("Gestionar Multas");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        
       
    }//GEN-LAST:event_jMenu1MouseClicked

    private void itemEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEstudianteActionPerformed
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_itemEstudianteActionPerformed

    private void itemEstudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemEstudianteMouseClicked
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_itemEstudianteMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        VentanaEditarUsuario ventana = new VentanaEditarUsuario();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       
        vl.setVisible(true);
       
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        VentanaValidarPrestamo ventana = new VentanaValidarPrestamo();
        ventana.lbl_usr.setText(label_nombre.getText());
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        VentanaLogin ventana = new VentanaLogin();
        JOptionPane.showMessageDialog(null, "SU SESION SE HA CERRADO");
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
       
    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jMenuItem5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem5MouseClicked
    
    }//GEN-LAST:event_jMenuItem5MouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       VentanaLibroAutor ventana = new VentanaLibroAutor();
       ventana.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       VentanaDevolverLibro ventana = new VentanaDevolverLibro();
       ventana.lbl_usr.setText(label_nombre.getText());
       ventana.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
       VentanaGenerarMulta ventana = new VentanaGenerarMulta();
       ventana.lbl_usr.setText(label_nombre.getText());
       ventana.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemEstudiante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel label_nombre;
    // End of variables declaration//GEN-END:variables

    private VentanaGenerarMulta VentanaGenerarMulta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
