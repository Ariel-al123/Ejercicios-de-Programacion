import java.util.Scanner;

public class Mammal extends Animal {
     String Color;

    public Mammal(String Color, int age, String makeSound) {
        super(age, makeSound);
        this.Color = Color;
    }

    public String Color() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o color (HEX): ");
        Color = sc.nextLine();

        return Color;
    }

    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Mammal: " + Color + "\n");
    }
}
