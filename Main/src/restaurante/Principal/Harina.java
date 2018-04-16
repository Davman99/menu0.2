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
public class Harina extends Principal {
    
    @Override
    public void seleccionar() {
        do{
        System.out.println("seleccione la harina para su plato");
        System.out.println("1. yuca");
        System.out.println("2. papa");
        System.out.println("3. pasta");
        System.out.println("3. arroz");
        Scanner sc=new Scanner (System.in);
        seleccion=sc.nextInt();
         switch (seleccion){
           case 1: 
               sel="yuca";
               break;
           case 2:
               sel="papa";
               break;
           case 3:
               sel="pasta";
               break;
           case 4:
               sel="arroz";
               break;
           default: 
               System.out.println("por favor seleccione una opcion de proteina valida");
       }
    }while(seleccion>4);  
    }
    
}
