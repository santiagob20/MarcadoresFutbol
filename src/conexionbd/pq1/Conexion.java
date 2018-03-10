/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionbd.pq1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sala_12
 */
public class Conexion 
{    
    public static Connection c;
    public Connection conectarse()
    {
        try 
        {
            String usu = "equiposusu";
            String clave = "laclave";
            
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/equiposbd",usu,clave);
            System.out.println("Conexion !!!");
            return c;
       
            
        } catch (ClassNotFoundException ex) {
            System.err.println("Error al conectarse  "+ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    public void desconectarse() throws SQLException{
     
        if(c!=null){
            if(!c.isClosed()){
                c.close();
            }
        }
    }
}
