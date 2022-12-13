package com.company;

import com.company.Adapters.AdapterMedicionConcreto;
import com.company.Clients.*;
import com.company.Observers.Constancia;
import com.company.Observers.Creido;
import com.company.Observers.Dedicacion;
import com.company.Observers.TrofeoObservador;
import com.company.Strategies.BajarPesoStrategy;
import com.company.Strategies.IObjetivoStrategy;
import com.company.Strategies.MantenerFiguraStrategy;
import com.company.Strategies.TonificarStrategy;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {


        Socio socio = new Socio(TipoEstrategia.TONIFICAR, "Lucia", "Naveira", 20, TipoSexo.FEMENINO, 51.4,20.1, 72.4);

        System.out.println("-----------SOCIO------------");

        socio.mostrarSocio(socio);
        socio.ingresar("lunaveira", "lucia123");

        Objetivo objetivo = new Objetivo(socio);



        TonificarStrategy tonificar = new TonificarStrategy();
        BajarPesoStrategy bajar = new BajarPesoStrategy();
        MantenerFiguraStrategy mantener = new MantenerFiguraStrategy();

        /*
        switch (socio.getTipoEstrategia()) {
            case BAJAR: objetivo.setStrategy(bajar);
            case TONIFICAR: objetivo.setStrategy(tonificar);
            case MANTENER: objetivo.setStrategy(mantener);
        }
         */
        objetivo.setStrategy(tonificar, TipoEstrategia.TONIFICAR);
        socio.setObjetivo(objetivo);





        System.out.println(" ");

        System.out.println("-----------RUTINA------------");

        socio.getObjetivo().crearRutina();
        socio.getObjetivo().mostrarRutina();

        System.out.println(" ");

        System.out.println("------------RUTINA REFORZADA------------");


        socio.getObjetivo().getRutina().reforzarRutina(2,2, 3);
        socio.getObjetivo().mostrarRutina();

        System.out.println(" ");



        System.out.println("-----------NUEVO OBJETIVO------------");

        objetivo.setStrategy(bajar, TipoEstrategia.BAJAR);
        socio.cambiarObjetivo(objetivo);

        System.out.println("-----------RUTINA------------");

        socio.getObjetivo().crearRutina();
        socio.getObjetivo().mostrarRutina();

        System.out.println(" ");

        System.out.println("------------RUTINA REFORZADA------------");


        socio.getObjetivo().getRutina().reforzarRutina(2,2, 3);
        socio.getObjetivo().mostrarRutina();

        System.out.println(" ");




        System.out.println("-----------TROFEOS------------");


        TrofeoObservador trofeoObservador = new Creido(socio);
        socio.agregarObservador(trofeoObservador);

        //Trofeo del creido
        socio.registrarMedicion(new AdapterMedicionConcreto().registrarMedicion());
        socio.registrarMedicion(new AdapterMedicionConcreto().registrarMedicion());
        socio.registrarMedicion(new AdapterMedicionConcreto().registrarMedicion());

        //Trofeo a la constancia
        socio.getObjetivo().setStrategy(bajar, TipoEstrategia.BAJAR);;
        socio.getObjetivo().crearRutina();
        TrofeoObservador trofeoObservador2 = new Constancia(socio,socio.getObjetivo().getRutina());
        socio.getObjetivo().getRutina().agregarObservador(trofeoObservador2);
        socio.getObjetivo().getRutina().chequearRutinaCumplida();

        //Trofeo de la dedicacion
        TrofeoObservador trofeoObservador3 = new Dedicacion(socio.getObjetivo());
        socio.getObjetivo().agregarObservador(trofeoObservador3);
        objetivo.setStrategy(tonificar, TipoEstrategia.TONIFICAR);
        socio.getObjetivo().chequearObjCumplido();



    }
}
