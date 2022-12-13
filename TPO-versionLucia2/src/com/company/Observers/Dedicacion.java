package com.company.Observers;

import com.company.Adapters.AdapterFirebase;
import com.company.Clients.Notificacion;
import com.company.Clients.Notificador;
import com.company.Clients.Objetivo;
import com.company.Clients.Socio;

public class Dedicacion extends TrofeoObservador{

    private Objetivo objetivo;
    private Socio socio;
    private String descripcion;

    public Dedicacion(Objetivo objetivo){
        this.descripcion = "Trofeo Dedicacion";
        this.objetivo = objetivo;
        this.socio = objetivo.getSocio();
    }

    @Override
    public void chequearPremio() {

        if(objetivo.isCumplido()) {
            Notificacion notificacion = new Notificacion("Ganaste un trofeo a la dedicacion");
            Notificador.setAdapterFirebase(new AdapterFirebase());
            Notificador.notificar(notificacion);

            this.socio.agregarTrofeo(this);
        }
    }

    public String getDescripcion() {
        return descripcion;
    }
}
