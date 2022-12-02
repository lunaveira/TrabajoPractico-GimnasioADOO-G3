package com.company.Strategies;

import com.company.Clients.Rutina;
import com.company.Clients.Socio;

public interface IObjetivoStrategy {

    boolean objCumplido(Socio socio);

    Rutina crearRutina();
}
