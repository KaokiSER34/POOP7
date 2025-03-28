/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase base para todos los animales, contiene atributos y métodos genéricos.
 * Puede ser extendida por distintos tipos de animales (terrestres, acuáticos, etc.).
 * 
 * @author Issmael
 */
package Animales;

import color.Color;

/**
 * Esta clase define los atributos y comportamientos generales de un animal.
 */
public class Animal {

    private String nombre;
    private String lugarDeOrigen;
    private Color color;

    /**
     * Constructor vacío que inicializa los atributos con valores por defecto.
     */
    public Animal() {
    }

    /**
     * Constructor que inicializa el nombre, lugar de origen y color del animal.
     * @param nombre Nombre del animal.
     * @param lugarDeOrigen Lugar de origen del animal.
     * @param color Color (personalizado) del animal.
     */
    public Animal(String nombre, String lugarDeOrigen, Color color) {
        this.nombre = nombre;
        this.lugarDeOrigen = lugarDeOrigen;
        this.color = color;
    }

    /**
     * Obtiene el nombre del animal.
     * @return El nombre del animal.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna el nombre del animal.
     * @param nombre Nuevo nombre para el animal.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el lugar de origen del animal.
     * @return El lugar de origen del animal.
     */
    public String getLugarDeOrigen() {
        return lugarDeOrigen;
    }

    /**
     * Asigna el lugar de origen del animal.
     * @param lugarDeOrigen Nuevo lugar de origen para el animal.
     */
    public void setLugarDeOrigen(String lugarDeOrigen) {
        this.lugarDeOrigen = lugarDeOrigen;
    }

    /**
     * Obtiene el color del animal (de la clase color.Color).
     * @return El color del animal.
     */
    public Color getColor() {
        return color;
    }

    /**
     * Asigna el color del animal.
     * @param color Nuevo color (color.Color) para el animal.
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Método para hacer un sonido genérico sin parámetros.
     */
    public void hacerSonido() {
        System.out.println("Sonido generico de animal");
    }

    /**
     * Método para hacer un sonido con un texto específico.
     * @param sonido El sonido que se desea que el animal emita.
     */
    public void hacerSonido(String sonido) {
        System.out.println(sonido);
    }

    /**
     * Método que describe la acción de comer del animal.
     */
    public void comer() {
        System.out.println(nombre + " esta alimentandose...");
    }

    /**
     * Representación en cadena del objeto Animal.
     * @return Cadena con los atributos del animal y el toString() de Object.
     */
    @Override
    public String toString() {
        return "Animal{" + "nombre= " + nombre + ", lugarDeOrigen= " + lugarDeOrigen + ", color= " + color + '}' + super.toString();
    }
}