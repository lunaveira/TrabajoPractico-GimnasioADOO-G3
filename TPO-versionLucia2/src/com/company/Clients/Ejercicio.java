package com.company.Clients;

import com.company.Strategies.ExigenciaMuscular;

import java.util.ArrayList;
import java.util.Random;
import java.util.random.*;

public class Ejercicio {

    Random random = new Random();
    private int series;
    private int reps;
    private int pesoAsignado;
    private int nivelAerobico;
    private ExigenciaMuscular exigenciaMuscular;
    private GrupoMuscular grupoMuscular;

    private String nombre;

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";


    public Ejercicio(){
    }

    public Ejercicio(String nombre, ExigenciaMuscular exigenciaMuscular, int nivelAerobico , GrupoMuscular grupo) {
        this.series = random.nextInt(4 - 2 + 1) + 2;
        this.reps =  random.nextInt(15 - 5 + 1) + 5;
        this.pesoAsignado = random.nextInt(100 - 90 + 1) + 90;
        this.nivelAerobico = nivelAerobico;
        this.exigenciaMuscular = exigenciaMuscular;
        this.grupoMuscular = grupo;
        this.nombre = nombre;
    }

    public void mostrarCadaEjercicio() {
        System.out.println(getNombre() + " | " + ANSI_RED +"Sets: " +  getSeries() + ANSI_RESET + " | " +ANSI_RED +"Reps: " + getReps() +ANSI_RESET +" | " +ANSI_RED +"Load: " + getPesoAsignado() + "Kg"+ ANSI_RESET);

    }

    public ExigenciaMuscular getExigenciaMuscular() {
        return exigenciaMuscular;
    }

    public void setExigenciaMuscular(ExigenciaMuscular exigenciaMuscular) {
        this.exigenciaMuscular = exigenciaMuscular;
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
