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
public class Actividad4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Conversion pies a metros");
        System.out.println("Ingrese la cantidad de pies (ft) que desea convertir:");
        double ft;
        double m;
        double Conver;
        m = 3.2808;
        Scanner Inputkey = new Scanner (System.in);
        ft = Inputkey.nextDouble();
        Conver = (ft / m);
        System.out.println("Su conversion es: " + Conver + " Metros");
        
        
        
                
        // TODO code application logic here
    }
    
}
