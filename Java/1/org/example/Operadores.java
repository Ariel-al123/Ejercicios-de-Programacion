package org.example;

import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int n1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int n2 = sc.nextInt();
        System.out.println(n1 + " + " + n2 + " = " + suma(n1 , n2));
        System.out.println(n1 + " - " + n2 + " = " + resta(n1 , n2));
        System.out.println(n1 + " * " + n2 + " = " + multiplicacion(n1 , n2));
        System.out.println(n1 + " / " + n2 + " = " + division(n1 , n2));
        System.out.println(n1 + " % " + n2 + " = " + modulo(n1 , n2));
    }

    // Crear una funcion que reciba los numeros a operar y el operador que retorne el resultado solamente al metodo main

    public static int suma(int n1, int n2) {
        return n1 + n2;
    }
    public static int resta(int n1, int n2) {
        return n1 - n2;
    }
    public static int multiplicacion(int n1, int n2) {
        return n1 * n2;
    }
    public static float division(int n1, int n2) {
        return n1 / n2;
    }
    public static float modulo(int n1, int n2) {
        return n1 % n2;
    }

}
