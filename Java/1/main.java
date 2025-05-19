import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un primer numero: ");
        int num1 = sc.nextInt();

        System.out.println("Ingrese un segundo numero: ");
        int num2 = sc.nextInt();

        System.out.println("+ Suma");
        System.out.println("- Resta");
        System.out.println("* Multiplicacion");
        System.out.println("/ Division");
        char operador =  sc.next().charAt(0);

        switch(operador){
            case '+':
                System.out.println(num1 + num2);
                break;
           case '-':
               System.out.println(num1 - num2);
               break;
           case '*':
               System.out.println(num1 * num2);
               break;
           case '/':
                System.out.println(num1 / num2);
               break;
            default:
                System.out.println("No se encontro un operador Valido");
        }



    }

}


