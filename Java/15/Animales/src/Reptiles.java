import java.util.Scanner;

public class Reptiles extends Animal {
    String Venenoso;
    int cantPatas;

    public Reptiles(int age, String makeSound, String Venenoso, int cantPatas) {
        super(age, makeSound);
        this.Venenoso = Venenoso;
        this.cantPatas = cantPatas;
    }

    public int cantPatas() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Menciona la cantidad de patas porfavor");
        cantPatas = sc.nextByte();
        return cantPatas;
    }

    public String Venenoso() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Es Venenoso??");
        System.out.println("[0] No");
        System.out.println("[1] Si");
        boolean opcVeneno = sc.nextBoolean();

        if (opcVeneno)
            Venenoso = "Si";
        else
            Venenoso = "No";

        return Venenoso;
    }

    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Es venenoso?? " + Venenoso);
        System.out.println("La cantidad de patas es: " + cantPatas);
    }
}
