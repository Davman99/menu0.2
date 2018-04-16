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
public class Proteina extends Principal{

    @Override
    public void seleccionar() {
        do{
             System.out.println("seleccione la proteina para su plato");
        System.out.println("1. pollo");
        System.out.println("2. carne");
        System.out.println("3. pescado");
        Scanner sc=new Scanner (System.in);
        seleccion=sc.nextInt();
         switch (seleccion){
           case 1: 
               sel="pollo";
               break;
           case 2:
               sel="carne";
               break;
           case 3:
               sel="pescado";
               break;
           default: 
               System.out.println("por favor seleccione una opcion de proteina valida");
       }
    }while(seleccion>3);  
    }
    
}
