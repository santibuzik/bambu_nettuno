/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package venta;

import bd.bdventa;
import empresa.empresa;
import java.sql.SQLException;

/**
 *
 * @author Notebook
 */

//extend empresa
public class venta{
    int numeroFolio;
    double totalsinimpuesto;
    double totalconimpuesto;
    double montoimpuesto;
    int cantidadFichas;
    String rut;
    int numeroTag;
    int tipo;
    bdventa venta = new bdventa();

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getNumeroTag() {
        return numeroTag;
    }

    public void setNumeroTag(int numeroTag) {
        this.numeroTag = numeroTag;
    }

    public int getNumeroFolio() {
        return numeroFolio;
    }

    public void setNumeroFolio(int numeroFolio) {
        this.numeroFolio = numeroFolio;
    }

    public double getTotalsinimpuesto() {
        return totalsinimpuesto;
    }

    public void setTotalsinimpuesto(double totalsinimpuesto) {
        this.totalsinimpuesto = totalsinimpuesto;
    }

    public double getTotalconimpuesto() {
        return totalconimpuesto;
    }

    public void setTotalconimpuesto(double totalconimpuesto) {
        this.totalconimpuesto = totalconimpuesto;
    }

    public double getMontoimpuesto() {
        return montoimpuesto;
    }

    public void setMontoimpuesto(double montoimpuesto) {
        this.montoimpuesto = montoimpuesto;
    }

    public int getCantidadFichas() {
        return cantidadFichas;
    }

    public void setCantidadFichas(int cantidadFichas) {
        this.cantidadFichas = cantidadFichas;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public venta(double totalsinimpuesto, double totalconimpuesto, double montoimpuesto, int cantidadFichas, String rut, int numeroTag, int tipo) {
        //this.numeroFolio = numeroFolio;
        this.totalsinimpuesto = totalsinimpuesto;
        this.totalconimpuesto = totalconimpuesto;
        this.montoimpuesto = montoimpuesto;
        this.cantidadFichas = cantidadFichas;
        this.rut = rut;
        this.numeroTag = numeroTag;
        this.tipo = tipo;
    }
    
    
    public venta(double totalsinimpuesto, int totalconimpuesto, double montoimpuesto, int cantidadFichas) {
        this.totalsinimpuesto = totalsinimpuesto;
        this.totalconimpuesto = totalconimpuesto;
        this.montoimpuesto = montoimpuesto;
        this.cantidadFichas = cantidadFichas;
        this.rut = rut;
    }
    
    public venta() {
		// TODO Auto-generated constructor stub
	}

	public String insertarVenta(venta pVenta) throws SQLException{
        totalsinimpuesto=pVenta.totalsinimpuesto;
        totalconimpuesto=pVenta.totalconimpuesto;
        montoimpuesto=pVenta.montoimpuesto;
        cantidadFichas=pVenta.cantidadFichas;
        rut=pVenta.rut;
        numeroTag=pVenta.numeroTag;
        tipo=pVenta.tipo;
        try{ 
        bdventa.insertarVenta(totalsinimpuesto,totalconimpuesto,montoimpuesto,cantidadFichas,rut,numeroTag,tipo);
        return "exito";
        }
        catch(Exception e){
        return "fail";
        }
    }
    
    public Double consultarNro() {
    	Double msj=0.0;
    	try { 
    		Double numeroVenta = venta.consultarNro();
    		msj=numeroVenta;
    	}
    	catch (Exception e) {
			// TODO: handle exception
		}
    	return msj;
    }
    
    public void eliminarVenta(){
        
    }
    
    
}
