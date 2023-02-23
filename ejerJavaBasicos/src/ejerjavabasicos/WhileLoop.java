/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerjavabasicos;

/**
 *
 * @author carter
 */
public class WhileLoop {
    public static void main(String[] args) {
        int count=0;
        System.out.println("\nUso de While");
        while(count<10){
            System.out.println("Hola Mundo "+count);
            count++;//contador, necesario para que el bucle no sea infinito
        }
        
        System.out.println("Fin!!!");
        
        
       int contar=0;
        System.out.println("\nUso de continue");
        while(contar<10){
            contar++;
            if(contar==6) 
                continue;//al llegar al valor 6 lo salta y continua con la iteración
            System.out.println("Hola Mundo "+contar);
        }
        
        System.out.println("Fin!!!"); 
        
        
        
        int contador=0;
        System.out.println("\nUso de break");
        while(contador<10){
            contador++;
            if(contador==6) 
                break;//al llegar al valor 6, sale de la iteración.Rompe el flujo de ejecución del bucle
            System.out.println("Hola Mundo "+contador);
        }
        
        System.out.println("Fin!!!"); 
        
        
                
    }
    
}
