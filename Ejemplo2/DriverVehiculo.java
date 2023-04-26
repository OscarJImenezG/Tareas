package Ejemplo2;

public class DriverVehiculo {

    public static void main(String args[]) {
        Camion camion = new Camion("Diesel", 3);
        camion.frenar();
        System.out.println(camion);
        System.out.println(camion.encender());
        camion.avanzar();
        camion.frenar();
        System.out.println(camion.apagar());
        
        Motocicleta moto = new Motocicleta(150, "Yamaha");
        System.out.println(moto);
        moto.encender();
        moto.avanzar();
        moto.haciendoUnCaballito();
        moto.frenar();
        moto.apagar();
        

    }
}
