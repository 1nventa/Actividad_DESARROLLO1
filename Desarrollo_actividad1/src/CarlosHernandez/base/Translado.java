/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarlosHernandez.base;
import java.util.Date;
/**
 *
 * @author Carlos
 */
public class Translado {
    private int id;
    private double cantidad;
    private Date fechaSalida;
    private Date fechaLlegada;
    private double distanciaKm;
    private double costo;
    
   
     public Translado() {}

    public Translado(int id, double cantidad, Date fechaSalida, Date fechaLlegada, double distanciaKm, double costo) {
        this.id = id;
        this.cantidad = cantidad;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
        this.distanciaKm = distanciaKm;
        this.costo = costo;
        
    }
}
