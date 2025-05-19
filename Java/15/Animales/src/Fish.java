import java.util.Scanner;

public class Fish extends Animal {
     String habitat;
     String swim;

    public Fish(int age, String makeSound, String habitat, String swim) {
        super(age, makeSound);
        this.habitat = habitat;
        this.swim = swim;
    }

    public String Habitat() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Menciona su habitat porfavor");
        habitat = sc.nextLine();
        return habitat;
    }

    public String Swim() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nada??");
        System.out.println("[0] No");
        System.out.println("[1] Si");
        boolean opcswim = sc.nextBoolean();

        if (opcswim)
            swim = "Si";
        else
            swim = "No";

        return swim;
    }

    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("El Habitat es: " + habitat);
        System.out.println("El swim es: " + swim);
    }

}