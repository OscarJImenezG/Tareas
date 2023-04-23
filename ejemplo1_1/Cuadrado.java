package mx.unam.Poo.ejemplo1_1;

public class Cuadrado implements Figura {

    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double a) {
        this.lado = a;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }

    @Override
    public double calcularArea() {
        return this.lado * lado;
    }

    @Override
    public double calPerim() {
        return lado * 4;
    }

    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(4.5);
        System.out.printf("Area = %.2f", cuadrado.calcularArea());

    }
}
