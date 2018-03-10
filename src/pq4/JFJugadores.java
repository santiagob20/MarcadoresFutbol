/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pq4;


import conexionbd.pq1.Conexion;
import static conexionbd.pq1.Conexion.c;
import conexionbd.pq1.DAOEquiposImp;
import conexionbd.pq1.DAOJugadoresImp;
import java.awt.Dimension;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pq2.Jugador;

/**
 *
 * @author santiagob20
 */
public class JFJugadores extends javax.swing.JFrame {

    /**
     * Creates new form JFHistorico
     */
    static JFJugadores jf = new JFJugadores();
    public JFJugadores() {
        initComponents();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblJugadores = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cjNombre = new javax.swing.JTextField();
        cjNumero = new javax.swing.JTextField();
        cjPosicion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tblJugadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "codigo", "nombreJugador", "numeroJugador", "posicionCampo"
            }
        ));
        tblJugadores.setToolTipText("");
        tblJugadores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tblJugadores);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(300, 20, 390, 230);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pq4/Imagenes/btn_guardar.png"))); // NOI18N
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
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

        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pq4/Imagenes/btn_crear.png"))); // NOI18N
        btnCrear.setBorderPainted(false);
        btnCrear.setContentAreaFilled(false);
        btnCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrear);
        btnCrear.setBounds(80, 260, 160, 50);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("INFORMACION DEL EQUIPO");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 90, 220, 40);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NUMERO DEL JUGADOR");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 190, 150, 16);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("POSICION EN EL CAMPO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 230, 160, 16);

        cjNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjNombreActionPerformed(evt);
            }
        });
        getContentPane().add(cjNombre);
        cjNombre.setBounds(170, 140, 120, 30);

        cjNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjNumeroActionPerformed(evt);
            }
        });
        getContentPane().add(cjNumero);
        cjNumero.setBounds(170, 180, 120, 30);

        cjPosicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjPosicionActionPerformed(evt);
            }
        });
        getContentPane().add(cjPosicion);
        cjPosicion.setBounds(170, 220, 120, 30);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NOMBRE DEL JUGADOR");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 150, 150, 16);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pq4/Imagenes/subpanel.png"))); // NOI18N
        getContentPane().add(Fondo);
        Fondo.setBounds(0, 0, 704, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cjNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cjNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cjNombreActionPerformed

    private void cjNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cjNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cjNumeroActionPerformed

    private void cjPosicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cjPosicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cjPosicionActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here
        crear();
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        
        Modificar();
        jf.setVisible(false);
        JFPrincipal jfc = new JFPrincipal();
        jfc.setVisible(true);
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        jf.setVisible(false);
        JFVerEquipo jfc = new JFVerEquipo();
        jfc.setVisible(true);
         DAOEquiposImp E = new DAOEquiposImp();
        try 
        {
            E.consultarT();
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(JFJugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFJugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFJugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFJugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JTextField cjNombre;
    private javax.swing.JTextField cjNumero;
    private javax.swing.JTextField cjPosicion;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tblJugadores;
    // End of variables declaration//GEN-END:variables

    private void crear(){
        try
        {  
            Jugador j = new Jugador();
            DAOJugadoresImp jg = new DAOJugadoresImp();
            
            j.setNombre(cjNombre.getText());
            j.setNumero(cjNumero.getText());
            j.setPosicion(cjPosicion.getText());
            jg.crearJugador(j);
            jg.consultarT();
            JOptionPane.showMessageDialog(null,"Jugador agregado exitosamente","Informacion",JOptionPane.INFORMATION_MESSAGE);
           
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informacion Errada", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void Modificar(){
        DefaultTableModel tbl = new DefaultTableModel();
        Jugador j = new Jugador();
        
        try
        {
            for (int i = 0; i < tbl.getRowCount(); i++) {
                PreparedStatement ps = c.prepareStatement("UPDATE jugadores set nombre_jugador=?,numero_jugador=?, posiciom_campo=?  WHERE codigo = ?");
                ps.setString(1, tbl.getValueAt(i,1).toString());
                ps.setString(2, tbl.getValueAt(i,2).toString());
                ps.setString(3, tbl.getValueAt(i,3).toString());
                ps.setString(4, tbl.getValueAt(i,0).toString());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Actualizado correctamente","Informacion",JOptionPane.INFORMATION_MESSAGE);
        }
        }catch(Exception ex) {
            Logger.getLogger(JFJugadores.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
}