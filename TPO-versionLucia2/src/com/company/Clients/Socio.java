package com.company.Clients;

import com.company.Adapters.AdapterLogin;
import com.company.Adapters.AdapterMedicionConcreto;
import com.company.Observers.Constancia;
import com.company.Observers.Creido;
import com.company.Observers.Dedicacion;
import com.company.Observers.TrofeoObservador;

import java.util.ArrayList;

public class Socio {

    private AdapterLogin adapterLogin;
    private TipoEstrategia tipoEstrategia;
    private ArrayList<Medicion> mediciones;
    private String nombre;
    private String apellido;
    private int edad;
    private TipoSexo tipoSexo;
    private Objetivo objetivo;
    private Double altura;
    private Double pesoActual;
    private Double masaActual;
    private Double grasaActual;
    private Rutina rutina;
    private AdapterMedicionConcreto adapterMedicionConcreto;
    private ArrayList<TrofeoObservador> trofeos;



    public Socio(TipoEstrategia tipoEstrategia, String nombre, String apellido, int edad, TipoSexo tipoSexo, Double pesoActual, Double grasaActual, Double masaActual  ) {
        super();
        AdapterLogin adapterLogin1 = new AdapterLogin();
        this.adapterLogin = adapterLogin1;
        this.tipoEstrategia = tipoEstrategia;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.tipoSexo = tipoSexo;
        this.pesoActual = pesoActual;
        this.grasaActual = grasaActual;
        this.masaActual = masaActual;


        this.trofeos = new ArrayList<TrofeoObservador>();
         Creido creido = new Creido();
         creido.setTipoTrofeo(TipoTrofeo.CREIDO);
         this.trofeos.add(creido);


          Dedicacion dedicacion = new Dedicacion();
          dedicacion.setTipoTrofeo(TipoTrofeo.DEDICACION);
          this.trofeos.add(dedicacion);

          Constancia constancia = new Constancia(rutina);
          constancia.setTipoTrofeo(TipoTrofeo.CONSTANCIA);
          this.trofeos.add(constancia);




    }

   public void mostrarSocio(Socio socio) {
        System.out.println("Nombre y apellido: " + socio.getNombre() + " " + socio.getApellido());
        System.out.println("Edad: " + socio.getEdad());
        System.out.println("Sexo: " + socio.getTipoSexo());
        System.out.println("Peso actual: " + socio.getPesoActual());
        System.out.println("Porcentaje grasa actual: " + socio.getGrasaActual());
        System.out.println("Porcentaje masa actual: " + socio.getMasaActual());
        System.out.println("Objetivo: " + socio.getTipoEstrategia());
   }



    public void ingresar(String user, String password) {
        adapterLogin.ingresar(user, password );
    }



    public AdapterLogin getAdapterLogin() {
        return adapterLogin;
    }

    public void setAdapterLogin(AdapterLogin adapterLogin) {
        this.adapterLogin = adapterLogin;
    }

    public ArrayList<Medicion> getMediciones() {
        return mediciones;
    }

    public void setMediciones(ArrayList<Medicion> mediciones) {
        this.mediciones = mediciones;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public TipoSexo getTipoSexo() {
        return tipoSexo;
    }

    public void setTipoSexo(TipoSexo tipoSexo) {
        this.tipoSexo = tipoSexo;
    }

    public Objetivo getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(Objetivo objetivo) {
        this.objetivo = objetivo;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Rutina getRutina() {
        return rutina;
    }

    public void setRutina(Rutina rutina) {
        this.rutina = rutina;
    }

    public AdapterMedicionConcreto getAdapterMedicionConcreto() {
        return adapterMedicionConcreto;
    }

    public void setAdapterMedicionConcreto(AdapterMedicionConcreto adapterMedicionConcreto) {
        this.adapterMedicionConcreto = adapterMedicionConcreto;
    }

    public ArrayList<TrofeoObservador> getTrofeos() {
        return trofeos;
    }

    public void setTrofeos(ArrayList<TrofeoObservador> trofeos) {
        this.trofeos = trofeos;
    }

    public TipoEstrategia getTipoEstrategia() {
        return tipoEstrategia;
    }

    public void setTipoEstrategia(TipoEstrategia tipoEstrategia) {
        this.tipoEstrategia = tipoEstrategia;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(Double pesoActual) {
        this.pesoActual = pesoActual;
    }

    public Double getMasaActual() {
        return masaActual;
    }

    public void setMasaActual(Double masaActual) {
        this.masaActual = masaActual;
    }

    public Double getGrasaActual() {
        return grasaActual;
    }

    public void setGrasaActual(Double grasaActual) {
        this.grasaActual = grasaActual;
    }

    public void agregarTrofeo(TrofeoObservador trofeo) {
        this.trofeos.add(trofeo);
    }

    public void agregarObservador(TrofeoObservador trofeo) {
        trofeos.add(trofeo);
    }


    public void cambiarObjetivo() {
        System.out.println("Nueva rutina creada para el nuevo objetivo: " + this.getTipoEstrategia());
    }

   public void registrarMedicion(Medicion medicion) {
        this.mediciones = new ArrayList<Medicion>();
        mediciones.add(medicion);
        pesoActual = medicion.getPeso();


   }

   /* public void verTrofeos() {
        for (TrofeoObservador trofeo : this.trofeos) {
            System.out.println(trofeo.getTipoTrofeo());
        }

    } */



    public void obtenerPremio() {
        if (trofeos != null ) {
            for (TrofeoObservador trofeo: trofeos) {
                if (trofeo instanceof Dedicacion) {
                    System.out.println("estas en dedicacion");
                } else if (trofeo instanceof Creido) {
                    System.out.println("estas en creido");
                } else if (trofeo instanceof Constancia) {
                    System.out.println("estas en constancia");
                }
            }
        }
    }


}
