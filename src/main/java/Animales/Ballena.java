/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase que representa una Ballena, un tipo específico de AnimalAcuatico.
 * Añade un atributo de largo y un método propio.
 * 
 * @author Issmael
 */
package Animales;

import color.Color;

/**
 * Esta clase define el comportamiento de una Ballena.
 */
public class Ballena extends AnimalAcuatico {
    private int largo;

    /**
     * Constructor vacío que inicializa los atributos con valores por defecto.
     */
    public Ballena() {
    }

    /**
     * Constructor con parámetros para inicializar una Ballena.
     * @param largo Largo aproximado de la ballena (en metros).
     * @param numAletas Número de aletas.
     * @param sonido Sonido característico.
     * @param nombre Nombre de la ballena.
     * @param lugarDeOrigen Lugar de origen de la ballena.
     * @param color Color (personalizado) de la ballena.
     */
    public Ballena(int largo, int numAletas, String sonido, String nombre, String lugarDeOrigen, Color color) {
        super(numAletas, sonido, nombre, lugarDeOrigen, color);
        this.largo = largo;
    }

    /**
     * Obtiene el largo de la ballena.
     * @return El largo de la ballena en metros.
     */
    public int getLargo() {
        return largo;
    }

    /**
     * Asigna el largo de la ballena.
     * @param largo Nuevo largo (en metros).
     */
    public void setLargo(int largo) {
        this.largo = largo;
    }

    /**
     * Método propio que describe la acción de pelear con Pinocho (broma/ejemplo).
     */
    public void pelearConPinocho() {
        System.out.println(getNombre() + " se ha peleado con Pinocho!");
    }

    /**
     * Sobrescritura del método hacerSonido() para una ballena.
     */
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " (Ballena) emite sonido: " + getSonido());
    }

    /**
     * Representación en cadena del objeto Ballena.
     * @return Cadena con atributos de la Ballena y la información de la superclase.
     */
    @Override
    public String toString() {
        return "Ballena{" + "largo= " + largo + "} " + super.toString();
    }
}