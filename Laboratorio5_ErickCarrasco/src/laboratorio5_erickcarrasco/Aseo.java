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
public class Aseo {
    private String nombre_aseo;
    private String descripcion;
    private String funcion;

    public Aseo() {
    }

    public Aseo(String nombre_aseo, String descripcion, String funcion) {
        this.nombre_aseo = nombre_aseo;
        this.descripcion = descripcion;
        this.funcion = funcion;
    }

    public String getNombre_aseo() {
        return nombre_aseo;
    }

    public void setNombre_aseo(String nombre_aseo) {
        this.nombre_aseo = nombre_aseo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    @Override
    public String toString() {
        return "" + "Instrumento de limpieza " + nombre_aseo + " descripcion " + descripcion ;
    }
    
    
    
}
