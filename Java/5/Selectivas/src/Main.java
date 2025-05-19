import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*Escriba un programa que dada una calificacion entre 50 y 100 de 10 en 10
      de el mensaje conrrecponduente al rango de la calificacion
     */

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite una calificacion ");
        byte calificacion = sc.nextByte();

        if (calificacion >= 50 && calificacion <= 59){
            System.out.println("Tu calificacion esta entre 50 y 59 ");
        } else if(calificacion >=60&&calificacion <=69) {
            System.out.println("Tu calificacion esta entre 60 y 69 ");
        } else if(calificacion >=70&&calificacion <=79) {
            System.out.println("Tu calificacion esta entre 70 y 79 ");
        } else if(calificacion >=80&&calificacion <=89) {
            System.out.println("Tu calificacion esta entre 80 y 89 ");
        }else if(calificacion >=90&&calificacion <=100) {
            System.out.println("Tu calificacion esta entre 90 y 100 ");
        }

    }
}
