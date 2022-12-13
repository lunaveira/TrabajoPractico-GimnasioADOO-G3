package com.company.Observers;

import com.company.Adapters.AdapterFirebase;
import com.company.Clients.Notificacion;
import com.company.Clients.Notificador;
import com.company.Clients.Socio;

public class Creido extends TrofeoObservador{

    private Socio socio;

    public Creido(Socio socio){
        this.socio = socio;
    }

    @Override
    public void chequearPremio() {

        if(socio.getMediciones().size()>=3) {
            Notificacion notificacion = new Notificacion("Ganaste el premio al creido");
            Notificador.setAdapterFirebase(new AdapterFirebase());
            Notificador.notificar(notificacion);
            socio.agregarTrofeo(this);
        }

    }
}
