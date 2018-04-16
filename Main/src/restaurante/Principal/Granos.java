/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.Principal;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Granos extends Principal {
    public void seleccionar() {
        do{
            System.out.println("seleccione el grano para su plato");
        System.out.println("1. lenteja");
        System.out.println("2. frijoles");
        System.out.println("3. garbanzo");
        System.out.println("4. arveja");
        Scanner sc=new Scanner (System.in);
        seleccion=sc.nextInt();
         switch (seleccion){
           case 1: 
               sel="lenteja";
               break;
           case 2:
               sel="frijole";
               break;
           case 3:
               sel="garbanzo";
               break;
           case 4:
               sel="arveja";
               break;
           default: 
               System.out.println("por favor seleccione una opcion de grano valida");
       }
    }while(seleccion>4);  
}
}
