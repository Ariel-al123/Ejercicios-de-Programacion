import java.util.*;
import Clases.*;


public class Main {
    public static void main(String[] args) {
        String nombre = "";
        double precio = 0;
        byte opcCategoria = 0;
        String categoria = "";
        boolean condicion = false;
        boolean condicionfinal = false;
        byte opc = 0;
        char simbolo = '+';
        double descuento = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el Tipo de Cliente: ");
        do {
            System.out.println("[3] Cliente 'Premium' ");
            System.out.println("[2] Cliente 'Frecuente' ");
            System.out.println("[1] Cliente 'Nuevo' ");
            System.out.println("-------------------------------");
            opc = sc.nextByte();
            if (opc >= 1 && opc <= 3) {
                condicion = true;
            } else {
                System.out.println("Introduzca un valor entre el 1 y 3) \n");
            }
            switch (opc){
                case 1: descuento = 5; break;
                case 2: descuento = 10; break;
                case 3: descuento = 15; break;
            }
        } while (!condicion);

        condicion = false;

        do {
            sc.nextLine(); // Limpiar buffer
            System.out.println("Ingrese el Nombre de Producto: ");
            nombre = sc.nextLine();

            System.out.println("Ingrese el Precio: ");
            precio = sc.nextDouble();

            do {
                System.out.println("------- Ingrese la Categoria: -------");
                System.out.println("[1] Alimentos y Bebidas");
                System.out.println("[2] Belleza y Cuidado Personal");
                System.out.println("[3] Electrónica y Tecnología");
                System.out.println("[4] Ropa y Accesorios");
                System.out.println("[5] Hogar y Decoración");
                System.out.println("[6] Deportes y Aire libre");
                opcCategoria = sc.nextByte();

                if (opcCategoria >= 1 && opcCategoria <= 6)
                    condicion = true;
                else
                    System.out.println("La categoria no es valida");

            } while (!condicion);
            condicion = false;

            switch (opcCategoria) {
                case 1: categoria = "Alimentos y Bebidas"; break;
                case 2: categoria = "Belleza y Cuidado Personal"; break;
                case 3: categoria = "Electrónica y Tecnología"; break;
                case 4: categoria = "Ropa y Accesorios"; break;
                case 5: categoria = "Hogar y Decoración"; break;
                case 6: categoria = "Deportes y Aire libre"; break;
            }

            // Crear objeto
            Descuentos producto = new Descuentos(nombre, precio, categoria);
            producto.AplicarDescuento(descuento); // Aplica el descuento según el tipo de cliente

            do {
                System.out.println("Desea añadir otro producto?");
                System.out.println("[+] Añadir");
                System.out.println("[-] Finalizar");
                simbolo = sc.next().charAt(0);
                if (simbolo == '+') {
                    condicion = true;
                } else if (simbolo == '-') {
                    condicion = true;
                    condicionfinal = true;
                    producto.mostrarDetalles();
                } else
                    System.out.println("Valor no valido");
            } while (!condicion);
            condicion = false;

        } while (!condicionfinal);

        System.out.println("\nFin del Programa 👩‍🚀👽");
    }
}
