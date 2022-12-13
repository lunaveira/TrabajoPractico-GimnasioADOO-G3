package com.company.Observers;

import com.company.Adapters.AdapterFirebase;
import com.company.Clients.Notificacion;
import com.company.Clients.Notificador;
import com.company.Clients.Objetivo;
import com.company.Clients.Socio;

public class Dedicacion extends TrofeoObservador{

    private Objetivo objetivo;
    private Notificador notificador;
    private Socio socio;

    public Dedicacion(Objetivo objetivo){
        this.objetivo = objetivo;
        this.socio = objetivo.getSocio();
    }

    @Override
    public void chequearPremio() {

        if(objetivo.isCumplido()) {
            Notificacion notificacion = new Notificacion("Ganaste un trofeo a la dedicacion");
            notificador.setAdapterFirebase(new AdapterFirebase());
            notificador.notificar(notificacion);

            this.socio.agregarTrofeo(this);
        }

    }
}
