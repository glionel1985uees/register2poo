/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia1;

import java.util.Scanner;

/**
 *
 * @author luife
 */
public class Ejecucion3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Inicio del programa.");
        System.out.println("Introduce una cadena de texto.");
        String entradaTeclado = "";
        Scanner entradaEscaner = new Scanner (System.in);      
        entradaTeclado = entradaEscaner.nextLine();
        System.out.println("El usuario escribió lo siguiente: \"" + entradaTeclado +"\"");
        
        // TODO code application logic here
    }
    
}
