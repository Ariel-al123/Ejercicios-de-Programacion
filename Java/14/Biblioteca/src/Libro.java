interface Prestable {
    void prestar();
    void devolver();
}

interface Digital {
    void descargar();
}

public class Libro implements Prestable {
    private String titulo;
    private boolean prestado = false;

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println(titulo + " ha sido prestado.");
        }
    }

    @Override
    public void devolver() {
        if (prestado) {
            prestado = false;
            System.out.println(titulo + " ha sido devuelto.");
        }
    }
}
