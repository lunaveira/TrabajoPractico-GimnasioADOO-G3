package com.company.Observers;

import com.company.Clients.Notificador;
import com.company.Clients.TipoTrofeo;

public abstract class TrofeoObservador {

    private Notificador notificador;
    private TipoTrofeo tipoTrofeo;

    public abstract void chequearPremio();


}
