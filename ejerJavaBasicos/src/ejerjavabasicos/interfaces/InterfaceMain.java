/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerjavabasicos.interfaces;

import ejerjavabasicos.Coche;

/**
 *
 * @author carter
 */
public class InterfaceMain {
    public static void main(String[] args) {
        CocheService service02=new CocheServiceClassicImpl();
        
        CocheService service03=new CocheServiceSportImpl();
        
        Coche CocheA = service03.crearCocheDemo();
        
        Coche CocheB = service02.crearCocheDemo();
        
        
        
        
    }       
}
