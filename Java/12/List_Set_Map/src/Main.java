import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, List<String>> EstudiantesMaterias = new HashMap<>();
        Map<String, Set<String>> MateriasEstudiantes = new HashMap<>();
        Map<String, Map<String, Integer>> MateriasCalificaciones = new HashMap<>();

        EstudiantesMaterias.put("Ana", new ArrayList<>(Arrays.asList("Matematicas")));
        EstudiantesMaterias.put("Luis", new ArrayList<>(Arrays.asList("Historia", "Fisica")));

        MateriasEstudiantes.put("Matematicas", new HashSet<>(Arrays.asList("Ana")));
        MateriasEstudiantes.put("Historia", new HashSet<>(Arrays.asList("Luis")));
        MateriasEstudiantes.put("Fisica", new HashSet<>(Arrays.asList("Luis")));

        Map<String, Integer> calificacionesMat = new HashMap<>();
        calificacionesMat.put("Ana", 90);

        MateriasCalificaciones.put("Matematicas", calificacionesMat);
        Map<String, Integer> calificacionesHis = new HashMap<>();
        calificacionesHis.put("Luis", 85);

        MateriasCalificaciones.put("Historia", calificacionesHis);
        Map<String, Integer> calificacionesFis = new HashMap<>();
        calificacionesFis.put("Luis", 88);

        MateriasCalificaciones.put("Fisica", calificacionesFis);


        int opcion = 0;
        
        do {
            opcion = menu();
            redireccionar(opcion, EstudiantesMaterias, MateriasEstudiantes, MateriasCalificaciones);
        } while(opcion != 0);
        System.out.println("Programa finalizado.");
    }

    public static int menu() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        boolean continuar = false;
        do {
            System.out.println("1 - Agregar Materias para un estudiante");
            System.out.println("2 - Registrar Estudiante en una Materia");
            System.out.println("3 - Asociar Calificación final para un estudiante en una Materia");
            System.out.println("4 - Consultar Calificaciones de un estudiante");
            System.out.print("Seleccione una opción: ");
                opcion = sc.nextInt();
            if(opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4){
                continuar = true;
            }else{
                System.out.println("Opccion Invalida, Vuelva a intentarlo");
            }
        }while(!continuar);
        return opcion;
    }

    public static void redireccionar(int opcion,
                                     Map<String, List<String>> EstudiantesMaterias,
                                     Map<String, Set<String>> MateriasEstudiantes,
                                     Map<String, Map<String, Integer>> MateriasCalificaciones) {
        switch(opcion) {
            case 1:
                AgregarMaterias(EstudiantesMaterias);
                break;
            case 2:
                registrarEstudiante(MateriasEstudiantes);
                break;
            case 3:
                asociarCalificaciones(MateriasEstudiantes, MateriasCalificaciones);
                break;
            case 4:
                consultarCalificaciones(MateriasCalificaciones);
                break;
        }
    }

    public static void AgregarMaterias(Map<String, List<String>> EstudiantesMaterias) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del estudiante: ");
        String estudiante = sc.nextLine();
        System.out.print("Ingrese el nombre de la materia a agregar: ");
        String materia = sc.nextLine();

        List<String> materias = EstudiantesMaterias.getOrDefault(estudiante, new ArrayList<>());
        if(!materias.contains(materia)) {
            materias.add(materia);
            EstudiantesMaterias.put(estudiante, materias);
            System.out.println("Materia '" + materia + "' agregada para el estudiante " + estudiante + ".");
        } else {
            System.out.println("El estudiante ya cursa la materia '" + materia + "'.");
        }
    }

    public static void registrarEstudiante(Map<String, Set<String>> MateriasEstudiantes) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la materia: ");
        String materia = sc.nextLine();
        System.out.print("Ingrese el nombre del estudiante a registrar: ");
        String estudiante = sc.nextLine();

        Set<String> estudiantes = MateriasEstudiantes.getOrDefault(materia, new HashSet<>());
        if(estudiantes.add(estudiante)) {
            MateriasEstudiantes.put(materia, estudiantes);
            System.out.println("Estudiante " + estudiante + " registrado en la materia '" + materia + "'.");
        } else {
            System.out.println("El estudiante " + estudiante + " ya se encuentra registrado en la materia '" + materia + "'.");
        }
    }


    public static void asociarCalificaciones( Map<String, Set<String>> MateriasEstudiantes, Map<String, Map<String, Integer>> MateriasCalificaciones) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la materia: ");
        String materia = sc.nextLine();
        System.out.print("Ingrese el nombre del estudiante: ");
        String estudiante = sc.nextLine();
        System.out.println("Ingrese la calificación final (0-100): ");
        int calificacion = sc.nextInt();

        Set<String> estudiantes = MateriasEstudiantes.get(materia);
        if(estudiantes == null || !estudiantes.contains(estudiante)) {
            System.out.println("El estudiante " + estudiante + " no se encuentra registrado en la materia '" + materia + "'.");
            return;
        }

        Map<String, Integer> calificaciones = MateriasCalificaciones.getOrDefault(materia, new HashMap<>());
        calificaciones.put(estudiante, calificacion);
        MateriasCalificaciones.put(materia, calificaciones);
        System.out.println("Calificación registrada para el estudiante " + estudiante + " en la materia '" + materia + "'.");
    }

    public static void consultarCalificaciones(Map<String, Map<String, Integer>> MateriasCalificaciones) {
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Ingrese el nombre del estudiante: ");
        String estudiante = sc.nextLine();
        boolean encontrado = false;

        System.out.println("\n--- Calificaciones para " + estudiante + " ---");

        for(String materia : MateriasCalificaciones.keySet()) {
            Map<String, Integer> calificaciones = MateriasCalificaciones.get(materia);
            if(calificaciones.containsKey(estudiante)) {
                System.out.println("Materia: " + materia + " - Calificación: " + calificaciones.get(estudiante));
                encontrado = true;
            }
        }
        if(!encontrado) {
            System.out.println("No se encontraron calificaciones para el estudiante " + estudiante + ".");
        }
    }
}
