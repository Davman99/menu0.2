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
public class Sopas extends Entrada{

    @Override
    public void seleccionar() {
        do{
        System.out.println("1. sopa de arroz");
        System.out.println("2. ajiaco");
        System.out.println("3. sopa de pasta");
        System.out.println("4. caldo de costilla");
        Scanner sc=new Scanner (System.in);
        seleccion=sc.nextInt();
         switch (seleccion){
           case 1: 
               sel="sopa de arroz";
               break;
           case 2:
               sel="ajiaco";
               break;
           case 3:
               sel="sopa de pasta";
               break;
           case 4:
               sel="caldo de costilla";
               break;
           default: 
               System.out.println("por favor seleccione una opcion de sopa valida");
       }
    }while(seleccion>4);  
    }
    
}
