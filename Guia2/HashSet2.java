/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2;

import java.util.HashSet;

/**
 *
 * @author luife
 */
public class HashSet2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        HashSet<String> M = new HashSet<>();
        M.add("Enero");
        M.add("Febrero");
        M.add("Marzo");
        M.add("Abril");
        M.add("Mayo");
        M.add("Junio");
        M.add("Julio");
        M.add("Agosto");
        M.add("Septiembre");
        M.add("Octubre");
        M.add("Noviembre");
        M.add("Diciembre");
        
        M.add("Abril");
        M.add("Julio");
        M.add("Agosto");
        
        System.out.println("Los meses del año son: \n" + M);
        
        HashSet<String> V = new HashSet<>();
        V.add("Poartal");
        V.add("Half-life");
        V.add("Mass Effect");
        V.add("Assassin's Creed");
        V.add("Dark Souls");
        V.add("Fallout");
        V.add("Grand Theft Auto");
        V.add("Doom");
        V.add("Yakuza");
        
        V.add("Assassin's Creed");
        V.add("Dark Souls");
        V.add("Grand Theft Auto");
        
        System.out.println("Algunas franquisias de juegos que recomiendo son: \n" + V);
        
        HashSet<String> Mov = new HashSet<>();
        Mov.add("12 Angry Men");
        Mov.add("Casablanca");
        Mov.add("Star Wars");
        Mov.add("Lord of the Rings");
        Mov.add("Gladiator");
        Mov.add("Indiana Jones");
        Mov.add("Back to the Future");
        Mov.add("Jaws");
        Mov.add("The Good, The Bad & The Ugly");
        Mov.add("Jurassic Park");
        
        Mov.add("Star Wars");
        Mov.add("Back to the Future");
        Mov.add("Indiana Jones");
        Mov.add("Jurassic Park");
        
        System.out.println("Alguna peliculas que recomiendo son: \n" + Mov);
        
    }
    
}
