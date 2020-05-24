/**
 * ITarjetasCierre_400Cierre.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador;

public class ITarjetasCierre_400Cierre  implements java.io.Serializable {
    private java.lang.Boolean cierreCentralizado;

    private org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasCierre_400Comportamiento comportamiento;

    private org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasCierre_400Configuracion configuracion;

    private java.lang.String empCod;

    private java.lang.String empHASH;

    private java.lang.Integer multiEmp;

    private java.lang.Integer procesadorId;

    private java.lang.String termCod;

    public ITarjetasCierre_400Cierre() {
    }

    public ITarjetasCierre_400Cierre(
           java.lang.Boolean cierreCentralizado,
           org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasCierre_400Comportamiento comportamiento,
           org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasCierre_400Configuracion configuracion,
           java.lang.String empCod,
           java.lang.String empHASH,
           java.lang.Integer multiEmp,
           java.lang.Integer procesadorId,
           java.lang.String termCod) {
           this.cierreCentralizado = cierreCentralizado;
           this.comportamiento = comportamiento;
           this.configuracion = configuracion;
           this.empCod = empCod;
           this.empHASH = empHASH;
           this.multiEmp = multiEmp;
           this.procesadorId = procesadorId;
           this.termCod = termCod;
    }


    /**
     * Gets the cierreCentralizado value for this ITarjetasCierre_400Cierre.
     * 
     * @return cierreCentralizado
     */
    public java.lang.Boolean getCierreCentralizado() {
        return cierreCentralizado;
    }


    /**
     * Sets the cierreCentralizado value for this ITarjetasCierre_400Cierre.
     * 
     * @param cierreCentralizado
     */
    public void setCierreCentralizado(java.lang.Boolean cierreCentralizado) {
        this.cierreCentralizado = cierreCentralizado;
    }


    /**
     * Gets the comportamiento value for this ITarjetasCierre_400Cierre.
     * 
     * @return comportamiento
     */
    public org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasCierre_400Comportamiento getComportamiento() {
        return comportamiento;
    }


    /**
     * Sets the comportamiento value for this ITarjetasCierre_400Cierre.
     * 
     * @param comportamiento
     */
    public void setComportamiento(org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasCierre_400Comportamiento comportamiento) {
        this.comportamiento = comportamiento;
    }


    /**
     * Gets the configuracion value for this ITarjetasCierre_400Cierre.
     * 
     * @return configuracion
     */
    public org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasCierre_400Configuracion getConfiguracion() {
        return configuracion;
    }


    /**
     * Sets the configuracion value for this ITarjetasCierre_400Cierre.
     * 
     * @param configuracion
     */
    public void setConfiguracion(org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasCierre_400Configuracion configuracion) {
        this.configuracion = configuracion;
    }


    /**
     * Gets the empCod value for this ITarjetasCierre_400Cierre.
     * 
     * @return empCod
     */
    public java.lang.String getEmpCod() {
        return empCod;
    }


    /**
     * Sets the empCod value for this ITarjetasCierre_400Cierre.
     * 
     * @param empCod
     */
    public void setEmpCod(java.lang.String empCod) {
        this.empCod = empCod;
    }


    /**
     * Gets the empHASH value for this ITarjetasCierre_400Cierre.
     * 
     * @return empHASH
     */
    public java.lang.String getEmpHASH() {
        return empHASH;
    }


    /**
     * Sets the empHASH value for this ITarjetasCierre_400Cierre.
     * 
     * @param empHASH
     */
    public void setEmpHASH(java.lang.String empHASH) {
        this.empHASH = empHASH;
    }


    /**
     * Gets the multiEmp value for this ITarjetasCierre_400Cierre.
     * 
     * @return multiEmp
     */
    public java.lang.Integer getMultiEmp() {
        return multiEmp;
    }


    /**
     * Sets the multiEmp value for this ITarjetasCierre_400Cierre.
     * 
     * @param multiEmp
     */
    public void setMultiEmp(java.lang.Integer multiEmp) {
        this.multiEmp = multiEmp;
    }


    /**
     * Gets the procesadorId value for this ITarjetasCierre_400Cierre.
     * 
     * @return procesadorId
     */
    public java.lang.Integer getProcesadorId() {
        return procesadorId;
    }


    /**
     * Sets the procesadorId value for this ITarjetasCierre_400Cierre.
     * 
     * @param procesadorId
     */
    public void setProcesadorId(java.lang.Integer procesadorId) {
        this.procesadorId = procesadorId;
    }


    /**
     * Gets the termCod value for this ITarjetasCierre_400Cierre.
     * 
     * @return termCod
     */
    public java.lang.String getTermCod() {
        return termCod;
    }


    /**
     * Sets the termCod value for this ITarjetasCierre_400Cierre.
     * 
     * @param termCod
     */
    public void setTermCod(java.lang.String termCod) {
        this.termCod = termCod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ITarjetasCierre_400Cierre)) return false;
        ITarjetasCierre_400Cierre other = (ITarjetasCierre_400Cierre) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cierreCentralizado==null && other.getCierreCentralizado()==null) || 
             (this.cierreCentralizado!=null &&
              this.cierreCentralizado.equals(other.getCierreCentralizado()))) &&
            ((this.comportamiento==null && other.getComportamiento()==null) || 
             (this.comportamiento!=null &&
              this.comportamiento.equals(other.getComportamiento()))) &&
            ((this.configuracion==null && other.getConfiguracion()==null) || 
             (this.configuracion!=null &&
              this.configuracion.equals(other.getConfiguracion()))) &&
            ((this.empCod==null && other.getEmpCod()==null) || 
             (this.empCod!=null &&
              this.empCod.equals(other.getEmpCod()))) &&
            ((this.empHASH==null && other.getEmpHASH()==null) || 
             (this.empHASH!=null &&
              this.empHASH.equals(other.getEmpHASH()))) &&
            ((this.multiEmp==null && other.getMultiEmp()==null) || 
             (this.multiEmp!=null &&
              this.multiEmp.equals(other.getMultiEmp()))) &&
            ((this.procesadorId==null && other.getProcesadorId()==null) || 
             (this.procesadorId!=null &&
              this.procesadorId.equals(other.getProcesadorId()))) &&
            ((this.termCod==null && other.getTermCod()==null) || 
             (this.termCod!=null &&
              this.termCod.equals(other.getTermCod())));
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
        if (getCierreCentralizado() != null) {
            _hashCode += getCierreCentralizado().hashCode();
        }
        if (getComportamiento() != null) {
            _hashCode += getComportamiento().hashCode();
        }
        if (getConfiguracion() != null) {
            _hashCode += getConfiguracion().hashCode();
        }
        if (getEmpCod() != null) {
            _hashCode += getEmpCod().hashCode();
        }
        if (getEmpHASH() != null) {
            _hashCode += getEmpHASH().hashCode();
        }
        if (getMultiEmp() != null) {
            _hashCode += getMultiEmp().hashCode();
        }
        if (getProcesadorId() != null) {
            _hashCode += getProcesadorId().hashCode();
        }
        if (getTermCod() != null) {
            _hashCode += getTermCod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ITarjetasCierre_400Cierre.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ITarjetasCierre_400.Cierre"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cierreCentralizado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "CierreCentralizado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comportamiento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "Comportamiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ITarjetasCierre_400.Comportamiento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configuracion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "Configuracion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ITarjetasCierre_400.Configuracion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empCod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "EmpCod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empHASH");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "EmpHASH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiEmp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "MultiEmp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("procesadorId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ProcesadorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("termCod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "TermCod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
