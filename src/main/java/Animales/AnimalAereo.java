/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase que representa un animal aéreo, hereda de Animal
 * y añade atributos y comportamientos específicos de los animales que vuelan.
 * 
 * Nota: Se muestra aquí por si deseas una jerarquía paralela
 * a AnimalAcuatico y AnimalTerrestre.
 * 
 * @author Issmael
 */
package Animales;

import color.Color;

/**
 * Esta clase define el comportamiento de un AnimalAereo.
 */
public class AnimalAereo extends Animal {
    private int numAlas;

    /**
     * Constructor vacío que inicializa los atributos con valores por defecto.
     */
    public AnimalAereo() {
    }

    /**
     * Constructor con parámetros para inicializar un animal aéreo.
     * @param nombre Nombre del animal.
     * @param lugarDeOrigen Lugar de origen del animal.
     * @param color Color (personalizado) del animal.
     * @param numAlas Número de alas del animal.
     */
    public AnimalAereo(String nombre, String lugarDeOrigen, Color color, int numAlas) {
        super(nombre, lugarDeOrigen, color);
        this.numAlas = numAlas;
    }

    /**
     * Obtiene el número de alas.
     * @return El número de alas del animal aéreo.
     */
    public int getNumAlas() {
        return numAlas;
    }

    /**
     * Asigna el número de alas.
     * @param numAlas Nuevo número de alas.
     */
    public void setNumAlas(int numAlas) {
        this.numAlas = numAlas;
    }

    /**
     * Método que describe la acción de volar del animal aéreo.
     */
    public void volar() {
        System.out.println(getNombre() + " esta volando con " + numAlas + " alas.");
    }

    /**
     * Sobrescritura del método comer() para un animal aéreo.
     */
    @Override
    public void comer() {
        System.out.println(getNombre() + " esta comiendo mientras vuela o descansa en su nido.");
    }

    /**
     * Representación en cadena del objeto AnimalAereo.
     * @return Cadena con atributos de AnimalAereo y la información de la superclase.
     */
    @Override
    public String toString() {
        return "AnimalAereo{" + "numAlas= " + numAlas + "} " + super.toString();
    }
}