package mx.unam.Poo;

import java.util.Scanner;

public class PractucaString {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Escribe tu nombre, profesión y país: ");
        String datos = lector.nextLine();

        String[] datosSeparados = datos.toUpperCase().split(" ");

        System.out.printf("Nombre: %8s%nProfesión: %9s%nPais: %11s", datosSeparados[0], datosSeparados[1], datosSeparados[2]);
    }
}
