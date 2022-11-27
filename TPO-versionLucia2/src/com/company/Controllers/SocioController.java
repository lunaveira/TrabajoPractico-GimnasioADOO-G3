package com.company.Controllers;

import com.company.Clients.Socio;

public class SocioController {

    private Socio socio;

    public SocioController(Socio socio) {
        this.socio = socio;
    }

    public SocioController() {

    }

    public void ingresar(String user, String password) {
        socio.ingresar(user, password);
    }
}
