package com.company.Clients;

import java.util.ArrayList;

public class Entrenamiento {

    private ArrayList<Ejercicio> ejercicios;

    private boolean entrenamientoCompleto = false;

    /*
    public Entrenamiento(NivelExigencia nivel, int nivelAerobicoMinimo, GrupoMuscular grupo) {
        this.ejercicios = new ArrayList<Ejercicio>();
        this.ejercicios.add(new Ejercicio(grupo,nivelAerobicoMinimo,nivel));
        this.ejercicios.add(new Ejercicio(grupo,nivelAerobicoMinimo,nivel));
        this.ejercicios.add(new Ejercicio(grupo,nivelAerobicoMinimo,nivel));
    }

     */

    public Entrenamiento(ArrayList<Ejercicio> ejercicios) {
        this.ejercicios = ejercicios;
    }

    public Entrenamiento nuevo() {
        ArrayList<Ejercicio> ejercicios = null;
        return new Entrenamiento(ejercicios);
    }

    public boolean entrenamientoCumplido(){
        return this.entrenamientoCompleto = true;
    }

    public void mostrarEntrenamiento() {
        for (Ejercicio ejercicio : ejercicios) {
            ejercicio.mostrarCadaEjercicio();
        }
    }

    public void reforzarEntrenamiento(int reps, int series, int peso) {
        ArrayList<Ejercicio> lista = new ArrayList<>();
        for (Ejercicio ejercicio : ejercicios) {
            EjercicioReforzado reforzado = new EjercicioReforzado(ejercicio, reps, series, peso);
            lista.add(reforzado);
        }

        this.ejercicios = lista;
    }

}
