/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

public class Cuadrilatero {

    private float lado1;
    private float lado2;

    //Metodo Constructor cuadrilatero
    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public String getValidador() {
        String validador;
        if (this.lado1 == this.lado2) {
            validador = "Cuadrado";

        } else {
            validador = "Rectangulo";
        }
        return validador;
    }

    //Metodo toma de Lado 1
    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    //Metodo toma de Lado2
    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    //Metodo Perimetro
    public float getPerimetro() {
        float perimetro = 2 * (lado1 + lado2);
        return perimetro;
    }

    //Meotodo Area
    public float getArea() {
        float area = (lado1 * lado2);
        return area;
    }

    //Imprimir Resultados
    public String toString1() {
        return "Para el Primer cuadrilatero que tiene el lado 1 " + lado1 + " y el lado 2 "
                + lado2 + " tiene un área de " + getArea()
                + " y un perimetro de " + getPerimetro() + " y es un " + getValidador();

    }

    public String toString2() {
        return "Para el Segundo cuadrilatero que tiene el lado 1 " + lado1 + " y el lado 2 "
                + lado2 + " tiene un área de " + getArea()
                + " y un perimetro de " + getPerimetro() + " y es un " + getValidador();

    }
}
