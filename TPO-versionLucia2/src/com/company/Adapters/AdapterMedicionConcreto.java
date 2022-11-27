package com.company.Adapters;

import com.company.Clients.Medicion;

public class AdapterMedicionConcreto implements IAdapterMedicion{
    @Override
    public Medicion registrarMedicion() {
        Medicion medicion = new Medicion("27/11/2022", 53.4,10.1,5.2);
        return medicion;
    }
}
