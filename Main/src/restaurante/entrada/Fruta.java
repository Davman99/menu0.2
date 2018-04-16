/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.entrada;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Fruta extends Entrada {

    @Override
    public void seleccionar() {
        do{
        System.out.println("1. papaya");
        System.out.println("2. manzana");
        System.out.println("3. pera");
        System.out.println("4. melon");
        Scanner sc=new Scanner (System.in);
        seleccion=sc.nextInt();
         switch (seleccion){
           case 1: 
               sel="papaya";
               break;
           case 2:
               sel="manzana";
               break;
           case 3:
               sel="pera";
               break;
           case 4:
               sel="melon";
               break;
           default: 
               System.out.println("por favor seleccione una opcion de fruta valida");
       }
    }while(seleccion>4);  
    }
    
}
