import javax.lang.model.type.NullType;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        boolean regresar = false;
        //  Ingles   Español
        Map<String, String> Traduccion = new HashMap<String, String>();
        Traduccion.put("Shamawra", "Jacket");
        Traduccion.put("Pel", "Pelo");
        Traduccion.put("Embarrassed", "Embarazado");

        do{
            opcion = Menu();
            Redireccionar(opcion, Traduccion);
        }while(!regresar);

    }


    public static int Menu(){
        Scanner sc = new Scanner(System.in);
        boolean continuar = false;
        int opcion = 0;
        do{
            System.out.println("1-. Agregar Nuevas Palabras");
            System.out.println("2-. Mostrar Traduccion en Ingles");
            System.out.println("3-. Mostrar Todas las traducciones");
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

    public static void Redireccionar(int opcion, Map<String, String> Traduccion){
        switch(opcion){
            case 1:
                Agregar(Traduccion);
                break;
            case 2:
                MostrarTraduccion(Traduccion);
                break;
            case 3:
                MostrarTodo(Traduccion);
                break;
        }
    }

    public static Map<String, String> Agregar(Map<String, String> Traduccion){
        Scanner sc = new Scanner(System.in);
        String ingles = "";
        String espanol = "";

        System.out.println("Ingrese una nueva palabra");

        System.out.println("Ingles");
        ingles = sc.nextLine();

        System.out.println("Español");
        espanol = sc.nextLine();

        if (!Traduccion.containsKey(ingles)) {
            Traduccion.put(ingles, espanol);
            System.out.println(ingles + " - " + espanol + " Fue añadido correctamente.");
        } else {
            System.out.println("Ya estaba añadida");
        }

        return Traduccion;
    }

    public static void MostrarTraduccion(Map<String, String> Traduccion) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Busca la palabra en español:");
        String palabra = sc.nextLine();
        boolean encontrado = false;

        for (Map.Entry<String, String> entrada : Traduccion.entrySet()) {
            if (entrada.getValue().equalsIgnoreCase(palabra)) {
                System.out.println("La traducción al inglés de '" + palabra + "' es: " + entrada.getKey());
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("La palabra '" + palabra + "' no se encuentra en el diccionario.");
        }
    }


    public static void MostrarTodo(Map<String, String> Traduccion){
        for (Map.Entry<String, String> entry : Traduccion.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}