/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerjavabasicos;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author carter
 */
public class MapMain {
    public static void main(String[] args) {
        Map<String,String> personas = new HashMap<>();
        personas.put("01A","Administrativo");
        personas.put("02T","Tecnico");
        personas.put("03O","Obrero");
        personas.put("04M","Maestranza");
        
        System.out.println(personas);
        
        System.out.println("\nListado claves ingresadas:");
        for(String key : personas.keySet()){
            System.out.println(key);
        }
        
        System.out.println("\nListado tipo de personal contratado:");
        for(String value : personas.values()){
            System.out.println(value);
       }
        
        System.out.println("\nListado de claves y valor:");
        for(Map.Entry<String, String> pair : personas.entrySet()){
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }
    }
}
