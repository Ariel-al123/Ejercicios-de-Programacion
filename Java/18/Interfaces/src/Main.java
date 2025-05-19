public class Main {
    public static void main(String[] args) {
        // Crear una canción
        Cancion miCancion = new Cancion("Bohemian Rhapsody");

        // Probar los métodos de la interfaz
        System.out.println("--- Probando interfaz Reproducible ---");
        miCancion.play();
        miCancion.pause();
        miCancion.stop();

        // También podemos usar polimorfismo
        Reproducible elemento = new Cancion("Imagine");
        System.out.println("\n--- Probando polimorfismo ---");
        elemento.play();
        elemento.pause();
        elemento.stop();
    }
}