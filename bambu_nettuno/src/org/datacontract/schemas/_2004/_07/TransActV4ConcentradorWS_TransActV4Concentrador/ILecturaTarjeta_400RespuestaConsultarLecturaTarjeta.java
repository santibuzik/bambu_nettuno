/**
 * ILecturaTarjeta_400RespuestaConsultarLecturaTarjeta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador;

public class ILecturaTarjeta_400RespuestaConsultarLecturaTarjeta  implements java.io.Serializable {
    private java.lang.String msgRespuesta;

    private int resp_CodigoRespuesta;

    private org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ILecturaTarjeta_400TipoEstadoAvance resp_EstadoAvance;

    private boolean resp_LecturaFinalizada;

    private java.lang.String resp_MensajeError;

    private int resp_TokenSegundosReConsultar;

    private java.lang.String tokenNro;

    private java.lang.String track1;

    private java.lang.String track2;

    private java.lang.String track3;

    public ILecturaTarjeta_400RespuestaConsultarLecturaTarjeta() {
    }

    public ILecturaTarjeta_400RespuestaConsultarLecturaTarjeta(
           java.lang.String msgRespuesta,
           int resp_CodigoRespuesta,
           org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ILecturaTarjeta_400TipoEstadoAvance resp_EstadoAvance,
           boolean resp_LecturaFinalizada,
           java.lang.String resp_MensajeError,
           int resp_TokenSegundosReConsultar,
           java.lang.String tokenNro,
           java.lang.String track1,
           java.lang.String track2,
           java.lang.String track3) {
           this.msgRespuesta = msgRespuesta;
           this.resp_CodigoRespuesta = resp_CodigoRespuesta;
           this.resp_EstadoAvance = resp_EstadoAvance;
           this.resp_LecturaFinalizada = resp_LecturaFinalizada;
           this.resp_MensajeError = resp_MensajeError;
           this.resp_TokenSegundosReConsultar = resp_TokenSegundosReConsultar;
           this.tokenNro = tokenNro;
           this.track1 = track1;
           this.track2 = track2;
           this.track3 = track3;
    }


    /**
     * Gets the msgRespuesta value for this ILecturaTarjeta_400RespuestaConsultarLecturaTarjeta.
     * 
     * @return msgRespuesta
     */
    public java.lang.String getMsgRespuesta() {
        return msgRespuesta;
    }


    /**
     * Sets the msgRespuesta value for this ILecturaTarjeta_400RespuestaConsultarLecturaTarjeta.
     * 
     * @param msgRespuesta
     */
    public void setMsgRespuesta(java.lang.String msgRespuesta) {
        this.msgRespuesta = msgRespuesta;
    }


    /**
     * Gets the resp_CodigoRespuesta value for this ILecturaTarjeta_400RespuestaConsultarLecturaTarjeta.
     * 
     * @return resp_CodigoRespuesta
     */
    public int getResp_CodigoRespuesta() {
        return resp_CodigoRespuesta;
    }


    /**
     * Sets the resp_CodigoRespuesta value for this ILecturaTarjeta_400RespuestaConsultarLecturaTarjeta.
     * 
     * @param resp_CodigoRespuesta
     */
    public void setResp_CodigoRespuesta(int resp_CodigoRespuesta) {
        this.resp_CodigoRespuesta = resp_CodigoRespuesta;
    }


    /**
     * Gets the resp_EstadoAvance value for this ILecturaTarjeta_400RespuestaConsultarLecturaTarjeta.
     * 
     * @return resp_EstadoAvance
     */
    public org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ILecturaTarjeta_400TipoEstadoAvance getResp_EstadoAvance() {
        return resp_EstadoAvance;
    }


    /**
     * Sets the resp_EstadoAvance value for this ILecturaTarjeta_400RespuestaConsultarLecturaTarjeta.
     * 
     * @param resp_EstadoAvance
     */
    public void setResp_EstadoAvance(org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ILecturaTarjeta_400TipoEstadoAvance resp_EstadoAvance) {
        this.resp_EstadoAvance = resp_EstadoAvance;
    }


    /**
     * Gets the resp_LecturaFinalizada value for this ILecturaTarjeta_400RespuestaConsultarLecturaTarjeta.
     * 
     * @return resp_LecturaFinalizada
     */
    public boolean isResp_LecturaFinalizada() {
        return resp_LecturaFinalizada;
    }


    /**
     * Sets the resp_LecturaFinalizada value for this ILecturaTarjeta_400RespuestaConsultarLecturaTarjeta.
     * 
     * @param resp_LecturaFinalizada
     */
    public void setResp_LecturaFinalizada(boolean resp_LecturaFinalizada) {
        this.resp_LecturaFinalizada = resp_LecturaFinalizada;
    }


    /**
     * Gets the resp_MensajeError value for this ILecturaTarjeta_400RespuestaConsultarLecturaTarjeta.
     * 
     * @return resp_MensajeError
     */
    public java.lang.String getResp_MensajeError() {
        return resp_MensajeError;
    }


    /**
     * Sets the resp_MensajeError value for this ILecturaTarjeta_400RespuestaConsultarLecturaTarjeta.
     * 
     * @param resp_MensajeError
     */
    public void setResp_MensajeError(java.lang.String resp_MensajeError) {
        this.resp_MensajeError = resp_MensajeError;
    }


    /**
     * Gets the resp_TokenSegundosReConsultar value for this ILecturaTarjeta_400RespuestaConsultarLecturaTarjeta.
     * 
     * @return resp_TokenSegundosReConsultar
     */
    public int getResp_TokenSegundosReConsultar() {
        return resp_TokenSegundosReConsultar;
    }


    /**
     * Sets the resp_TokenSegundosReConsultar value for this ILecturaTarjeta_400RespuestaConsultarLecturaTarjeta.
     * 
     * @param resp_TokenSegundosReConsultar
     */
    public void setResp_TokenSegundosReConsultar(int resp_TokenSegundosReConsultar) {
        this.resp_TokenSegundosReConsultar = resp_TokenSegundosReConsultar;
    }


    /**
     * Gets the tokenNro value for this ILecturaTarjeta_400RespuestaConsultarLecturaTarjeta.
     * 
     * @return tokenNro
     */
    public java.lang.String getTokenNro() {
        return tokenNro;
    }


    /**
     * Sets the tokenNro value for this ILecturaTarjeta_400RespuestaConsultarLecturaTarjeta.
     * 
     * @param tokenNro
     */
    public void setTokenNro(java.lang.String tokenNro) {
        this.tokenNro = tokenNro;
    }


    /**
     * Gets the track1 value for this ILecturaTarjeta_400RespuestaConsultarLecturaTarjeta.
     * 
     * @return track1
     */
    public java.lang.String getTrack1() {
        return track1;
    }


    /**
     * Sets the track1 value for this ILecturaTarjeta_400RespuestaConsultarLecturaTarjeta.
     * 
     * @param track1
     */
    public void setTrack1(java.lang.String track1) {
        this.track1 = track1;
    }


    /**
     * Gets the track2 value for this ILecturaTarjeta_400RespuestaConsultarLecturaTarjeta.
     * 
     * @return track2
     */
    public java.lang.String getTrack2() {
        return track2;
    }


    /**
     * Sets the track2 value for this ILecturaTarjeta_400RespuestaConsultarLecturaTarjeta.
     * 
     * @param track2
     */
    public void setTrack2(java.lang.String track2) {
        this.track2 = track2;
    }


    /**
     * Gets the track3 value for this ILecturaTarjeta_400RespuestaConsultarLecturaTarjeta.
     * 
     * @return track3
     */
    public java.lang.String getTrack3() {
        return track3;
    }


    /**
     * Sets the track3 value for this ILecturaTarjeta_400RespuestaConsultarLecturaTarjeta.
     * 
     * @param track3
     */
    public void setTrack3(java.lang.String track3) {
        this.track3 = track3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ILecturaTarjeta_400RespuestaConsultarLecturaTarjeta)) return false;
        ILecturaTarjeta_400RespuestaConsultarLecturaTarjeta other = (ILecturaTarjeta_400RespuestaConsultarLecturaTarjeta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.msgRespuesta==null && other.getMsgRespuesta()==null) || 
             (this.msgRespuesta!=null &&
              this.msgRespuesta.equals(other.getMsgRespuesta()))) &&
            this.resp_CodigoRespuesta == other.getResp_CodigoRespuesta() &&
            ((this.resp_EstadoAvance==null && other.getResp_EstadoAvance()==null) || 
             (this.resp_EstadoAvance!=null &&
              this.resp_EstadoAvance.equals(other.getResp_EstadoAvance()))) &&
            this.resp_LecturaFinalizada == other.isResp_LecturaFinalizada() &&
            ((this.resp_MensajeError==null && other.getResp_MensajeError()==null) || 
             (this.resp_MensajeError!=null &&
              this.resp_MensajeError.equals(other.getResp_MensajeError()))) &&
            this.resp_TokenSegundosReConsultar == other.getResp_TokenSegundosReConsultar() &&
            ((this.tokenNro==null && other.getTokenNro()==null) || 
             (this.tokenNro!=null &&
              this.tokenNro.equals(other.getTokenNro()))) &&
            ((this.track1==null && other.getTrack1()==null) || 
             (this.track1!=null &&
              this.track1.equals(other.getTrack1()))) &&
            ((this.track2==null && other.getTrack2()==null) || 
             (this.track2!=null &&
              this.track2.equals(other.getTrack2()))) &&
            ((this.track3==null && other.getTrack3()==null) || 
             (this.track3!=null &&
              this.track3.equals(other.getTrack3())));
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
        if (getMsgRespuesta() != null) {
            _hashCode += getMsgRespuesta().hashCode();
        }
        _hashCode += getResp_CodigoRespuesta();
        if (getResp_EstadoAvance() != null) {
            _hashCode += getResp_EstadoAvance().hashCode();
        }
        _hashCode += (isResp_LecturaFinalizada() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getResp_MensajeError() != null) {
            _hashCode += getResp_MensajeError().hashCode();
        }
        _hashCode += getResp_TokenSegundosReConsultar();
        if (getTokenNro() != null) {
            _hashCode += getTokenNro().hashCode();
        }
        if (getTrack1() != null) {
            _hashCode += getTrack1().hashCode();
        }
        if (getTrack2() != null) {
            _hashCode += getTrack2().hashCode();
        }
        if (getTrack3() != null) {
            _hashCode += getTrack3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ILecturaTarjeta_400RespuestaConsultarLecturaTarjeta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ILecturaTarjeta_400.RespuestaConsultarLecturaTarjeta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msgRespuesta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "MsgRespuesta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ILecturaTarjeta_400.TipoEstadoAvance"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resp_LecturaFinalizada");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "Resp_LecturaFinalizada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("track1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "Track1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("track2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "Track2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("track3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "Track3"));
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
