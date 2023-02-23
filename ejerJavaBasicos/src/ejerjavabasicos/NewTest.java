/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerjavabasicos;

import java.util.HashSet;

/**
 *
 * @author carter
 */
public class NewTest {
  

     public static void main(String... sss) {

        HashSet<Object> miSet = new HashSet<>();

        String s1 = new String("hola");

        String s2 = new String("hola");

        Simple s3 = new Simple("holasimple");

        Simple s4 = new Simple("holasimple");

        miSet.add(s1);

        miSet.add(s2);

        miSet.add(s3);

        miSet.add(s4);

        System.out.println(miSet);

     }

}

 

class Simple {

     private String str;

     Simple(String str) {

        this.str = str;

     }

     @Override
     public String toString() {

        return str;

     }

}
    
    
    
    
    
