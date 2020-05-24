package org.tempuri;

public class ITarjetasTransaccion_400Proxy implements org.tempuri.ITarjetasTransaccion_400 {
  private String _endpoint = null;
  private org.tempuri.ITarjetasTransaccion_400 iTarjetasTransaccion_400 = null;
  
  public ITarjetasTransaccion_400Proxy() {
    _initITarjetasTransaccion_400Proxy();
  }
  
  public ITarjetasTransaccion_400Proxy(String endpoint) {
    _endpoint = endpoint;
    _initITarjetasTransaccion_400Proxy();
  }
  
  private void _initITarjetasTransaccion_400Proxy() {
    try {
      iTarjetasTransaccion_400 = (new org.tempuri.TarjetasTransaccion_400Locator()).getBasicHttpBinding_ITarjetasTransaccion_400();
      if (iTarjetasTransaccion_400 != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iTarjetasTransaccion_400)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iTarjetasTransaccion_400)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iTarjetasTransaccion_400 != null)
      ((javax.xml.rpc.Stub)iTarjetasTransaccion_400)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.ITarjetasTransaccion_400 getITarjetasTransaccion_400() {
    if (iTarjetasTransaccion_400 == null)
      _initITarjetasTransaccion_400Proxy();
    return iTarjetasTransaccion_400;
  }
  
  public org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasTransaccion_400RespuestaPostearConsultaDatosTarjeta postearConsultaDatosTarjeta(org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasTransaccion_400ConsultaTarjeta consultaTarjeta) throws java.rmi.RemoteException{
    if (iTarjetasTransaccion_400 == null)
      _initITarjetasTransaccion_400Proxy();
    return iTarjetasTransaccion_400.postearConsultaDatosTarjeta(consultaTarjeta);
  }
  
  public org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta consultarDatosTarjeta(java.lang.String tokenNro) throws java.rmi.RemoteException{
    if (iTarjetasTransaccion_400 == null)
      _initITarjetasTransaccion_400Proxy();
    return iTarjetasTransaccion_400.consultarDatosTarjeta(tokenNro);
  }
  
  public org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasTransaccion_400RespuestaPostearTransaccion postearTransaccion(org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasTransaccion_400Transaccion transaccion) throws java.rmi.RemoteException{
    if (iTarjetasTransaccion_400 == null)
      _initITarjetasTransaccion_400Proxy();
    return iTarjetasTransaccion_400.postearTransaccion(transaccion);
  }
  
  public org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasTransaccion_400RespuestaPostearTransaccion postearTransaccionBatch(org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasTransaccion_400Transaccion transaccion, java.lang.Integer referencia, java.lang.String descripcion, java.lang.Integer minutosExpira) throws java.rmi.RemoteException{
    if (iTarjetasTransaccion_400 == null)
      _initITarjetasTransaccion_400Proxy();
    return iTarjetasTransaccion_400.postearTransaccionBatch(transaccion, referencia, descripcion, minutosExpira);
  }
  
  public java.lang.Boolean confirmarPosteoTransaccionBatch(java.lang.String tokenNro) throws java.rmi.RemoteException{
    if (iTarjetasTransaccion_400 == null)
      _initITarjetasTransaccion_400Proxy();
    return iTarjetasTransaccion_400.confirmarPosteoTransaccionBatch(tokenNro);
  }
  
  public org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasTransaccion_400RespuestaConsultarTransaccion consultarTransaccion(java.lang.String tokenNro) throws java.rmi.RemoteException{
    if (iTarjetasTransaccion_400 == null)
      _initITarjetasTransaccion_400Proxy();
    return iTarjetasTransaccion_400.consultarTransaccion(tokenNro);
  }
  
  public org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasTransaccion_400RespuestaCancelarTransaccion cancelarTransaccion(java.lang.String tokenNro) throws java.rmi.RemoteException{
    if (iTarjetasTransaccion_400 == null)
      _initITarjetasTransaccion_400Proxy();
    return iTarjetasTransaccion_400.cancelarTransaccion(tokenNro);
  }
  
  
}