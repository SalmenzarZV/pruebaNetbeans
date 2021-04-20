/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaentornos;

/**
 *
 * @author sergi
 */
public class Videojuego {
    //Campos de la clase
    String nombre;
    int horas;
    String genero;
    int porcentajeLogros;
    /**
     * Constructor para la clase Videojuego
     * @param nombre El parámetro nombre define el nombre del videojuego
     * @param horas El parámetro horas define las horas que ha sido jugado el videojuego
     * @param genero El parámetro genero indica a que género pertenece el videojuego (ejemplo: lucha, acción...)
     * @param porcentajeLogros El parámetro define el porcentaje de logros que ha conseguido el jugador
     */
    public Videojuego(String nombre, int horas, String genero, int porcentajeLogros) {
        this.nombre = nombre;
        this.horas = horas;
        this.genero = genero;
        this.porcentajeLogros = porcentajeLogros;
    }
    /**
     * Método que devuelve el género del videojuego
     * @return El género del videojuego
     */
    public String getGenero() {
        return genero;
    }
    /**
     * Método que devuelve el nombre del videojuego
     * @return El nombre del videojuego
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Le asigna un valor a la variable nombre a través de un parámetro
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Método que devuelve las horas que ha sido jugado el videojuego
     * @return Las horas que ha sido jugado el videojuego
     */
    public int getHoras() {
        return horas;
    }
    /**
     * Le asigna un valor a la variable horas a través de un parámetro
     * @param horas 
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }
    /**
     * Le asigna un valor a la variable genero a través de un parámetro
     * @param genero 
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
    /**
     * Método que devuelve el porcentaje de los logros conseguidos
     * @return El porcentaje de los logros conseguidos
     */
    public int getPorcentajeLogros() {
        return porcentajeLogros;
    }
    /**
     * Le asigna un valor a la variable porcentajeLogros a través de un parámetro
     * @param porcentajeLogros 
     */
    public void setPorcentajeLogros(int porcentajeLogros) {
        this.porcentajeLogros = porcentajeLogros;
    }
}
