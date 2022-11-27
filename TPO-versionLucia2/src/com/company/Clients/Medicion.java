package com.company.Clients;

public class Medicion {

    private String fecha;
    private Double peso;
    private Double grasa;
    private Double masa;

    public Medicion(String fecha, Double peso, Double grasa, Double masa) {
        this.fecha = fecha;
        this.peso = peso;
        this.grasa = grasa;
        this.masa = masa;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getGrasa() {
        return grasa;
    }

    public void setGrasa(Double grasa) {
        this.grasa = grasa;
    }

    public Double getMasa() {
        return masa;
    }

    public void setMasa(Double masa) {
        this.masa = masa;
    }
}
