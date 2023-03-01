package mx.unam.Poo;

import java.util.Scanner;

public class JuegoGato {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese una cadena de 9 valores de estos tipos: \"X\" \"O\" \"_\" (-1 para salir)");
        int contador = 0;
        boolean tOrF = false;

        while (contador <= 0) {
            String cadena = lector.nextLine();
            char almacen[] = cadena.toCharArray();
            if (cadena.equals("-1")) {
                break;
            } else {
                if (cadena.length() == 9) {
                    for (int j = 0; j < 9; j++) {
                        if (almacen[j] == 'X' || almacen[j] == 'O' || almacen[j] == '_' || almacen[j] == 'x' || almacen[j] == 'o') {
                            if (j == 8) {
                                System.out.printf("|%c|%c|%c|%n|%c|%c|%c|%n|%c|%c|%c|%n", almacen[0], almacen[1], almacen[2], almacen[3], almacen[4], almacen[5], almacen[6], almacen[7], almacen[8]);
                                tOrF = true;
                                break;
                            }
                        } else {
                            System.out.printf("Intentalo de nuevo... solo admite estos valores: \"X\" \"O\" \"_\" (-1 pasa salir)%n");
                            break;
                        }
                    }
                } else {
                    System.out.printf("Oh oh intentalo de nuevo recuerda 9 valores (-1 para salir)%n");
                }
            }
            if (tOrF == true) {
                break;
            }
        }
    }
}
