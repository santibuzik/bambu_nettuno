/**
 * ITarjetasCierre_400.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface ITarjetasCierre_400 extends java.rmi.Remote {
    public org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasCierre_400RespuestaPostearCierre postearCierre(org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasCierre_400Cierre cierre) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasCierre_400RespuestaPostearCierre postearConsultaUltimoCierre(org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasCierre_400Cierre consultaUltimoCierre) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasCierre_400RespuestaConsultarCierre consultarCierre(java.lang.String tokenNro) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasCierre_400RespuestaCancelarCierre cancelarCierre(java.lang.String tokenNro) throws java.rmi.RemoteException;
}
