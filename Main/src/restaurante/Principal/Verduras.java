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
public class Verduras extends Principal {
     @Override
    public void seleccionar() {
        do{
             System.out.println("seleccione la verdura para su plato");
        System.out.println("1. pure de ahuyama");
        System.out.println("2. habichuelas");
        System.out.println("3. ensalada de aguacate");
        System.out.println("4. ensalada roja");
        Scanner sc=new Scanner (System.in);
        seleccion=sc.nextInt();
         switch (seleccion){
           case 1: 
               sel="pure de ahuyama";
               break;
           case 2:
               sel="habichuelas";
               break;
           case 3:
               sel="ensalada de aguacate";
               break;
           case 4:
               sel="ensalada roja";
               break;
           default: 
               System.out.println("por favor seleccione una opcion de verduras valida");
       }
    }while(seleccion>4);  
}
}
