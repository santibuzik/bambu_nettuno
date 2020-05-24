/**
 * ITarjetasCierre_400Comportamiento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador;

public class ITarjetasCierre_400Comportamiento  implements java.io.Serializable {
    private java.lang.Boolean modificarProcesadorId;

    public ITarjetasCierre_400Comportamiento() {
    }

    public ITarjetasCierre_400Comportamiento(
           java.lang.Boolean modificarProcesadorId) {
           this.modificarProcesadorId = modificarProcesadorId;
    }


    /**
     * Gets the modificarProcesadorId value for this ITarjetasCierre_400Comportamiento.
     * 
     * @return modificarProcesadorId
     */
    public java.lang.Boolean getModificarProcesadorId() {
        return modificarProcesadorId;
    }


    /**
     * Sets the modificarProcesadorId value for this ITarjetasCierre_400Comportamiento.
     * 
     * @param modificarProcesadorId
     */
    public void setModificarProcesadorId(java.lang.Boolean modificarProcesadorId) {
        this.modificarProcesadorId = modificarProcesadorId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ITarjetasCierre_400Comportamiento)) return false;
        ITarjetasCierre_400Comportamiento other = (ITarjetasCierre_400Comportamiento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.modificarProcesadorId==null && other.getModificarProcesadorId()==null) || 
             (this.modificarProcesadorId!=null &&
              this.modificarProcesadorId.equals(other.getModificarProcesadorId())));
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
        if (getModificarProcesadorId() != null) {
            _hashCode += getModificarProcesadorId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ITarjetasCierre_400Comportamiento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ITarjetasCierre_400.Comportamiento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modificarProcesadorId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ModificarProcesadorId"));
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
