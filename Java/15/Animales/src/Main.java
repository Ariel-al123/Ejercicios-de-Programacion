public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(35, "muuuuuu");
        animal.mostrarDetalles();

        Mammal mammal = new Mammal("Verde", 12, "guaw guaw");
        mammal.mostrarDetalles();

        Fish fish = new Fish(3, "(chirridos)", "rios", "si");
        fish.mostrarDetalles();

        Bird bird = new Bird(15, "Si", 4, "pío, pío, pío");
        bird.mostrarDetalles();

        Reptiles reptiles = new Reptiles(3,"sss", "Si", 0);
        reptiles.mostrarDetalles();
    }
}