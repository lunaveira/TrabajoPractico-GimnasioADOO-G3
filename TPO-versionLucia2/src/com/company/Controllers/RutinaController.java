package com.company.Controllers;

import com.company.Clients.Rutina;

public class RutinaController {

    private Rutina rutina;

    public RutinaController(Rutina rutina) {
        this.rutina = rutina;
    }

    public Rutina agregarRutina(Rutina rutina) {
        return new Rutina();
    }
}
