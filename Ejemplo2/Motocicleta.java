package Ejemplo2;

public class Motocicleta implements Vehiculo {

    private int centimentroscubicos;
    private String marca;

    public Motocicleta() {
    }

    public Motocicleta(int centimentroscubicos, String marca) {
        this.centimentroscubicos = centimentroscubicos;
        this.marca = marca;
    }

    public int getCentimentroscubicos() {
        return centimentroscubicos;
    }

    public void setCentimentroscubicos(int centimentroscubicos) {
        this.centimentroscubicos = centimentroscubicos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Motocicleta{" + "centimentroscubicos=" + centimentroscubicos + ", marca=" + marca + '}';
    }

    public void haciendoUnCaballito() {
        System.out.println("Haciendo un caballito...");
    }

    @Override
    public boolean encender() {
        System.out.println("Encendiendo la motocicleta marca: " + this.marca);
        return true;
    }

    @Override
    public boolean apagar() {
        System.out.println("Apagando la motocicleta marca: " + this.marca);
        return true;
    }

    @Override
    public void avanzar() {
        System.out.println("Avanzando con la motocicleta de " + this.centimentroscubicos + "C.C.");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando con la motocicleta de " + this.centimentroscubicos + "C.C.");
    }

}
