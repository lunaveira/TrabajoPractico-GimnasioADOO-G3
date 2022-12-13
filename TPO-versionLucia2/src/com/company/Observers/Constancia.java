package com.company.Observers;

import com.company.Adapters.AdapterFirebase;
import com.company.Clients.Notificacion;
import com.company.Clients.Notificador;
import com.company.Clients.Rutina;
import com.company.Clients.Socio;

public class Constancia extends TrofeoObservador {

    private Rutina rutina;
    private Socio socio;

    public Constancia(Socio socio, Rutina rutina){
        this.rutina = rutina;
        this.socio = socio;
    }






    @Override
    public void chequearPremio() {
        if(rutina.isCumplida()) {
            Notificacion notificacion = new Notificacion("Ganaste un trofeo a la constancia");
            Notificador.setAdapterFirebase(new AdapterFirebase());
            Notificador.notificar(notificacion);

            this.socio.agregarTrofeo(this);


        }
    }
}
