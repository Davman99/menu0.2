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
public class Jugos extends Bebidas {

    @Override
    public void seleccionar() {
        System.out.println("1. jugo de mora");
        System.out.println("2. jugo de mango");
        System.out.println("3. jugo de guayaba");
        Scanner sc=new Scanner (System.in);
        seleccion=sc.nextInt();
       switch (seleccion){
           case 1: 
               sel="jugo de mora";
               break;
           case 2:
               sel="jugo de mango";
               break;
           case 3:
               sel="jugo de guayaba";
               break;
           case 4:
               sel="jugo de guanabana";
               break;
           default: 
               System.out.println("por favor seleccione un jugo");
       }
    }
    
    
}
