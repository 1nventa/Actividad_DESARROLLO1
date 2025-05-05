/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarlosHernandez.base;

/**
 *
 * @author Carlos
 */
public class Productor {
    private int id;
    private String nombre;
    private String direccion;
    private String tipoActividad;
    
    // Constructor vacío
    public Productor() {}

    // Constructor con parámetros
    public Productor(int id, String nombre, String direccion, String tipoActividad) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipoActividad = tipoActividad;
    }
}
