interface Reproducible {
    void play();
    void pause();
    void stop();
}

public class Cancion implements Reproducible {
    private String titulo;

    public Cancion(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void play() {
        System.out.println("Reproduciendo canción: " + titulo);
    }

    @Override
    public void pause() {
        System.out.println("Canción pausada: " + titulo);
    }

    @Override
    public void stop() {
        System.out.println("Canción detenida: " + titulo);
    }
}