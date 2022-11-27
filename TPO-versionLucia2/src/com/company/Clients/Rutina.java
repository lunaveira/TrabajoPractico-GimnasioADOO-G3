package com.company.Clients;

import java.util.ArrayList;
import java.util.List;

public class Rutina {

    private int diasTraining;
    private Objetivo objetivo;
    private int duracion;
    private ArrayList<Entrenamiento> entrenamientos;
    private boolean cumplida = false;


    public Rutina() {
    }

    public void crearRutina(){
        Rutina rutina = new Rutina();
        System.out.println("rutina creada");
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



}
