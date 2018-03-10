/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pq4;

import conexionbd.pq1.DAOEquiposImp;
import conexionbd.pq1.DAOJugadoresImp;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import pq2.Equipo;
import static pq4.JFPrincipal.cjEscudo;

/**
 *
 * @author santiagob20
 */
public class JFVerEquipo extends javax.swing.JFrame {

    /**
     * Creates new form JFVerEquipo
     */
    
    static JFVerEquipo jf = new JFVerEquipo();
    DAOEquiposImp d = new DAOEquiposImp();
    public JFVerEquipo() {
        initComponents();
        try {
            
           
            Image foto = getToolkit().getImage(d.consultaUrl());
            System.out.println(d.consultaUrl());
            foto = foto.getScaledInstance(143, 143, Image.SCALE_DEFAULT);
            cjEscudo.setIcon(new ImageIcon(foto));
            
        } catch (SQLException ex) {
            Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setSize(new Dimension(705, 391));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cjFechaCreacion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cjEstadio = new javax.swing.JTextField();
        cjNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cjEscudo = new javax.swing.JLabel();
        btnVerJugadores = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnExaminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtVerEquiposURL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        cjFechaCreacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjFechaCreacionActionPerformed(evt);
            }
        });
        getContentPane().add(cjFechaCreacion);
        cjFechaCreacion.setBounds(210, 170, 120, 30);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("AÑO CREACIÓN");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 180, 99, 16);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ESTADIO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 140, 55, 16);

        cjEstadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjEstadioActionPerformed(evt);
            }
        });
        getContentPane().add(cjEstadio);
        cjEstadio.setBounds(210, 130, 120, 30);

        cjNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjNombreActionPerformed(evt);
            }
        });
        getContentPane().add(cjNombre);
        cjNombre.setBounds(210, 90, 120, 30);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("EQUIPO");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(130, 100, 47, 16);
        getContentPane().add(cjEscudo);
        cjEscudo.setBounds(430, 70, 140, 140);

        btnVerJugadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pq4/Imagenes/btn_VerJug.png"))); // NOI18N
        btnVerJugadores.setBorderPainted(false);
        btnVerJugadores.setContentAreaFilled(false);
        btnVerJugadores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerJugadoresActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerJugadores);
        btnVerJugadores.setBounds(130, 320, 150, 40);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pq4/Imagenes/btn_guardar.png"))); // NOI18N
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(430, 320, 150, 40);

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
        btnExaminar.setBounds(430, 220, 150, 40);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cargar imagen de 143px * 143px");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(400, 260, 220, 30);

        txtVerEquiposURL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pq4/Imagenes/subpanel.png"))); // NOI18N
        getContentPane().add(txtVerEquiposURL);
        txtVerEquiposURL.setBounds(0, 0, 704, 390);

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(410, 290, 200, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cjFechaCreacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cjFechaCreacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cjFechaCreacionActionPerformed

    private void cjEstadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cjEstadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cjEstadioActionPerformed

    private void cjNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cjNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cjNombreActionPerformed

    private void btnVerJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerJugadoresActionPerformed
        // TODO add your handling code here:
        jf.setVisible(false);
        JFJugadores jfj = new JFJugadores();
        jfj.setVisible(true);
        DAOJugadoresImp jg = new DAOJugadoresImp();
        try {
            jg.consultarT();
        } catch (Exception ex) {
            Logger.getLogger(JFVerEquipo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnVerJugadoresActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        actualizar();
        
        
        jf.setVisible(false);
        JFPrincipal jfc = new JFPrincipal();
        jfc.setVisible(true);
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        jf.setVisible(false);
        
        JFPrincipal jfc = new JFPrincipal();
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
            java.util.logging.Logger.getLogger(JFVerEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFVerEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFVerEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFVerEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jf.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnExaminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVerJugadores;
    private javax.swing.JLabel cjEscudo;
    public static javax.swing.JTextField cjEstadio;
    public static javax.swing.JTextField cjFechaCreacion;
    public static javax.swing.JTextField cjNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel txtVerEquiposURL;
    // End of variables declaration//GEN-END:variables

    private void actualizar() 
    {
        
        try 
        {
            DAOEquiposImp E = new DAOEquiposImp();
            Equipo e =new Equipo();
            e.setNombre(cjNombre.getText());
            e.setEstadio(cjEstadio.getText());
            e.setFechaCreacion(Integer.parseInt(cjFechaCreacion.getText()));
            e.setNombreImagen(txtVerEquiposURL.getText());
            E.editar(e);
            JOptionPane.showMessageDialog(null, "Registro Actualizado", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(JFVerEquipo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
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
            txtVerEquiposURL.setText(String.valueOf(file));
            Image foto = getToolkit().getImage(txtVerEquiposURL.getText());
            foto = foto.getScaledInstance(143, 143, Image.SCALE_DEFAULT);
            cjEscudo.setIcon(new ImageIcon(foto));
        }
    }
    
}
