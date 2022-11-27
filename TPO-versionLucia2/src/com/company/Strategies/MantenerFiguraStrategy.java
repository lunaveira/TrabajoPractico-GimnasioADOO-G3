package com.company.Strategies;

import com.company.Clients.Socio;

public class MantenerFiguraStrategy implements IObjetivoStrategy{

    private String nombreObjetivo;
    private int valorConfigurable = 3;


    public MantenerFiguraStrategy() {
        this.nombreObjetivo = "Mantener la figura";
    }

    public String toString() {
        return this.nombreObjetivo;
    }

    @Override
    public boolean objCumplido(Socio socio) {
        if(socio.getPesoActual() < (socio.getPesoActual() + valorConfigurable) && socio.getPesoActual() > (socio.getPesoActual() + valorConfigurable)) {
            return true;
        }

        return false;
    }
}
