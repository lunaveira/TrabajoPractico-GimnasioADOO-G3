package com.company.Strategies;

import com.company.Clients.Rutina;
import com.company.Clients.Socio;

public class MantenerFiguraStrategy implements IObjetivoStrategy{

    private String nombreObjetivo;
    private int valorConfigurable = 3;


    private int nivelAerobico = 3;
    private ExigenciaMuscular exigenciaMuscular = ExigenciaMuscular.MEDIA;


    public MantenerFiguraStrategy() {
        this.nombreObjetivo = "Mantener la figura";
    }

    public String toString() {
        return this.nombreObjetivo;
    }

    @Override
    public boolean objCumplido(Socio socio) {
        if(socio.getPesoActual() < (socio.getPesoActual() + valorConfigurable) && socio.getPesoActual() > (socio.getPesoActual() + valorConfigurable)) {
            System.out.println("El objetivo de mantener la figura fue cumplido");
            return true;
        }

        return false;
    }

    public Rutina crearRutina() {
        return new Rutina( nivelAerobico,  exigenciaMuscular);
    }
}
