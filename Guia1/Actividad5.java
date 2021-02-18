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
public class Actividad5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Conversion de Fahrenheit a Celsius");
        double F;
        double Conver;
        Scanner InputKey = new Scanner (System.in);
        F = InputKey.nextDouble();
        Conver = ((F-32)/1.8000);
        System.out.println("Su conversion es: " + Conver + " Celsius");
        
        
        
        
        
        // TODO code application logic here
    }
    
}
