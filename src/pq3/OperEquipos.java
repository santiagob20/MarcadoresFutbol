/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pq3;

import java.util.List;
import pq2.Equipo;

/**
 *
 * @author santiagob20
 */
public interface OperEquipos {
    
    public void insertar(Equipo e) throws Exception;
    public void borrar(Equipo e) throws Exception;
    public void editar(Equipo e) throws Exception;
    public List<Equipo> consultarT() throws Exception;
    public void consulta(int pk) throws Exception;
    
    
}
