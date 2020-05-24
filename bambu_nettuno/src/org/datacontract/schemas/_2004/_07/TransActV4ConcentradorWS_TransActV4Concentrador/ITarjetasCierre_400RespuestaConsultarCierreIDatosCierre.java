/**
 * ITarjetasCierre_400RespuestaConsultarCierreIDatosCierre.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador;

public class ITarjetasCierre_400RespuestaConsultarCierreIDatosCierre  implements java.io.Serializable {
    private java.lang.Boolean aprobado;

    private java.lang.String codRespuesta;

    private org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasCierre_400RespuestaConsultarCierreIDatosCierreExtendida extendida;

    private java.lang.Double lote;

    private java.lang.String msgRespuesta;

    private java.lang.String nroAutorizacion;

    private java.lang.Integer procesadorId;

    public ITarjetasCierre_400RespuestaConsultarCierreIDatosCierre() {
    }

    public ITarjetasCierre_400RespuestaConsultarCierreIDatosCierre(
           java.lang.Boolean aprobado,
           java.lang.String codRespuesta,
           org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasCierre_400RespuestaConsultarCierreIDatosCierreExtendida extendida,
           java.lang.Double lote,
           java.lang.String msgRespuesta,
           java.lang.String nroAutorizacion,
           java.lang.Integer procesadorId) {
           this.aprobado = aprobado;
           this.codRespuesta = codRespuesta;
           this.extendida = extendida;
           this.lote = lote;
           this.msgRespuesta = msgRespuesta;
           this.nroAutorizacion = nroAutorizacion;
           this.procesadorId = procesadorId;
    }


    /**
     * Gets the aprobado value for this ITarjetasCierre_400RespuestaConsultarCierreIDatosCierre.
     * 
     * @return aprobado
     */
    public java.lang.Boolean getAprobado() {
        return aprobado;
    }


    /**
     * Sets the aprobado value for this ITarjetasCierre_400RespuestaConsultarCierreIDatosCierre.
     * 
     * @param aprobado
     */
    public void setAprobado(java.lang.Boolean aprobado) {
        this.aprobado = aprobado;
    }


    /**
     * Gets the codRespuesta value for this ITarjetasCierre_400RespuestaConsultarCierreIDatosCierre.
     * 
     * @return codRespuesta
     */
    public java.lang.String getCodRespuesta() {
        return codRespuesta;
    }


    /**
     * Sets the codRespuesta value for this ITarjetasCierre_400RespuestaConsultarCierreIDatosCierre.
     * 
     * @param codRespuesta
     */
    public void setCodRespuesta(java.lang.String codRespuesta) {
        this.codRespuesta = codRespuesta;
    }


    /**
     * Gets the extendida value for this ITarjetasCierre_400RespuestaConsultarCierreIDatosCierre.
     * 
     * @return extendida
     */
    public org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasCierre_400RespuestaConsultarCierreIDatosCierreExtendida getExtendida() {
        return extendida;
    }


    /**
     * Sets the extendida value for this ITarjetasCierre_400RespuestaConsultarCierreIDatosCierre.
     * 
     * @param extendida
     */
    public void setExtendida(org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasCierre_400RespuestaConsultarCierreIDatosCierreExtendida extendida) {
        this.extendida = extendida;
    }


    /**
     * Gets the lote value for this ITarjetasCierre_400RespuestaConsultarCierreIDatosCierre.
     * 
     * @return lote
     */
    public java.lang.Double getLote() {
        return lote;
    }


    /**
     * Sets the lote value for this ITarjetasCierre_400RespuestaConsultarCierreIDatosCierre.
     * 
     * @param lote
     */
    public void setLote(java.lang.Double lote) {
        this.lote = lote;
    }


    /**
     * Gets the msgRespuesta value for this ITarjetasCierre_400RespuestaConsultarCierreIDatosCierre.
     * 
     * @return msgRespuesta
     */
    public java.lang.String getMsgRespuesta() {
        return msgRespuesta;
    }


    /**
     * Sets the msgRespuesta value for this ITarjetasCierre_400RespuestaConsultarCierreIDatosCierre.
     * 
     * @param msgRespuesta
     */
    public void setMsgRespuesta(java.lang.String msgRespuesta) {
        this.msgRespuesta = msgRespuesta;
    }


    /**
     * Gets the nroAutorizacion value for this ITarjetasCierre_400RespuestaConsultarCierreIDatosCierre.
     * 
     * @return nroAutorizacion
     */
    public java.lang.String getNroAutorizacion() {
        return nroAutorizacion;
    }


    /**
     * Sets the nroAutorizacion value for this ITarjetasCierre_400RespuestaConsultarCierreIDatosCierre.
     * 
     * @param nroAutorizacion
     */
    public void setNroAutorizacion(java.lang.String nroAutorizacion) {
        this.nroAutorizacion = nroAutorizacion;
    }


    /**
     * Gets the procesadorId value for this ITarjetasCierre_400RespuestaConsultarCierreIDatosCierre.
     * 
     * @return procesadorId
     */
    public java.lang.Integer getProcesadorId() {
        return procesadorId;
    }


    /**
     * Sets the procesadorId value for this ITarjetasCierre_400RespuestaConsultarCierreIDatosCierre.
     * 
     * @param procesadorId
     */
    public void setProcesadorId(java.lang.Integer procesadorId) {
        this.procesadorId = procesadorId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ITarjetasCierre_400RespuestaConsultarCierreIDatosCierre)) return false;
        ITarjetasCierre_400RespuestaConsultarCierreIDatosCierre other = (ITarjetasCierre_400RespuestaConsultarCierreIDatosCierre) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aprobado==null && other.getAprobado()==null) || 
             (this.aprobado!=null &&
              this.aprobado.equals(other.getAprobado()))) &&
            ((this.codRespuesta==null && other.getCodRespuesta()==null) || 
             (this.codRespuesta!=null &&
              this.codRespuesta.equals(other.getCodRespuesta()))) &&
            ((this.extendida==null && other.getExtendida()==null) || 
             (this.extendida!=null &&
              this.extendida.equals(other.getExtendida()))) &&
            ((this.lote==null && other.getLote()==null) || 
             (this.lote!=null &&
              this.lote.equals(other.getLote()))) &&
            ((this.msgRespuesta==null && other.getMsgRespuesta()==null) || 
             (this.msgRespuesta!=null &&
              this.msgRespuesta.equals(other.getMsgRespuesta()))) &&
            ((this.nroAutorizacion==null && other.getNroAutorizacion()==null) || 
             (this.nroAutorizacion!=null &&
              this.nroAutorizacion.equals(other.getNroAutorizacion()))) &&
            ((this.procesadorId==null && other.getProcesadorId()==null) || 
             (this.procesadorId!=null &&
              this.procesadorId.equals(other.getProcesadorId())));
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
        if (getAprobado() != null) {
            _hashCode += getAprobado().hashCode();
        }
        if (getCodRespuesta() != null) {
            _hashCode += getCodRespuesta().hashCode();
        }
        if (getExtendida() != null) {
            _hashCode += getExtendida().hashCode();
        }
        if (getLote() != null) {
            _hashCode += getLote().hashCode();
        }
        if (getMsgRespuesta() != null) {
            _hashCode += getMsgRespuesta().hashCode();
        }
        if (getNroAutorizacion() != null) {
            _hashCode += getNroAutorizacion().hashCode();
        }
        if (getProcesadorId() != null) {
            _hashCode += getProcesadorId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ITarjetasCierre_400RespuestaConsultarCierreIDatosCierre.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ITarjetasCierre_400.RespuestaConsultarCierre.IDatosCierre"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aprobado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "Aprobado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codRespuesta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "CodRespuesta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extendida");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "Extendida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ITarjetasCierre_400.RespuestaConsultarCierre.IDatosCierreExtendida"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "Lote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msgRespuesta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "MsgRespuesta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroAutorizacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "NroAutorizacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("procesadorId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ProcesadorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
