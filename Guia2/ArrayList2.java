/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2;

import java.util.ArrayList;

/**
 *
 * @author luife
 */
public class ArrayList2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> Month = new ArrayList<>();
        Month.add("Enero");
        Month.add("Febrero");
        Month.add("Marzo");
        Month.add("Abril");
        Month.add("Mayo");
        Month.add("Junio");
        Month.add("Julio");
        Month.add("Agosto");
        Month.add("Septiembre");
        Month.add("Octubre");
        Month.add("Noviembre");
        Month.add("Diciembre");
        System.out.println("Los nombres de los meses del año son: " + Month);
        
        ArrayList<String> CBrand = new ArrayList<>();
        CBrand.add("Nissan");
        CBrand.add("Toyota");
        CBrand.add("Mazda");
        CBrand.add("Ford");
        CBrand.add("Honda");
        CBrand.add("Mitsubishi");
        CBrand.add("Hyundai");
        CBrand.add("Ferrari");
        CBrand.add("Volkswagen");
        CBrand.add("Audi");
        System.out.println("Los nombres de las marcas de vehiculos son: " + CBrand);
        
        ArrayList<String> ClothBrand = new ArrayList<>();
        ClothBrand.add("Nike");
        ClothBrand.add("Polo");
        ClothBrand.add("CAT");
        ClothBrand.add("Puma");
        ClothBrand.add("Nautica");
        ClothBrand.add("Adidas");
        ClothBrand.add("Underarmor");
        ClothBrand.add("Tommy Hilfiger");
        ClothBrand.add("Ralph Lauren");
        System.out.println("Los nombres de las marcas de ropa son: " + ClothBrand);
        
        ArrayList<String> Hobbies = new ArrayList<>();
        Hobbies.add("Videojuegos");
        Hobbies.add("Hacer Ejercicio");
        Hobbies.add("Dibujar");
        Hobbies.add("Tocar Guitarra");
        Hobbies.add("Leer Comics");
        Hobbies.add("Relajarse");
        Hobbies.add("Ver Peliculas");
        System.out.println("Mis pasatiempos son: " + Hobbies);
        
    }
    
}
