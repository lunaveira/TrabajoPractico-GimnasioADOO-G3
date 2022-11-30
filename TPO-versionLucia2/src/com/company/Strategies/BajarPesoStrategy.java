package com.company.Strategies;

import com.company.Clients.Socio;

public class BajarPesoStrategy implements IObjetivoStrategy{

    private String nombreObjetivo;
    private int pesoObjetivo = (int) Math.random();


    public BajarPesoStrategy() {
        this.nombreObjetivo = "Bajar de peso";
    }

    public String toString() {
        return this.nombreObjetivo;
    }

    @Override
    public boolean objCumplido(Socio socio) {
        System.out.println("El objetivo de bajar peso fue cumplido");
        return socio.getPesoActual() == pesoObjetivo;

    }
}
