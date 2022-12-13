package com.company.Clients;

import com.company.Observers.Creido;
import com.company.Observers.Dedicacion;
import com.company.Observers.TrofeoObservador;
import com.company.Strategies.IObjetivoStrategy;

import java.util.ArrayList;

public class Objetivo {

    private TipoEstrategia tipoEstrategia;
    private IObjetivoStrategy strategy;


    private Rutina rutina;

    private ArrayList<TrofeoObservador> observadors;

    private boolean cumplido = true;



    public Objetivo() {
        this.observadors = new ArrayList<>();
        TrofeoObservador dedicacion = new Dedicacion();
        this.observadors.add(dedicacion);

    }

    public TipoEstrategia getTipoEstrategia() {
        return this.tipoEstrategia;
    }

    public void setTipoEstrategia(TipoEstrategia tipoEstrategia) {
        this.tipoEstrategia = tipoEstrategia;
    }

    public IObjetivoStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IObjetivoStrategy strategy, TipoEstrategia tipoEstrategia) {
        this.strategy = strategy;
        setTipoEstrategia(tipoEstrategia);
    }


    public Rutina getRutina() {
        return this.rutina;
    }

    public void setRutina(Rutina rutina) {
        this.rutina = rutina;
    }

    public ArrayList<TrofeoObservador> getObservadors() {
        return observadors;
    }

    public void setObservadors(ArrayList<TrofeoObservador> observadors) {
        this.observadors = observadors;
    }

    public boolean isCumplido() {
        return cumplido;
    }

    public void setCumplido(boolean cumplido) {
        this.cumplido = cumplido;
    }

    public void chequearObjCumplido(Socio socio){
        if(strategy.objCumplido(socio)) {
            this.cumplido = true;
            for(TrofeoObservador tr : observadors) {
                tr.chequearPremio();
            }
        }
    }

    public void crearRutina() {
        this.rutina = this.strategy.crearRutina();

    }

    public void mostrarRutina() {
        this.rutina.mostrarCadaRutina();

    }




}
