/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaentornos;

/**
 * Esta clase contiene los atributos y métodos que tendra el objeto herramientas
 * @author sergi
 */
public class Herramienta {
    //campos de la clase
    String nombre;
    String uso;
    String fechaCompra;
    double precioCompra;
    
    /**
     * Constructor de la clase Herramienta
     * @param nombre El parámetro nombre define el nombre de la herramienta.
     * @param uso El paámetro uso define el tipo de utilidad para la que esta pensada la herramienta.
     * @param fechaCompra El parámetro fechaCompra define en que fecha se realizó la compra. 
     * @param precioCompra El parámetro precioCompra define el valor por el que fue adquirida la herramienta
     */
    public Herramienta(String nombre, String uso, String fechaCompra, double precioCompra) {
        this.nombre = nombre;
        this.uso = uso;
        this.fechaCompra = fechaCompra;
        this.precioCompra = precioCompra;
    }
    /**
     * Método que devuelve el nombre de la herramienta
     * @return El nombre de la herramienta
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Método que asigna a la variable nombre un valor dado por un parámetro 
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Método que devuelve el tipo de utilidad que tiene la herramienta
     * @return La utilidad de la herramienta
     */
    public String getUso() {
        return uso;
    }
/**
 * Método que asigna a la variable uso un valor dado por un parámetro
 * @param uso 
 */
    public void setUso(String uso) {
        this.uso = uso;
    }
    
    /**
     * Método que devuelve la fecha de compra de la herramienta
     * @return La fecha de compra de la herramienta
     */
    public String getFechaCompra() {
        return fechaCompra;
    }
    /**
     * Método que asigna a la variable fechaCompra un valor dado por un parámetro
     * @param fechaCompra 
     */
    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    
    /**
     * Método que devuelve el valor por el que se adquirió de la herramienta
     * @return El valor de adquisición de la herramienta
     */
    public double getPrecioCompra() {
        return precioCompra;
    }
    /**
     * Método que asigna a la variable precioCompra un valor dado por un parámetro
     * @param precioCompra 
     */
    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }
}
