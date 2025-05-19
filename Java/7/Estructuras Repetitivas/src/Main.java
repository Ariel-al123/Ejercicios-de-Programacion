import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char operacion = Menu();
        byte opcion = MenuEstructura(operacion);
        byte tabla = Tabla();
        byte cantidad = Cantidad();

        switch (opcion){
            case 1:
                While(tabla, cantidad, operacion);
                break;
            case 2:
                Do_While(tabla, cantidad, operacion);
                break;
            case 3:
                For(tabla, cantidad, operacion);
                break;
        }
    }

    public static char Menu(){
        boolean continuar = false;
        char opcion;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese una opcion: ");
            System.out.println("+. Sumar");
            System.out.println("-. Restar");
            System.out.println("*. Multiplicar");
            System.out.println("/. Dividir");
            System.out.println("--------------------------");
            opcion = sc.next().charAt(0);
            if (opcion == '+' || opcion == '-' || opcion == '*' || opcion == '/') {
                continuar = true;
            }else{ System.out.println("Opcion no encontrada en el sistema");}
        }while (!continuar);
        return opcion;
    }

    public static byte MenuEstructura(char operacion){
        boolean continuar = false;
        byte opcion;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese la estructura selectiva: ");
            System.out.println("1. While");
            System.out.println("2. Do-While");
            System.out.println("3. For");
            System.out.println("--------------------------");
            opcion = sc.nextByte();
            if (opcion == 1 || opcion == 2 || opcion == 3) {
                continuar = true;
            }else{ System.out.println("Opcion no encontrada en el sistema");}
        }while (!continuar);
       return opcion;
    }

    // Método para realizar las operaciones
    public static byte calcular(byte num1, byte num2, char operador) {
        int resultado = 0;
         switch (operador) {
            case '+' :
                resultado =  num1 + num2;
                break;
            case '-' :
                resultado = num1 - num2;
                break;
            case '*' :
                resultado = num1 * num2;
                break;
            case '/' :
                if (num2 != 0){
                    resultado = num1 / num2;
                }else {
                    resultado = 0;
                }
            break;

        };
            return (byte) resultado;
    }

    public static byte Tabla (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la tabla: ");
        byte tabla = sc.nextByte();
        return tabla;
    }

    public static byte Cantidad(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad: ");
        byte cantidad = sc.nextByte();
        return cantidad;
    }
    public static void Do_While(byte numero, byte cantidad, char operador) {
        byte i = 1;
        do {
            System.out.println(numero + " " + operador + " " + i + " = " + calcular(numero, i, operador));
            i++;
        } while (i <= cantidad);
    }

    public static void  While(byte numero, byte cantidad, char operador) {
        byte i = 1;
        while (i <= cantidad) {
            System.out.println(numero + " " + operador + " " + i + " = " + calcular(numero, i, operador));
            i++;
        }
    }

    public static void For(byte numero, byte cantidad, char operador) {
        for (byte i = 1; i <= cantidad; i++) {
            System.out.println(numero + " " + operador + " " + i + " = " + calcular(numero, i, operador));
        }
    }
}