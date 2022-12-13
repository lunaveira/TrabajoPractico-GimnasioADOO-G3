package com.company.Observers;

import com.company.Adapters.AdapterFirebase;
import com.company.Clients.Notificacion;
import com.company.Clients.Notificador;
import com.company.Clients.Socio;

public class Creido extends TrofeoObservador{

    private Socio socio;
    private String descripcion;

    public Creido(Socio socio){
        this.descripcion = "Trofeo Creido";
        this.socio = socio;
    }

    @Override
    public void chequearPremio() {

        if(socio.getMediciones().size()>=3) {
            Notificacion notificacion = new Notificacion("Ganaste el premio al creido");
            Notificador.setAdapterFirebase(new AdapterFirebase());
            Notificador.notificar(notificacion);
            this.socio.agregarTrofeo(this);
        }
    }

    public String getDescripcion() {
        return this.descripcion;
    }
}
