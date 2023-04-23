package mx.unam.Poo.ejemplo1_1;

public class Main {
   
    public static void main(String args[]) {
        
        Circulo circulo = new Circulo(5.4);
        Cuadrado cuadrado = new Cuadrado(5.5);
        System.out.printf("CIRCULO%nArea = %.2f%nPerimetro = %.2f%nCUADRADO%nArea = %.2f%nPerimetro = %.2f", circulo.calcularArea(), circulo.calPerim(), cuadrado.calcularArea(), cuadrado.calPerim());
    }
}
