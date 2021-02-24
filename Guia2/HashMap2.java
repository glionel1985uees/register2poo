/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2;

import java.util.HashMap;

/**
 *
 * @author luife
 */
public class HashMap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<Integer, String> VideoGames = new HashMap<>();
        VideoGames.put(1, "Fallout: New Vegas");
        VideoGames.put(2, "Dragon's Dogma: Dark Arisen");
        VideoGames.put(3,"The Sims 3");
        VideoGames.put(4,"Cities Skylines");
        VideoGames.put(5,"Vampire The Masquerade: Bloodlines");
        VideoGames.put(6,"Bayonetta");
        VideoGames.put(7,"Assassin's Creed II");
        VideoGames.put(8,"State of Decay");
        VideoGames.put(9,"Left 4 Dead");
        VideoGames.put(10,"Portal");
        System.out.println("Algunos juegos que recomiendo son: " + VideoGames);
        
        HashMap<Integer, String> Movies = new HashMap<>();
        Movies.put(11,"12 Angry Men");
        Movies.put(12,"Casablanca");
        Movies.put(13,"Star Wars");
        Movies.put(14,"Lord of the Rings");
        Movies.put(15,"Gladiator");
        Movies.put(16,"Indiana Jones");
        Movies.put(17,"Back to the Future");
        Movies.put(18,"Jaws");
        Movies.put(19,"The Good, The Bad & The Ugly");
        Movies.put(20,"Jurassic Park");
        System.out.println("Algunas peliculas que recombiendo son: " + Movies);
       
        
    }
    
}
