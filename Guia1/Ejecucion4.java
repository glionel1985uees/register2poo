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
public class Ejecucion4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println ("Incio del programa.");
        System.out.println ("Introduzca 2 números enteros.");
        
        int numero1;
        int numero2;
        int resultado;
        Scanner entradaEscaner = new Scanner (System.in);
        
        numero1 = entradaEscaner.nextInt();
        numero2 = entradaEscaner.nextInt();
        resultado = numero1 + numero2;
        System.out.println ("El total de los numeros ingrsados es: " + resultado);
        // TODO code application logic here
    }
    
}
