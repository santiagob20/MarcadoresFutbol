/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionbd.pq1;

import static conexionbd.pq1.Conexion.c;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pq2.Jugador;
import pq3.OperJugadores;
import pq4.JFJugadores;

/**
 *
 * @author santiagob20
 */
public class DAOJugadoresImp extends Conexion implements OperJugadores{

    @Override
    public void crearJugador(Jugador j) 
    {
        conectarse();
        if (conectarse() != null) 
        {
            try 
            {
                PreparedStatement ps = c.prepareStatement("INSERT INTO jugadores(nombre_jugador, numero_jugador, posicion_campo) VALUES(?,?,?)");
                ps.setString(1,j.getNombre());
                ps.setString(2,j.getNumero());
                ps.setString(3,j.getPosicion());
                ps.executeUpdate();
            } 
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(null, "Sin Conexion a la Base de Datossss",null,JOptionPane.ERROR_MESSAGE);
            }
        }    
    }

    @Override
    public void borrarjugador(Jugador j) throws Exception 
    {
        
    
    }

    @Override
    public void modificarJugador(Jugador j) throws Exception 
    {
        conectarse();
        if (conectarse() != null) 
        {
            try 
            {
                PreparedStatement ps = c.prepareStatement("UPDATE jugadores(nombre_jugador, numero_jugador, posicion_campo) VALUES(?,?,?) WHERE codigo = 1");
                ps.setString(1, j.getNombre());
                ps.setString(2, j.getNumero());
                ps.setString(3, j.getPosicion());
                
                ps.executeUpdate();
            } 
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(null, "Sin Conexion a la Base de Datos",null,JOptionPane.ERROR_MESSAGE);
            }
        }   
    }

    @Override
    public List<Jugador> consultarT() throws Exception 
    {
        ArrayList<Jugador> lista = null;
        try
        {
            this.conectarse();
            PreparedStatement st = this.c.prepareStatement("SELECT * FROM jugadores");
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            DefaultTableModel dfBuscar = new DefaultTableModel();
            JFJugadores.tblJugadores.setModel(dfBuscar);
            dfBuscar.setColumnIdentifiers(new Object[]{"codigo","nombre_jugador","numero_jugador","posicion_campo"});
            while (rs.next()) 
            {
                dfBuscar.addRow(new Object[]{rs.getString("codigo"),rs.getString("nombre_jugador"), rs.getInt("numero_jugador"), rs.getString("posicion_campo")});
            }     
    }
         
        catch(SQLException ex)
        {
           throw ex;
       }
        finally
        {
           this.desconectarse();
       }
        return lista;
    }
    
}
