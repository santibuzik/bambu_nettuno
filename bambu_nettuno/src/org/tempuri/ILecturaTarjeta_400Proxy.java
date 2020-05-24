package org.tempuri;

public class ILecturaTarjeta_400Proxy implements org.tempuri.ILecturaTarjeta_400 {
  private String _endpoint = null;
  private org.tempuri.ILecturaTarjeta_400 iLecturaTarjeta_400 = null;
  
  public ILecturaTarjeta_400Proxy() {
    _initILecturaTarjeta_400Proxy();
  }
  
  public ILecturaTarjeta_400Proxy(String endpoint) {
    _endpoint = endpoint;
    _initILecturaTarjeta_400Proxy();
  }
  
  private void _initILecturaTarjeta_400Proxy() {
    try {
      iLecturaTarjeta_400 = (new org.tempuri.LecturaTarjeta_400Locator()).getBasicHttpBinding_ILecturaTarjeta_400();
      if (iLecturaTarjeta_400 != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iLecturaTarjeta_400)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iLecturaTarjeta_400)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iLecturaTarjeta_400 != null)
      ((javax.xml.rpc.Stub)iLecturaTarjeta_400)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.ILecturaTarjeta_400 getILecturaTarjeta_400() {
    if (iLecturaTarjeta_400 == null)
      _initILecturaTarjeta_400Proxy();
    return iLecturaTarjeta_400;
  }
  
  public org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ILecturaTarjeta_400RespuestaPostearLecturaTarjeta postearLecturaTarjeta(org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ILecturaTarjeta_400LecturaTarjeta lecturaTarjeta) throws java.rmi.RemoteException{
    if (iLecturaTarjeta_400 == null)
      _initILecturaTarjeta_400Proxy();
    return iLecturaTarjeta_400.postearLecturaTarjeta(lecturaTarjeta);
  }
  
  public org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ILecturaTarjeta_400RespuestaConsultarLecturaTarjeta consultarLecturaTarjeta(java.lang.String tokenNro) throws java.rmi.RemoteException{
    if (iLecturaTarjeta_400 == null)
      _initILecturaTarjeta_400Proxy();
    return iLecturaTarjeta_400.consultarLecturaTarjeta(tokenNro);
  }
  
  
}