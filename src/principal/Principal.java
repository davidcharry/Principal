/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

public class Principal {

    //Objetos
    static Scanner sc = new Scanner(System.in);
    static Cuadrilatero cuadrilatero1 = new Cuadrilatero(0, 0);
    static Cuadrilatero cuadrilatero2 = new Cuadrilatero(0, 0);

    public static void main(String[] args) {
        leerLados();
        mostrarPerimetro();
        mostrarArea();

    }

    //Lectura del teclado
    public static void leerLados() {

        System.out.println("Ingrese el lado 1 para el Primer cuadrilatero: ");
        cuadrilatero1.setLado1(sc.nextInt());
        System.out.println("Ingrese el lado  2 para el Primer cuadrilatero");
        cuadrilatero1.setLado2(sc.nextInt());
        System.out.println("Ingrese el lado 1 para el Segundo cuadrilatero: ");
        cuadrilatero2.setLado1(sc.nextInt());
        System.out.println("Ingrese el lado 2 para el Segundo cuadrilatero: ");
        cuadrilatero2.setLado2(sc.nextInt());
        System.out.println("");
    }

    //Mostrar resultado del perimetro
    public static void mostrarPerimetro() {
        cuadrilatero1.getPerimetro();
        cuadrilatero2.getPerimetro();
        System.out.println(cuadrilatero1.toString1());
        System.out.println("");
    }

    //Mostrar resultado del Area
    public static void mostrarArea() {
        cuadrilatero1.getArea();
        cuadrilatero2.getArea();
        System.out.println(cuadrilatero2.toString2());
    }
}
