/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase que representa un animal terrestre, hereda de Animal
 * y añade atributos y comportamientos específicos de los animales que viven en tierra.
 * 
 * Nota: Ajusta los parámetros de constructor según tu preferencia
 * o requerimientos del diagrama de clases.
 * 
 * @author Issmael
 */
package Animales;

import color.Color;

/**
 * Esta clase define el comportamiento de un AnimalTerrestre.
 */
public class AnimalTerrestre extends Animal {
    private int numPatas;
    private String sonido;

    /**
     * Constructor vacío que inicializa los atributos con valores por defecto.
     */
    public AnimalTerrestre() {
    }

    /**
     * Constructor con parámetros para inicializar un animal terrestre.
     * @param nombre Nombre del animal.
     * @param lugarDeOrigen Lugar de origen del animal.
     * @param color Color (personalizado) del animal.
     * @param numPatas Número de patas del animal.
     * @param sonido Sonido característico del animal.
     */
    public AnimalTerrestre(String nombre, String lugarDeOrigen, Color color, int numPatas, String sonido) {
        super(nombre, lugarDeOrigen, color);
        this.numPatas = numPatas;
        this.sonido = sonido;
    }

    /**
     * Obtiene el número de patas del animal terrestre.
     * @return El número de patas.
     */
    public int getNumPatas() {
        return numPatas;
    }

    /**
     * Asigna el número de patas del animal terrestre.
     * @param numPatas Nuevo número de patas.
     */
    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    /**
     * Obtiene el sonido característico del animal terrestre.
     * @return El sonido del animal terrestre.
     */
    public String getSonido() {
        return sonido;
    }

    /**
     * Asigna el sonido característico del animal terrestre.
     * @param sonido Nuevo sonido.
     */
    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    /**
     * Método que describe la acción de correr del animal terrestre.
     */
    public void correr() {
        System.out.println(getNombre() + " esta corriendo con sus " + numPatas + " patas.");
    }

    /**
     * Sobrescritura del método comer() para un animal terrestre.
     */
    @Override
    public void comer() {
        System.out.println(getNombre() + " esta comiendo en tierra firme.");
    }

    /**
     * Sobrescritura del método hacerSonido() sin parámetros,
     * mostrando el sonido terrestre.
     */
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " hace un sonido terrestre: " + sonido);
    }

    /**
     * Representación en cadena del objeto AnimalTerrestre.
     * @return Cadena con atributos de AnimalTerrestre y la información de la superclase.
     */
    @Override
    public String toString() {
        return "AnimalTerrestre{" + "numPatas= " + numPatas + ", sonido= '" + sonido + '\'' + "} " + super.toString();
    }
}