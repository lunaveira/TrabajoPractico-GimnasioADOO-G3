package com.company.Clients;

import com.company.Strategies.ExigenciaMuscular;

import java.util.ArrayList;

public class Ejercicio {

    private int series;
    private int reps;
    private int pesoAsignado;
    private int nivelAerobico;
    private ExigenciaMuscular exigenciaMuscular;
    private GrupoMuscular grupoMuscular;

    private String nombre;



    public Ejercicio(String nombre, ExigenciaMuscular exigenciaMuscular, int nivelAerobico , GrupoMuscular grupo) {
        this.series = 3;
        this.reps =  12;
        this.pesoAsignado = 10;
        this.nivelAerobico = nivelAerobico;
        this.exigenciaMuscular = exigenciaMuscular;
        this.grupoMuscular = grupo;
        this.nombre = nombre;
    }

    public Ejercicio() {

    }

    public void mostrarCadaEjercicio() {
        System.out.println("Ejercicio: "+ getNombre());
        System.out.println("Cantidad de series: " + getSeries());
        System.out.println("Cantidad de repeticiones: " + getReps());
        System.out.println("Peso asignado: " + getPesoAsignado());
        System.out.println(" ");
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


    public GrupoMuscular getGrupoMuscular() {
        return grupoMuscular;
    }

    public void setGrupoMuscular(GrupoMuscular grupoMuscular) {
        this.grupoMuscular = grupoMuscular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
