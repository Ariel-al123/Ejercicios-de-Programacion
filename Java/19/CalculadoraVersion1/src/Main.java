import java.util.Scanner;
import operaciones.*;

// calculadora orientada a objetos

public class Main {
    public static void main(String[] args) {
        byte opcion = Menu();
        Redireccion(opcion);
    }

    public static byte Menu(){
        Scanner sc = new Scanner(System.in);
        byte opcion = 0;
        boolean continuar = false;

        do {
            System.out.println("1-. Suma");
            System.out.println("2-. Resta");
            System.out.println("3-. Multiplicacion");
            System.out.println("4-. Division");
            System.out.println("5-. Cuadrado");
            System.out.println("6-. Inversa");
            System.out.println("7-. Raiz Cuadrada");
            opcion = sc.nextByte();
            if (opcion >=1 && opcion <=7)
                continuar = true;
            else
                System.out.println("Opcion no valida");

        }while(!continuar);

        return opcion;
    }

    public static void Redireccion(byte opcion){
        Scanner sc = new Scanner(System.in);
        boolean continuar = false;

        System.out.println("Dame un numero");
        double n1 = sc.nextInt();
        System.out.println("ahora dame otro");
        double n2 = sc.nextInt();

        operaciones operaciones = new operaciones(n1,n2);

        switch(opcion) {
            case 1:
                System.out.println("Suma " + operaciones.Suma(n1, n2) + "\n");
                break;
            case 2:
                System.out.println("Resta " + operaciones.Resta(n1, n2) + "\n");
                break;
            case 3:
                System.out.println("Multiplicacion " + operaciones.Multiplicacion(n1, n2) + "\n");
                break;
            case 4:
                System.out.println("Division " + operaciones.Division(n1, n2) + "\n");
                break;
            case 5:
                System.out.println("Cuadrado " + operaciones.Cuadrado(n1, n2) + "\n");
                break;
            case 6:
                System.out.println("Inversa " + operaciones.Inversa(n1) + "\n");
                break;
                case 7:
                    System.out.println("Raiz Cuadrada " + operaciones.RaizCuadrada(n1) + "\n");
        }
    }

}