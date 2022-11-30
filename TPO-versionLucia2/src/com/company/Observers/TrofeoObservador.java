package com.company.Observers;

import com.company.Clients.Notificador;
import com.company.Clients.TipoTrofeo;

public abstract class TrofeoObservador {

    private Notificador notificador;
    private TipoTrofeo tipoTrofeo;

    public abstract void chequearPremio();

    public Notificador getNotificador() {
        return notificador;
    }

    public void setNotificador(Notificador notificador) {
        this.notificador = notificador;
    }

    public TipoTrofeo getTipoTrofeo() {
        return tipoTrofeo;
    }

    public void setTipoTrofeo(TipoTrofeo tipoTrofeo) {
        this.tipoTrofeo = tipoTrofeo;
    }
}
