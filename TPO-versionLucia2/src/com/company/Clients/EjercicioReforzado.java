package com.company.Clients;

public class EjercicioReforzado extends Ejercicio {

    private int reps;
    private int series;
    private int peso;
    private Ejercicio ejercicio;

    public EjercicioReforzado(Ejercicio ejercicio, int reps, int series, int peso) {
        this.ejercicio = ejercicio;
        this.reps = reps;
        this.series = series;
        this.peso = peso;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
