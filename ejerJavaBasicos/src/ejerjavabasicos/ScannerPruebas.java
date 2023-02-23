/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerjavabasicos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author carter
 */
public class ScannerPruebas {
    
    public static void main(String[] args) throws FileNotFoundException {

        Scanner teclado = new Scanner(System.in);
        String string = new String("3 2 4 AF Pepe8");
        Scanner scString = new Scanner(string);
                while (scString.hasNext()) {
                        String cadena = scString.next();
                        System.out.print(cadena + "-");
                }
            
        scString.close();
        
        System.out.println(" ");
        System.out.println("Cadena: " + string);
        
        
        Scanner scBase = new Scanner(string);
        scBase.useRadix(16);
        System.out.println("La base numérica es: " + scBase.radix());
                while (scBase.hasNextInt()) {
                int n = scBase.nextInt();
                System.out.print(n + " ");
                }
        scBase.close();
        
        System.out.println("");
        
        String stringDelimiter = "aa / /// bb/cc";
        
        System.out.println("Cadena: " + stringDelimiter);
        Scanner scDelimiter = new Scanner(stringDelimiter);
        
// scDelimiter.useDelimiter(“\\s*\\+\\s*”);
        scDelimiter.useDelimiter("/");
        System.out.println("El delimitador usado es: " + scDelimiter.delimiter());
                while (scDelimiter.hasNext()) {
                String s = scDelimiter.next();
                System.out.print(s + "-");
                }
        scDelimiter.close();
        
        System.out.println("");        
          
        
        
        
        
         String stringLocale = "1.234,6 0,888 1_344_899,098";
        
         System.out.println("Cadena: " + stringLocale);
         
        Scanner scLocale = new Scanner(stringLocale);
        
        
        scDelimiter.useLocale(new Locale("ES"));
                while (scLocale.hasNextDouble()) {
                double d = scLocale.nextDouble();
                System.out.print(d + " ");
               }
               
        scLocale.close();
        System.out.println("");
        
        teclado.useDelimiter("=");
        System.out.print("teclea cadenas con separador " + teclado.delimiter() + " : ");
                while (teclado.hasNext()) {
                    String s = teclado.next();
                    System.out.print(s + " ");
                    if (s.equals("FIN")) {
                    teclado.reset();
                    break;
                }
        }
        System.out.println("");
        // teclado.useDelimiter(“\\p{javaWhitespace}+")
        // .useLocale(Locale.getDefault(Locale.Category.FORMAT))
        // .useRadix(10);
        
        
        System.out.println("Reset reinicia delimitador, localizacion y base numerica");
        System.out.println("Delimitador es: " + teclado.delimiter());
        System.out.println("La localizacion es: " + teclado.locale().getCountry());
        System.out.println("La base numerica es: " + teclado.radix());
        
        
        
        String carpeta="C:\\ficheros\\";
        String archivo="leerfichero.txt";
        //Path path =
        //FileSystems.getDefault().getPath(carpeta, archivo);
        //Scanner leerfichero = new Scanner(path);
        File fichero = new File(carpeta+archivo);
        Scanner leerfichero = new Scanner(fichero);
        leerfichero.useDelimiter("=");
                    while (leerfichero.hasNext()) {
                    String cadena = leerfichero.next();
                    System.out.print(cadena + " ");
                    }
        leerfichero.close();
        
        
        
}
}
        
        
    
    
    
    
    
    


    
    


    

