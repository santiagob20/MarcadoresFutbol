/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionbd.pq1;

import java.sql.Connection;

/**
 *
 * @author Sala_12
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Conexion conect = new Conexion();
        Connection cx=conect.conectarse();
        
        if(cx == null){
            System.err.println("es null");
        }
    }
    
}
