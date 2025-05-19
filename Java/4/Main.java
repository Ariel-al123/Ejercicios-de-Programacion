import Java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int edad = 18;
        Scanner sc = new Scanner(System.in);

        if (edad >= 18){
            System.out.println("Es mayor de edad " + edad);
        }else{
            System.out.println("Es menor de edad " + edad);
        }
        mayorEdad();


        System.out.println("Dame tu año de nacimiento");
        int nacimiento = sc.nextInt();
        System.out.println("Dame el año actual");
        int actual = sc.nextInt();
        System.out.println("Ingrese su nombre");
        String nombre = sc.nextLine();

        Edad(nacimiento, actual, nombre);

    }

    public static void mayorEdad(){
        String mensaje = edad >= 18 ? "Es mayor de edad" : "es menor de edad";
    }

    //Crea un  metodo que reciba el año de nacimiento, el año actual y retorne el
    // mensaje si es mayor o menor de edad la persona. Los valores son asignados
    // directamente en el metodo

    public static String Edad(int nacimiento, int actual, string nombre){
        edad = actual - nacimiento;
        return String mensaje = edad >= 18 ? nombre, "Hola ", nombre, " eres mayor de edad" : "Hola " ,nombre, " eres menor de edad";
    }

}