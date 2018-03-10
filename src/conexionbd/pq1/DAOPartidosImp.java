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
import pq2.Partido;
import pq3.OperPartidos;
import pq4.JFHistorico;
import pq4.JFPartidosProg;

/**
 *
 * @author santiagob20
 */
public class DAOPartidosImp extends Conexion implements OperPartidos{

    @Override
    public void agregarPartido(Partido p) throws Exception 
    {
       conectarse();
        if (conectarse() != null) 
        {
            try 
            {
                PreparedStatement ps = c.prepareStatement("INSERT INTO partidos(equipo_fav, marcador_fav, tipo_fav, equipo_rival, marcador_rival, tipo_rival, estadio, fecha_partido, hora_partido) VALUES(?,?,?,?,?,?,?,?,?)");
                ps.setString(1, p.getEquipoFav());
                ps.setInt(2,p.getMarcadorFav());
                ps.setString(3,p.getTipoFav());
                ps.setString(4,p.getEquipoRival());
                ps.setString(5,p.getMarcadorRival());
                ps.setString(6,p.getTipoRival());
                ps.setString(7,p.getEstadio());
                ps.setString(8,p.getFecha());
                ps.setString(9,p.getHora());
                ps.executeUpdate();
            } 
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(null, "Sin Conexion a la Base de Datos",null,JOptionPane.ERROR_MESSAGE);
            }
        } 
    }

    @Override
    public void modificarPartido(Partido p) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Partido> consultarProgramados() throws Exception {
        
    ArrayList<Partido> lista = null;
        try
        {
            this.conectarse();
            PreparedStatement st = this.c.prepareStatement("SELECT * FROM partidos where cast(partidos.fecha_partido as date)>now()");
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            DefaultTableModel dfBuscar = new DefaultTableModel();
            JFPartidosProg.tblPartidosProg.setModel(dfBuscar);
            dfBuscar.setColumnIdentifiers(new Object[]{"Equipo Favorito","marcador","Tipo","Equipo Rival","Marcador","Tipo","Estadio","Fecha Partido"});
            while (rs.next()) 
            {
                dfBuscar.addRow(new Object[]{rs.getString("equipo_fav"),rs.getString("marcador_fav"),rs.getString("tipo_fav"),rs.getString("equipo_rival"),rs.getString("marcador_rival"),rs.getString("tipo_rival"),rs.getString("estadio"),rs.getString("fecha_partido")});
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al consultar","Error",JOptionPane.ERROR_MESSAGE );
        }finally
        {
           this.desconectarse();
        }
        
        return lista;
    }

    @Override
    public List<Partido> consultarHistorico() throws Exception {
    
        ArrayList<Partido> lista = null;
        try
        {
            this.conectarse();
            PreparedStatement st = this.c.prepareStatement("SELECT * FROM partidos where cast(partidos.fecha_partido as date)<now()");
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            DefaultTableModel dfBuscar = new DefaultTableModel();
            JFHistorico.tblHistorico.setModel(dfBuscar);
            dfBuscar.setColumnIdentifiers(new Object[]{"Equipo Favorito","marcador","Tipo","Equipo Rival","Marcador","Tipo","Estadio","Fecha Partido"});
            while (rs.next()) 
            {
                dfBuscar.addRow(new Object[]{rs.getString("equipo_fav"),rs.getInt("marcador_fav"),rs.getString("tipo_fav"),rs.getString("equipo_rival"),rs.getString("marcador_rival"),rs.getString("tipo_rival"),rs.getString("estadio"),rs.getString("fecha_partido")});
            }
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Error al consultar","Error",JOptionPane.ERROR_MESSAGE );
            throw ex;
        }
        finally
        {
           this.desconectarse();
        }
        return lista;

   
    
    }
}
