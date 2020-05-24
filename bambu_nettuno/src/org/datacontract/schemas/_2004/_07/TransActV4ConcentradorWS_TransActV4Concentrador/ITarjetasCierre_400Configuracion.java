/**
 * ITarjetasCierre_400Configuracion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador;

public class ITarjetasCierre_400Configuracion  implements java.io.Serializable {
    private java.lang.Integer GUIModo;

    private java.lang.Integer impresionCopias;

    private java.lang.Integer impresionModo;

    private java.lang.String impresionNombreImpresora;

    private java.lang.Integer impresionTipo;

    private java.lang.Integer impresionTipoImpresora;

    private java.lang.Boolean modoEmulacion;

    public ITarjetasCierre_400Configuracion() {
    }

    public ITarjetasCierre_400Configuracion(
           java.lang.Integer GUIModo,
           java.lang.Integer impresionCopias,
           java.lang.Integer impresionModo,
           java.lang.String impresionNombreImpresora,
           java.lang.Integer impresionTipo,
           java.lang.Integer impresionTipoImpresora,
           java.lang.Boolean modoEmulacion) {
           this.GUIModo = GUIModo;
           this.impresionCopias = impresionCopias;
           this.impresionModo = impresionModo;
           this.impresionNombreImpresora = impresionNombreImpresora;
           this.impresionTipo = impresionTipo;
           this.impresionTipoImpresora = impresionTipoImpresora;
           this.modoEmulacion = modoEmulacion;
    }


    /**
     * Gets the GUIModo value for this ITarjetasCierre_400Configuracion.
     * 
     * @return GUIModo
     */
    public java.lang.Integer getGUIModo() {
        return GUIModo;
    }


    /**
     * Sets the GUIModo value for this ITarjetasCierre_400Configuracion.
     * 
     * @param GUIModo
     */
    public void setGUIModo(java.lang.Integer GUIModo) {
        this.GUIModo = GUIModo;
    }


    /**
     * Gets the impresionCopias value for this ITarjetasCierre_400Configuracion.
     * 
     * @return impresionCopias
     */
    public java.lang.Integer getImpresionCopias() {
        return impresionCopias;
    }


    /**
     * Sets the impresionCopias value for this ITarjetasCierre_400Configuracion.
     * 
     * @param impresionCopias
     */
    public void setImpresionCopias(java.lang.Integer impresionCopias) {
        this.impresionCopias = impresionCopias;
    }


    /**
     * Gets the impresionModo value for this ITarjetasCierre_400Configuracion.
     * 
     * @return impresionModo
     */
    public java.lang.Integer getImpresionModo() {
        return impresionModo;
    }


    /**
     * Sets the impresionModo value for this ITarjetasCierre_400Configuracion.
     * 
     * @param impresionModo
     */
    public void setImpresionModo(java.lang.Integer impresionModo) {
        this.impresionModo = impresionModo;
    }


    /**
     * Gets the impresionNombreImpresora value for this ITarjetasCierre_400Configuracion.
     * 
     * @return impresionNombreImpresora
     */
    public java.lang.String getImpresionNombreImpresora() {
        return impresionNombreImpresora;
    }


    /**
     * Sets the impresionNombreImpresora value for this ITarjetasCierre_400Configuracion.
     * 
     * @param impresionNombreImpresora
     */
    public void setImpresionNombreImpresora(java.lang.String impresionNombreImpresora) {
        this.impresionNombreImpresora = impresionNombreImpresora;
    }


    /**
     * Gets the impresionTipo value for this ITarjetasCierre_400Configuracion.
     * 
     * @return impresionTipo
     */
    public java.lang.Integer getImpresionTipo() {
        return impresionTipo;
    }


    /**
     * Sets the impresionTipo value for this ITarjetasCierre_400Configuracion.
     * 
     * @param impresionTipo
     */
    public void setImpresionTipo(java.lang.Integer impresionTipo) {
        this.impresionTipo = impresionTipo;
    }


    /**
     * Gets the impresionTipoImpresora value for this ITarjetasCierre_400Configuracion.
     * 
     * @return impresionTipoImpresora
     */
    public java.lang.Integer getImpresionTipoImpresora() {
        return impresionTipoImpresora;
    }


    /**
     * Sets the impresionTipoImpresora value for this ITarjetasCierre_400Configuracion.
     * 
     * @param impresionTipoImpresora
     */
    public void setImpresionTipoImpresora(java.lang.Integer impresionTipoImpresora) {
        this.impresionTipoImpresora = impresionTipoImpresora;
    }


    /**
     * Gets the modoEmulacion value for this ITarjetasCierre_400Configuracion.
     * 
     * @return modoEmulacion
     */
    public java.lang.Boolean getModoEmulacion() {
        return modoEmulacion;
    }


    /**
     * Sets the modoEmulacion value for this ITarjetasCierre_400Configuracion.
     * 
     * @param modoEmulacion
     */
    public void setModoEmulacion(java.lang.Boolean modoEmulacion) {
        this.modoEmulacion = modoEmulacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ITarjetasCierre_400Configuracion)) return false;
        ITarjetasCierre_400Configuracion other = (ITarjetasCierre_400Configuracion) obj;
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
            ((this.impresionCopias==null && other.getImpresionCopias()==null) || 
             (this.impresionCopias!=null &&
              this.impresionCopias.equals(other.getImpresionCopias()))) &&
            ((this.impresionModo==null && other.getImpresionModo()==null) || 
             (this.impresionModo!=null &&
              this.impresionModo.equals(other.getImpresionModo()))) &&
            ((this.impresionNombreImpresora==null && other.getImpresionNombreImpresora()==null) || 
             (this.impresionNombreImpresora!=null &&
              this.impresionNombreImpresora.equals(other.getImpresionNombreImpresora()))) &&
            ((this.impresionTipo==null && other.getImpresionTipo()==null) || 
             (this.impresionTipo!=null &&
              this.impresionTipo.equals(other.getImpresionTipo()))) &&
            ((this.impresionTipoImpresora==null && other.getImpresionTipoImpresora()==null) || 
             (this.impresionTipoImpresora!=null &&
              this.impresionTipoImpresora.equals(other.getImpresionTipoImpresora()))) &&
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
        if (getImpresionCopias() != null) {
            _hashCode += getImpresionCopias().hashCode();
        }
        if (getImpresionModo() != null) {
            _hashCode += getImpresionModo().hashCode();
        }
        if (getImpresionNombreImpresora() != null) {
            _hashCode += getImpresionNombreImpresora().hashCode();
        }
        if (getImpresionTipo() != null) {
            _hashCode += getImpresionTipo().hashCode();
        }
        if (getImpresionTipoImpresora() != null) {
            _hashCode += getImpresionTipoImpresora().hashCode();
        }
        if (getModoEmulacion() != null) {
            _hashCode += getModoEmulacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ITarjetasCierre_400Configuracion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ITarjetasCierre_400.Configuracion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GUIModo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "GUIModo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impresionCopias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ImpresionCopias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impresionModo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ImpresionModo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impresionNombreImpresora");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ImpresionNombreImpresora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impresionTipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ImpresionTipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impresionTipoImpresora");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ImpresionTipoImpresora"));
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
