package operaciones;

public class division {
    double a;
    double b;

    public division(double a, double b) {
        this.a = a;
        this.b = b;
    }
    //Getters
    public int getdivision(int a, int b) { return a / b;}
    public float getdivision(float a, float b) { return a / b;}
    public double getdivision(double a, double b) { return a / b;}

    //Setters
    public void setdivision(int a, int b) {
        return a / b;
    }
    public void setdivision(float a, float b) {
        return a / b;
    }
    public void setdivision(double a, double b){
        return a / b;
    }
}
