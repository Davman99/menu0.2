/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.bebidas;

import restaurante.bebidas.Bebidas;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Gaseosas extends Bebidas{

    @Override
    public void seleccionar() {
        do{
        System.out.println("1. cocacola");
        System.out.println("2. cuatro");
        System.out.println("3. 7up");
        Scanner sc=new Scanner (System.in);
        seleccion=sc.nextInt();
         switch (seleccion){
           case 1: 
               sel="cocacola";
               break;
           case 2:
               sel="cuatro";
               break;
           case 3:
               sel="7uo";
               break;
           case 4:
               sel="pepsi";
               break;
           default: 
               System.out.println("por favor seleccione opcion valida de gaseosa");
       }
    }while(seleccion>4);  
}
}
