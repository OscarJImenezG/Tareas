package mx.unam.Poo;

import java.util.Scanner;

public class CodigoAscii {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        //Cosidero que esta parte del proceso se explica sola
        System.out.println("Ingresa una cadena de caracteres: ");
        String cadena = lector.nextLine();
        int trueOrFalse = 2;
        // Cree un arreglo que servira para despues...
        Integer[] almacenDeLetras = new Integer[cadena.length()];
        System.out.println("Tecleaste: " + cadena);

        //Para separar los caracteres usamos un for y el metodo .charAt
        for (int contador = 0; contador < cadena.length(); contador++) {
            System.out.printf("El valor decimal de: %c es: %d%n", cadena.charAt(contador), (int) cadena.charAt(contador));
            // Almaceno los numeros Ascci en un arreglo
            almacenDeLetras[contador] = (int) cadena.charAt(contador);

        }
        //Ahora bien utilice otro for y un if-else para comparar y determinar si son consecutivos 
        //los simbolos en el codigo Ascii
        for (int contador = 0; contador < cadena.length() - 1; contador++) {
            if (almacenDeLetras[contador] + 1 == (almacenDeLetras[contador + 1])) {
                trueOrFalse = 1;
            } else {
                trueOrFalse = 0;
                break;
            }
        }
        // Utilice la variable "trueOrFalse" entera para saber si era cierta o falsa la consecutividad
        if (trueOrFalse == 1) {
            System.out.printf("True!!...%n La cadena de valores SI! es consecutiva%n");
        } else {
            System.out.printf("False!!...%n La cadena de valores NO! es consecutiva%n");
        }
    }
}
