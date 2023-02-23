/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerjavabasicos;

import java.util.Scanner;

/**
 *
 * @author carter
 */
public class ThrowMain {
    
    public static void main(String[] args) {
        
        try{
            leerNombres();
            
        }catch (NameFormatException e){
            e.printStackTrace();
        }
        
    }
    
    /**
     * Metodo que lee nombres de consola y verifica que tenga longitud igual 
     * o mayor a 8 carcteres.
     * @throws NameFormatException
     */
    
    //Indicamos que este metodo va a lanzar la exception con la palabra
    //reservada throws más el nombre de la excepcion creada
    private static void leerNombres() throws NameFormatException{
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce un nombre");
        while(teclado.hasNext()){
            System.out.println("Introduce un nombre");
            String nombre =teclado.nextLine();
            if (nombre.length()<8){
                teclado.close();
                //Esta palabra lanza la excepcion creada
                throw new NameFormatException("El nombre debe contener mínimo 8 caracteres");
                
            }       
    }
        
        teclado.close();
    }
    
    
    
}
