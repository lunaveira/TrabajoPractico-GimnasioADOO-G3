package com.company.Clients;

public class EjercicioReforzado extends Ejercicio {

    private int repsReforzadas;
    private int seriesReforzadas;
    private int pesoReforzado;
    private Ejercicio ejercicio;

    public EjercicioReforzado(Ejercicio ejercicio, Integer repsReforzadas, Integer seriesReforzadas, Integer pesoReforzado) {
        this.ejercicio = ejercicio;
        this.nombreEjercicio = ejercicio.getNombreEjercicio();
        this.repsReforzadas = repsReforzadas;
        this.seriesReforzadas = seriesReforzadas;
        this.pesoReforzado = pesoReforzado;
    }

    public int getRepsReforzadas() {
        return ejercicio.getReps() + repsReforzadas;
    }

    public int getSeriesReforzadas() {
        return ejercicio.getSeries() + seriesReforzadas;
    }

    public int getPesoReforzadas() {
        return ejercicio.getPesoAsignado() + pesoReforzado;
    }
}
