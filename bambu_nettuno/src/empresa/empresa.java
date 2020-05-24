/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author Notebook
 */
public class empresa {
    String rut;
    int numerotag;
    String razonsocial;
    String direccion;
    boolean habilitada;

    public void empresa(String rut, int numerotag, String razonsocial, String direccion, boolean habilitada) {
        this.rut = rut;
        this.numerotag = numerotag;
        this.razonsocial = razonsocial;
        this.direccion = direccion;
        this.habilitada = habilitada;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getNumerotag() {
        return numerotag;
    }

    public void setNumerotag(int numerotag) {
        this.numerotag = numerotag;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isHabilitada() {
        return habilitada;
    }

    public void setHabilitada(boolean habilitada) {
        this.habilitada = habilitada;
    }
    
    
}
