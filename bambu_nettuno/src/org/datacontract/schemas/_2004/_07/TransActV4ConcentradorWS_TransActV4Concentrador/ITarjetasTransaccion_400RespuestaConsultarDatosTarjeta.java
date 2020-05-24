/**
 * ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador;

public class ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta  implements java.io.Serializable {
    private int emisorId;

    private int resp_CodigoRespuesta;

    private java.lang.String resp_MensajeError;

    private int resp_TokenSegundosReConsultar;

    private boolean resp_TransaccionFinalizada;

    private boolean tarjetaAlimentacion;

    private java.lang.String tarjetaIIN;

    private int tarjetaId;

    private int tarjetaLargo;

    private java.lang.String tarjetaNro;

    private boolean tarjetaPrepaga;

    private boolean tarjetaPrestaciones;

    private java.lang.String tarjetaTipo;

    private java.lang.String tarjetaUlt4;

    private java.lang.String tokenNro;

    public ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta() {
    }

    public ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta(
           int emisorId,
           int resp_CodigoRespuesta,
           java.lang.String resp_MensajeError,
           int resp_TokenSegundosReConsultar,
           boolean resp_TransaccionFinalizada,
           boolean tarjetaAlimentacion,
           java.lang.String tarjetaIIN,
           int tarjetaId,
           int tarjetaLargo,
           java.lang.String tarjetaNro,
           boolean tarjetaPrepaga,
           boolean tarjetaPrestaciones,
           java.lang.String tarjetaTipo,
           java.lang.String tarjetaUlt4,
           java.lang.String tokenNro) {
           this.emisorId = emisorId;
           this.resp_CodigoRespuesta = resp_CodigoRespuesta;
           this.resp_MensajeError = resp_MensajeError;
           this.resp_TokenSegundosReConsultar = resp_TokenSegundosReConsultar;
           this.resp_TransaccionFinalizada = resp_TransaccionFinalizada;
           this.tarjetaAlimentacion = tarjetaAlimentacion;
           this.tarjetaIIN = tarjetaIIN;
           this.tarjetaId = tarjetaId;
           this.tarjetaLargo = tarjetaLargo;
           this.tarjetaNro = tarjetaNro;
           this.tarjetaPrepaga = tarjetaPrepaga;
           this.tarjetaPrestaciones = tarjetaPrestaciones;
           this.tarjetaTipo = tarjetaTipo;
           this.tarjetaUlt4 = tarjetaUlt4;
           this.tokenNro = tokenNro;
    }


    /**
     * Gets the emisorId value for this ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta.
     * 
     * @return emisorId
     */
    public int getEmisorId() {
        return emisorId;
    }


    /**
     * Sets the emisorId value for this ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta.
     * 
     * @param emisorId
     */
    public void setEmisorId(int emisorId) {
        this.emisorId = emisorId;
    }


    /**
     * Gets the resp_CodigoRespuesta value for this ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta.
     * 
     * @return resp_CodigoRespuesta
     */
    public int getResp_CodigoRespuesta() {
        return resp_CodigoRespuesta;
    }


    /**
     * Sets the resp_CodigoRespuesta value for this ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta.
     * 
     * @param resp_CodigoRespuesta
     */
    public void setResp_CodigoRespuesta(int resp_CodigoRespuesta) {
        this.resp_CodigoRespuesta = resp_CodigoRespuesta;
    }


    /**
     * Gets the resp_MensajeError value for this ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta.
     * 
     * @return resp_MensajeError
     */
    public java.lang.String getResp_MensajeError() {
        return resp_MensajeError;
    }


    /**
     * Sets the resp_MensajeError value for this ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta.
     * 
     * @param resp_MensajeError
     */
    public void setResp_MensajeError(java.lang.String resp_MensajeError) {
        this.resp_MensajeError = resp_MensajeError;
    }


    /**
     * Gets the resp_TokenSegundosReConsultar value for this ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta.
     * 
     * @return resp_TokenSegundosReConsultar
     */
    public int getResp_TokenSegundosReConsultar() {
        return resp_TokenSegundosReConsultar;
    }


    /**
     * Sets the resp_TokenSegundosReConsultar value for this ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta.
     * 
     * @param resp_TokenSegundosReConsultar
     */
    public void setResp_TokenSegundosReConsultar(int resp_TokenSegundosReConsultar) {
        this.resp_TokenSegundosReConsultar = resp_TokenSegundosReConsultar;
    }


    /**
     * Gets the resp_TransaccionFinalizada value for this ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta.
     * 
     * @return resp_TransaccionFinalizada
     */
    public boolean isResp_TransaccionFinalizada() {
        return resp_TransaccionFinalizada;
    }


    /**
     * Sets the resp_TransaccionFinalizada value for this ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta.
     * 
     * @param resp_TransaccionFinalizada
     */
    public void setResp_TransaccionFinalizada(boolean resp_TransaccionFinalizada) {
        this.resp_TransaccionFinalizada = resp_TransaccionFinalizada;
    }


    /**
     * Gets the tarjetaAlimentacion value for this ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta.
     * 
     * @return tarjetaAlimentacion
     */
    public boolean isTarjetaAlimentacion() {
        return tarjetaAlimentacion;
    }


    /**
     * Sets the tarjetaAlimentacion value for this ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta.
     * 
     * @param tarjetaAlimentacion
     */
    public void setTarjetaAlimentacion(boolean tarjetaAlimentacion) {
        this.tarjetaAlimentacion = tarjetaAlimentacion;
    }


    /**
     * Gets the tarjetaIIN value for this ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta.
     * 
     * @return tarjetaIIN
     */
    public java.lang.String getTarjetaIIN() {
        return tarjetaIIN;
    }


    /**
     * Sets the tarjetaIIN value for this ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta.
     * 
     * @param tarjetaIIN
     */
    public void setTarjetaIIN(java.lang.String tarjetaIIN) {
        this.tarjetaIIN = tarjetaIIN;
    }


    /**
     * Gets the tarjetaId value for this ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta.
     * 
     * @return tarjetaId
     */
    public int getTarjetaId() {
        return tarjetaId;
    }


    /**
     * Sets the tarjetaId value for this ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta.
     * 
     * @param tarjetaId
     */
    public void setTarjetaId(int tarjetaId) {
        this.tarjetaId = tarjetaId;
    }


    /**
     * Gets the tarjetaLargo value for this ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta.
     * 
     * @return tarjetaLargo
     */
    public int getTarjetaLargo() {
        return tarjetaLargo;
    }


    /**
     * Sets the tarjetaLargo value for this ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta.
     * 
     * @param tarjetaLargo
     */
    public void setTarjetaLargo(int tarjetaLargo) {
        this.tarjetaLargo = tarjetaLargo;
    }


    /**
     * Gets the tarjetaNro value for this ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta.
     * 
     * @return tarjetaNro
     */
    public java.lang.String getTarjetaNro() {
        return tarjetaNro;
    }


    /**
     * Sets the tarjetaNro value for this ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta.
     * 
     * @param tarjetaNro
     */
    public void setTarjetaNro(java.lang.String tarjetaNro) {
        this.tarjetaNro = tarjetaNro;
    }


    /**
     * Gets the tarjetaPrepaga value for this ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta.
     * 
     * @return tarjetaPrepaga
     */
    public boolean isTarjetaPrepaga() {
        return tarjetaPrepaga;
    }


    /**
     * Sets the tarjetaPrepaga value for this ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta.
     * 
     * @param tarjetaPrepaga
     */
    public void setTarjetaPrepaga(boolean tarjetaPrepaga) {
        this.tarjetaPrepaga = tarjetaPrepaga;
    }


    /**
     * Gets the tarjetaPrestaciones value for this ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta.
     * 
     * @return tarjetaPrestaciones
     */
    public boolean isTarjetaPrestaciones() {
        return tarjetaPrestaciones;
    }


    /**
     * Sets the tarjetaPrestaciones value for this ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta.
     * 
     * @param tarjetaPrestaciones
     */
    public void setTarjetaPrestaciones(boolean tarjetaPrestaciones) {
        this.tarjetaPrestaciones = tarjetaPrestaciones;
    }


    /**
     * Gets the tarjetaTipo value for this ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta.
     * 
     * @return tarjetaTipo
     */
    public java.lang.String getTarjetaTipo() {
        return tarjetaTipo;
    }


    /**
     * Sets the tarjetaTipo value for this ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta.
     * 
     * @param tarjetaTipo
     */
    public void setTarjetaTipo(java.lang.String tarjetaTipo) {
        this.tarjetaTipo = tarjetaTipo;
    }


    /**
     * Gets the tarjetaUlt4 value for this ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta.
     * 
     * @return tarjetaUlt4
     */
    public java.lang.String getTarjetaUlt4() {
        return tarjetaUlt4;
    }


    /**
     * Sets the tarjetaUlt4 value for this ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta.
     * 
     * @param tarjetaUlt4
     */
    public void setTarjetaUlt4(java.lang.String tarjetaUlt4) {
        this.tarjetaUlt4 = tarjetaUlt4;
    }


    /**
     * Gets the tokenNro value for this ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta.
     * 
     * @return tokenNro
     */
    public java.lang.String getTokenNro() {
        return tokenNro;
    }


    /**
     * Sets the tokenNro value for this ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta.
     * 
     * @param tokenNro
     */
    public void setTokenNro(java.lang.String tokenNro) {
        this.tokenNro = tokenNro;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta)) return false;
        ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta other = (ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.emisorId == other.getEmisorId() &&
            this.resp_CodigoRespuesta == other.getResp_CodigoRespuesta() &&
            ((this.resp_MensajeError==null && other.getResp_MensajeError()==null) || 
             (this.resp_MensajeError!=null &&
              this.resp_MensajeError.equals(other.getResp_MensajeError()))) &&
            this.resp_TokenSegundosReConsultar == other.getResp_TokenSegundosReConsultar() &&
            this.resp_TransaccionFinalizada == other.isResp_TransaccionFinalizada() &&
            this.tarjetaAlimentacion == other.isTarjetaAlimentacion() &&
            ((this.tarjetaIIN==null && other.getTarjetaIIN()==null) || 
             (this.tarjetaIIN!=null &&
              this.tarjetaIIN.equals(other.getTarjetaIIN()))) &&
            this.tarjetaId == other.getTarjetaId() &&
            this.tarjetaLargo == other.getTarjetaLargo() &&
            ((this.tarjetaNro==null && other.getTarjetaNro()==null) || 
             (this.tarjetaNro!=null &&
              this.tarjetaNro.equals(other.getTarjetaNro()))) &&
            this.tarjetaPrepaga == other.isTarjetaPrepaga() &&
            this.tarjetaPrestaciones == other.isTarjetaPrestaciones() &&
            ((this.tarjetaTipo==null && other.getTarjetaTipo()==null) || 
             (this.tarjetaTipo!=null &&
              this.tarjetaTipo.equals(other.getTarjetaTipo()))) &&
            ((this.tarjetaUlt4==null && other.getTarjetaUlt4()==null) || 
             (this.tarjetaUlt4!=null &&
              this.tarjetaUlt4.equals(other.getTarjetaUlt4()))) &&
            ((this.tokenNro==null && other.getTokenNro()==null) || 
             (this.tokenNro!=null &&
              this.tokenNro.equals(other.getTokenNro())));
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
        _hashCode += getEmisorId();
        _hashCode += getResp_CodigoRespuesta();
        if (getResp_MensajeError() != null) {
            _hashCode += getResp_MensajeError().hashCode();
        }
        _hashCode += getResp_TokenSegundosReConsultar();
        _hashCode += (isResp_TransaccionFinalizada() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isTarjetaAlimentacion() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTarjetaIIN() != null) {
            _hashCode += getTarjetaIIN().hashCode();
        }
        _hashCode += getTarjetaId();
        _hashCode += getTarjetaLargo();
        if (getTarjetaNro() != null) {
            _hashCode += getTarjetaNro().hashCode();
        }
        _hashCode += (isTarjetaPrepaga() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isTarjetaPrestaciones() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTarjetaTipo() != null) {
            _hashCode += getTarjetaTipo().hashCode();
        }
        if (getTarjetaUlt4() != null) {
            _hashCode += getTarjetaUlt4().hashCode();
        }
        if (getTokenNro() != null) {
            _hashCode += getTokenNro().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ITarjetasTransaccion_400.RespuestaConsultarDatosTarjeta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emisorId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "EmisorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("resp_TokenSegundosReConsultar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "Resp_TokenSegundosReConsultar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resp_TransaccionFinalizada");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "Resp_TransaccionFinalizada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarjetaAlimentacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "TarjetaAlimentacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarjetaIIN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "TarjetaIIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarjetaId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "TarjetaId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarjetaLargo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "TarjetaLargo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarjetaNro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "TarjetaNro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarjetaPrepaga");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "TarjetaPrepaga"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarjetaPrestaciones");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "TarjetaPrestaciones"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarjetaTipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "TarjetaTipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarjetaUlt4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "TarjetaUlt4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenNro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "TokenNro"));
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
