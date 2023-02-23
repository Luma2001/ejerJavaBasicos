/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerjavabasicos;

/**
 *
 * @author carter
 */
public class SwitchControl {
    
    
    public static void main(String[] args) {
        String weather = "sunny";
        
        switch(weather){
            
            case "sunny":
                System.out.println("El tiempo es soleado");
                break;
                
            case "cloudy":
                System.out.println("El tiempo es nublado");
                break;
            
            default:
                System.out.println("No se ha podido identificar");
                
            
        }
    }
    
}
