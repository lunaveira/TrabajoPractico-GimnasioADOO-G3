package com.company.Clients;

public class Ejercicio {

    private int series;
    private int reps;
    private int pesoAsignado;
    private int nivelAerobico;
    private int exigenciaMuscular;
    private GrupoMuscular grupoMuscular;
    private String nombreEjercicio;


    public Ejercicio(int series, int reps, int pesoAsignado, int nivelAerobico, int exigenciaMuscular, GrupoMuscular grupoMuscular, String nombreEjercicio) {
        this.series = series;
        this.reps = reps;
        this.pesoAsignado = pesoAsignado;
        this.nivelAerobico = nivelAerobico;
        this.exigenciaMuscular = exigenciaMuscular;
        this.grupoMuscular = grupoMuscular;
        this.nombreEjercicio = nombreEjercicio;
    }

    public Ejercicio() {

    }

    public void mostrarCadaEjercicio() {
        System.out.println("Ejercicio: " + getNombreEjercicio());
        System.out.println("Cantidad de series: " + getSeries());
        System.out.println("Cantidad de repeticiones: " + getReps());
        System.out.println("Peso asignado: " + getPesoAsignado());
    }




    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public int getPesoAsignado() {
        return pesoAsignado;
    }

    public void setPesoAsignado(int pesoAsignado) {
        this.pesoAsignado = pesoAsignado;
    }

    public int getNivelAerobico() {
        return nivelAerobico;
    }

    public void setNivelAerobico(int nivelAerobico) {
        this.nivelAerobico = nivelAerobico;
    }

    public int getExigenciaMuscular() {
        return exigenciaMuscular;
    }

    public void setExigenciaMuscular(int exigenciaMuscular) {
        this.exigenciaMuscular = exigenciaMuscular;
    }

    public GrupoMuscular getGrupoMuscular() {
        return grupoMuscular;
    }

    public void setGrupoMuscular(GrupoMuscular grupoMuscular) {
        this.grupoMuscular = grupoMuscular;
    }

    public String getNombreEjercicio() {
        return nombreEjercicio;
    }

    public void setNombreEjercicio(String nombreEjercicio) {
        this.nombreEjercicio = nombreEjercicio;
    }
}
