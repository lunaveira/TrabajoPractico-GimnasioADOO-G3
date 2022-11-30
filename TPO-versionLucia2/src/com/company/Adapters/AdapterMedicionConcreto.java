package com.company.Adapters;

import com.company.Clients.Medicion;

public class AdapterMedicionConcreto implements IAdapterMedicion{
    @Override
    public Medicion registrarMedicion() {
        return new Medicion("30/11/22", 77.7, 99.99, 99.99);
    }
}
