package com.company.Clients;

import com.company.Strategies.ExigenciaMuscular;

import java.util.ArrayList;

public class Entrenamiento {

    private ArrayList<Ejercicio> ejercicios;


    private boolean entrenamientoCompleto = false;


    public Entrenamiento(ExigenciaMuscular exigenciaMuscular, int nivelAerobico , GrupoMuscular grupo) {
        this.ejercicios = new ArrayList<>();
        // PIERNAS
        Ejercicio ejercicio1 = new Ejercicio("Sentadillas con barra",ExigenciaMuscular.MEDIA,3,GrupoMuscular.PIERNAS);
        Ejercicio ejercicio2 = new Ejercicio("Sentadillas frontales",ExigenciaMuscular.ALTA,3,GrupoMuscular.PIERNAS);
        Ejercicio ejercicio3 = new Ejercicio("Peso muerto",ExigenciaMuscular.MEDIA,3,GrupoMuscular.PIERNAS);
        Ejercicio ejercicio4 = new Ejercicio("Walking luge",ExigenciaMuscular.BAJA,4,GrupoMuscular.PIERNAS);
        Ejercicio ejercicio5 = new Ejercicio("Goblet Squad",ExigenciaMuscular.MEDIA,3,GrupoMuscular.PIERNAS);
        Ejercicio ejercicio6 = new Ejercicio("Sentadilla bulgara",ExigenciaMuscular.ALTA,2,GrupoMuscular.PIERNAS);
        Ejercicio ejercicio7 = new Ejercicio("Leg Press",ExigenciaMuscular.BAJA,3,GrupoMuscular.PIERNAS);
        Ejercicio ejercicio8 = new Ejercicio("Peso muerto rumano",ExigenciaMuscular.MEDIA,3,GrupoMuscular.PIERNAS);
        Ejercicio ejercicio9 = new Ejercicio("Buenos dias",ExigenciaMuscular.MEDIA,2,GrupoMuscular.PIERNAS);
        Ejercicio ejercicio10 = new Ejercicio("Glute hamstring raise",ExigenciaMuscular.ALTA,3,GrupoMuscular.PIERNAS);

        // PECHO
        Ejercicio ejercicio11 = new Ejercicio("Press de banca inclinado",ExigenciaMuscular.ALTA,3,GrupoMuscular.PECHO);
        Ejercicio ejercicio12 = new Ejercicio("Flexiones con peso",ExigenciaMuscular.MEDIA,3,GrupoMuscular.PECHO);
        Ejercicio ejercicio13 = new Ejercicio("Press de banca con agarre cerrado",ExigenciaMuscular.ALTA,3,GrupoMuscular.PECHO);
        Ejercicio ejercicio21 = new Ejercicio("Band bent over row",ExigenciaMuscular.BAJA,4,GrupoMuscular.ESPALDA);
        Ejercicio ejercicio39 = new Ejercicio("Elevaciones laterales en máquina",ExigenciaMuscular.MEDIA,3,GrupoMuscular.HOMBROS);
        Ejercicio ejercicio41 = new Ejercicio("Curl para bíceps con barra olímpica",ExigenciaMuscular.ALTA,2,GrupoMuscular.BRAZOS);
        /*
        Ejercicio ejercicio14 = new Ejercicio("Flexión con mancuernas",3,10,5f,4,ExigenciaMuscular.BAJA,GrupoMuscular.PECHO,"");
        Ejercicio ejercicio15 = new Ejercicio("Aleteo con cable",3,10,25f,5,ExigenciaMuscular.MEDIA,GrupoMuscular.PECHO,"");
        Ejercicio ejercicio16 = new Ejercicio("Sentadilla bulgara",2,15,7.5f,6,ExigenciaMuscular.MEDIA,GrupoMuscular.PECHO,"");
        Ejercicio ejercicio17 = new Ejercicio("Press de banca declinado",3,10,7.5f,7,ExigenciaMuscular.MEDIA,GrupoMuscular.PECHO,"");
        Ejercicio ejercicio18 = new Ejercicio("Mancuernas sobrevolando tu cuerpo",3,10,7.5f,8,ExigenciaMuscular.BAJA,GrupoMuscular.PECHO,"");
        Ejercicio ejercicio19 = new Ejercicio("Hex press",3,8,12f,9,ExigenciaMuscular.MEDIA,GrupoMuscular.PECHO,"");
        Ejercicio ejercicio20 = new Ejercicio("Aperturas con mancuernas",3,15,5f,10,ExigenciaMuscular.MEDIA,GrupoMuscular.PECHO,"");


        // ESPALDA
        Ejercicio ejercicio21 = new Ejercicio("Band bent over row",3,10,0f,1,ExigenciaMuscular.BAJA,GrupoMuscular.ESPALDA,"");
        Ejercicio ejercicio22 = new Ejercicio("Renegade row",3,8,5f,2,ExigenciaMuscular.MEDIA,GrupoMuscular.ESPALDA,"");
        Ejercicio ejercicio23 = new Ejercicio("Remo con mancuerna a una mano",3,10,7.5f,3,ExigenciaMuscular.MEDIA,GrupoMuscular.ESPALDA,"");
        Ejercicio ejercicio24 = new Ejercicio("Remo invertido",3,10,0f,4,ExigenciaMuscular.ALTA,GrupoMuscular.ESPALDA,"");
        Ejercicio ejercicio25 = new Ejercicio("Remo a una mano con mancuerna con piernas dobladas",3,10,7.5f,5,ExigenciaMuscular.MEDIA,GrupoMuscular.ESPALDA,"");
        Ejercicio ejercicio26 = new Ejercicio("Remo en máquina",3,10,35f,6,ExigenciaMuscular.BAJA,GrupoMuscular.ESPALDA,"");
        Ejercicio ejercicio27 = new Ejercicio("Dominadas y chin up",3,5,0f,7,ExigenciaMuscular.ALTA,GrupoMuscular.ESPALDA,"");
        Ejercicio ejercicio28 = new Ejercicio("Polea al pecho",3,10,30f,8,ExigenciaMuscular.MEDIA,GrupoMuscular.ESPALDA,"");
        Ejercicio ejercicio29 = new Ejercicio("Swings con pesa rusa",3,8,5f,9,ExigenciaMuscular.MEDIA,GrupoMuscular.ESPALDA,"");
        Ejercicio ejercicio30 = new Ejercicio("Remo doble con pesas rusas",3,15,5f,10,ExigenciaMuscular.BAJA,GrupoMuscular.ESPALDA,"");


        // HOMBROS
        Ejercicio ejercicio31 = new Ejercicio("Press de hombros con mancuernas",4,10,10f,1,ExigenciaMuscular.MEDIA,GrupoMuscular.HOMBROS,"");
        Ejercicio ejercicio32 = new Ejercicio("Press Arnold con un solo brazo para hombros",4,10,7.5f,2,ExigenciaMuscular.MEDIA,GrupoMuscular.HOMBROS,"");
        Ejercicio ejercicio33 = new Ejercicio("Elevaciones laterales para hombros",4,12,7.5f,3,ExigenciaMuscular.ALTA,GrupoMuscular.HOMBROS,"");
        Ejercicio ejercicio34 = new Ejercicio("Levantamientos frontales de martillo alterno",4,10,5f,4,ExigenciaMuscular.ALTA,GrupoMuscular.HOMBROS,"");
        Ejercicio ejercicio35 = new Ejercicio("Trasnuca con barra en máquina",3,10,15f,5,ExigenciaMuscular.BAJA,GrupoMuscular.HOMBROS,"");
        Ejercicio ejercicio36 = new Ejercicio("Press militar",4,8,40f,6,ExigenciaMuscular.MEDIA,GrupoMuscular.HOMBROS,"");
        Ejercicio ejercicio37 = new Ejercicio("Remo al mentón",4,10,0f,7,ExigenciaMuscular.BAJA,GrupoMuscular.HOMBROS,"");
        Ejercicio ejercicio38 = new Ejercicio("Encogimientos de hombros",4,10,7.5f,8,ExigenciaMuscular.MEDIA,GrupoMuscular.HOMBROS,"");
        Ejercicio ejercicio39 = new Ejercicio("Elevaciones laterales en máquina",3,8,20f,9,ExigenciaMuscular.MEDIA,GrupoMuscular.HOMBROS,"");
        Ejercicio ejercicio40 = new Ejercicio("Flexiones para hombros",4,10,0f,10,ExigenciaMuscular.BAJA,GrupoMuscular.HOMBROS,"");


        // BRAZOS
        Ejercicio ejercicio41 = new Ejercicio("Curl para bíceps con barra olímpica",4,10,20f,1,ExigenciaMuscular.ALTA,GrupoMuscular.BRAZOS,"");
        Ejercicio ejercicio42 = new Ejercicio("Curl con barra Z",3,12,15f,2,ExigenciaMuscular.MEDIA,GrupoMuscular.BRAZOS,"");
        Ejercicio ejercicio43 = new Ejercicio("Curl con mancuernas",3,10,7.5f,3,ExigenciaMuscular.BAJA,GrupoMuscular.BRAZOS,"");
        Ejercicio ejercicio44 = new Ejercicio("Curl de martillo con mancuernas",3,8,5f,4,ExigenciaMuscular.BAJA,GrupoMuscular.BRAZOS,"");
        Ejercicio ejercicio45 = new Ejercicio("Dominadas con agarre neutro",3,10,15f,5,ExigenciaMuscular.ALTA,GrupoMuscular.BRAZOS,"");
        Ejercicio ejercicio46 = new Ejercicio("Remos",4,8,40f,6,ExigenciaMuscular.MEDIA,GrupoMuscular.BRAZOS,"");
        Ejercicio ejercicio47 = new Ejercicio("Flexiones de brazos",4,10,0f,7,ExigenciaMuscular.BAJA,GrupoMuscular.BRAZOS,"");
        Ejercicio ejercicio48 = new Ejercicio("Bíceps con estocada posterior",3,8,7.5f,8,ExigenciaMuscular.MEDIA,GrupoMuscular.BRAZOS,"");
        Ejercicio ejercicio49 = new Ejercicio("Plancha",3,8,0f,9,ExigenciaMuscular.ALTA,GrupoMuscular.BRAZOS,"");
        Ejercicio ejercicio50 = new Ejercicio("Dominadas supinas",3,8,0f,10,ExigenciaMuscular.ALTA,GrupoMuscular.BRAZOS,"");


         */
        ejercicios.add(ejercicio1);
        ejercicios.add(ejercicio2);
        ejercicios.add(ejercicio3);
        ejercicios.add(ejercicio4);
        ejercicios.add(ejercicio5);
        ejercicios.add(ejercicio6);
        ejercicios.add(ejercicio7);
        ejercicios.add(ejercicio8);
        ejercicios.add(ejercicio9);
        ejercicios.add(ejercicio10);
        ejercicios.add(ejercicio11);
        ejercicios.add(ejercicio12);
        ejercicios.add(ejercicio13);
        ejercicios.add(ejercicio21);
        ejercicios.add(ejercicio39);
        ejercicios.add(ejercicio41);
        /*
        ejercicios.add(ejercicio14);
        ejercicios.add(ejercicio15);
        ejercicios.add(ejercicio16);
        ejercicios.add(ejercicio17);
        ejercicios.add(ejercicio18);
        ejercicios.add(ejercicio19);
        ejercicios.add(ejercicio20);

        ejercicios.add(ejercicio22);
        ejercicios.add(ejercicio23);
        ejercicios.add(ejercicio24);
        ejercicios.add(ejercicio25);
        ejercicios.add(ejercicio26);
        ejercicios.add(ejercicio27);
        ejercicios.add(ejercicio28);
        ejercicios.add(ejercicio29);
        ejercicios.add(ejercicio30);
        ejercicios.add(ejercicio31);
        ejercicios.add(ejercicio32);
        ejercicios.add(ejercicio33);
        ejercicios.add(ejercicio34);
        ejercicios.add(ejercicio35);
        ejercicios.add(ejercicio36);
        ejercicios.add(ejercicio37);
        ejercicios.add(ejercicio38);

        ejercicios.add(ejercicio40);

        ejercicios.add(ejercicio42);
        ejercicios.add(ejercicio43);
        ejercicios.add(ejercicio44);
        ejercicios.add(ejercicio45);
        ejercicios.add(ejercicio46);
        ejercicios.add(ejercicio47);
        ejercicios.add(ejercicio48);
        ejercicios.add(ejercicio49);
        ejercicios.add(ejercicio50);

         */
    }



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
            reforzado.reforzarEjercicio();
        }

        this.ejercicios = lista;
    }




}
