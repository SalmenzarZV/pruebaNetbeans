/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaentornos;

/**
 * Clase cuya utilidad es añadir, borrar y mostrar los videojuegos y 
 * herramientas contenidos en las diferentes bibliotecas que nosotros añadamos
 * usando los métodos de las otras clases.
 * @see Clase Biblioteca
 * @author sergi
 */
public class SteamEntornos {
    //Campos de la clase
    static Videojuego vj = new Videojuego("NieR Automata", 27, "Hack'n'Slash", 50);
    static Videojuego vj2 = new Videojuego("Moonlighter", 10, "Rogue-lite", 20);
    static Videojuego vj3 = new Videojuego("Geometry Dash", 130, "Plataformas", 95);
    static Videojuego vj4 = new Videojuego("Tomb Raider", 30, "Acción y aventura", 80);
    
    static Herramienta h = new Herramienta("Wallpaper Engine", "Fotografía", "15/10/2020", 3.55);
    static Herramienta h2 = new Herramienta("GameMaker Studio 2", "Desarrollo de juegos", "1/1/2021", 83.00);
    static Herramienta h3 = new Herramienta("Desktop+", "Utilidad", "20/10/2020", 0.00);
    static Herramienta h4 = new Herramienta("Movavi", "Edición de foto", "15/10/2019", 30.00);
    
    static BiblioSteam biblioSergio = new BiblioSteam();
    public static void main(String[] args) {
        //Llamadas a los métodos
        biblioSergio.añadeVideojuego(vj);
        biblioSergio.añadeVideojuego(vj2);
        biblioSergio.añadeVideojuego(vj3);
        biblioSergio.añadeVideojuego(vj4);
        biblioSergio.añadeVideojuego(vj);
        
        biblioSergio.añadeHerramienta(h);
        biblioSergio.añadeHerramienta(h2);
        biblioSergio.añadeHerramienta(h3);
        biblioSergio.añadeHerramienta(h4);
        biblioSergio.añadeHerramienta(h);
        
        biblioSergio.dimeVideojuegos();
        biblioSergio.dimeHerramientas();
        biblioSergio.dimeBiblioteca();
    }  
}