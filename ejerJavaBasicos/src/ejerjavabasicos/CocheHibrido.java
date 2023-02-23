/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerjavabasicos;

/**
 *
 * @author carter
 */
public class CocheHibrido extends Coche{
    
    //Atributos
    String motorHibrido;
    
    //Constructor vacío
    public CocheHibrido() {
    }

    //Constructor con parámetro propio
    public CocheHibrido(String motorHibrido) {
        this.motorHibrido = motorHibrido;
    }

    
    //Constructor con parámetro propio y heredados
    public CocheHibrido(String motorHibrido, String color, String fabricante, String modelo, Double peso, Double largo) {
        super(color, fabricante, modelo, peso, largo);
        this.motorHibrido = motorHibrido;
    }

    @Override
    public String toString() {
        return "CocheHibrido{" + "motorHibrido=" + motorHibrido + ", color=" + color + ", fabricante=" + fabricante + ", modelo=" + modelo + ", peso=" + peso + ", largo=" + largo + ", velocidad=" + velocidad + '}';
    }
    
    
    
    
    
}
