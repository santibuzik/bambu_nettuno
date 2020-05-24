/**
 * LecturaTarjeta_400Locator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class LecturaTarjeta_400Locator extends org.apache.axis.client.Service implements org.tempuri.LecturaTarjeta_400 {

    public LecturaTarjeta_400Locator() {
    }


    public LecturaTarjeta_400Locator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LecturaTarjeta_400Locator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_ILecturaTarjeta_400
    private java.lang.String BasicHttpBinding_ILecturaTarjeta_400_address = "https://wwwi.transact.com.uy/Concentrador/LecturaTarjeta_400.svc";

    public java.lang.String getBasicHttpBinding_ILecturaTarjeta_400Address() {
        return BasicHttpBinding_ILecturaTarjeta_400_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_ILecturaTarjeta_400WSDDServiceName = "BasicHttpBinding_ILecturaTarjeta_400";

    public java.lang.String getBasicHttpBinding_ILecturaTarjeta_400WSDDServiceName() {
        return BasicHttpBinding_ILecturaTarjeta_400WSDDServiceName;
    }

    public void setBasicHttpBinding_ILecturaTarjeta_400WSDDServiceName(java.lang.String name) {
        BasicHttpBinding_ILecturaTarjeta_400WSDDServiceName = name;
    }

    public org.tempuri.ILecturaTarjeta_400 getBasicHttpBinding_ILecturaTarjeta_400() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_ILecturaTarjeta_400_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_ILecturaTarjeta_400(endpoint);
    }

    public org.tempuri.ILecturaTarjeta_400 getBasicHttpBinding_ILecturaTarjeta_400(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.BasicHttpBinding_ILecturaTarjeta_400Stub _stub = new org.tempuri.BasicHttpBinding_ILecturaTarjeta_400Stub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_ILecturaTarjeta_400WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_ILecturaTarjeta_400EndpointAddress(java.lang.String address) {
        BasicHttpBinding_ILecturaTarjeta_400_address = address;
    }


    // Use to get a proxy class for BasicHttpBinding_ILecturaTarjeta_4001
    private java.lang.String BasicHttpBinding_ILecturaTarjeta_4001_address = "http://itransact01/Concentrador/LecturaTarjeta_400.svc";

    public java.lang.String getBasicHttpBinding_ILecturaTarjeta_4001Address() {
        return BasicHttpBinding_ILecturaTarjeta_4001_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_ILecturaTarjeta_4001WSDDServiceName = "BasicHttpBinding_ILecturaTarjeta_4001";

    public java.lang.String getBasicHttpBinding_ILecturaTarjeta_4001WSDDServiceName() {
        return BasicHttpBinding_ILecturaTarjeta_4001WSDDServiceName;
    }

    public void setBasicHttpBinding_ILecturaTarjeta_4001WSDDServiceName(java.lang.String name) {
        BasicHttpBinding_ILecturaTarjeta_4001WSDDServiceName = name;
    }

    public org.tempuri.ILecturaTarjeta_400 getBasicHttpBinding_ILecturaTarjeta_4001() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_ILecturaTarjeta_4001_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_ILecturaTarjeta_4001(endpoint);
    }

    public org.tempuri.ILecturaTarjeta_400 getBasicHttpBinding_ILecturaTarjeta_4001(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.BasicHttpBinding_ILecturaTarjeta_4001Stub _stub = new org.tempuri.BasicHttpBinding_ILecturaTarjeta_4001Stub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_ILecturaTarjeta_4001WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_ILecturaTarjeta_4001EndpointAddress(java.lang.String address) {
        BasicHttpBinding_ILecturaTarjeta_4001_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.ILecturaTarjeta_400.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.BasicHttpBinding_ILecturaTarjeta_400Stub _stub = new org.tempuri.BasicHttpBinding_ILecturaTarjeta_400Stub(new java.net.URL(BasicHttpBinding_ILecturaTarjeta_400_address), this);
                _stub.setPortName(getBasicHttpBinding_ILecturaTarjeta_400WSDDServiceName());
                return _stub;
            }
            if (org.tempuri.ILecturaTarjeta_400.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.BasicHttpBinding_ILecturaTarjeta_4001Stub _stub = new org.tempuri.BasicHttpBinding_ILecturaTarjeta_4001Stub(new java.net.URL(BasicHttpBinding_ILecturaTarjeta_4001_address), this);
                _stub.setPortName(getBasicHttpBinding_ILecturaTarjeta_4001WSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BasicHttpBinding_ILecturaTarjeta_400".equals(inputPortName)) {
            return getBasicHttpBinding_ILecturaTarjeta_400();
        }
        else if ("BasicHttpBinding_ILecturaTarjeta_4001".equals(inputPortName)) {
            return getBasicHttpBinding_ILecturaTarjeta_4001();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "LecturaTarjeta_400");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "BasicHttpBinding_ILecturaTarjeta_400"));
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "BasicHttpBinding_ILecturaTarjeta_4001"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_ILecturaTarjeta_400".equals(portName)) {
            setBasicHttpBinding_ILecturaTarjeta_400EndpointAddress(address);
        }
        else 
if ("BasicHttpBinding_ILecturaTarjeta_4001".equals(portName)) {
            setBasicHttpBinding_ILecturaTarjeta_4001EndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
