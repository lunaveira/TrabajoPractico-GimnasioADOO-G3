package com.company.Observers;

import com.company.Adapters.AdapterFirebase;
import com.company.Clients.Notificacion;
import com.company.Clients.Notificador;
import com.company.Clients.Rutina;

public class Constancia extends TrofeoObservador {

    private Rutina rutina;

    private Notificador notificador;



    public Constancia(Rutina rutina) {
        this.rutina = rutina;
    }

    @Override
    public void chequearPremio() {
        if(rutina.rutinaCumplida()) {
            Notificacion notificacion = new Notificacion("Ganaste un trofeo a la constancia");
            notificador.setAdapterFirebase(new AdapterFirebase());
            notificador.notificar(notificacion);


        }
    }
}
