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
public class Actividad3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Perimetro de un Ciruclo");
        System.out.println("ingrese el radio de su circulo");
        double r;
        double pi;
        double Num2;
        double P;
        pi = 3.141592653589;
        Num2 = 2;
        Scanner InputKey  = new Scanner (System.in);
        r = InputKey.nextDouble();
        P = (pi * Num2 * r);
        System.out.println("El perimetro de su circulo es: " + P);
        // TODO code application logic here
    }
    
}
