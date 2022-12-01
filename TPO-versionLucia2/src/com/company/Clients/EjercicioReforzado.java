package com.company.Clients;

public class EjercicioReforzado extends Ejercicio {

    private int repsReforzadas;
    private int seriesReforzadas;
    private int pesoReforzado;
    private Ejercicio ejercicio;

    public EjercicioReforzado(Ejercicio ejercicio, int repsReforzadas, int seriesReforzadas, int pesoReforzado) {
        this.ejercicio = ejercicio;
        this.setNombreEjercicio(ejercicio.getNombreEjercicio());
        this.repsReforzadas = repsReforzadas;
        this.seriesReforzadas = seriesReforzadas;
        this.pesoReforzado = pesoReforzado;

    }



    public void reforzarEjercicio() {
        System.out.println("Ejercicio: " + ejercicio.getNombreEjercicio());
        System.out.println("Cantidad de series:  " + ejercicio.getSeries() * seriesReforzadas);
        System.out.println("Cantidad de repeticiones:  " + ejercicio.getReps() * repsReforzadas);
        System.out.println("Peso asignado:  " + ejercicio.getPesoAsignado() * pesoReforzado);
    }

}
