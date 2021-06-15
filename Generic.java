/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generic;

/**
 *
 * @author Usuario
 */
public class Generic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sorteador<String> s = new Sorteador();
        s.insertar("Buenas");
        s.insertar("chango");
        s.insertar("Todo");
        s.insertar("bien?");
        s.insertar("Nos");
        s.insertar("vemos");
        s.insertar("despues");
        
        
        /*while(!s.estaVacio()){
         System.out.print(s.proximoSorteado()+"  ");   
        }*/
        
        for(String cadena : s){
            System.out.print(cadena+"  "); 
        }
    }
    
}
