public class Automovil extends Vehiculo {
    String modelo;

    public Automovil(String moarca, int anio, String modelo) {
        super(moarca, anio);
        this.modelo = modelo;
    }

    //anotation
    @Override //sobre escirbe lo de abajo
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Modelo: " + modelo);
    }


}


