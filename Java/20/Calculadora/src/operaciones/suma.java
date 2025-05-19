package operaciones;

public class suma {
    double a;
    double b;
    //Constructor
    public suma(double a, double b) {
        this.a = a;
        this.b = b;
    }
    //Getters
    public int getSuma(int a, int b) { return a + b;}
    public float getSuma(float a, float b) { return a + b;}
    public double getSuma(double a, double b){ return a+b;}

    //Setters
    public void setSuma(int a, int b) {
        a + b;
    }
    public void setSuma(float a, float b) {
         a + b;
    }
    public void setSuma(double a, double b){
        a + b;
    }
}
