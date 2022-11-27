package com.company.Controllers;

import com.company.Clients.Ejercicio;

public class EjercicioController {

    private Ejercicio ejercicio;

    public EjercicioController(Ejercicio ejercicio) {
        this.ejercicio = ejercicio;
    }

    public Ejercicio agregarEjercicio(Ejercicio ejercicio) {
        return new Ejercicio();
    }
}
