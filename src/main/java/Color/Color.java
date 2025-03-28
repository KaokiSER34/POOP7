/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase que representa un color personalizado con nombre y código.
 * @author Issmael
 */
package color;

/**
 * Esta clase define un color con nombre y código, diferente a la clase java.awt.Color.
 */
public class Color {
    private String colorName;
    private String colorCode;

    /**
     * Constructor vacío que inicializa los atributos con valores por defecto.
     */
    public Color() {
    }

    /**
     * Constructor que asigna nombre y código de color.
     * @param colorName El nombre del color (ej. "Rojo", "Azul").
     * @param colorCode El código del color (ej. "#FF0000").
     */
    public Color(String colorName, String colorCode) {
        this.colorName = colorName;
        this.colorCode = colorCode;
    }

    /**
     * Obtiene el nombre del color.
     * @return El nombre del color.
     */
    public String getColorName() {
        return colorName;
    }

    /**
     * Asigna el nombre del color.
     * @param colorName El nuevo nombre del color.
     */
    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    /**
     * Obtiene el código del color.
     * @return El código del color (ej. "#FF0000").
     */
    public String getColorCode() {
        return colorCode;
    }

    /**
     * Asigna el código del color.
     * @param colorCode El nuevo código del color (ej. "#00FF00").
     */
    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    /**
     * Representación en cadena del objeto Color.
     * @return Una cadena con el nombre y código del color, más el toString() de Object.
     */
    @Override
    public String toString() {
        return "Color{" + "colorName= " + colorName + ", colorCode= " + colorCode + '}' + super.toString();
    }
}