package operaciones;

public class cuadrado {
    double a;
    double b;

    public cuadrado(double a, double b) {
        this.a = a;
        this.b = b;
    }
    //Getters
    public int getcuadrado(int a, int b) {
        for (int i = 0; i < b; i++){
            a *= a;
        }

        return a;
    }
    public float getcuadrado(float a, float b) {
        for (int i = 0; i < b; i++){
            a *= a;
        }

        return a;
    }
    public double getcuadrado(double a, double b) {
        for (int i = 0; i < b; i++){
            a *= a;
        }

        return a;
    }

    //Setters
    public void setcuadrado(int a, int b) {
        for (int i = 0; i < b; i++){
            a *= a;
        }

    }
    public void setcuadrado(float a, float b) {
        for (int i = 0; i < b; i++){
            a *= a;
        }

    }
    public void setcuadrado(double a, double b){
        for (int i = 0; i < b; i++){
            a *= a;
        }
    }
}
