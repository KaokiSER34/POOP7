/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase principal (main) que demuestra el uso de las clases de la jerarquía de animales.
 * Crea instancias de las distintas clases y llama a sus métodos para ilustrar la herencia.
 * 
 * @author Issmael
 */
package com.mycompany.poop7;

import Animales.Animal;
import Animales.AnimalAcuatico;
import Animales.Ballena;
import Animales.AnimalAereo;
import Animales.Pajaro;
import Animales.AnimalTerrestre;
import Animales.Perro;
import color.Color;

/**
 * Clase principal de prueba que contiene el método main.
 */
public class POOP7 {
    /**
     * Método principal de la aplicación. Crea instancias de distintas clases y
     * llama a sus métodos para demostrar la herencia y el polimorfismo.
     * @param args Argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        System.out.println("=== EJEMPLOS DE TODAS LAS CLASES ===");

        /*
         * 1) Ejemplo de Animal
         */
        Animal animal1 = new Animal(
            "Generico",
            "Desconocido",
            new Color("Gris", "#808080")
        );
        System.out.println("\n-- Ejemplo de Animal --");
        animal1.hacerSonido();   
        animal1.hacerSonido("Soy un Animal generico!");
        animal1.comer();
        System.out.println(animal1);

        /*
         * 2) Ejemplo de AnimalAcuatico
         */
        AnimalAcuatico animalAcuatico1 = new AnimalAcuatico(
            4,
            "Glu glu",
            "Pez payaso",
            "Oceano Atlantico",
            new Color("Naranja", "#FFA500")
        );
        System.out.println("\n-- Ejemplo de AnimalAcuatico --");
        animalAcuatico1.hacerSonido();
        animalAcuatico1.nadar();
        animalAcuatico1.comer();
        System.out.println(animalAcuatico1);

        /*
         * 3) Ejemplo de Ballena
         */
        Ballena ballena1 = new Ballena(
            30,
            4,
            "Canto de ballena",
            "Willy",
            "Oceano Pacifico",
            new Color("Azul", "#0000FF")
        );
        System.out.println("\n-- Ejemplo de Ballena --");
        ballena1.hacerSonido();
        ballena1.nadar();
        ballena1.pelearConPinocho();
        ballena1.comer();
        System.out.println(ballena1);

        /*
         * 4) Ejemplo de AnimalAereo
         */
        AnimalAereo animalAereo1 = new AnimalAereo(
            "Aguila",
            "Montanias Rocosas",
            new Color("Cafe", "#A52A2A"),
            2
        );
        System.out.println("\n-- Ejemplo de AnimalAereo --");
        animalAereo1.volar();
        animalAereo1.hacerSonido();
        animalAereo1.comer();
        System.out.println(animalAereo1);

        /*
         * 5) Ejemplo de Pajaro
         */
        Pajaro pajaro1 = new Pajaro(
            "Piolin",
            "Jaula de la abuela",
            new Color("Amarillo", "#FFFF00"),
            2,
            "Pico corto"
        );
        System.out.println("\n-- Ejemplo de Pajaro --");
        pajaro1.volar();
        pajaro1.piar();
        pajaro1.comer();
        System.out.println(pajaro1);

        /*
         * 6) Ejemplo de AnimalTerrestre
         */
        AnimalTerrestre animalTerrestre1 = new AnimalTerrestre(
            "Cerdo",
            "Granja",
            new Color("Rosa", "#FFC0CB"),
            4,
            "Oink oink"
        );
        System.out.println("\n-- Ejemplo de AnimalTerrestre --");
        animalTerrestre1.hacerSonido();
        animalTerrestre1.correr();
        animalTerrestre1.comer();
        System.out.println(animalTerrestre1);

        /*
         * 7) Ejemplo de Perro
         */
        Perro perro1 = new Perro(
            "Kirsha",
            "Casa",
            new Color("Blanco", "#FFFFFF"),
            4,
            "Guau guau",
            new Color("Cafe", "#A52A2A")
        );
        System.out.println("\n-- Ejemplo de Perro --");
        perro1.hacerSonido();
        perro1.hacerTravesuras();
        perro1.correr();
        perro1.comer();
        System.out.println(perro1);
    }
}