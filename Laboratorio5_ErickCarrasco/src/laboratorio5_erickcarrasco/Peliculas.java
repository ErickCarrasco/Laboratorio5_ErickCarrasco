/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio5_erickcarrasco;

/**
 *
 * @author erick
 */
public class Peliculas {
    private String nombrep;
    private int duracion;
    private String clasificacion;
    private String categoria;

    public Peliculas() {
    }

    public Peliculas(String nombrep, int duracion, String clasificacion, String categoria) {
        this.nombrep = nombrep;
        this.duracion = duracion;
        this.clasificacion = clasificacion;
        this.categoria = categoria;
    }

    public String getNombrep() {
        return nombrep;
    }

    public void setNombrep(String nombrep) {
        this.nombrep = nombrep;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "" + "nombre pelicula: " + nombrep + " duracion " + duracion + " mins "+" clasificacion "
                + clasificacion ;
    }
    
    
    
    
}
