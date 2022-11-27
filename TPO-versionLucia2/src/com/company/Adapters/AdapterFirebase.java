package com.company.Adapters;

import com.company.Clients.Notificacion;

public class AdapterFirebase implements IAdapterFirebase {
    @Override
    public void notificar(Notificacion notificacion) {
        System.out.println("Se envia el mensaje: " + notificacion.getMensaje());
    }
}
