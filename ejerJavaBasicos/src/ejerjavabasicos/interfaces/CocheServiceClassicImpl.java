/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerjavabasicos.interfaces;

import ejerjavabasicos.Coche;
import ejerjavabasicos.CocheElectrico;

/**
 *
 * @author carter
 */
public class CocheServiceClassicImpl implements CocheService{

    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche clasico");
        return new Coche();
    }
    
}
