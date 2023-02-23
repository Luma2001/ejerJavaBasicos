/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerjavabasicos;

/**
 *
 * @author carter
 */
public class Polimorfismo {
    public static void main(String[] args) {
        
        Coche coche01=new Coche();
        CocheElectrico coche02=new CocheElectrico();
        CocheHibrido coche03=new CocheHibrido();
        
        //Polimorfismo
        Coche coche04=new CocheElectrico();
        Coche coche05=new CocheHibrido();
        
        
        if(coche04 instanceof Coche){
        System.out.println("Coche");
        }
        
        if(coche04 instanceof CocheElectrico){
        System.out.println("Coche Electrico");
        }
        
        if(coche04 instanceof CocheHibrido){
        System.out.println("Coche Hibrido");
        }
        
        
        //Creamos Array con objetos creados con el tipo base, pero pertenecen a distintas clases
        //Al ser creados con el tipo base, son considerados todos del mismo tipo Coche.
        //Nota: coche01 es del tipo Coche, coche04 es del tipo CocheElectrico, coche05 es del tipo CocheHibrido
        
        Coche [] listadoCoches={coche01,coche04,coche05};
        
        System.out.println(coche01);
        System.out.println(coche04);
        System.out.println(coche05);
        System.out.println(listadoCoches);//Corregir
        
    }
    
}
