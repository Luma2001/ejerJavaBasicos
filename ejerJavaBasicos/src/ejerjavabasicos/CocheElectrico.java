/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerjavabasicos;

/**
 *
 * @author carter
 */
public class CocheElectrico extends Coche{
    
    //Atributos
    String motorElectrico;

    //Constructor Vacio
    public CocheElectrico() {
    }

    
    //Constructor con parámetro propio
    public CocheElectrico(String motorElectrico) {
        this.motorElectrico = motorElectrico;
    }

    //Constructor con todos los parametros propios y heredados
    public CocheElectrico(String motorElectrico, String color, String fabricante, String modelo, Double peso, Double largo) {
        super(color, fabricante, modelo, peso, largo);
        this.motorElectrico = motorElectrico;
    }

    @Override
    public void acelerar(Integer cantidad) {
        Integer cantidadAjustada=cantidad*2;
        super.acelerar(cantidadAjustada); // sobreescribimos método de clase padre
    }

     
    
    
    @Override
    public String toString() {
        return "CocheElectrico{" + "motorElectrico=" + motorElectrico + ", color=" + color + ", fabricante=" + fabricante + ", modelo=" + modelo + ", peso=" + peso + ", largo=" + largo + ", velocidad=" + velocidad + '}';
    }
 
    
    
    
    
    
}
