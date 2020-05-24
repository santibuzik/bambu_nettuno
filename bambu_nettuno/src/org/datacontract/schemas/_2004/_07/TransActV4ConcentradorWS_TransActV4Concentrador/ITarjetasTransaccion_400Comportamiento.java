/**
 * ITarjetasTransaccion_400Comportamiento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador;

public class ITarjetasTransaccion_400Comportamiento  implements java.io.Serializable {
    private java.lang.Boolean modificarCuotas;

    private java.lang.Boolean modificarDecretoLey;

    private java.lang.Boolean modificarFactura;

    private java.lang.Boolean modificarMoneda;

    private java.lang.Boolean modificarMontos;

    private java.lang.Boolean modificarPlan;

    private java.lang.Boolean modificarTarjeta;

    private java.lang.Boolean modificarTipoCuenta;

    public ITarjetasTransaccion_400Comportamiento() {
    }

    public ITarjetasTransaccion_400Comportamiento(
           java.lang.Boolean modificarCuotas,
           java.lang.Boolean modificarDecretoLey,
           java.lang.Boolean modificarFactura,
           java.lang.Boolean modificarMoneda,
           java.lang.Boolean modificarMontos,
           java.lang.Boolean modificarPlan,
           java.lang.Boolean modificarTarjeta,
           java.lang.Boolean modificarTipoCuenta) {
           this.modificarCuotas = modificarCuotas;
           this.modificarDecretoLey = modificarDecretoLey;
           this.modificarFactura = modificarFactura;
           this.modificarMoneda = modificarMoneda;
           this.modificarMontos = modificarMontos;
           this.modificarPlan = modificarPlan;
           this.modificarTarjeta = modificarTarjeta;
           this.modificarTipoCuenta = modificarTipoCuenta;
    }


    /**
     * Gets the modificarCuotas value for this ITarjetasTransaccion_400Comportamiento.
     * 
     * @return modificarCuotas
     */
    public java.lang.Boolean getModificarCuotas() {
        return modificarCuotas;
    }


    /**
     * Sets the modificarCuotas value for this ITarjetasTransaccion_400Comportamiento.
     * 
     * @param modificarCuotas
     */
    public void setModificarCuotas(java.lang.Boolean modificarCuotas) {
        this.modificarCuotas = modificarCuotas;
    }


    /**
     * Gets the modificarDecretoLey value for this ITarjetasTransaccion_400Comportamiento.
     * 
     * @return modificarDecretoLey
     */
    public java.lang.Boolean getModificarDecretoLey() {
        return modificarDecretoLey;
    }


    /**
     * Sets the modificarDecretoLey value for this ITarjetasTransaccion_400Comportamiento.
     * 
     * @param modificarDecretoLey
     */
    public void setModificarDecretoLey(java.lang.Boolean modificarDecretoLey) {
        this.modificarDecretoLey = modificarDecretoLey;
    }


    /**
     * Gets the modificarFactura value for this ITarjetasTransaccion_400Comportamiento.
     * 
     * @return modificarFactura
     */
    public java.lang.Boolean getModificarFactura() {
        return modificarFactura;
    }


    /**
     * Sets the modificarFactura value for this ITarjetasTransaccion_400Comportamiento.
     * 
     * @param modificarFactura
     */
    public void setModificarFactura(java.lang.Boolean modificarFactura) {
        this.modificarFactura = modificarFactura;
    }


    /**
     * Gets the modificarMoneda value for this ITarjetasTransaccion_400Comportamiento.
     * 
     * @return modificarMoneda
     */
    public java.lang.Boolean getModificarMoneda() {
        return modificarMoneda;
    }


    /**
     * Sets the modificarMoneda value for this ITarjetasTransaccion_400Comportamiento.
     * 
     * @param modificarMoneda
     */
    public void setModificarMoneda(java.lang.Boolean modificarMoneda) {
        this.modificarMoneda = modificarMoneda;
    }


    /**
     * Gets the modificarMontos value for this ITarjetasTransaccion_400Comportamiento.
     * 
     * @return modificarMontos
     */
    public java.lang.Boolean getModificarMontos() {
        return modificarMontos;
    }


    /**
     * Sets the modificarMontos value for this ITarjetasTransaccion_400Comportamiento.
     * 
     * @param modificarMontos
     */
    public void setModificarMontos(java.lang.Boolean modificarMontos) {
        this.modificarMontos = modificarMontos;
    }


    /**
     * Gets the modificarPlan value for this ITarjetasTransaccion_400Comportamiento.
     * 
     * @return modificarPlan
     */
    public java.lang.Boolean getModificarPlan() {
        return modificarPlan;
    }


    /**
     * Sets the modificarPlan value for this ITarjetasTransaccion_400Comportamiento.
     * 
     * @param modificarPlan
     */
    public void setModificarPlan(java.lang.Boolean modificarPlan) {
        this.modificarPlan = modificarPlan;
    }


    /**
     * Gets the modificarTarjeta value for this ITarjetasTransaccion_400Comportamiento.
     * 
     * @return modificarTarjeta
     */
    public java.lang.Boolean getModificarTarjeta() {
        return modificarTarjeta;
    }


    /**
     * Sets the modificarTarjeta value for this ITarjetasTransaccion_400Comportamiento.
     * 
     * @param modificarTarjeta
     */
    public void setModificarTarjeta(java.lang.Boolean modificarTarjeta) {
        this.modificarTarjeta = modificarTarjeta;
    }


    /**
     * Gets the modificarTipoCuenta value for this ITarjetasTransaccion_400Comportamiento.
     * 
     * @return modificarTipoCuenta
     */
    public java.lang.Boolean getModificarTipoCuenta() {
        return modificarTipoCuenta;
    }


    /**
     * Sets the modificarTipoCuenta value for this ITarjetasTransaccion_400Comportamiento.
     * 
     * @param modificarTipoCuenta
     */
    public void setModificarTipoCuenta(java.lang.Boolean modificarTipoCuenta) {
        this.modificarTipoCuenta = modificarTipoCuenta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ITarjetasTransaccion_400Comportamiento)) return false;
        ITarjetasTransaccion_400Comportamiento other = (ITarjetasTransaccion_400Comportamiento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.modificarCuotas==null && other.getModificarCuotas()==null) || 
             (this.modificarCuotas!=null &&
              this.modificarCuotas.equals(other.getModificarCuotas()))) &&
            ((this.modificarDecretoLey==null && other.getModificarDecretoLey()==null) || 
             (this.modificarDecretoLey!=null &&
              this.modificarDecretoLey.equals(other.getModificarDecretoLey()))) &&
            ((this.modificarFactura==null && other.getModificarFactura()==null) || 
             (this.modificarFactura!=null &&
              this.modificarFactura.equals(other.getModificarFactura()))) &&
            ((this.modificarMoneda==null && other.getModificarMoneda()==null) || 
             (this.modificarMoneda!=null &&
              this.modificarMoneda.equals(other.getModificarMoneda()))) &&
            ((this.modificarMontos==null && other.getModificarMontos()==null) || 
             (this.modificarMontos!=null &&
              this.modificarMontos.equals(other.getModificarMontos()))) &&
            ((this.modificarPlan==null && other.getModificarPlan()==null) || 
             (this.modificarPlan!=null &&
              this.modificarPlan.equals(other.getModificarPlan()))) &&
            ((this.modificarTarjeta==null && other.getModificarTarjeta()==null) || 
             (this.modificarTarjeta!=null &&
              this.modificarTarjeta.equals(other.getModificarTarjeta()))) &&
            ((this.modificarTipoCuenta==null && other.getModificarTipoCuenta()==null) || 
             (this.modificarTipoCuenta!=null &&
              this.modificarTipoCuenta.equals(other.getModificarTipoCuenta())));
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
        if (getModificarCuotas() != null) {
            _hashCode += getModificarCuotas().hashCode();
        }
        if (getModificarDecretoLey() != null) {
            _hashCode += getModificarDecretoLey().hashCode();
        }
        if (getModificarFactura() != null) {
            _hashCode += getModificarFactura().hashCode();
        }
        if (getModificarMoneda() != null) {
            _hashCode += getModificarMoneda().hashCode();
        }
        if (getModificarMontos() != null) {
            _hashCode += getModificarMontos().hashCode();
        }
        if (getModificarPlan() != null) {
            _hashCode += getModificarPlan().hashCode();
        }
        if (getModificarTarjeta() != null) {
            _hashCode += getModificarTarjeta().hashCode();
        }
        if (getModificarTipoCuenta() != null) {
            _hashCode += getModificarTipoCuenta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ITarjetasTransaccion_400Comportamiento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ITarjetasTransaccion_400.Comportamiento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modificarCuotas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ModificarCuotas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modificarDecretoLey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ModificarDecretoLey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modificarFactura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ModificarFactura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modificarMoneda");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ModificarMoneda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modificarMontos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ModificarMontos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modificarPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ModificarPlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modificarTarjeta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ModificarTarjeta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modificarTipoCuenta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ModificarTipoCuenta"));
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
