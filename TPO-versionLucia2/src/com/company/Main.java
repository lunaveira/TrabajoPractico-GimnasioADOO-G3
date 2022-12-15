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



    public static void Rutina(Socio socio, boolean reforzar){
        System.out.println("-----------------RUTINA------------------");

        socio.getObjetivo().crearRutina();
        socio.getObjetivo().mostrarRutina();
        System.out.println();

        if(reforzar){
            System.out.println("------------RUTINA REFORZADA-------------");

            socio.getObjetivo().getRutina().reforzarRutina(2,2, 3);
            socio.getObjetivo().mostrarRutina();
            System.out.println();
        }
    }



    public static void main(String[] args) {


        Socio socio = new Socio(TipoEstrategia.MANTENER, "Lucia", "Naveira", 20, TipoSexo.FEMENINO, 51.0,20.1, 72.4);

        System.out.println("-----------SOCIO------------");

        socio.mostrarSocio(socio);
        socio.ingresar("lunaveira", "lucia123");
        System.out.println();

        Objetivo objetivo = new Objetivo(socio);

        TonificarStrategy tonificar = new TonificarStrategy();
        BajarPesoStrategy bajar = new BajarPesoStrategy();
        MantenerFiguraStrategy mantener = new MantenerFiguraStrategy();


        //objetivo.setStrategy(bajar, TipoEstrategia.BAJAR);
        //objetivo.setStrategy(tonificar,TipoEstrategia.TONIFICAR);
        //objetivo.setStrategy(mantener, TipoEstrategia.MANTENER);
        /*
        switch (socio.getTipoEstrategia()) {

        }

         */
        objetivo.setStrategy(mantener, TipoEstrategia.MANTENER);
        socio.setObjetivo(objetivo);


        Rutina(socio,true);


        System.out.println("-------------NUEVO OBJETIVO--------------");

        objetivo.setStrategy(bajar, TipoEstrategia.BAJAR);
        socio.cambiarObjetivo(objetivo);

        Rutina(socio,false);

        //Trofeo del creido
        TrofeoObservador trofeoObservador = new Creido(socio);
        socio.agregarObservador(trofeoObservador);
        //socio.registrarMedicion(new AdapterMedicionConcreto().registrarMedicion());
        socio.registrarMedicion(new AdapterMedicionConcreto().registrarMedicion());
        socio.registrarMedicion(new AdapterMedicionConcreto().registrarMedicion());

        //Trofeo a la constancia
        TrofeoObservador trofeoObservador2 = new Constancia(socio,socio.getObjetivo().getRutina());
        socio.getObjetivo().getRutina().agregarObservador(trofeoObservador2);
        socio.getObjetivo().getRutina().chequearRutinaCumplida();

        //Trofeo de la dedicacion | hay que cambiar el peso
        TrofeoObservador trofeoObservador3 = new Dedicacion(socio.getObjetivo());
        socio.getObjetivo().agregarObservador(trofeoObservador3);
        socio.getObjetivo().chequearObjCumplido();

        socio.verTrofeos();
    }
}
