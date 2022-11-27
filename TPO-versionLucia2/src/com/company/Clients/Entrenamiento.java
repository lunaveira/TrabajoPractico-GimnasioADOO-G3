package com.company.Clients;

import java.util.ArrayList;

public class Entrenamiento {

    private ArrayList<Ejercicio> ejercicios;


    public Entrenamiento(ArrayList<Ejercicio> ejercicios) {
        this.ejercicios = ejercicios;
    }

    public Entrenamiento() {

    }

    public Entrenamiento nuevo() {
        ArrayList<Ejercicio> ejercicios = null;
        return new Entrenamiento(ejercicios);
    }

    public boolean entrenamientoCumplido(){
        return true;
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
