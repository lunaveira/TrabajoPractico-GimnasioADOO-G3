package com.company.Clients;

public class EjercicioReforzado extends Ejercicio {

    private int repsReforzadas;
    private int seriesReforzadas;
    private int pesoReforzado;
    private Ejercicio ejercicio;

    public EjercicioReforzado(Ejercicio ejercicio, int repsReforzadas, int seriesReforzadas, int pesoReforzado) {
        this.ejercicio = ejercicio;
        this.setNombre(ejercicio.getNombre());
        this.repsReforzadas = repsReforzadas;
        this.seriesReforzadas = seriesReforzadas;
        this.pesoReforzado = pesoReforzado;

    }



    public void reforzarEjercicio() {
        ejercicio.setSeries(ejercicio.getSeries() * seriesReforzadas);
        ejercicio.setReps(ejercicio.getReps() * repsReforzadas);
        ejercicio.setPesoAsignado(ejercicio.getPesoAsignado() * pesoReforzado);
    }

}
