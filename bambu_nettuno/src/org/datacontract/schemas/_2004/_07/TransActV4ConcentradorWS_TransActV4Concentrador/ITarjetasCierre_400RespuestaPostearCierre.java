/**
 * ITarjetasCierre_400RespuestaPostearCierre.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador;

public class ITarjetasCierre_400RespuestaPostearCierre  implements java.io.Serializable {
    private int resp_CodigoRespuesta;

    private java.lang.String resp_MensajeError;

    private java.lang.String tokenNro;

    private int tokenSegundosConsultar;

    public ITarjetasCierre_400RespuestaPostearCierre() {
    }

    public ITarjetasCierre_400RespuestaPostearCierre(
           int resp_CodigoRespuesta,
           java.lang.String resp_MensajeError,
           java.lang.String tokenNro,
           int tokenSegundosConsultar) {
           this.resp_CodigoRespuesta = resp_CodigoRespuesta;
           this.resp_MensajeError = resp_MensajeError;
           this.tokenNro = tokenNro;
           this.tokenSegundosConsultar = tokenSegundosConsultar;
    }


    /**
     * Gets the resp_CodigoRespuesta value for this ITarjetasCierre_400RespuestaPostearCierre.
     * 
     * @return resp_CodigoRespuesta
     */
    public int getResp_CodigoRespuesta() {
        return resp_CodigoRespuesta;
    }


    /**
     * Sets the resp_CodigoRespuesta value for this ITarjetasCierre_400RespuestaPostearCierre.
     * 
     * @param resp_CodigoRespuesta
     */
    public void setResp_CodigoRespuesta(int resp_CodigoRespuesta) {
        this.resp_CodigoRespuesta = resp_CodigoRespuesta;
    }


    /**
     * Gets the resp_MensajeError value for this ITarjetasCierre_400RespuestaPostearCierre.
     * 
     * @return resp_MensajeError
     */
    public java.lang.String getResp_MensajeError() {
        return resp_MensajeError;
    }


    /**
     * Sets the resp_MensajeError value for this ITarjetasCierre_400RespuestaPostearCierre.
     * 
     * @param resp_MensajeError
     */
    public void setResp_MensajeError(java.lang.String resp_MensajeError) {
        this.resp_MensajeError = resp_MensajeError;
    }


    /**
     * Gets the tokenNro value for this ITarjetasCierre_400RespuestaPostearCierre.
     * 
     * @return tokenNro
     */
    public java.lang.String getTokenNro() {
        return tokenNro;
    }


    /**
     * Sets the tokenNro value for this ITarjetasCierre_400RespuestaPostearCierre.
     * 
     * @param tokenNro
     */
    public void setTokenNro(java.lang.String tokenNro) {
        this.tokenNro = tokenNro;
    }


    /**
     * Gets the tokenSegundosConsultar value for this ITarjetasCierre_400RespuestaPostearCierre.
     * 
     * @return tokenSegundosConsultar
     */
    public int getTokenSegundosConsultar() {
        return tokenSegundosConsultar;
    }


    /**
     * Sets the tokenSegundosConsultar value for this ITarjetasCierre_400RespuestaPostearCierre.
     * 
     * @param tokenSegundosConsultar
     */
    public void setTokenSegundosConsultar(int tokenSegundosConsultar) {
        this.tokenSegundosConsultar = tokenSegundosConsultar;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ITarjetasCierre_400RespuestaPostearCierre)) return false;
        ITarjetasCierre_400RespuestaPostearCierre other = (ITarjetasCierre_400RespuestaPostearCierre) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.resp_CodigoRespuesta == other.getResp_CodigoRespuesta() &&
            ((this.resp_MensajeError==null && other.getResp_MensajeError()==null) || 
             (this.resp_MensajeError!=null &&
              this.resp_MensajeError.equals(other.getResp_MensajeError()))) &&
            ((this.tokenNro==null && other.getTokenNro()==null) || 
             (this.tokenNro!=null &&
              this.tokenNro.equals(other.getTokenNro()))) &&
            this.tokenSegundosConsultar == other.getTokenSegundosConsultar();
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
        _hashCode += getResp_CodigoRespuesta();
        if (getResp_MensajeError() != null) {
            _hashCode += getResp_MensajeError().hashCode();
        }
        if (getTokenNro() != null) {
            _hashCode += getTokenNro().hashCode();
        }
        _hashCode += getTokenSegundosConsultar();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ITarjetasCierre_400RespuestaPostearCierre.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ITarjetasCierre_400.RespuestaPostearCierre"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resp_CodigoRespuesta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "Resp_CodigoRespuesta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resp_MensajeError");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "Resp_MensajeError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenNro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "TokenNro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenSegundosConsultar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "TokenSegundosConsultar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
