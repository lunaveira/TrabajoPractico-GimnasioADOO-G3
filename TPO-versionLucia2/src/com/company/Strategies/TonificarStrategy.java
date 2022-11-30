package com.company.Strategies;

import com.company.Clients.Socio;

public class TonificarStrategy implements IObjetivoStrategy{

    private String nombreObjetivo;

    private int grasaIdeal = 30;
    private int masaIdeal = 70;


    public TonificarStrategy() {
        this.nombreObjetivo = "Tonificar el cuerpo";
    }

    public String toString() {
        return this.nombreObjetivo;
    }

    @Override
    public boolean objCumplido(Socio socio) {
        if (socio.getGrasaActual() <= grasaIdeal && socio.getMasaActual() >= masaIdeal) {
            System.out.println("El objetivo de tonificar fue cumplido");
            return true;
        }

        return false;
    }
}
