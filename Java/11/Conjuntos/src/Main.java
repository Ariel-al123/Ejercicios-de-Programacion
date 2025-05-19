import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        int opcion = Menu();
        Set<String> Nombre = new TreeSet<>();
        Nombre.add("Juan");
        Nombre.add("Ariel");
        Nombre.add("Yin");
        Nombre.add("Walter");

        Redireccionar(opcion, Nombre);
       boolean regresar = false;

        /*  char regresar_opccion = ' ';
        Scanner sc = new Scanner(System.in);
        */


        do {
            /*
            System.out.println("Deseas regresar al programa? [Y/N]");
            regresar_opccion = sc.next().charAt(0);
            if (regresar_opccion == 'Y' || regresar_opccion == 'y') {
            */

                opcion = Menu();
                Redireccionar(opcion, Nombre);
                /*
            }else if (regresar_opccion == 'N' || regresar_opccion == 'n') {
                regresar = true;
            }else {
                System.out.print("Opccion Invalida:");
            }
            */
        }while(!regresar);

        System.out.println("Fin del Programa :)");

    }

    public static int Menu(){
        Scanner sc = new Scanner(System.in);
        boolean continuar = false;
        int opcion = 0;
        do{
        System.out.println("1-. Agregar");
        System.out.println("2-. Mostrar");
        System.out.println("3-. Verificar");
        System.out.println("-------------------");
        System.out.println("Seleccione una opcion");
            opcion = sc.nextInt();
            if(opcion == 1 || opcion == 2 || opcion == 3){
                continuar = true;
            }else{
                  System.out.println("Opccion Invalida, Vuelva a intentarlo");
            }
        }while(!continuar);

        return opcion;
    }
    public static void Redireccionar(int opcion, Set<String> Nombre){
        switch(opcion){
            case 1:
                Agregar(Nombre);
            break;
            case 2:
                Mostrar(Nombre);
            break;
            case 3:
                Verificar(Nombre);
            break;
        }
    }
    public static boolean Validacion(Set<String> Nombre, String invitado){
        return Nombre.contains(invitado);
    }

    public static Set<String> Agregar(Set<String> Nombre){
        Scanner sc = new Scanner(System.in);
        String invitado = "";
        boolean continuar = false;

        System.out.println("Ingrese un invitado nuevo");
        invitado = sc.nextLine();
        if (!Validacion(Nombre, invitado)) {
            Nombre.add(invitado);
            System.out.println(invitado + " Fue añadido correctamente.");
        } else {
            System.out.println(invitado + " Ya fue invitado.");
        }

        return Nombre;
    }
    public static void Mostrar(Set<String> Nombre){
        System.out.println("Invitados :");
        System.out.println(Nombre);
    }

    public static void Verificar(Set<String> Nombre) {
        Scanner sc = new Scanner(System.in);
        String persona = "";

        System.out.println("Ingrese el nombre de la persona:");
        persona = sc.nextLine();
        if (Validacion(Nombre, persona))
            System.out.println("La Persona ya ha sido registrada.");
        else{
            System.out.println("La Persona no esta invitada.");
        }

    }

}