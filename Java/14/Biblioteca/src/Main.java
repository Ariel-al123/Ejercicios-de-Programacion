public class Main {
    public static void main(String[] args) {
        // Crear objetos
        Libro libroFisico = new Libro("Cien años de soledad");
        Ebook libroDigital = new Ebook("El principito");

        // Probar los métodos de Prestable
        System.out.println("--- Probando libros físicos ---");
        libroFisico.prestar();
        libroFisico.devolver();

        // Probar los métodos de ambas interfaces en Ebook
        System.out.println("\n--- Probando ebooks ---");
        libroDigital.prestar();
        libroDigital.descargar();
        libroDigital.devolver();

        // Probando polimorfismo con interfaces
        System.out.println("\n--- Probando polimorfismo ---");
        Prestable[] prestables = {libroFisico, libroDigital};
        for (Prestable item : prestables) {
            item.prestar();
            if (item instanceof Digital) {
                ((Digital) item).descargar();
            }
            item.devolver();
            System.out.println(); // Separador
        }
    }
}