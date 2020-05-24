package org.tempuri;

public class ITarjetasCierre_400Proxy implements org.tempuri.ITarjetasCierre_400 {
  private String _endpoint = null;
  private org.tempuri.ITarjetasCierre_400 iTarjetasCierre_400 = null;
  
  public ITarjetasCierre_400Proxy() {
    _initITarjetasCierre_400Proxy();
  }
  
  public ITarjetasCierre_400Proxy(String endpoint) {
    _endpoint = endpoint;
    _initITarjetasCierre_400Proxy();
  }
  
  private void _initITarjetasCierre_400Proxy() {
    try {
      iTarjetasCierre_400 = (new org.tempuri.TarjetasCierre_400Locator()).getBasicHttpBinding_ITarjetasCierre_400();
      if (iTarjetasCierre_400 != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iTarjetasCierre_400)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iTarjetasCierre_400)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iTarjetasCierre_400 != null)
      ((javax.xml.rpc.Stub)iTarjetasCierre_400)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.ITarjetasCierre_400 getITarjetasCierre_400() {
    if (iTarjetasCierre_400 == null)
      _initITarjetasCierre_400Proxy();
    return iTarjetasCierre_400;
  }
  
  public org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasCierre_400RespuestaPostearCierre postearCierre(org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasCierre_400Cierre cierre) throws java.rmi.RemoteException{
    if (iTarjetasCierre_400 == null)
      _initITarjetasCierre_400Proxy();
    return iTarjetasCierre_400.postearCierre(cierre);
  }
  
  public org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasCierre_400RespuestaPostearCierre postearConsultaUltimoCierre(org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasCierre_400Cierre consultaUltimoCierre) throws java.rmi.RemoteException{
    if (iTarjetasCierre_400 == null)
      _initITarjetasCierre_400Proxy();
    return iTarjetasCierre_400.postearConsultaUltimoCierre(consultaUltimoCierre);
  }
  
  public org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasCierre_400RespuestaConsultarCierre consultarCierre(java.lang.String tokenNro) throws java.rmi.RemoteException{
    if (iTarjetasCierre_400 == null)
      _initITarjetasCierre_400Proxy();
    return iTarjetasCierre_400.consultarCierre(tokenNro);
  }
  
  public org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasCierre_400RespuestaCancelarCierre cancelarCierre(java.lang.String tokenNro) throws java.rmi.RemoteException{
    if (iTarjetasCierre_400 == null)
      _initITarjetasCierre_400Proxy();
    return iTarjetasCierre_400.cancelarCierre(tokenNro);
  }
  
  
}