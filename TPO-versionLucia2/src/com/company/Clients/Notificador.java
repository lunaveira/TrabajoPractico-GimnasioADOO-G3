package com.company.Clients;

import com.company.Adapters.AdapterFirebase;

public class Notificador {

    private static AdapterFirebase adapterFirebase;

    public Notificador() {
    }

    public AdapterFirebase getAdapterFirebase() {
        return adapterFirebase;
    }

    public static void setAdapterFirebase(AdapterFirebase adapterFire) {
        adapterFirebase = adapterFire;
    }

    public static void notificar(Notificacion notificacion) {
        Notificador.adapterFirebase.notificar(notificacion);
    }

}
