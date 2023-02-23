/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerjavabasicos;

/**
 *
 * @author carter
 */

//metodo creado que hereda de Exception
public class NameFormatException extends Exception{
    
    private static final long serialVersionUID = 1L;
      
    
    //Constructor que pasa mensaje de error cuando se genera la excepcion
    public NameFormatException(String errorMessage){
        super(errorMessage);
    }

    
}
