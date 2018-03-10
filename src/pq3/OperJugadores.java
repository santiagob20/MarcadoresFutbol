/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pq3;

import java.util.List;
import pq2.Jugador;

/**
 *
 * @author santiagob20
 */
public interface OperJugadores {
    
    public void crearJugador(Jugador j) throws Exception;
    public void borrarjugador(Jugador j) throws Exception;
    public void modificarJugador(Jugador j) throws Exception;
    public List<Jugador> consultarT() throws Exception;
}
