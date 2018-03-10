/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pq2;

/**
 *
 * @author santiagob20
 */
public class Partido {
    
    private int codigo;
    private String equipoFav;
    private int marcadorFav;
    private String tipoFav;
    private String equipoRival;
    private String marcadorRival;
    private String tipoRival;
    private String estadio;
    private String fecha;
    private String hora;

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the equipoFav
     */
    public String getEquipoFav() {
        return equipoFav;
    }

    /**
     * @param equipoFav the equipoFav to set
     */
    public void setEquipoFav(String equipoFav) {
        this.equipoFav = equipoFav;
    }

    /**
     * @return the marcadorFav
     */
    public int getMarcadorFav() {
        return marcadorFav;
    }

    /**
     * @param marcadorFav the marcadorFav to set
     */
    public void setMarcadorFav(int marcadorFav) {
        this.marcadorFav = marcadorFav;
    }

    /**
     * @return the tipoFav
     */
    public String getTipoFav() {
        return tipoFav;
    }

    /**
     * @param tipoFav the tipoFav to set
     */
    public void setTipoFav(String tipoFav) {
        this.tipoFav = tipoFav;
    }

    /**
     * @return the equipoRival
     */
    public String getEquipoRival() {
        return equipoRival;
    }

    /**
     * @param equipoRival the equipoRival to set
     */
    public void setEquipoRival(String equipoRival) {
        this.equipoRival = equipoRival;
    }

    /**
     * @return the marcadorRival
     */
    public String getMarcadorRival() {
        return marcadorRival;
    }

    /**
     * @param marcadorRival the marcadorRival to set
     */
    public void setMarcadorRival(String marcadorRival) {
        this.marcadorRival = marcadorRival;
    }

    /**
     * @return the tipoRival
     */
    public String getTipoRival() {
        return tipoRival;
    }

    /**
     * @param tipoRival the tipoRival to set
     */
    public void setTipoRival(String tipoRival) {
        this.tipoRival = tipoRival;
    }

    /**
     * @return the estadio
     */
    public String getEstadio() {
        return estadio;
    }

    /**
     * @param estadio the estadio to set
     */
    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }
}
