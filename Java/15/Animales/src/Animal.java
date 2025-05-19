import java.util.Scanner;

public class Animal {
    private int age;
    private String makeSound;

    public Animal(int age, String makeSound) {
        this.age = age;
        this.makeSound = makeSound;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMakeSound() {
        return makeSound;
    }

    public void setMakeSound(String makeSound) {
        this.makeSound = makeSound;
    }

    public void mostrarDetalles() {
        System.out.println("Age : " + age);
        System.out.println("El animal hace: " + makeSound);
    }
}
