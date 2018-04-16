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
public class Dulce extends Postre{
    public void seleccionar() {
        do{
        System.out.println("1. helado");
        System.out.println("2. chocolate");
        System.out.println("3. arequipe");
        System.out.println("4. dulce de fruta");
        Scanner sc=new Scanner (System.in);
        seleccion=sc.nextInt();
         switch (seleccion){
           case 1: 
               sel="helado";
               break;
           case 2:
               sel="chocolate";
               break;
           case 3:
               sel="arequipe";
               break;
           case 4:
               sel="dulce de fruta";
               break;
           default: 
               System.out.println("por favor seleccione una opcion de fruta valida");
       }
    }while(seleccion>4);  
}
}

