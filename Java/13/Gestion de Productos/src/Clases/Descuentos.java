package Clases;
import java.util.*;
import javax.swing.*;


public class Descuentos {
    private String nombre;
    private double precio;
    private String categoria;

    private static List<String> ListNombre = new ArrayList<>();
    private static List<Double> ListPrecio = new ArrayList<>();
    private static List<Double> ListDescuento = new ArrayList<>();
    private static List<Double> ListPrecioTotal = new ArrayList<>();
    private static List<String> ListCategoria = new ArrayList<>();



    public Descuentos(String nombre) {
        this.nombre = nombre;

        ListNombre.add(nombre);
    }
    public Descuentos(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;

        ListNombre.add(nombre);
        ListPrecio.add(precio);

    }
    public Descuentos(String nombre, double precio, String categoria){
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;

        ListNombre.add(nombre);
        ListPrecio.add(precio);
        ListCategoria.add(categoria);

    }

    public double AplicarDescuento() {
        double descuento = precio * 0.1;
        double resultado = precio - descuento;

        ListDescuento.add(descuento);
        ListPrecioTotal.add(resultado);

        return resultado;
    }

    public double AplicarDescuento(double descuento) {
        descuento /= 100;
        double resultado = precio - (precio * descuento);

        ListDescuento.add(precio * descuento);
        ListPrecioTotal.add(resultado);

        return resultado;
    }

    public void mostrarDetalles() {
        System.out.println("Detalles de todos los productos:");

        for (int i = 0; i < ListNombre.size(); i++) {
            System.out.println("-------------------------------");
            System.out.println("Nombre: " + ListNombre.get(i));
            System.out.println("Categoría: " + ListCategoria.get(i));
            System.out.println("Precio original: " + ListPrecio.get(i));
            System.out.println("Descuento aplicado: " + ListDescuento.get(i));
            System.out.println("Precio final: " + ListPrecioTotal.get(i));
        }
    }
}
