package operaciones;
import java.util.*;

public class operaciones {
    double a;
    double b;
    public operaciones(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double Suma(double a, double b) { return a + b;}
    public double Resta(double a, double b) { return a - b;}
    public double Multiplicacion(double a, double b) { return a * b;}
    public double Division(double a, double b) { return a / b;}
    public double Inversa(double a) { return 1/a;}
    public double Cuadrado(double a, double b){
        this.a = a;
        this.b = b;
        for (int i = 0; i < b; i++){
            a *= a;
        }
        return a;
    }

    public double RaizCuadrada(double a){
        return Math.sqrt(a);
    }

}
