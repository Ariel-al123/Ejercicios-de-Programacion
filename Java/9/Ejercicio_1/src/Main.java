import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;

public class Main {
    public static void main(String[] args) {
        List<String> Tareas = new ArrayList<>();
        Tareas.add("Bañarme");
        Tareas.add("Dormir");
        Tareas.add("Jugar");

       int menu = Menu();
        Redireccionar(menu, Tareas);
    }

    public static int Menu() {
        Scanner sc = new Scanner(System.in);
        int menu = 0;
        System.out.println("1. Agregar Tareas a la Lista");
        System.out.println("2. Mostrar Tareas a Pendientes");
        System.out.println("3. Eliminar Tareas a Especificas");
        System.out.println("-----------------------------------------");
        menu = sc.nextInt();

        return menu;
    }
    public static void Redireccionar(int menu, List<String> Tareas) {
        switch (menu) {
            case 1:
                Agregar(Tareas);
            break;
            case 2:
               Mostrar(Tareas);
            break;
            case 3:
                Eliminar(Tareas);
            break;
            default:
               System.out.println("Opcion no valida");
        }

    }


    public static List<String> Agregar (List<String> Tareas) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del Tarea: ");
        String nombre = sc.nextLine();
        Tareas.add(nombre);
        System.out.println("Tarea Añadida");
        Mostrar(Tareas);
        return Tareas;

    }

    public static List<String> Eliminar (List<String> Tareas) {
        Scanner sc = new Scanner(System.in);
        int posicion = 0;
        for (int i = 0; i < Tareas.size(); i++) {
            System.out.println(Tareas.get(i) + ":" + i);
        }
        System.out.println("¿Cuál deseas eliminar?");
        posicion = sc.nextInt();
        Tareas.remove(posicion);
        System.out.println(Tareas.get(posicion) + " Eliminada");
        return Tareas;
    }

    public static void Mostrar (List<String> Tareas) {
        System.out.println(Tareas);
    }

}