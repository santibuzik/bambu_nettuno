/**
 * ITarjetasCierre_400RespuestaConsultarCierre.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador;

public class ITarjetasCierre_400RespuestaConsultarCierre  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasCierre_400RespuestaConsultarCierreIDatosCierre[] datosCierre;

    private java.lang.String estado;

    private boolean resp_CierreFinalizado;

    private int resp_CodigoRespuesta;

    private org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasCierre_400TipoEstadoAvance resp_EstadoAvance;

    private java.lang.String resp_MensajeError;

    private int resp_TokenSegundosReConsultar;

    private java.lang.String tokenNro;

    private java.lang.String[] voucher;

    public ITarjetasCierre_400RespuestaConsultarCierre() {
    }

    public ITarjetasCierre_400RespuestaConsultarCierre(
           org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasCierre_400RespuestaConsultarCierreIDatosCierre[] datosCierre,
           java.lang.String estado,
           boolean resp_CierreFinalizado,
           int resp_CodigoRespuesta,
           org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasCierre_400TipoEstadoAvance resp_EstadoAvance,
           java.lang.String resp_MensajeError,
           int resp_TokenSegundosReConsultar,
           java.lang.String tokenNro,
           java.lang.String[] voucher) {
           this.datosCierre = datosCierre;
           this.estado = estado;
           this.resp_CierreFinalizado = resp_CierreFinalizado;
           this.resp_CodigoRespuesta = resp_CodigoRespuesta;
           this.resp_EstadoAvance = resp_EstadoAvance;
           this.resp_MensajeError = resp_MensajeError;
           this.resp_TokenSegundosReConsultar = resp_TokenSegundosReConsultar;
           this.tokenNro = tokenNro;
           this.voucher = voucher;
    }


    /**
     * Gets the datosCierre value for this ITarjetasCierre_400RespuestaConsultarCierre.
     * 
     * @return datosCierre
     */
    public org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasCierre_400RespuestaConsultarCierreIDatosCierre[] getDatosCierre() {
        return datosCierre;
    }


    /**
     * Sets the datosCierre value for this ITarjetasCierre_400RespuestaConsultarCierre.
     * 
     * @param datosCierre
     */
    public void setDatosCierre(org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasCierre_400RespuestaConsultarCierreIDatosCierre[] datosCierre) {
        this.datosCierre = datosCierre;
    }


    /**
     * Gets the estado value for this ITarjetasCierre_400RespuestaConsultarCierre.
     * 
     * @return estado
     */
    public java.lang.String getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this ITarjetasCierre_400RespuestaConsultarCierre.
     * 
     * @param estado
     */
    public void setEstado(java.lang.String estado) {
        this.estado = estado;
    }


    /**
     * Gets the resp_CierreFinalizado value for this ITarjetasCierre_400RespuestaConsultarCierre.
     * 
     * @return resp_CierreFinalizado
     */
    public boolean isResp_CierreFinalizado() {
        return resp_CierreFinalizado;
    }


    /**
     * Sets the resp_CierreFinalizado value for this ITarjetasCierre_400RespuestaConsultarCierre.
     * 
     * @param resp_CierreFinalizado
     */
    public void setResp_CierreFinalizado(boolean resp_CierreFinalizado) {
        this.resp_CierreFinalizado = resp_CierreFinalizado;
    }


    /**
     * Gets the resp_CodigoRespuesta value for this ITarjetasCierre_400RespuestaConsultarCierre.
     * 
     * @return resp_CodigoRespuesta
     */
    public int getResp_CodigoRespuesta() {
        return resp_CodigoRespuesta;
    }


    /**
     * Sets the resp_CodigoRespuesta value for this ITarjetasCierre_400RespuestaConsultarCierre.
     * 
     * @param resp_CodigoRespuesta
     */
    public void setResp_CodigoRespuesta(int resp_CodigoRespuesta) {
        this.resp_CodigoRespuesta = resp_CodigoRespuesta;
    }


    /**
     * Gets the resp_EstadoAvance value for this ITarjetasCierre_400RespuestaConsultarCierre.
     * 
     * @return resp_EstadoAvance
     */
    public org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasCierre_400TipoEstadoAvance getResp_EstadoAvance() {
        return resp_EstadoAvance;
    }


    /**
     * Sets the resp_EstadoAvance value for this ITarjetasCierre_400RespuestaConsultarCierre.
     * 
     * @param resp_EstadoAvance
     */
    public void setResp_EstadoAvance(org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasCierre_400TipoEstadoAvance resp_EstadoAvance) {
        this.resp_EstadoAvance = resp_EstadoAvance;
    }


    /**
     * Gets the resp_MensajeError value for this ITarjetasCierre_400RespuestaConsultarCierre.
     * 
     * @return resp_MensajeError
     */
    public java.lang.String getResp_MensajeError() {
        return resp_MensajeError;
    }


    /**
     * Sets the resp_MensajeError value for this ITarjetasCierre_400RespuestaConsultarCierre.
     * 
     * @param resp_MensajeError
     */
    public void setResp_MensajeError(java.lang.String resp_MensajeError) {
        this.resp_MensajeError = resp_MensajeError;
    }


    /**
     * Gets the resp_TokenSegundosReConsultar value for this ITarjetasCierre_400RespuestaConsultarCierre.
     * 
     * @return resp_TokenSegundosReConsultar
     */
    public int getResp_TokenSegundosReConsultar() {
        return resp_TokenSegundosReConsultar;
    }


    /**
     * Sets the resp_TokenSegundosReConsultar value for this ITarjetasCierre_400RespuestaConsultarCierre.
     * 
     * @param resp_TokenSegundosReConsultar
     */
    public void setResp_TokenSegundosReConsultar(int resp_TokenSegundosReConsultar) {
        this.resp_TokenSegundosReConsultar = resp_TokenSegundosReConsultar;
    }


    /**
     * Gets the tokenNro value for this ITarjetasCierre_400RespuestaConsultarCierre.
     * 
     * @return tokenNro
     */
    public java.lang.String getTokenNro() {
        return tokenNro;
    }


    /**
     * Sets the tokenNro value for this ITarjetasCierre_400RespuestaConsultarCierre.
     * 
     * @param tokenNro
     */
    public void setTokenNro(java.lang.String tokenNro) {
        this.tokenNro = tokenNro;
    }


    /**
     * Gets the voucher value for this ITarjetasCierre_400RespuestaConsultarCierre.
     * 
     * @return voucher
     */
    public java.lang.String[] getVoucher() {
        return voucher;
    }


    /**
     * Sets the voucher value for this ITarjetasCierre_400RespuestaConsultarCierre.
     * 
     * @param voucher
     */
    public void setVoucher(java.lang.String[] voucher) {
        this.voucher = voucher;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ITarjetasCierre_400RespuestaConsultarCierre)) return false;
        ITarjetasCierre_400RespuestaConsultarCierre other = (ITarjetasCierre_400RespuestaConsultarCierre) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.datosCierre==null && other.getDatosCierre()==null) || 
             (this.datosCierre!=null &&
              java.util.Arrays.equals(this.datosCierre, other.getDatosCierre()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            this.resp_CierreFinalizado == other.isResp_CierreFinalizado() &&
            this.resp_CodigoRespuesta == other.getResp_CodigoRespuesta() &&
            ((this.resp_EstadoAvance==null && other.getResp_EstadoAvance()==null) || 
             (this.resp_EstadoAvance!=null &&
              this.resp_EstadoAvance.equals(other.getResp_EstadoAvance()))) &&
            ((this.resp_MensajeError==null && other.getResp_MensajeError()==null) || 
             (this.resp_MensajeError!=null &&
              this.resp_MensajeError.equals(other.getResp_MensajeError()))) &&
            this.resp_TokenSegundosReConsultar == other.getResp_TokenSegundosReConsultar() &&
            ((this.tokenNro==null && other.getTokenNro()==null) || 
             (this.tokenNro!=null &&
              this.tokenNro.equals(other.getTokenNro()))) &&
            ((this.voucher==null && other.getVoucher()==null) || 
             (this.voucher!=null &&
              java.util.Arrays.equals(this.voucher, other.getVoucher())));
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
        if (getDatosCierre() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDatosCierre());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDatosCierre(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        _hashCode += (isResp_CierreFinalizado() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getResp_CodigoRespuesta();
        if (getResp_EstadoAvance() != null) {
            _hashCode += getResp_EstadoAvance().hashCode();
        }
        if (getResp_MensajeError() != null) {
            _hashCode += getResp_MensajeError().hashCode();
        }
        _hashCode += getResp_TokenSegundosReConsultar();
        if (getTokenNro() != null) {
            _hashCode += getTokenNro().hashCode();
        }
        if (getVoucher() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVoucher());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVoucher(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ITarjetasCierre_400RespuestaConsultarCierre.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ITarjetasCierre_400.RespuestaConsultarCierre"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosCierre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "DatosCierre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ITarjetasCierre_400.RespuestaConsultarCierre.IDatosCierre"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ITarjetasCierre_400.RespuestaConsultarCierre.IDatosCierre"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "Estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resp_CierreFinalizado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "Resp_CierreFinalizado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resp_CodigoRespuesta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "Resp_CodigoRespuesta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resp_EstadoAvance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "Resp_EstadoAvance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ITarjetasCierre_400.TipoEstadoAvance"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resp_MensajeError");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "Resp_MensajeError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resp_TokenSegundosReConsultar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "Resp_TokenSegundosReConsultar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenNro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "TokenNro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucher");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "Voucher"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
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
