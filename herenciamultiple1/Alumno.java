package mx.unam.Poo.herenciamultiple1;

public class Alumno extends Persona{
    private int numeroCuenta;
    private String carrera;
    private double promedio;
    
    public Alumno(){
    }
    
    public Alumno(String nombre, int edad){
        super(nombre, edad);
    }

    public Alumno(int numeroCuenta, String carrera, double promedio) {
        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public Alumno(int numeroCuenta, String carrera, double promedio, String nombre, int edad) {
        super(nombre, edad);
        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
        this.promedio = promedio;
    }
    
    public static void main(String[] args) {
        System.out.println("hola");
    }

    @Override
    public String toString() {
        return super.toString() + " Alumno{" + "numeroCuenta=" + numeroCuenta + ", carrera=" + carrera + ", promedio=" + promedio + '}';
    }
    
    
}
