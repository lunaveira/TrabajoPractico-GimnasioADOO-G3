package com.company.Clients;

import com.company.Strategies.IObjetivoStrategy;

public class Objetivo {

    private TipoEstrategia tipoEstrategia;
    private IObjetivoStrategy strategy;
    private Socio socio;

    private Rutina rutina;

    public Objetivo() {
    }

    public TipoEstrategia getTipoEstrategia() {
        return tipoEstrategia;
    }

    public void setTipoEstrategia(TipoEstrategia tipoEstrategia) {
        this.tipoEstrategia = tipoEstrategia;
    }

    public IObjetivoStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IObjetivoStrategy strategy) {
        this.strategy = strategy;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public Rutina getRutina() {
        return rutina;
    }

    public void setRutina(Rutina rutina) {
        this.rutina = rutina;
    }


    public boolean objCumplido() {
        return strategy.objCumplido(socio);
    }
}
