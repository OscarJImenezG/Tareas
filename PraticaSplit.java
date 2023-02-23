package mx.unam.Poo;

import java.util.Scanner;

public class PraticaSplit {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Escribe tu nommbre, profesión y país: ");
        String datos = lector.nextLine();

        String[] datosSeparados = new String[3];

        System.arraycopy(datos.toUpperCase().split(" "), 0, datosSeparados, 0, 3);

        System.out.printf("Nombre: %8s%nProfesión: %9s%nPais: %11s", datosSeparados[0], datosSeparados[1], datosSeparados[2]);
    }
}
