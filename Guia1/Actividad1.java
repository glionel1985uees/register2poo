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
public class Actividad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Area de un cuadrado");
        System.out.println("Ingrese un lado de su cuadrado:");
        double InputNum;
        double Area;
        Scanner InputKey  = new Scanner (System.in);
        InputNum = InputKey.nextDouble();
        Area = InputNum * InputNum;
        System.out.println("El Área de su cuadrado es: " + Area);
        
               
        // TODO code application logic here
    }
    
}
