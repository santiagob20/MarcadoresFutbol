/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pq3;

import java.util.List;
import pq2.Partido;

/**
 *
 * @author santiagob20
 */
public interface OperPartidos {
    
    public void agregarPartido(Partido p) throws Exception;
    public void modificarPartido(Partido p) throws Exception;
    public List<Partido> consultarProgramados() throws Exception;
    public List<Partido> consultarHistorico() throws Exception;
}
