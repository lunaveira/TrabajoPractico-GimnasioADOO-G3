package com.company.Clients;

public class Ejercicio {

    protected int series;
    protected int reps;
    protected int pesoAsignado;
    protected int nivelAerobico;
    protected int exigenciaMuscular;
    protected GrupoMuscular grupoMuscular;
    protected String nombreEjercicio;


    public Ejercicio( GrupoMuscular grupoMuscular, String nombreEjercicio) {
        this.series = 3;
        this.reps =  12;
        this.pesoAsignado = 10;
        this.nivelAerobico = 5;
        this.exigenciaMuscular = 10;
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
