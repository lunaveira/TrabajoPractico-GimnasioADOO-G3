package com.company.Controllers;

import com.company.Clients.Objetivo;
import com.company.Clients.Socio;
import com.company.Clients.TipoEstrategia;
import com.company.Clients.TipoSexo;

public class ObjetivoController {

    private Objetivo objetivo;

    public ObjetivoController(Objetivo objetivo) {
        this.objetivo = objetivo;
    }

    public Objetivo agregarObjetivo(Objetivo objetivo) {
        Socio socio = new Socio(TipoEstrategia.TONIFICAR, "Lucia", "Naveira", 20, TipoSexo.FEMENINO, 51.4,20.1, 72.4);

        return new Objetivo(socio);
    }
}
