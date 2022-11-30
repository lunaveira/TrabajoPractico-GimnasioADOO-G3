package com.company.Observers;

import com.company.Adapters.AdapterFirebase;
import com.company.Clients.Notificacion;
import com.company.Clients.Notificador;
import com.company.Clients.Socio;

public class Creido extends TrofeoObservador{

    private Socio socio;
    private Notificador notificador;




    @Override
    public void chequearPremio() {

        if(socio.getMediciones().size()>=3) {
            Notificacion notificacion = new Notificacion("Ganaste el premio al creido");
            notificador.setAdapterFirebase(new AdapterFirebase());
            notificador.notificar(notificacion);
            this.socio.agregarTrofeo(this);
        }

    }
}
