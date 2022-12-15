package com.company.Clients;

import com.company.Strategies.ExigenciaMuscular;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Entrenamiento {

    private ArrayList<Ejercicio> ejercicios;
    private ArrayList<EjercicioRealizado> ejerciciosRealizados;


    private boolean entrenamientoCompleto = false;


    public Entrenamiento(ExigenciaMuscular exigenciaMuscular, int nivelAerobico , GrupoMuscular grupo) {
        this.ejercicios = new ArrayList<>();
        this.ejerciciosRealizados = new ArrayList<>();
        if(exigenciaMuscular.equals(ExigenciaMuscular.BAJA)){
            if(grupo.equals(GrupoMuscular.PIERNAS)){
                // PIERNAS
                Ejercicio ejercicio1pierna = new Ejercicio("Sentadillas con barra",exigenciaMuscular,nivelAerobico,GrupoMuscular.PIERNAS);
                Ejercicio ejercicio2pierna = new Ejercicio("Sentadillas frontales",exigenciaMuscular,nivelAerobico,GrupoMuscular.PIERNAS);
                Ejercicio ejercicio3pierna = new Ejercicio("Peso muerto",exigenciaMuscular,nivelAerobico,GrupoMuscular.PIERNAS);
                ejercicios.add(ejercicio1pierna);
                ejercicios.add(ejercicio2pierna);
                ejercicios.add(ejercicio3pierna);
                //Ej realizado
                EjercicioRealizado ejercicioRealizado1pierna = new EjercicioRealizado("Sentadillas con barra",exigenciaMuscular,nivelAerobico,GrupoMuscular.PIERNAS);
                EjercicioRealizado ejercicioRealizado2pierna = new EjercicioRealizado("Sentadillas frontales",exigenciaMuscular,nivelAerobico,GrupoMuscular.PIERNAS);
                EjercicioRealizado ejercicioRealizado3pierna = new EjercicioRealizado("Peso muerto",exigenciaMuscular,nivelAerobico,GrupoMuscular.PIERNAS);
                ejerciciosRealizados.add(ejercicioRealizado1pierna);
                ejerciciosRealizados.add(ejercicioRealizado2pierna);
                ejerciciosRealizados.add(ejercicioRealizado3pierna);
            } else if (grupo.equals(GrupoMuscular.PECHO)){
                // PECHO
                Ejercicio ejercicio1pecho = new Ejercicio("Press de banca inclinado",exigenciaMuscular,nivelAerobico,GrupoMuscular.PECHO);
                Ejercicio ejercicio2pecho = new Ejercicio("Flexiones con peso",exigenciaMuscular,nivelAerobico,GrupoMuscular.PECHO);
                Ejercicio ejercicio3pecho = new Ejercicio("Press de banca con agarre cerrado",exigenciaMuscular,nivelAerobico,GrupoMuscular.PECHO);
                ejercicios.add(ejercicio1pecho);
                ejercicios.add(ejercicio2pecho);
                ejercicios.add(ejercicio3pecho);
                //Ej realizado
                EjercicioRealizado ejercicioRealizado1pecho = new EjercicioRealizado("Press de banca inclinado",exigenciaMuscular,nivelAerobico,GrupoMuscular.PECHO);
                EjercicioRealizado ejercicioRealizado2pecho = new EjercicioRealizado("Flexiones con peso",exigenciaMuscular,nivelAerobico,GrupoMuscular.PECHO);
                EjercicioRealizado ejercicioRealizado3pecho = new EjercicioRealizado("Press de banca con agarre cerrado",exigenciaMuscular,nivelAerobico,GrupoMuscular.PECHO);
                ejerciciosRealizados.add(ejercicioRealizado1pecho);
                ejerciciosRealizados.add(ejercicioRealizado2pecho);
                ejerciciosRealizados.add(ejercicioRealizado3pecho);
            } else if(grupo.equals(GrupoMuscular.ESPALDA)){
                // ESPALDA
                Ejercicio ejercicio21 = new Ejercicio("Band bent over row",exigenciaMuscular,nivelAerobico,GrupoMuscular.ESPALDA);
                Ejercicio ejercicio22 = new Ejercicio("Renegade row",exigenciaMuscular,nivelAerobico,GrupoMuscular.ESPALDA);
                Ejercicio ejercicio23 = new Ejercicio("Remo con mancuerna a una mano",exigenciaMuscular,nivelAerobico,GrupoMuscular.ESPALDA);
                ejercicios.add(ejercicio21);
                ejercicios.add(ejercicio22);
                ejercicios.add(ejercicio23);
                EjercicioRealizado ejercicioRealizado1espalda = new EjercicioRealizado("Band bent over row",exigenciaMuscular,nivelAerobico,GrupoMuscular.ESPALDA);
                EjercicioRealizado ejercicioRealizado2espalda = new EjercicioRealizado("Renegade row",exigenciaMuscular,nivelAerobico,GrupoMuscular.ESPALDA);
                EjercicioRealizado ejercicioRealizado3espalda = new EjercicioRealizado("Remo con mancuerna a una mano",exigenciaMuscular,nivelAerobico,GrupoMuscular.ESPALDA);
                ejerciciosRealizados.add(ejercicioRealizado1espalda);
                ejerciciosRealizados.add(ejercicioRealizado2espalda);
                ejerciciosRealizados.add(ejercicioRealizado3espalda);
            } else if(grupo.equals(GrupoMuscular.HOMBROS)){
                // HOMBROS
                Ejercicio ejercicio31 = new Ejercicio("Press de hombros con mancuernas",exigenciaMuscular,nivelAerobico,GrupoMuscular.HOMBROS);
                Ejercicio ejercicio32 = new Ejercicio("Press Arnold con un solo brazo para hombros",exigenciaMuscular,nivelAerobico,GrupoMuscular.HOMBROS);
                Ejercicio ejercicio33 = new Ejercicio("Elevaciones laterales para hombros",exigenciaMuscular,nivelAerobico,GrupoMuscular.HOMBROS);
                ejercicios.add(ejercicio31);
                ejercicios.add(ejercicio32);
                ejercicios.add(ejercicio33);
                EjercicioRealizado ejercicioRealizado1hombros = new EjercicioRealizado("Press de hombros con mancuernas",exigenciaMuscular,nivelAerobico,GrupoMuscular.HOMBROS);
                EjercicioRealizado ejercicioRealizado2hombros = new EjercicioRealizado("Press Arnold con un solo brazo para hombros",exigenciaMuscular,nivelAerobico,GrupoMuscular.HOMBROS);
                EjercicioRealizado ejercicioRealizado3hombros = new EjercicioRealizado("Elevaciones laterales para hombros",exigenciaMuscular,nivelAerobico,GrupoMuscular.HOMBROS);
                ejerciciosRealizados.add(ejercicioRealizado1hombros);
                ejerciciosRealizados.add(ejercicioRealizado2hombros);
                ejerciciosRealizados.add(ejercicioRealizado3hombros);
            } else if(grupo.equals(GrupoMuscular.BRAZOS)){
                // BRAZOS
                Ejercicio ejercicio41 = new Ejercicio("Curl para bíceps con barra olímpica",exigenciaMuscular,nivelAerobico,GrupoMuscular.BRAZOS);
                Ejercicio ejercicio42 = new Ejercicio("Curl con barra Z",exigenciaMuscular,nivelAerobico,GrupoMuscular.BRAZOS);
                Ejercicio ejercicio43 = new Ejercicio("Curl con mancuernas",exigenciaMuscular,nivelAerobico,GrupoMuscular.BRAZOS);
                System.out.println(ejercicio43.getReps() + " " + ejercicio43.getSeries());
                System.out.println(ejercicio42.getReps() + " " + ejercicio42.getSeries());
                ejercicios.add(ejercicio41);
                ejercicios.add(ejercicio42);
                ejercicios.add(ejercicio43);
                EjercicioRealizado ejercicioRealizado1brazos = new EjercicioRealizado("Curl para bíceps con barra olímpica",exigenciaMuscular,nivelAerobico,GrupoMuscular.BRAZOS);
                EjercicioRealizado ejercicioRealizado2brazos = new EjercicioRealizado("Curl con barra Z",exigenciaMuscular,nivelAerobico,GrupoMuscular.BRAZOS);
                EjercicioRealizado ejercicioRealizado3brazos = new EjercicioRealizado("Curl con mancuernas",exigenciaMuscular,nivelAerobico,GrupoMuscular.BRAZOS);
                System.out.println(ejercicioRealizado3brazos.getReps() + " " + ejercicioRealizado3brazos.getSeries());
                System.out.println(ejercicioRealizado2brazos.getReps() + " " + ejercicioRealizado2brazos.getSeries());
                ejerciciosRealizados.add(ejercicioRealizado1brazos);
                ejerciciosRealizados.add(ejercicioRealizado2brazos);
                ejerciciosRealizados.add(ejercicioRealizado3brazos);

            }
        } else if(exigenciaMuscular.equals(ExigenciaMuscular.MEDIA)){
            if(grupo.equals(GrupoMuscular.PIERNAS)){
                // PIERNAS
                Ejercicio ejercicio4 = new Ejercicio("Walking luge",exigenciaMuscular,nivelAerobico,GrupoMuscular.PIERNAS);
                Ejercicio ejercicio5 = new Ejercicio("Goblet Squad",exigenciaMuscular,nivelAerobico,GrupoMuscular.PIERNAS);
                Ejercicio ejercicio6 = new Ejercicio("Sentadilla bulgara",exigenciaMuscular,nivelAerobico,GrupoMuscular.PIERNAS);
                ejercicios.add(ejercicio4);
                ejercicios.add(ejercicio5);
                ejercicios.add(ejercicio6);
                EjercicioRealizado ejercicioRealizado4 = new EjercicioRealizado("Walking luge",exigenciaMuscular,nivelAerobico,GrupoMuscular.PIERNAS);
                EjercicioRealizado ejercicioRealizado5 = new EjercicioRealizado("Goblet Squad",exigenciaMuscular,nivelAerobico,GrupoMuscular.PIERNAS);
                EjercicioRealizado ejercicioRealizado6 = new EjercicioRealizado("Sentadilla bulgara",exigenciaMuscular,nivelAerobico,GrupoMuscular.PIERNAS);
                ejerciciosRealizados.add(ejercicioRealizado4);
                ejerciciosRealizados.add(ejercicioRealizado5);
                ejerciciosRealizados.add(ejercicioRealizado6);

            } else if (grupo.equals(GrupoMuscular.PECHO)){
                // PECHO
                Ejercicio ejercicio14 = new Ejercicio("Flexión con mancuernas",exigenciaMuscular,nivelAerobico,GrupoMuscular.PECHO);
                Ejercicio ejercicio15 = new Ejercicio("Aleteo con cable",exigenciaMuscular,nivelAerobico,GrupoMuscular.PECHO);
                Ejercicio ejercicio16 = new Ejercicio("Press de banca declinado",exigenciaMuscular,nivelAerobico,GrupoMuscular.PECHO);
                ejercicios.add(ejercicio14);
                ejercicios.add(ejercicio15);
                ejercicios.add(ejercicio16);
                EjercicioRealizado ejercicioRealizado14 = new EjercicioRealizado("Flexión con mancuernas",exigenciaMuscular,nivelAerobico,GrupoMuscular.PECHO);
                EjercicioRealizado ejercicioRealizado15 = new EjercicioRealizado("Aleteo con cable",exigenciaMuscular,nivelAerobico,GrupoMuscular.PECHO);
                EjercicioRealizado ejercicioRealizado16 = new EjercicioRealizado("Press de banca declinado",exigenciaMuscular,nivelAerobico,GrupoMuscular.PECHO);
                ejerciciosRealizados.add(ejercicioRealizado14);
                ejerciciosRealizados.add(ejercicioRealizado15);
                ejerciciosRealizados.add(ejercicioRealizado16);

            } else if(grupo.equals(GrupoMuscular.ESPALDA)){
                // ESPALDA
                Ejercicio ejercicio24 = new Ejercicio("Remo invertido",exigenciaMuscular,nivelAerobico,GrupoMuscular.ESPALDA);
                Ejercicio ejercicio25 = new Ejercicio("Remo a una mano con mancuerna con piernas dobladas",exigenciaMuscular,nivelAerobico,GrupoMuscular.ESPALDA);
                Ejercicio ejercicio26 = new Ejercicio("Remo en máquina",exigenciaMuscular,nivelAerobico,GrupoMuscular.ESPALDA);
                ejercicios.add(ejercicio24);
                ejercicios.add(ejercicio25);
                ejercicios.add(ejercicio26);
                EjercicioRealizado ejercicioRealizado24 = new EjercicioRealizado("Remo invertido",exigenciaMuscular,nivelAerobico,GrupoMuscular.ESPALDA);
                EjercicioRealizado ejercicioRealizado25 = new EjercicioRealizado("Remo a una mano con mancuerna con piernas dobladas",exigenciaMuscular,nivelAerobico,GrupoMuscular.ESPALDA);
                EjercicioRealizado ejercicioRealizado26 = new EjercicioRealizado("Remo en máquina",exigenciaMuscular,nivelAerobico,GrupoMuscular.ESPALDA);
                ejerciciosRealizados.add(ejercicioRealizado24);
                ejerciciosRealizados.add(ejercicioRealizado25);
                ejerciciosRealizados.add(ejercicioRealizado26);

            } else if(grupo.equals(GrupoMuscular.HOMBROS)){
                // HOMBROS
                Ejercicio ejercicio34 = new Ejercicio("Levantamientos frontales de martillo alterno",exigenciaMuscular,nivelAerobico,GrupoMuscular.HOMBROS);
                Ejercicio ejercicio35 = new Ejercicio("Trasnuca con barra en máquina",exigenciaMuscular,nivelAerobico,GrupoMuscular.HOMBROS);
                Ejercicio ejercicio36 = new Ejercicio("Press militar",exigenciaMuscular,nivelAerobico,GrupoMuscular.HOMBROS);
                ejercicios.add(ejercicio34);
                ejercicios.add(ejercicio35);
                ejercicios.add(ejercicio36);
                EjercicioRealizado ejercicioRealizado34 = new EjercicioRealizado("Levantamientos frontales de martillo alterno",exigenciaMuscular,nivelAerobico,GrupoMuscular.HOMBROS);
                EjercicioRealizado ejercicioRealizado35 = new EjercicioRealizado("Trasnuca con barra en máquina",exigenciaMuscular,nivelAerobico,GrupoMuscular.HOMBROS);
                EjercicioRealizado ejercicioRealizado36 = new EjercicioRealizado("Press militar",exigenciaMuscular,nivelAerobico,GrupoMuscular.HOMBROS);
                ejerciciosRealizados.add(ejercicioRealizado34);
                ejerciciosRealizados.add(ejercicioRealizado35);
                ejerciciosRealizados.add(ejercicioRealizado36);


            } else if(grupo.equals(GrupoMuscular.BRAZOS)){
                // BRAZOS
                Ejercicio ejercicio44 = new Ejercicio("Curl de martillo con mancuernas",exigenciaMuscular,nivelAerobico,GrupoMuscular.BRAZOS);
                Ejercicio ejercicio45 = new Ejercicio("Dominadas con agarre neutro",exigenciaMuscular,nivelAerobico,GrupoMuscular.BRAZOS);
                Ejercicio ejercicio46 = new Ejercicio("Remos",exigenciaMuscular,nivelAerobico,GrupoMuscular.BRAZOS);
                ejercicios.add(ejercicio44);
                ejercicios.add(ejercicio45);
                ejercicios.add(ejercicio46);
                EjercicioRealizado ejercicioRealizado44 = new EjercicioRealizado("Curl de martillo con mancuernas",exigenciaMuscular,nivelAerobico,GrupoMuscular.BRAZOS);
                EjercicioRealizado ejercicioRealizado45 = new EjercicioRealizado("Dominadas con agarre neutro",exigenciaMuscular,nivelAerobico,GrupoMuscular.BRAZOS);
                EjercicioRealizado ejercicioRealizado46 = new EjercicioRealizado("Remos",exigenciaMuscular,nivelAerobico,GrupoMuscular.BRAZOS);
                ejerciciosRealizados.add(ejercicioRealizado44);
                ejerciciosRealizados.add(ejercicioRealizado44);
                ejerciciosRealizados.add(ejercicioRealizado44);
            }


        } else {

            if(grupo.equals(GrupoMuscular.PIERNAS)){
                // PIERNAS
                Ejercicio ejercicio7 = new Ejercicio("Leg Press",exigenciaMuscular,nivelAerobico,GrupoMuscular.PIERNAS);
                Ejercicio ejercicio8 = new Ejercicio("Peso muerto rumano",exigenciaMuscular,nivelAerobico,GrupoMuscular.PIERNAS);
                Ejercicio ejercicio9 = new Ejercicio("Buenos dias",exigenciaMuscular,nivelAerobico,GrupoMuscular.PIERNAS);
                ejercicios.add(ejercicio7);
                ejercicios.add(ejercicio8);
                ejercicios.add(ejercicio9);
                EjercicioRealizado ejercicioRealizado7 = new EjercicioRealizado(ejercicio7);
                EjercicioRealizado ejercicioRealizado8 = new EjercicioRealizado(ejercicio8);
                EjercicioRealizado ejercicioRealizado9 = new EjercicioRealizado(ejercicio9);
                ejerciciosRealizados.add(ejercicioRealizado7);
                ejerciciosRealizados.add(ejercicioRealizado8);
                ejerciciosRealizados.add(ejercicioRealizado9);

            } else if (grupo.equals(GrupoMuscular.PECHO)){
                // PECHO
                Ejercicio ejercicio18 = new Ejercicio("Mancuernas sobrevolando tu cuerpo",exigenciaMuscular,nivelAerobico,GrupoMuscular.PECHO);
                Ejercicio ejercicio19 = new Ejercicio("Hex press",exigenciaMuscular,nivelAerobico,GrupoMuscular.PECHO);
                Ejercicio ejercicio20 = new Ejercicio("Aperturas con mancuernas",exigenciaMuscular,nivelAerobico,GrupoMuscular.PECHO);
                ejercicios.add(ejercicio18);
                ejercicios.add(ejercicio19);
                ejercicios.add(ejercicio20);
                EjercicioRealizado ejercicioRealizado18 = new EjercicioRealizado(ejercicio18);
                EjercicioRealizado ejercicioRealizado19 = new EjercicioRealizado(ejercicio19);
                EjercicioRealizado ejercicioRealizado20 = new EjercicioRealizado(ejercicio20);
                ejerciciosRealizados.add(ejercicioRealizado18);
                ejerciciosRealizados.add(ejercicioRealizado19);
                ejerciciosRealizados.add(ejercicioRealizado20);

            } else if(grupo.equals(GrupoMuscular.ESPALDA)){
                // ESPALDA
                Ejercicio ejercicio27 = new Ejercicio("Dominadas y chin up",exigenciaMuscular,nivelAerobico,GrupoMuscular.ESPALDA);
                Ejercicio ejercicio28 = new Ejercicio("Polea al pecho",exigenciaMuscular,nivelAerobico,GrupoMuscular.ESPALDA);
                Ejercicio ejercicio29 = new Ejercicio("Swings con pesa rusa",exigenciaMuscular,nivelAerobico,GrupoMuscular.ESPALDA);
                ejercicios.add(ejercicio27);
                ejercicios.add(ejercicio28);
                ejercicios.add(ejercicio29);
                EjercicioRealizado ejercicioRealizado27 = new EjercicioRealizado(ejercicio27);
                EjercicioRealizado ejercicioRealizado28 = new EjercicioRealizado(ejercicio28);
                EjercicioRealizado ejercicioRealizado29 = new EjercicioRealizado(ejercicio29);
                ejerciciosRealizados.add(ejercicioRealizado27);
                ejerciciosRealizados.add(ejercicioRealizado28);
                ejerciciosRealizados.add(ejercicioRealizado29);

            } else if(grupo.equals(GrupoMuscular.HOMBROS)){
                // HOMBROS
                Ejercicio ejercicio38 = new Ejercicio("Encogimientos de hombros",exigenciaMuscular,nivelAerobico,GrupoMuscular.HOMBROS);
                Ejercicio ejercicio39 = new Ejercicio("Elevaciones laterales en máquina",exigenciaMuscular,nivelAerobico,GrupoMuscular.HOMBROS);
                Ejercicio ejercicio40 = new Ejercicio("Flexiones para hombros",exigenciaMuscular,nivelAerobico,GrupoMuscular.HOMBROS);
                ejercicios.add(ejercicio38);
                ejercicios.add(ejercicio39);
                ejercicios.add(ejercicio40);
                EjercicioRealizado ejercicioRealizado38 = new EjercicioRealizado(ejercicio38);
                EjercicioRealizado ejercicioRealizado39 = new EjercicioRealizado(ejercicio39);
                EjercicioRealizado ejercicioRealizado40 = new EjercicioRealizado(ejercicio40);
                ejerciciosRealizados.add(ejercicioRealizado38);
                ejerciciosRealizados.add(ejercicioRealizado39);
                ejerciciosRealizados.add(ejercicioRealizado40);

            } else if(grupo.equals(GrupoMuscular.BRAZOS)){
                // BRAZOS
                Ejercicio ejercicio47 = new Ejercicio("Flexiones de brazos",exigenciaMuscular,nivelAerobico,GrupoMuscular.BRAZOS);
                Ejercicio ejercicio48 = new Ejercicio("Bíceps con estocada posterior",exigenciaMuscular,nivelAerobico,GrupoMuscular.BRAZOS);
                Ejercicio ejercicio49 = new Ejercicio("Plancha",exigenciaMuscular,nivelAerobico,GrupoMuscular.BRAZOS);
                ejercicios.add(ejercicio47);
                ejercicios.add(ejercicio48);
                ejercicios.add(ejercicio49);
                EjercicioRealizado ejercicioRealizado47 = new EjercicioRealizado(ejercicio47);
                EjercicioRealizado ejercicioRealizado48 = new EjercicioRealizado(ejercicio48);
                EjercicioRealizado ejercicioRealizado49 = new EjercicioRealizado(ejercicio49);
                ejerciciosRealizados.add(ejercicioRealizado47);
                ejerciciosRealizados.add(ejercicioRealizado48);
                ejerciciosRealizados.add(ejercicioRealizado49);

            }

        }

    }



    public Entrenamiento(ArrayList<Ejercicio> ejercicios) {
        this.ejercicios = ejercicios;
    }

    public Entrenamiento nuevo() {
        ArrayList<Ejercicio> ejercicios = null;
        return new Entrenamiento(ejercicios);
    }


    public boolean entrenamientoCumplido(){
        for(Ejercicio ejercicio: ejercicios){
            Stream<EjercicioRealizado> stream = this.ejerciciosRealizados.stream();
            EjercicioRealizado ejercicioRealizado = stream.filter(ej -> ej.getNombre().equals(ejercicio.getNombre()))
                    .findFirst()
                    .orElse(null);
            if(!(ejercicioRealizado.getReps() == ejercicio.getReps() && ejercicioRealizado.getSeries() == ejercicio.getSeries())){
               return false;
            }
        }
        return true;
    }

    public void mostrarEntrenamiento() {
        for (Ejercicio ejercicio : ejercicios) {
            ejercicio.mostrarCadaEjercicio();
        }
    }



    public void reforzarEntrenamiento(int reps, int series, int peso) {
        for (Ejercicio ejercicio : ejercicios) {
            EjercicioReforzado reforzado = new EjercicioReforzado(ejercicio, reps, series, peso);
            reforzado.reforzarEjercicio();
        }
    }

    public ArrayList<Ejercicio> getEjercicios() {
        return ejercicios;
    }

    public void setEjercicios(ArrayList<Ejercicio> ejercicios) {
        this.ejercicios = ejercicios;
    }
}
