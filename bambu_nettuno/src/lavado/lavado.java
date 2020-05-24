/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavado;

import java.sql.Date;

/**
 *
 * @author Notebook
 */
public class lavado {
    double totalconimpuesto;
    double totalsinimpuesto;
    double montoimpuesto;

    public lavado(double totalconimpuesto, double totalsinimpuesto, double montoimpuesto) {
        this.totalconimpuesto = totalconimpuesto;
        this.totalsinimpuesto = totalsinimpuesto;
        this.montoimpuesto = montoimpuesto;
        //this.fecha = fecha;
    }

    public double getTotalconimpuesto() {
        return totalconimpuesto;
    }

    public void setTotalconimpuesto(double totalconimpuesto) {
        this.totalconimpuesto = totalconimpuesto;
    }

    public double getTotalsinimpuesto() {
        return totalsinimpuesto;
    }

    public void setTotalsinimpuesto(double totalsinimpuesto) {
        this.totalsinimpuesto = totalsinimpuesto;
    }

    public double getMontoimpuesto() {
        return montoimpuesto;
    }

    public void setMontoimpuesto(double montoimpuesto) {
        this.montoimpuesto = montoimpuesto;
    }

    /*public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }*/
    
    public void insertarLavado(lavado pLavado){
        montoimpuesto=pLavado.montoimpuesto;
        totalconimpuesto=pLavado.totalconimpuesto;
        totalsinimpuesto=pLavado.totalsinimpuesto;
        //bdlavado.insertarLavado(montoimpuesto,totalconimpuesto,totalsinimpuesto);
    }
    
    
}
