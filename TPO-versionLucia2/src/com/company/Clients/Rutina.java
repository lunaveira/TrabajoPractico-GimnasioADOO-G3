package com.company.Clients;

import java.util.ArrayList;
import java.util.List;

public class Rutina {

    private int diasTraining;
    private Objetivo objetivo;
    private int duracion;
    private ArrayList<Entrenamiento> entrenamientos;
    private boolean cumplida = false;


    public Rutina(int diasTraining, Objetivo objetivo, int duracion, ArrayList<Entrenamiento> entrenamientos, boolean cumplida) {
        this.diasTraining = diasTraining;
        this.objetivo = objetivo;
        this.duracion = duracion;
        this.entrenamientos = entrenamientos;
        this.cumplida = cumplida;
    }

    public boolean rutinaCumplida() {
        for (Entrenamiento e : entrenamientos) {
            if (e.entrenamientoCumplido()) {
                return true;
            }
        }
        return false;
    }

    public void agregarEntrenamiento(Entrenamiento entrenamiento) {
       System.out.println("Entrenamiento agregado");
    }

    public void quitarEntrenamiento(Entrenamiento entrenamiento) {
        System.out.println("Entrenamiento eliminado");
    }

    public void mostrarCadaRutina() {
        for (Entrenamiento ent : this.entrenamientos) {
            ent.mostrarEntrenamiento();
        }

    }
    public void reforzarRutina(Integer repsReforzadas, Integer seriesReforzadas, Integer pesoReforzado) {
        for (Entrenamiento ent : this.entrenamientos) {
            ent.reforzarEntrenamiento(repsReforzadas, seriesReforzadas, pesoReforzado);
        }
    }

}
