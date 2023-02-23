/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerjavabasicos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carter
 */
public class Listas {
    
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>(); //creamos una lista dinámica de Strings
    
        //Agregamos elementos a la lista 
        
        nombres.add("Nombre 01");
        nombres.add("Nombre 02");
        nombres.add("Nombre 03");
        nombres.add("Nombre 04");
        nombres.add("Nombre 05");
        nombres.add("Nombre 06");
        
        //Impresión por consola
        
        System.out.println(nombres);
        
        for(String nombre:nombres){//nombre es una variable temporal
            System.out.println(nombre);
        }
        
        
        List<Coche> coches = new ArrayList<>();
        
        coches.add(new Coche("Rojo", "Honda", "Civic",1450.45, 4.5));
        coches.add(new Coche("Verde", "Honda", "Civic",1450.45, 4.5));
        coches.add(new Coche("Azul", "Honda", "Civic",1450.45, 4.5));
        
        System.out.println(coches);
        
        
        for(Coche coche:coches){
            System.out.println(coche);
        }
        
        
              
    
    
    
    
    }
    
}
