package mx.unam.Poo;

import java.util.Scanner;

public class MaquinaDeCafe {

    Scanner lector = new Scanner(System.in);
    private int depositoAgua;
    private int depositoCafe;
    private int depositoCrema;
    private boolean maquinaOperando;
    private boolean[] vasos;
    private int i;

    public MaquinaDeCafe() {
        depositoAgua = 5000;
        depositoCafe = 1000;
        depositoCrema = 1500;
        maquinaOperando = true;
        vasos = new boolean[50];
        i = 49;

    }

    public MaquinaDeCafe(int depositoAgua, int depositoCafe, int depositoCrema, boolean maquinaOperando, boolean[] vasos, int i) {
        this.depositoAgua = depositoAgua;
        this.depositoCafe = depositoCafe;
        this.depositoCrema = depositoCrema;
        this.maquinaOperando = maquinaOperando;
        this.vasos = vasos;
        this.i = i;
    }

    public int getDepositoAgua() {
        return depositoAgua;
    }

    public int getDepositoCafe() {
        return depositoCafe;
    }

    public int getDepositoCrema() {
        return depositoCrema;
    }

    public boolean isMaquinaOperando() {
        return maquinaOperando;
    }

    public boolean[] getVasos() {
        return vasos;
    }

    public int getI() {
        return i;
    }

    public void setDepositoAgua(int depositoAgua) {
        this.depositoAgua = depositoAgua;
    }

    public void setDepositoCafe(int depositoCafe) {
        this.depositoCafe = depositoCafe;
    }

    public void setDepositoCrema(int depositoCrema) {
        this.depositoCrema = depositoCrema;
    }

    public void setMaquinaOperando(boolean maquinaOperando) {
        this.maquinaOperando = maquinaOperando;
    }

    public void setVasos(boolean[] vasos) {
        this.vasos = vasos;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Estado de la cafetera\nDeposito de Agua: " + depositoAgua + " ml."
                + "\nDeposito de cafe: " + depositoCafe + " grs." + "\nDeposito de Crema: " + depositoCrema + " ml."
                + "\nVasos " + i + " piezas.";
    }

    public String EstadoDeMaquina() {
        return toString();
    }

    public boolean EvaluacionDeInsumos() {
        String problema = "", faltanVasos = "no hay vasos", faltaAgua = "no hay agua", faltaCafe = "no hay cafe", faltaCrema = "no hay crema";
        if (depositoAgua >= 0 && depositoAgua < 100) {
            maquinaOperando = false;
            problema = faltaAgua;
        }
        if (depositoCafe >= 0 && depositoCafe < 14) {
            maquinaOperando = false;
            problema = faltaCafe;
        }
        if (depositoCrema >= 0 && depositoCrema < 70) {
            maquinaOperando = false;
            problema = faltaCrema;
        }
        if (vasos[0] == true) {
            maquinaOperando = false;
            problema = faltanVasos;
        }
        if (maquinaOperando == false) {
            System.out.printf("La cafetera no puede operar %s...%n", problema);
        } else {

            System.out.println("La cafetera esta preparando tu cafe...");
        }
        return maquinaOperando;
    }

    public boolean ServirAmericano() {
        EvaluacionDeInsumos();
        if (maquinaOperando == true) {
            depositoAgua -= 180;
            depositoCafe -= 15;
            vasos[i] = true;
            System.out.println("Tu cafe Americano esta listo!!!");
            i--;
        } else {
            System.out.println(toString());
            System.out.println("");
        }
        return maquinaOperando;
    }

    public boolean ServirExpreso() {
        EvaluacionDeInsumos();
        if (maquinaOperando == true) {
            depositoAgua -= 120;
            depositoCafe -= 20;
            vasos[i] = true;
            i--;
            System.out.println("Tu cafe Expreso esta listo!!!");
        } else {
            System.out.println(toString());
        }
        return maquinaOperando;
    }

    public boolean ServirCapuchino() {
        EvaluacionDeInsumos();
        if (maquinaOperando == true) {
            depositoAgua -= 100;
            depositoCafe -= 14;
            depositoCrema -= 70;
            vasos[i] = true;
            i--;
            System.out.println("Tu cafe Capuchino esta listo!!!");
        } else {
            System.out.println(toString());
        }
        return maquinaOperando;
    }

    public static void main(String[] args) {
        MaquinaDeCafe cafetera = new MaquinaDeCafe();

        System.out.println(cafetera.EstadoDeMaquina());
        for (int i = 0; i <= 8; i++) {
            cafetera.ServirAmericano();
            cafetera.ServirAmericano();
            cafetera.ServirCapuchino();
            cafetera.ServirExpreso();
            cafetera.ServirCapuchino();
            
        }
    }
}
