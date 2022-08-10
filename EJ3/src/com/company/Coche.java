package com.company;

public class Coche {
    Integer puertas;

    public Coche (Integer puertas){
        this.puertas = puertas;
    }

    public void contarPuertas (Integer cantidad) {
        if (cantidad > 0 && cantidad <= 6) {
            this.puertas += cantidad;
        }
    }


}
