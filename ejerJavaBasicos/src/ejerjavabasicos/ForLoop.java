/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerjavabasicos;

/**
 *
 * @author carter
 */
public class ForLoop {
    public static void main(String[] args) {
        for(int i=0; i<10;i++){
            
            if(i==6)
                continue;
            System.out.println((i+1)+"- Hola Mundo!!");
        }
        System.out.println("Fin!!");
    }
    
}
