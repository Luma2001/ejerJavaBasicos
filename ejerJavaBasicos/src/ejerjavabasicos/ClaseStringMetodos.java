/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerjavabasicos;

/**
 *
 * @author carter
 */
public class ClaseStringMetodos {
    
    public static void main(String[] args) {
        //La clase String
        /*
        length()
        startsWith("")
        indexOf("")
        subString(1,5)
        trim()
        equals()
        compareTo
        */
        
        
        String mensaje="  Hola Mundo  ";
        
        //muestra la longitud de una cadena de un String
        System.out.println(mensaje.length());
        
        //devuelve un texto en mayuscula. 
        //Nota: no modifica variable original,
        //por eso se almacena en otra variable para poder usarlo
        String mensajeMAY = mensaje.toUpperCase();
        System.out.println(mensajeMAY);
        System.out.println(mensaje.toUpperCase());
        
        //Elimina espacios innecesarios al comienzo o al final de un string
        System.out.println(mensajeMAY.trim());
                mensajeMAY=mensajeMAY.trim();
        //Comparando dos strings
        String saludo="HOLA MUNDO";
        if(mensajeMAY.equals(saludo)){
            System.out.println("Verdadero");
        }else{
            System.out.println("Falso");
        }
       
        //Comparando sin tener encuenta mayu o minus
        if(mensajeMAY.equalsIgnoreCase(saludo)){
            System.out.println("Verdadero");
        }else{
            System.out.println("Falso");
        }
        
        //Seleccionamos una parte de la cadena
        System.out.println(mensajeMAY.substring(1, 5));
        
        //Me indica en que posición está un caracter
        System.out.println(mensaje.indexOf("l"));
        
        //Devuelve verdadero si están vacio o tiene espacio en blanco
        System.out.println(mensaje.isBlank());
        
        //Devuelve verdadero si length es igual a cero
        System.out.println(mensaje.isEmpty());
        
        //devuelve el caracter de la posición indicada
        System.out.println(mensaje.charAt(5));
        
        
        //devuelve el unicode del caracter de la posicion indicada
        System.out.println(mensaje.codePointAt(5));
        
        
        //Compara dos string
        System.out.println(mensaje.compareTo(mensajeMAY));
         
        System.out.println(mensajeMAY.compareToIgnoreCase(saludo));
        
        //concatena dos string
        System.out.println(mensaje.concat(saludo));
        
        //Devuelve true si el final del string coincide con los caracteres dados
        System.out.println(mensaje.endsWith(" "));
        
        //me indica la posicion de la ultima vez que aparece un caracter
        System.out.println(mensaje.lastIndexOf("o"));
        
        //para repetir la variable las veces que indiquemos
         System.out.println(mensaje.repeat(4));
        
        //Es true si coincide con lo que escribimos entre comillas 
         System.out.println(mensaje.startsWith("  H"));
          
         System.out.println(mensaje.hashCode());
         
         //Reemplazar el primer caracter que coincide por otro
         System.out.println(mensaje.replaceFirst("H", "h"));
          
         System.out.println(mensaje.replaceFirst("o","O"));
         
         //para generar una separacion del comienzo de linea
         System.out.println(mensaje.indent(10));
         
         //Para verifica si el string coincide con una expresion dada
         System.out.println(mensaje.matches("  Hola Mundo  "));
         
         //Reemplaza todos los carácteres que coinciden
         System.out.println(mensaje.replaceAll("o", "O"));
         
          
          
    }
    
}
