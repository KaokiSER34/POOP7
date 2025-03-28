/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase que representa un animal acuático, hereda de Animal y añade
 * atributos y comportamientos específicos de los animales que viven en el agua.
 * 
 * @author Issmael
 */
package Animales;

import color.Color;

/**
 * Esta clase define el comportamiento de un AnimalAcuatico.
 */
public class AnimalAcuatico extends Animal {
    private int numAletas;
    private String sonido;

    /**
     * Constructor vacío que inicializa los atributos con valores por defecto.
     */
    public AnimalAcuatico() {
    }

    /**
     * Constructor con parámetros para inicializar un animal acuático.
     * @param numAletas Número de aletas del animal.
     * @param sonido Sonido característico del animal.
     * @param nombre Nombre del animal.
     * @param lugarDeOrigen Lugar de origen del animal.
     * @param color Color (personalizado) del animal.
     */
    public AnimalAcuatico(int numAletas, String sonido, String nombre, String lugarDeOrigen, Color color) {
        super(nombre, lugarDeOrigen, color);
        this.numAletas = numAletas;
        this.sonido = sonido;
    }

    /**
     * Obtiene el número de aletas.
     * @return El número de aletas del animal acuático.
     */
    public int getNumAletas() {
        return numAletas;
    }

    /**
     * Asigna el número de aletas.
     * @param numAletas Nuevo número de aletas.
     */
    public void setNumAletas(int numAletas) {
        this.numAletas = numAletas;
    }

    /**
     * Obtiene el sonido característico.
     * @return El sonido del animal acuático.
     */
    public String getSonido() {
        return sonido;
    }

    /**
     * Asigna el sonido característico.
     * @param sonido Nuevo sonido del animal acuático.
     */
    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    /**
     * Método que describe la acción de nadar del animal.
     */
    public void nadar() {
        System.out.println(getNombre() + " esta nadando");
    }

    /**
     * Sobrescritura del método comer() para un animal acuático.
     */
    @Override
    public void comer() {
        System.out.println(getNombre() + " esta comiendo en el agua");
    }

    /**
     * Sobrescritura del método hacerSonido() sin parámetros,
     * mostrando el sonido acuático.
     */
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " hace un sonido acuatico: " + this.sonido);
    }

    /**
     * Representación en cadena del objeto AnimalAcuatico.
     * @return Cadena con atributos de AnimalAcuatico y la información de la superclase.
     */
    @Override
    public String toString() {
        return "AnimalAcuatico{" + "numAletas= " + numAletas + ", sonido= " + sonido + "} " + super.toString();
    }
}