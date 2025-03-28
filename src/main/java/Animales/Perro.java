/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase que representa un Perro, un tipo específico de AnimalTerrestre.
 * Añade un atributo para el color del pelaje y un método propio.
 * 
 * Nota: Ajusta los parámetros de constructor según tu preferencia
 * o requerimientos del diagrama de clases.
 * 
 * @author Issmael
 */
package Animales;

import color.Color;

/**
 * Esta clase define el comportamiento de un Perro.
 */
public class Perro extends AnimalTerrestre {
    private Color colorPelaje;

    /**
     * Constructor vacío que inicializa los atributos con valores por defecto.
     */
    public Perro() {
    }

    /**
     * Constructor con parámetros para inicializar un Perro.
     * @param nombre Nombre del perro.
     * @param lugarDeOrigen Lugar de origen del perro.
     * @param color Color (personalizado) general (heredado de Animal).
     * @param numPatas Número de patas del perro.
     * @param sonido Sonido característico del perro (ej. "Guau").
     * @param colorPelaje Color específico del pelaje.
     */
    public Perro(String nombre, String lugarDeOrigen, Color color,
                 int numPatas, String sonido, Color colorPelaje) {
        super(nombre, lugarDeOrigen, color, numPatas, sonido);
        this.colorPelaje = colorPelaje;
    }

    /**
     * Obtiene el color del pelaje del perro.
     * @return Un objeto color.Color con la información del pelaje.
     */
    public Color getColorPelaje() {
        return colorPelaje;
    }

    /**
     * Asigna el color del pelaje del perro.
     * @param colorPelaje Nuevo color del pelaje.
     */
    public void setColorPelaje(Color colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    /**
     * Método propio que describe la acción de hacer travesuras.
     */
    public void hacerTravesuras() {
        System.out.println(getNombre() + " esta haciendo travesuras en casa.");
    }

    /**
     * Representación en cadena del objeto Perro.
     * @return Cadena con atributos de Perro y la información de la superclase.
     */
    @Override
    public String toString() {
        return "Perro{" + "colorPelaje= " + colorPelaje + "} " + super.toString();
    }
}