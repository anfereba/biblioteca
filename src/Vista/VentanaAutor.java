/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import Vista.Animaciones.*;
import Domain.*;
import Datos.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andres R
 */
public class VentanaAutor extends javax.swing.JFrame {
    List<Atributos> autores;
    AutorJDBC au = new AutorJDBC();
    AutorJDBC dbautor = new AutorJDBC();

    /**
     * Creates new form VentanaEstudiante
     */
    public VentanaAutor() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_nacionalidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        date_fecha_nacautor = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        txt_Id_Lector = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojerusan.RSTableMetro();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("DATOS DEL AUTOR");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("Id_Autor");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 80, -1));
        jPanel2.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 158, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("Nacionalidad");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));
        jPanel2.add(txt_nacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 158, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("Fecha Nac:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 63, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Open Sans", 1, 10)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/BotonSave.png"))); // NOI18N
        jButton1.setText("GUARDAR");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 120, -1));

        btnMostrar.setBackground(new java.awt.Color(255, 255, 255));
        btnMostrar.setFont(new java.awt.Font("Open Sans", 1, 10)); // NOI18N
        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/IconoMostrar.png"))); // NOI18N
        btnMostrar.setText("MOSTRAR");
        btnMostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMostrarMouseClicked(evt);
            }
        });
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 120, -1));

        btnActualizar.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizar.setFont(new java.awt.Font("Open Sans", 1, 10)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/IconoUpdate.png"))); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarMouseClicked(evt);
            }
        });
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 140, -1));

        btnBorrar.setBackground(new java.awt.Color(255, 255, 255));
        btnBorrar.setFont(new java.awt.Font("Open Sans", 1, 10)); // NOI18N
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/IconoDelete.png"))); // NOI18N
        btnBorrar.setText("BORRAR");
        btnBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrarMouseClicked(evt);
            }
        });
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 120, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 670, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/IconoWriter.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 120, -1));

        date_fecha_nacautor.setDateFormatString("yyyy-MM-dd");
        jPanel2.add(date_fecha_nacautor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 160, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Exit.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(703, 1, -1, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 590, 20));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setText("Nombre");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 63, -1));
        jPanel2.add(txt_Id_Lector, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 158, -1));

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));

        jButton3.setText("Ir a Ventana LibroAutor");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 660, 300));

        rSTableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_AUTOR", "NOMBRE", "NACIONALIDAD", "FECHA_NAC"
            }
        ));
        rSTableMetro1.setColorBackgoundHead(new java.awt.Color(0, 102, 0));
        rSTableMetro1.setColorFilasForeground1(new java.awt.Color(0, 102, 0));
        rSTableMetro1.setColorFilasForeground2(new java.awt.Color(0, 102, 0));
        rSTableMetro1.setColorSelBackgound(new java.awt.Color(0, 102, 0));
        rSTableMetro1.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        rSTableMetro1.setFuenteFilas(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        rSTableMetro1.setFuenteFilasSelect(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        rSTableMetro1.setFuenteHead(new java.awt.Font("Open Sans", 1, 15)); // NOI18N
        rSTableMetro1.setRowHeight(30);
        rSTableMetro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSTableMetro1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(rSTableMetro1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 660, 257));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/FondoVentanaAutores.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1110, 570));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, -1, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AutorJDBC dbautor = new AutorJDBC();
        String Nombre = txt_nombre.getText();
        String Nacionalidad = txt_nacionalidad.getText();
        String Fecha_Nac =  ((JTextField)date_fecha_nacautor.getDateEditor().getUiComponent()).getText();
        if(!"".equals(txt_nombre.getText()) &&!"".equals(txt_nacionalidad.getText()) && !"".equals(Fecha_Nac)){
            dbautor.insert(Nombre, Nacionalidad, Fecha_Nac);
            if(dbautor.correcto){
                new Suces(this, true).setVisible(true);
                
            }
            else
            JOptionPane.showMessageDialog(null, "HA OCURRIDO UN ERROR");
        }
        else{
            JOptionPane.showMessageDialog(null, "LOS CAMPOS NO DEBEN ESTAR VACIOS");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnMostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarMouseClicked

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        LimpiarDatos();
        SelectAutores();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int Id_Autor = Integer.parseInt(txt_Id_Lector.getText());
        String Nombre = txt_nombre.getText();
        String Nacionalidad = txt_nacionalidad.getText();
        String Fecha_Nac =  ((JTextField)date_fecha_nacautor.getDateEditor().getUiComponent()).getText();
        if(!"".equals(txt_Id_Lector.getText()) && !"".equals(txt_nombre.getText()) &&
            !"".equals(txt_nacionalidad.getText()) && !"".equals(Fecha_Nac)){
            dbautor.update(Nombre, Nacionalidad, Fecha_Nac, Id_Autor);
            if(dbautor.correcto){
                new Suces(this, true).setVisible(true);
                
            }
            else
            JOptionPane.showMessageDialog(null, "HA OCURRIDO UN ERROR");
        }
        else{
            JOptionPane.showMessageDialog(null, "LOS CAMPOS NO DEBEN ESTAR VACIOS");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseClicked
        int Id_Autor = Integer.parseInt(txt_Id_Lector.getText());
        if(!"".equals(txt_Id_Lector.getText())){
            dbautor.delete(Id_Autor);
            JOptionPane.showMessageDialog(null, "Registro Eliminado");
        }
        else{
            JOptionPane.showMessageDialog(null,"EL CAMPO NO DEBE ESTAR VACIO");
        }
    }//GEN-LAST:event_btnBorrarMouseClicked

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       VentanaLibroAutor ventana = new VentanaLibroAutor();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.label_nombre.setText("root");
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void rSTableMetro1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSTableMetro1MouseClicked
        DefaultTableModel tb = (DefaultTableModel) rSTableMetro1.getModel();
        int selectedRowIndex = rSTableMetro1.getSelectedRow();
            txt_Id_Lector.setText(tb.getValueAt(selectedRowIndex, 0).toString());
            txt_nombre.setText(tb.getValueAt(selectedRowIndex, 1).toString());
            txt_nacionalidad.setText(tb.getValueAt(selectedRowIndex, 2).toString());
            String Fecha_Nac =  (tb.getValueAt(selectedRowIndex, 3).toString());
        try {
            Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(Fecha_Nac);
            date_fecha_nacautor.setDate(date1);
        } catch (ParseException ex) {
            Logger.getLogger(VentanaAutor.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_rSTableMetro1MouseClicked

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
            java.util.logging.Logger.getLogger(VentanaAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAutor().setVisible(true);
            }
        });
    }
    public void SelectAutores(){
        autores = au.select();
        DefaultTableModel tb = (DefaultTableModel) rSTableMetro1.getModel();
        for (Atributos in : autores) {
            tb.addRow(new Object[]{in.getId_Autor(), in.getNombre_A(), in.getNacionalidad(), in.getFecha_Nac()});
        }    
    }
    public void LimpiarDatos() {
        DefaultTableModel tb = (DefaultTableModel) rSTableMetro1.getModel();
        for (int i = tb.getRowCount() - 1; i >= 0; i--) {
            tb.removeRow(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnMostrar;
    private com.toedter.calendar.JDateChooser date_fecha_nacautor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private rojerusan.RSTableMetro rSTableMetro1;
    private javax.swing.JTextField txt_Id_Lector;
    private javax.swing.JTextField txt_nacionalidad;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
