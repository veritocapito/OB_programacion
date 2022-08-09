package com.company;

public class CocheMain {
    public static void main(String[] args) {

        Coche miCoche = new Coche(4);

        miCoche.contarPuertas(1);
        System.out.println(miCoche.puertas);

    }
}
