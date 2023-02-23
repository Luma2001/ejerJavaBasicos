/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerjavabasicos;

/**
 *
 * @author carter
 */


//Creando Clases
public class Coche {
    
    //atributos
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    
    Integer velocidad = 0;
    
    
    //Constructor: métodos especiales que permite crear objetos de la clase
    //Vacio: nos permite crear objetos, sin asignar valor a los parámetros
    public Coche() {
    }

   //con parametros
    public Coche(String color, String fabricante, String modelo, Double peso, Double largo) {
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
    }
    
    
    //Comportamientos
    
    public void acelerar(Integer cantidad){
        if(cantidad>0 && cantidad<=120){
          this.velocidad += cantidad;  
        }
        
    }

    @Override
    public String toString() {
        return "Coche{" + "color=" + color + ", fabricante=" + fabricante + ", modelo=" + modelo + ", peso=" + peso + ", largo=" + largo + ", velocidad=" + velocidad + '}';
    }
    
    
    
    
    
    
    
    
    
}
