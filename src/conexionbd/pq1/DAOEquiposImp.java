/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionbd.pq1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pq2.Equipo;
import pq3.OperEquipos;
import pq4.JFPrincipal;
import pq4.JFVerEquipo;

/**
 *
 * @author santiagob20
 */
public class DAOEquiposImp extends Conexion implements OperEquipos{

    @Override
    public void insertar(Equipo e) throws SQLException
    {
       conectarse();
        if (conectarse() != null) 
        {
            FileInputStream archivofotos;
            try 
            {
                PreparedStatement ps = c.prepareStatement("INSERT INTO equipos(nombre, estadio, fechacreacion,nombreimagen,imagen) VALUES(?,?,?,?,?)");
                ps.setString(1, e.getNombre());
                ps.setString(2, e.getEstadio());
                ps.setInt(3, e.getFechaCreacion());
                ps.setString(4,e.getNombreImagen());
                try {
                    archivofotos = new FileInputStream(e.getNombreImagen());
                    ps.setBinaryStream(5, archivofotos);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(DAOEquiposImp.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                ps.executeUpdate();
            } 
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(null, "Sin Conexion a la Base de Datos",null,JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }
    
    public int insertarS (Equipo e)
    {
        PreparedStatement ps = null;
        int rta = 0;
        conectarse();
        if (conectarse() != null) 
        {
            try 
            {
                ps = c.prepareStatement("INSERT INTO equipos(nombre, estadio) VALUES(?,?)");
                ps.setString(1, e.getNombre());
                ps.setString(2, e.getEstadio());
                rta = ps.executeUpdate();
            } 
            catch (SQLException ex) 
            {
                
            }
        }
        return rta;
    }

    @Override
    public void borrar(Equipo e) throws Exception 
    {
        try{
           this.conectarse();
           PreparedStatement st = this.c.prepareStatement("DELETE FROM Equipos WHERE codigo = ?");
           st.setInt(1, e.getCodigo());
           st.executeUpdate();
       } catch(SQLException ex){
           throw ex;
       }finally{
           this.desconectarse();
       }   
    }

    @Override
    public void editar(Equipo e) throws Exception 
    {
        conectarse();
        if (conectarse() != null) 
        {
            try
                {
                    PreparedStatement st = this.c.prepareStatement("UPDATE equipos SET nombre = ?, estadio = ?, fechacreacion = ?, nombreimagen = ? WHERE codigo = 1");
                    st.setString(1, e.getNombre());
                    st.setString(2, e.getEstadio());
                    st.setInt(3, e.getFechaCreacion());
                    st.setString(4,e.getNombreImagen());
                    st.executeUpdate();    
                } 
                catch(SQLException ex)
                {
                   throw ex;
                }
                finally
                {
                       this.desconectarse();
                }
        }
    }    

    @Override
    public List<Equipo> consultarT() throws Exception 
    {
         ArrayList<Equipo> lista = null;
        try
        {
            this.conectarse();
            PreparedStatement st = this.c.prepareStatement("SELECT * FROM equipos where codigo=1");
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            //DefaultTableModel dfBuscar = new DefaultTableModel();
            //JFVerEquipo.jTable.setModel(dfBuscar);
            //dfBuscar.setColumnIdentifiers(new Object[]{"codigo","nombre","estadio","fechacreacion"});
            while (rs.next()) 
            {
                JFVerEquipo.cjNombre.setText(rs.getString("nombre"));
                JFVerEquipo.cjEstadio.setText(rs.getString("estadio"));
                JFVerEquipo.cjFechaCreacion.setText(rs.getString("fechacreacion"));
                //dfBuscar.addRow(new Object[]{rs.getInt("codigo"), rs.getString("nombre"), rs.getString("estadio"), rs.getInt("fechacreacion")});
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
    

    @Override
    public void consulta(int pk) throws Exception 
    {
        
    }
    
    public String consultaUrl() throws SQLException 
    {
        String a = null;
        try
        {
            this.conectarse();
            PreparedStatement st = this.c.prepareStatement("SELECT * FROM equipos where codigo=1");
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) 
            {
                a = rs.getString("nombreimagen");

            }
     

    
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Error SQL", "Error",JOptionPane.ERROR_MESSAGE);
        }
        return a;
    }
    
}
