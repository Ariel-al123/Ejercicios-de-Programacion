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
            if (opcion >=1 && opcion <=6)
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

        suma Misuma = new suma(n1,n2);
        resta Miresta = new resta(n1,n2);
        multiplicacion Mimultiplicacion = new multiplicacion(n1,n2);
        division Midivision = new division(n1,n2);
        cuadrado Micuadrado = new cuadrado(n1,n2);
        inversa Miinversa = new inversa(n1);
        raizcuadrada Miraizcuadrada = new raizcuadrada(n1)

        switch(opcion) {
            case 1:
                System.out.println("Suma Getter " + Misuma.getSuma(n1, n2) + "\nSuma Setter " + Misuma.setSuma(n1, n2));
                break;
            case 2:
                System.out.println("Resta Getter " + Miresta.getResta(n1, n2) + "\nResta Setter " + Miresta.setResta(n1, n2));
                break;
            case 3:
                System.out.println("Multiplicacion Getter " + Mimultiplicacion.getmultiplicacion(n1, n2) + "\nMultiplicacion Setter " + Mimultiplicacion.setmultiplicacion(n1, n2));
                break;
            case 4:
                System.out.println("Division Getter " + Midivision.getdivision(n1, n2) + "\nDivision Setter " + Midivision.setdivision(n1, n2));
                break;
            case 5:
                System.out.println("Cuadrado Getter " + Micuadrado.getcuadrado(n1, n2) + "\nCuadrado Setter " + Midivision.setdivision(n1, n2));
                break;
            case 6:
                System.out.println("Inversa Getter " + Miinversa.getinversa(n1) + "\nInversa Setter " + Miinversa.setinversa(n1));
                break;
            case 7:
                System.out.println("Raiz Cuadrada Getter " + Miraizcuadrada.getraizcuadrada(n1) + "\nRaiz Cuadrada Setter " + Miraizcuadrada.setraizcuadrada(n1));
                break;
        }
    }

}