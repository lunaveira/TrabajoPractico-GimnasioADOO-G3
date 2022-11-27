package com.company.Adapters;

public class AdapterLogin implements IAdapterLogin{
    @Override
    public void ingresar(String user, String password) {
        System.out.println("el usuario " + user + " ingreso correctamente");
    }
}
