package com.company.Clients;

import com.company.Adapters.AdapterFirebase;

public class Notificador {

    private static AdapterFirebase adapterFirebase;

    public Notificador() {
    }

    public AdapterFirebase getAdapterFirebase() {
        return adapterFirebase;
    }

    public void setAdapterFirebase(AdapterFirebase adapterFirebase) {
        this.adapterFirebase = adapterFirebase;
    }

    public void notificar(Notificacion notificacion) {
        Notificador.adapterFirebase.notificar(notificacion);


    }

}
