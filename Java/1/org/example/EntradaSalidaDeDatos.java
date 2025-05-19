package org.example;
import java.util.Scanner;
public class EntradaSalidaDeDatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int n = sc.nextInt();
        System.out.println(n);

        /* crear una nueva clase y preguntar
            año de nacimiento, año actual
            y escirbir la edad y preguntar el nombre
        */

        System.out.println("Ingrese su nombre: ");
        String  Nombre = sc.nextLine();
        System.out.println("Ingrese su año de nacimento: ");
        int anoNacimento = sc.nextInt();
        System.out.println("Ingrese su año de acual: ");
        int anoActual = sc.nextInt();

        System.out.println(Nombre);
        System.out.println(anoActual-anoNacimento);
    }
}
