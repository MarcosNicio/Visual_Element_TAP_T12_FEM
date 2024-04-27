/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FiltroInterfaz;

/**
 *
 * @author Fercr
 */
public class Elemento {
    private String id;
    private String nombre;
    private String fechaUltimaDonacion;
    private String tipoSangre;
    private String direccion;
    private boolean elegible;

    public Elemento(String id, String nombre, String fechaUltimaDonacion, String tipoSangre, String direccion, boolean elegible) {
        this.id = id;
        this.nombre = nombre;
        this.fechaUltimaDonacion = fechaUltimaDonacion;
        this.tipoSangre = tipoSangre;
        this.direccion = direccion;
        this.elegible = elegible;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Fecha de ultima donación
    public String getFecha() {
        return fechaUltimaDonacion;
    }

    public void setFechaUltimaDonacion(String fechaUltimaDonacion) {
        this.fechaUltimaDonacion = fechaUltimaDonacion;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isElegible() {
        return elegible;
    }

    public void setElegible(boolean elegible) {
        this.elegible = elegible;
    }
    
    public String formatElemento(){
        return String.format("ID: %s, Nombre: %s, Fecha Última Donación: %s, Tipo de Sangre: %s, Dirección: %s, Es elegible: %s\n",
                getId(), getNombre(), getFecha(), getTipoSangre(), getDireccion(), isElegible() ? "Sí" : "No");
    }
    

    
    
    
}
