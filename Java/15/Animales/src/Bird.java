import java.util.Scanner;

public class Bird extends Animal {
     double ancho ;
     String fly;

    public Bird(double ancho, String fly, int age, String makeSound) {
        super(age, makeSound);
        this.ancho = ancho;
        this.fly = fly;
    }
    public double ancho() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el ancho de la ala del ave");
        ancho = sc.nextDouble();
        return ancho;
    }

    public void fly() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Puede Volar??");
        System.out.print("[0] SI");
        System.out.print("[1] NO");
        boolean opc = sc.nextBoolean();
        if (opc) {
            fly = "Si";
        }else{
            fly = "No";
        }
    }
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("El ancho del ala es: " + ancho);
        System.out.println("El ave puede volar?? " + fly);
    }

}
