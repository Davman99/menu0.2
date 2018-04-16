/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.postres;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Sal extends Postre {

    @Override
    public void seleccionar() {
        do{
        System.out.println("1. galletas");
        System.out.println("2. waffles");
        System.out.println("3. postre 3");
        System.out.println("4. postre 4");
        Scanner sc=new Scanner (System.in);
        seleccion=sc.nextInt();
         switch (seleccion){
           case 1: 
               sel="galletas";
               break;
           case 2:
               sel="waffles";
               break;
           case 3:
               sel="postre 3";
               break;
           case 4:
               sel="postre 3";
               break;
           default: 
               System.out.println("por favor seleccione una opcion de fruta valida");
       }
    }while(seleccion>4);  
    }
    
}
