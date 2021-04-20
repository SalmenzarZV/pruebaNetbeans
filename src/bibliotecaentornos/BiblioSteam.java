/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaentornos;

import java.util.ArrayList;

/**
 * Esta clase contiene dos objetos que contedran todos los objetos videojuegos 
 * y/o herramientas que queramos introducirle
 * @see Clase Videojuego
 * @see Clase Herramienta
 * @author sergi
 */
public class BiblioSteam {
    //Campos de la clase
    ArrayList<Videojuego> videojuegos;
    ArrayList<Herramienta> herramientas;
    /**
     * Constructor para la Biblioteca
     */
    public BiblioSteam(){
        videojuegos = new ArrayList<Videojuego>();
        herramientas = new ArrayList<Herramienta>();
    }
    /**
     * Método al que le pasamos un objeto de tipo Videojuego y lo inserta en la 
     * lista de videojuegos de la biblioteca si este juego aún no está contenido
     * en la biblioteca. También muestra por consola si se ha añadido el 
     * videojuego o no.
     * @param vj 
     */
    public void añadeVideojuego(Videojuego vj){
        if (!videojuegos.contains(vj)) {
            videojuegos.add(vj);
            System.out.println(vj.getNombre()+" añadido a su biblioteca");
        } else System.out.println("Ya tiene este producto");
        
    }
    /**
     * Método al que le pasamos un objeto de tipo Herramienta y lo inserta en la 
     * lista de herramientas de la biblioteca si esta herramienta aún no está 
     * contenida en la biblioteca. También muestra por consola si se ha añadido 
     * el videojuego o no.
     * @param h 
     */
    public void añadeHerramienta(Herramienta h){
        if (!herramientas.contains(h)) {
            herramientas.add(h);
            System.out.println(h.getNombre()+" añadido a su biblioteca");
        } else System.out.println("Ya tiene este producto");
    }
    /**
     * Borra un videojuego dado de la lista de videojuegos de la biblioteca si 
     * este está contenido en esta lista. También devuelve por consola si se ha 
     * borrado o no el videojuego
     * @param vj 
     */
    public void borraVideojuego(Videojuego vj){
        if (videojuegos.contains(vj)) {
            videojuegos.remove(vj);
            System.out.println(vj.getNombre()+" ha sido eliminado de su biblioteca");
        } else System.out.println("No tiene este producto");
    }
    /**
     * Borra una Herramienta dada de la lista de videojuegos de la biblioteca  
     * si esta está contenido en esta lista. También devuelve por consola si se 
     * ha borrado o no el videojuego
     * @param h 
     */
    public void borraHerramienta(Herramienta h){
        if (herramientas.contains(h)) {
            herramientas.remove(h);
            System.out.println(h.getNombre()+" ha sido eliminado de su biblioteca");
        } else System.out.println("No tiene este producto");
    }
    /**
     * Método que devuelve por consola todos los videojuegos que posee la
     * biblioteca
     */
    public void dimeVideojuegos(){
        for (int i = 0; i < videojuegos.size(); i++) {
            System.out.println("||"+videojuegos.get(i).getNombre()+"||");
            System.out.println("Genero: "+videojuegos.get(i).getGenero());
            System.out.println("Horas: "+videojuegos.get(i).getHoras()+"h");
            System.out.println("Logros: "+videojuegos.get(i).getPorcentajeLogros()+"%");
            System.out.println("--------------------------------------------");
        }
    }
    /**
     * Método que devuelve por consola todas las herramientas que posee la 
     * biblioteca
     */
    public void dimeHerramientas(){
        for (int i = 0; i < herramientas.size(); i++) {
            System.out.println("||"+herramientas.get(i).getNombre()+"||");
            System.out.println("Uso: "+herramientas.get(i).getUso());
            System.out.println("Fecha de compra: "+herramientas.get(i).getFechaCompra());
            System.out.println("Adquirido por: "+herramientas.get(i).getPrecioCompra()+"€");
            System.out.println("--------------------------------------------");
        }
    }
    /**
     * Método que devuelve por consola tanto los videojuegos como las 
     * herramientas que contiene la biblioteca
     */
    public void dimeBiblioteca(){
        System.out.println("/*--------VIDEOJUEGOS--------*/");
        dimeVideojuegos();
        System.out.println("/*--------HERRAMIENTAS--------*/");
        dimeHerramientas();
    }
    
    
}
