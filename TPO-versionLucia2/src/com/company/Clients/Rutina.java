package com.company.Clients;

import java.util.ArrayList;
import java.util.List;

public class Rutina {

    private int diasTraining;
    private Objetivo objetivo;
    private int duracion;
    private ArrayList<Entrenamiento> entrenamientos;
    private boolean cumplida = false;
    private GrupoMuscular grupoMuscular ;


    public Rutina() {
       this.entrenamientos = new ArrayList<Entrenamiento>();
       this.entrenamientos.add(new Entrenamiento(GrupoMuscular.BRAZOS, "Vuelos laterales"));
       this.entrenamientos.add(new Entrenamiento(GrupoMuscular.ESPALDA, "Remo con barra"));
       this.entrenamientos.add(new Entrenamiento(GrupoMuscular.PECHO, "Press banco plano"));
       this.entrenamientos.add(new Entrenamiento(GrupoMuscular.PIERNAS, "Sentadillas"));
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

    public void mostrarCadaRutina() {
        for (Entrenamiento entrenamiento : this.entrenamientos) {
            entrenamiento.mostrarEntrenamiento();
        }

    }

    public void reforzarRutina(int repsReforzadas, int seriesReforzadas, int pesoReforzado) {
        for (Entrenamiento entrenamiento : entrenamientos) {
            entrenamiento.reforzarEntrenamiento(repsReforzadas, seriesReforzadas, pesoReforzado);
            entrenamiento.mostrarEntrenamiento();
        }
    }




}
