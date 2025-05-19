// Clase abstracta base
public abstract class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public abstract void hacerSonido(); // Método abstracto

    public void dormir() {
        System.out.println(nombre + " está durmiendo.");
    }
}
