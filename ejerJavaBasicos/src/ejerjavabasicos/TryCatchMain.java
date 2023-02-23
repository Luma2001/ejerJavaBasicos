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
public class TryCatchMain {
    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Ingrese dividendo");
        
        int dividendo=teclado.nextInt();
        
        System.out.println("Ingrese divisor");
        int divisor = teclado.nextInt();
        
        //Try catch captura excepciones y permite que el còdigo prosiga
        try{
            int result = dividendo/divisor;
            System.out.println("El resultado de la division es " +  result);
            
        } catch(ArithmeticException e){
            e.printStackTrace();
            System.out.println("Ha ingresado un numero incorrecto");
        }finally{//se ejecuta si o si
            System.out.println("Cierre de Recursos");
        }
        
        System.out.println("fin");//sin importar si existe una excepcion o no 
                                    //el programa llega al final del código
        
        
        
    }
    
}
