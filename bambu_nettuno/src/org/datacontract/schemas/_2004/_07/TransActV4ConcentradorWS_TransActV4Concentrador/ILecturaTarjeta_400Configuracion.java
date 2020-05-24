/**
 * ILecturaTarjeta_400Configuracion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador;

public class ILecturaTarjeta_400Configuracion  implements java.io.Serializable {
    private java.lang.Integer GUIModo;

    private java.lang.Boolean modoEmulacion;

    public ILecturaTarjeta_400Configuracion() {
    }

    public ILecturaTarjeta_400Configuracion(
           java.lang.Integer GUIModo,
           java.lang.Boolean modoEmulacion) {
           this.GUIModo = GUIModo;
           this.modoEmulacion = modoEmulacion;
    }


    /**
     * Gets the GUIModo value for this ILecturaTarjeta_400Configuracion.
     * 
     * @return GUIModo
     */
    public java.lang.Integer getGUIModo() {
        return GUIModo;
    }


    /**
     * Sets the GUIModo value for this ILecturaTarjeta_400Configuracion.
     * 
     * @param GUIModo
     */
    public void setGUIModo(java.lang.Integer GUIModo) {
        this.GUIModo = GUIModo;
    }


    /**
     * Gets the modoEmulacion value for this ILecturaTarjeta_400Configuracion.
     * 
     * @return modoEmulacion
     */
    public java.lang.Boolean getModoEmulacion() {
        return modoEmulacion;
    }


    /**
     * Sets the modoEmulacion value for this ILecturaTarjeta_400Configuracion.
     * 
     * @param modoEmulacion
     */
    public void setModoEmulacion(java.lang.Boolean modoEmulacion) {
        this.modoEmulacion = modoEmulacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ILecturaTarjeta_400Configuracion)) return false;
        ILecturaTarjeta_400Configuracion other = (ILecturaTarjeta_400Configuracion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GUIModo==null && other.getGUIModo()==null) || 
             (this.GUIModo!=null &&
              this.GUIModo.equals(other.getGUIModo()))) &&
            ((this.modoEmulacion==null && other.getModoEmulacion()==null) || 
             (this.modoEmulacion!=null &&
              this.modoEmulacion.equals(other.getModoEmulacion())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getGUIModo() != null) {
            _hashCode += getGUIModo().hashCode();
        }
        if (getModoEmulacion() != null) {
            _hashCode += getModoEmulacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ILecturaTarjeta_400Configuracion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ILecturaTarjeta_400.Configuracion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GUIModo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "GUIModo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modoEmulacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ModoEmulacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
