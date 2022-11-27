package com.company.Controllers;

import com.company.Clients.Objetivo;

public class ObjetivoController {

    private Objetivo objetivo;

    public ObjetivoController(Objetivo objetivo) {
        this.objetivo = objetivo;
    }

    public Objetivo agregarObjetivo(Objetivo objetivo) {
        return new Objetivo();
    }
}
