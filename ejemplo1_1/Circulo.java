package mx.unam.Poo.ejemplo1_1;

public class Circulo implements Figura {

    private static double PI = 3.1416;
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return (PI * Math.pow(radio, 2));
    }
    
    @Override
    public double calPerim(){
        return (PI * (radio + radio));
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        System.out.printf("Area del circulo = %.2f%nPerimetro del circulo = %.2f", circulo.calcularArea(), circulo.calPerim());
    }

}
