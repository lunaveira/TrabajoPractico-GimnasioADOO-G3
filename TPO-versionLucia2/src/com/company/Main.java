package com.company;

import com.company.Clients.*;
import com.company.Strategies.BajarPesoStrategy;
import com.company.Strategies.IObjetivoStrategy;
import com.company.Strategies.MantenerFiguraStrategy;
import com.company.Strategies.TonificarStrategy;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {


        Socio socio = new Socio(TipoEstrategia.BAJAR, "Lucia", "Naveira", 20, TipoSexo.FEMENINO, 53.4,20.1, 50.4);

        socio.mostrarSocio(socio);
        socio.ingresar("lunaveira", "lucia123");

        Objetivo objetivo = new Objetivo();



        TonificarStrategy tonificar = new TonificarStrategy();
        BajarPesoStrategy bajar = new BajarPesoStrategy();
        MantenerFiguraStrategy mantener = new MantenerFiguraStrategy();

        switch (socio.getTipoEstrategia()) {
            case BAJAR: objetivo.setStrategy(bajar);
            case TONIFICAR: objetivo.setStrategy(tonificar);
            case MANTENER: objetivo.setStrategy(mantener);
        }

        objetivo.setSocio(socio);

        ArrayList<Entrenamiento> entrenamientos = null;

        Rutina rutina = new Rutina(4,objetivo,1,entrenamientos,false);

        socio.cambiarObjetivo();

        socio.obtenerPremio();






    }
}
