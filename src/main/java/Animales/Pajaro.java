/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase que representa un Pájaro, hereda de AnimalAereo
 * y añade un atributo tipoPico y un método específico.
 * 
 * Nota: Ajusta los parámetros de constructor según tu preferencia
 * o requerimientos del diagrama de clases.
 * 
 * @author Issmael
 */
package Animales;

import color.Color;

/**
 * Esta clase define el comportamiento de un Pájaro.
 */
public class Pajaro extends AnimalAereo {
    private String tipoPico;

    /**
     * Constructor vacío que inicializa los atributos con valores por defecto.
     */
    public Pajaro() {
    }

    /**
     * Constructor con parámetros para inicializar un Pájaro.
     * @param nombre Nombre del pájaro.
     * @param lugarDeOrigen Lugar de origen del pájaro.
     * @param color Color (personalizado) del pájaro.
     * @param numAlas Número de alas del pájaro.
     * @param tipoPico Tipo de pico (ej. "corto", "largo").
     */
    public Pajaro(String nombre, String lugarDeOrigen, Color color, int numAlas, String tipoPico) {
        super(nombre, lugarDeOrigen, color, numAlas);
        this.tipoPico = tipoPico;
    }

    /**
     * Obtiene el tipo de pico del pájaro.
     * @return El tipo de pico.
     */
    public String getTipoPico() {
        return tipoPico;
    }

    /**
     * Asigna el tipo de pico del pájaro.
     * @param tipoPico Nuevo tipo de pico.
     */
    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }

    /**
     * Método que describe la acción de piar del pájaro.
     */
    public void piar() {
        System.out.println(getNombre() + " emite un sonido de pajaro con su pico " + tipoPico);
    }

    /**
     * Representación en cadena del objeto Pájaro.
     * @return Cadena con atributos de Pajaro y la información de la superclase.
     */
    @Override
    public String toString() {
        return "Pajaro{" + "tipoPico= '" + tipoPico + '\'' + "} " + super.toString();
    }
}