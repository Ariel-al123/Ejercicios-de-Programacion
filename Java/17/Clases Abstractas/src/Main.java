// Clase principal con el método main
public class Main {
    public static void main(String[] args) {
        Perro miPerro = new Perro("Firulais");
        Gato miGato = new Gato("Michi");

        miPerro.hacerSonido(); // Firulais dice: ¡Guau guau!
        miPerro.dormir();      // Firulais está durmiendo.

        miGato.hacerSonido();  // Michi dice: ¡Miau!
        miGato.dormir();       // Michi está durmiendo.
    }
}
