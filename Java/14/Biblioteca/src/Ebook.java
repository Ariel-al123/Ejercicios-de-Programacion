class Ebook implements Prestable, Digital {
    private String titulo;
    private boolean prestado = false;

    public Ebook(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println(titulo + " (ebook) ha sido prestado.");
        }
    }

    @Override
    public void devolver() {
        if (prestado) {
            prestado = false;
            System.out.println(titulo + " (ebook) ha sido devuelto.");
        }
    }

    @Override
    public void descargar() {
        System.out.println("Descargando " + titulo + " en formato digital.");
    }
}