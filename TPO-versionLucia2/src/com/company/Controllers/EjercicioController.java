package com.company.Controllers;

import com.company.Clients.Ejercicio;
import com.company.Clients.GrupoMuscular;
import com.company.Strategies.ExigenciaMuscular;

public class EjercicioController {

    private Ejercicio ejercicio;

    public EjercicioController(Ejercicio ejercicio) {
        this.ejercicio = ejercicio;
    }

    public Ejercicio agregarEjercicio(Ejercicio ejercicio) {
        return new Ejercicio("nombre", ExigenciaMuscular.ALTA,3, GrupoMuscular.PECHO);
    }
}
