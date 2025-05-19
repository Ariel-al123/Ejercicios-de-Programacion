import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero del 1-12");
        int mes = sc.nextInt();
        boolean bandera = false;
        do {
            if (!(mes >= 1 && mes <= 12)) {
                System.out.println("No hay un número entre 1-12");
                System.out.println("Vuelva a intentarlo");
                mes = sc.nextInt();
            } else {
                bandera = true;
            }
        }while(!bandera);

        System.out.println("1-. Ejercicio UNO");
        meses(mes);
        System.out.println("2-. Ejercicio DOS");
        String Meses = Mes(mes);
        System.out.println(Meses);
    }

    public static String Mes(int n1){
        String meses[] = {
                "Enero",
                "Febrero",
                "Marzo",
                "Abril",
                "Mayo",
                "Junio",
                "Julio",
                "Agosto",
                "Septiembre",
                "Octubre",
                "Noviembre",
                "Diciembre"
        };

        return meses[n1-1];
    }

    public static void meses(int n1){
        String meses[] = {
                "Enero",
                "Febrero",
                "Marzo",
                "Abril",
                "Mayo",
                "Junio",
                "Julio",
                "Agosto",
                "Septiembre",
                "Octubre",
                "Noviembre",
                "Diciembre"
        };
        System.out.println(meses[n1-1]);
    }
}