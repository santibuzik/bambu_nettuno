/**
 * ITarjetasTransaccion_400.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface ITarjetasTransaccion_400 extends java.rmi.Remote {
    public org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasTransaccion_400RespuestaPostearConsultaDatosTarjeta postearConsultaDatosTarjeta(org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasTransaccion_400ConsultaTarjeta consultaTarjeta) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta consultarDatosTarjeta(java.lang.String tokenNro) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasTransaccion_400RespuestaPostearTransaccion postearTransaccion(org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasTransaccion_400Transaccion transaccion) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasTransaccion_400RespuestaPostearTransaccion postearTransaccionBatch(org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasTransaccion_400Transaccion transaccion, java.lang.Integer referencia, java.lang.String descripcion, java.lang.Integer minutosExpira) throws java.rmi.RemoteException;
    public java.lang.Boolean confirmarPosteoTransaccionBatch(java.lang.String tokenNro) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasTransaccion_400RespuestaConsultarTransaccion consultarTransaccion(java.lang.String tokenNro) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasTransaccion_400RespuestaCancelarTransaccion cancelarTransaccion(java.lang.String tokenNro) throws java.rmi.RemoteException;
}
