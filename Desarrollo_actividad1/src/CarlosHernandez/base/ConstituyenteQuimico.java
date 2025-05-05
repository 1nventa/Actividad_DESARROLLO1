/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarlosHernandez.base;

/**
 *
 * @author Carlos
 */
public class ConstituyenteQuimico {
    private int id;
    private String nombre;
    private double proporcion;
    
     public ConstituyenteQuimico() {}

    public ConstituyenteQuimico(int id, String nombre, double proporcion) {
        this.id = id;
        this.nombre = nombre;
        this.proporcion = proporcion;
    }
}
