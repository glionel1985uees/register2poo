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
public class Actividad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Calculo al cubo");
        System.out.println("Ingrese un número entero:");
        int Num;
        int Cubo;
        Scanner InputKey = new Scanner (System.in);
        Num = InputKey.nextInt();
        Cubo = Num * Num * Num;
        System.out.println("Su número ingresado al cubo es: " + Cubo);
        
        
        // TODO code application logic here
    }
    
}
