/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerjavabasicos;

/**
 *
 * @author carter
 */
public class EjerJavaBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //Creamos un objeto de la clase coche
        Coche cocheObj= new Coche("rojo", "peugeot","308",1430.45,5.4);//presionar ctrl+p para que aparezcan los parámetros
        
        //llamamos un método de la clase
        cocheObj.acelerar(50);
        System.out.println(cocheObj);
        
        //modificamos valor de unos los parámetros
        cocheObj.peso=1300.50;
        System.out.println(cocheObj);  
        
        //Creamos objeto de la subclase cocheElectrico
        CocheElectrico cocheObj02=new CocheElectrico("R-505", "azul metalico","Honda", "Civic",1480.45,5.0);
        System.out.println(cocheObj02);
        
        //Llamanos un método de la clase heredada(para probar que también se heredan los métodos
        //luego sobreescribimos el método en la clase cocheElectrico y lo modificamos
        cocheObj02.acelerar(50);
        System.out.println(cocheObj02);
        
        
    }
    
}
