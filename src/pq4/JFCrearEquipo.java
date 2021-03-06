/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pq4;

import conexionbd.pq1.Conexion;
import conexionbd.pq1.DAOEquiposImp;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import pq2.Equipo;

/**
 *
 * @author santiagob20
 */
public class JFCrearEquipo extends javax.swing.JFrame {

    /**
     * Creates new form FormularioJFrame
     */
    static JFCrearEquipo jf = new JFCrearEquipo();

    public JFCrearEquipo() {
        initComponents();
        this.setSize(new Dimension(705, 391));

    }

    private boolean insertar() {
        boolean valor = false;
        try {
            DAOEquiposImp A = new DAOEquiposImp();
            Equipo E1 = new Equipo();
            E1.setEstadio(cjEstadio.getText());
            E1.setNombre(cjNombre.getText());
            E1.setFechaCreacion(Integer.parseInt(cjFechaCreacion.getText()));
            E1.setNombreImagen(txtUrl.getText());
            A.insertar(E1);
            valor = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error SQL");
        }
        return valor;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGuardar = new javax.swing.JButton();
        cjFechaCreacion = new javax.swing.JTextField();
        JEstadio = new javax.swing.JLabel();
        JNombre = new javax.swing.JLabel();
        cjEstadio = new javax.swing.JTextField();
        cjNombre = new javax.swing.JTextField();
        JEstadio1 = new javax.swing.JLabel();
        JNombre1 = new javax.swing.JLabel();
        btnExaminar = new javax.swing.JButton();
        txtUrl = new javax.swing.JLabel();
        cjEscudo = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pq4/Imagenes/btn_crear.png"))); // NOI18N
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(210, 310, 160, 50);

        cjFechaCreacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjFechaCreacionActionPerformed(evt);
            }
        });
        getContentPane().add(cjFechaCreacion);
        cjFechaCreacion.setBounds(210, 150, 190, 30);

        JEstadio.setForeground(new java.awt.Color(255, 255, 255));
        JEstadio.setText("ESCUDO");
        getContentPane().add(JEstadio);
        JEstadio.setBounds(140, 220, 60, 20);

        JNombre.setForeground(new java.awt.Color(255, 255, 255));
        JNombre.setText("AÑO CREACIÓN");
        getContentPane().add(JNombre);
        JNombre.setBounds(90, 160, 100, 16);

        cjEstadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjEstadioActionPerformed(evt);
            }
        });
        getContentPane().add(cjEstadio);
        cjEstadio.setBounds(210, 110, 190, 30);

        cjNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjNombreActionPerformed(evt);
            }
        });
        getContentPane().add(cjNombre);
        cjNombre.setBounds(210, 70, 190, 30);

        JEstadio1.setForeground(new java.awt.Color(255, 255, 255));
        JEstadio1.setText("ESTADIO");
        getContentPane().add(JEstadio1);
        JEstadio1.setBounds(130, 120, 90, 16);

        JNombre1.setForeground(new java.awt.Color(255, 255, 255));
        JNombre1.setText("NOMBRE");
        getContentPane().add(JNombre1);
        JNombre1.setBounds(130, 80, 60, 16);

        btnExaminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pq4/Imagenes/btn_examinar.png"))); // NOI18N
        btnExaminar.setBorderPainted(false);
        btnExaminar.setContentAreaFilled(false);
        btnExaminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExaminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExaminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnExaminar);
        btnExaminar.setBounds(220, 210, 150, 40);

        txtUrl.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtUrl.setForeground(new java.awt.Color(255, 255, 255));
        txtUrl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtUrl.setText("...");
        getContentPane().add(txtUrl);
        txtUrl.setBounds(210, 190, 190, 20);

        cjEscudo.setForeground(new java.awt.Color(255, 255, 255));
        cjEscudo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cjEscudo.setText("Escudo");
        cjEscudo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(cjEscudo);
        cjEscudo.setBounds(490, 80, 160, 150);

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pq4/Imagenes/btn_atras.png"))); // NOI18N
        btnAtras.setBorderPainted(false);
        btnAtras.setContentAreaFilled(false);
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras);
        btnAtras.setBounds(10, 10, 160, 40);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cargar imagen de 143px * 143px");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 250, 220, 30);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pq4/Imagenes/subpanel.png"))); // NOI18N
        getContentPane().add(Fondo);
        Fondo.setBounds(0, 0, 704, 390);

        setSize(new java.awt.Dimension(704, 411));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cjFechaCreacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cjFechaCreacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cjFechaCreacionActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:

        if (insertar() == true) {
            JOptionPane.showMessageDialog(null, "Registro Ingresado", "Registro", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Registro NO! Ingresado", "Error", JOptionPane.ERROR_MESSAGE);
        }

        JFPrincipal rg = new JFPrincipal();
        rg.setVisible(true);
        jf.setVisible(false);


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cjEstadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cjEstadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cjEstadioActionPerformed

    private void cjNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cjNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cjNombreActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        jf.setVisible(false);
        JFInicial2 jfc = new JFInicial2();
        jfc.setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnExaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExaminarActionPerformed
        // TODO add your handling code here:
        ventanaEmergente();
    }//GEN-LAST:event_btnExaminarActionPerformed

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
            java.util.logging.Logger.getLogger(JFCrearEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCrearEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCrearEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCrearEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                jf.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel JEstadio;
    private javax.swing.JLabel JEstadio1;
    private javax.swing.JLabel JNombre;
    private javax.swing.JLabel JNombre1;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnExaminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel cjEscudo;
    private javax.swing.JTextField cjEstadio;
    private javax.swing.JTextField cjFechaCreacion;
    private javax.swing.JTextField cjNombre;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel txtUrl;
    // End of variables declaration//GEN-END:variables
    
    public void ventanaEmergente() 
    {
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Formatos de Archivo JPEG(.*JPG;*.JPEG)", "jpg","jpeg");
        JFileChooser archivo = new JFileChooser();
        archivo.addChoosableFileFilter(filtro);
        archivo.setDialogTitle("Abrir Archivo");
        int ventana = archivo.showOpenDialog(null);
        if (ventana == JFileChooser.APPROVE_OPTION) 
        {
            File file = archivo.getSelectedFile();
            txtUrl.setText(String.valueOf(file));
            Image foto = getToolkit().getImage(txtUrl.getText());
            foto = foto.getScaledInstance(143, 143, Image.SCALE_DEFAULT);
            cjEscudo.setIcon(new ImageIcon(foto));
        }
    }
}
