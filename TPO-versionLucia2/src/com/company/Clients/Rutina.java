package com.company.Clients;

import com.company.Observers.Constancia;
import com.company.Observers.TrofeoObservador;
import com.company.Strategies.ExigenciaMuscular;

import java.util.ArrayList;

public class Rutina {

    private int diasTraining;
    private Objetivo objetivo;
    private int duracion;
    private ArrayList<Entrenamiento> entrenamientos;
    private boolean cumplida = false;
    private GrupoMuscular grupoMuscular ;
    private ArrayList<TrofeoObservador> observadors;

    private int nivelAerobico;
    private int exigenciaMuscular;





    public Rutina(int nivelAerobico, ExigenciaMuscular exigenciaMuscular) {
        this.entrenamientos = new ArrayList<>();
        this.entrenamientos.add(new Entrenamiento(exigenciaMuscular,nivelAerobico,GrupoMuscular.PIERNAS));
        this.entrenamientos.add(new Entrenamiento(exigenciaMuscular,nivelAerobico,GrupoMuscular.PECHO));
        this.entrenamientos.add(new Entrenamiento(exigenciaMuscular,nivelAerobico,GrupoMuscular.ESPALDA));
        this.entrenamientos.add(new Entrenamiento(exigenciaMuscular,nivelAerobico,GrupoMuscular.BRAZOS));
        this.entrenamientos.add(new Entrenamiento(exigenciaMuscular,nivelAerobico,GrupoMuscular.HOMBROS));

        this.observadors = new ArrayList<>();
        TrofeoObservador constancia = new Constancia();
        this.observadors.add(constancia);
    }



    public void chequearRutinaCumplida() {
        for (Entrenamiento e : entrenamientos) {
            if (e.entrenamientoCumplido()) {
                for(TrofeoObservador tr : observadors) {
                    tr.chequearPremio();
                }
            }
        }
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

    public int getDiasTraining() {
        return diasTraining;
    }

    public void setDiasTraining(int diasTraining) {
        this.diasTraining = diasTraining;
    }

    public Objetivo getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(Objetivo objetivo) {
        this.objetivo = objetivo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public ArrayList<Entrenamiento> getEntrenamientos() {
        return entrenamientos;
    }

    public void setEntrenamientos(ArrayList<Entrenamiento> entrenamientos) {
        this.entrenamientos = entrenamientos;
    }

    public boolean isCumplida() {
        return cumplida;
    }

    public void setCumplida(boolean cumplida) {
        this.cumplida = cumplida;
    }

    public GrupoMuscular getGrupoMuscular() {
        return grupoMuscular;
    }

    public void setGrupoMuscular(GrupoMuscular grupoMuscular) {
        this.grupoMuscular = grupoMuscular;
    }

    public ArrayList<TrofeoObservador> getObservadors() {
        return observadors;
    }

    public void setObservadors(ArrayList<TrofeoObservador> observadors) {
        this.observadors = observadors;
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
}
