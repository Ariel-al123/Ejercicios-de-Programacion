public class Main {
    public static void main(String[] args) {
        Vehiculo miVehiculo = new Vehiculo("Nissan", 2025);
        miVehiculo.mostrarDetalles();

        Automovil miSedan = new Automovil("Toyota", 2023, "Corolla");
        miSedan.mostrarDetalles();

        Automovil miDeportiva = new Automovil("Honda", 2021, "CBR600RR");
        miDeportiva.mostrarDetalles();

        Automovil miCargaPesada = new Automovil("Kenworth", 2024, "T680");
        miCargaPesada.mostrarDetalles();

        Automovil miMontaña = new Automovil("Specialized", 2022, "Stumpjumper EVO");
        miMontaña.mostrarDetalles();

        Automovil miTransportePublico = new Automovil("Mercedes-Benz", 2020, "O 500 RSD 2445");
        miTransportePublico.mostrarDetalles();

        Automovil miPickUp = new Automovil("Ford", 2023, "Ranger Raptor");
        miPickUp.mostrarDetalles();
    }
}