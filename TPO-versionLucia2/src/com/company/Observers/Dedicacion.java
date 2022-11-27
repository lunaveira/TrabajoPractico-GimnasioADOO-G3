package com.company.Observers;

import com.company.Adapters.AdapterFirebase;
import com.company.Clients.Notificacion;
import com.company.Clients.Notificador;
import com.company.Clients.Objetivo;

public class Dedicacion extends TrofeoObservador{

    private Objetivo objetivo;
    private Notificador notificador;

    @Override
    public void chequearPremio() {

        if(objetivo.objCumplido()) {
            Notificacion notificacion = new Notificacion("Ganaste un trofeo a la dedicacion");
            notificador.setAdapterFirebase(new AdapterFirebase());
            notificador.notificar(notificacion);
        }

    }
}
