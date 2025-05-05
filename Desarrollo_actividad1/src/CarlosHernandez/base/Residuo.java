/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarlosHernandez.base;
import java.util.Date;
import java.util.List;
/**
 *
 * @author Carlos
 */
public class Residuo {
    private int id;
    private String codigo;
    private double cantidad;
    private Date fechaGeneracion;
     private List<ConstituyenteQuimico> constituyentes;
    
    
    public Residuo() {}

    public Residuo(int id, String codigo, double cantidad, Date fechaGeneracion) {
        this.id = id;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.fechaGeneracion = fechaGeneracion;
    }
}
