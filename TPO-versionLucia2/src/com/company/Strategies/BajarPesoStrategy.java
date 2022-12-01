package com.company.Strategies;

import com.company.Clients.Socio;

public class BajarPesoStrategy implements IObjetivoStrategy{

    private String nombreObjetivo;
    private int pesoObjetivo = 52;


    public BajarPesoStrategy() {
        this.nombreObjetivo = "Bajar de peso";
    }

    public String toString() {
        return this.nombreObjetivo;
    }

    @Override
    public boolean objCumplido(Socio socio) {

        if (socio.getPesoActual() <= pesoObjetivo) {
            System.out.println("El objetivo de bajar peso fue cumplido");
            return true;
        }
        return false;

    }
}
