/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.bebidas;

import restaurante.bebidas.Bebidas;

/**
 *
 * @author david
 */
public class Licores extends Bebidas {
    
    @Override
    public void seleccionar() {
         switch (seleccion){
           case 1: 
               sel="cerveza";
               break;
           case 2:
               sel="vino";
               break;
           case 3:
               sel="coctel";
               break;
           case 4:
               sel="aguardinte";
               break;
           default: 
               System.out.println("por favor seleccione una gaseosa");
       }
    }
    
}
