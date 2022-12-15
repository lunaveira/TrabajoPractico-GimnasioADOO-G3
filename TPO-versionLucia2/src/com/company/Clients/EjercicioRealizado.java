package com.company.Clients;

import com.company.Strategies.ExigenciaMuscular;

import java.util.Random;
import java.util.stream.*;

public class EjercicioRealizado {
    Random random = new Random();
    private int series;
    private int reps;
    private int pesoAsignado;
    private int nivelAerobico;
    private ExigenciaMuscular exigenciaMuscular;
    private GrupoMuscular grupoMuscular;
    private String nombre;


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

    public String getNombre() {
        return nombre;
    }


    public EjercicioRealizado(String nombre, ExigenciaMuscular exigenciaMuscular, int nivelAerobico , GrupoMuscular grupo){
        this.series = random.nextInt(6 - 1 + 1) + 2;
        this.reps =  random.nextInt(15 - 5 + 1) + 5;
        this.pesoAsignado = random.nextInt(100 - 90 + 1) + 90;
        this.nivelAerobico = nivelAerobico;
        this.exigenciaMuscular = exigenciaMuscular;
        this.grupoMuscular = grupo;
        this.nombre = nombre;
    }

    public EjercicioRealizado(Ejercicio ejercicio){
        this.series = ejercicio.getSeries();
        this.reps =  ejercicio.getReps();
        this.pesoAsignado = ejercicio.getPesoAsignado();
        this.nivelAerobico = ejercicio.getNivelAerobico();
        this.exigenciaMuscular = ejercicio.getExigenciaMuscular();
        this.grupoMuscular = ejercicio.getGrupoMuscular();
        this.nombre = ejercicio.getNombre();

    }
}
