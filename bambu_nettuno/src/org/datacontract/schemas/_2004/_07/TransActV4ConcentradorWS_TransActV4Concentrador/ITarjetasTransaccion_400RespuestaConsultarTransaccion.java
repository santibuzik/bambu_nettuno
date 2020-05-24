/**
 * ITarjetasTransaccion_400RespuestaConsultarTransaccion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador;

public class ITarjetasTransaccion_400RespuestaConsultarTransaccion  implements java.io.Serializable {
    private boolean aprobada;

    private java.lang.String codRespAdq;

    private org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion datosTransaccion;

    private boolean esOffline;

    private double lote;

    private java.lang.String msgRespuesta;

    private java.lang.String nroAutorizacion;

    private int resp_CodigoRespuesta;

    private org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasTransaccion_400TipoEstadoAvance resp_EstadoAvance;

    private java.lang.String resp_MensajeError;

    private int resp_TokenSegundosReConsultar;

    private boolean resp_TransaccionFinalizada;

    private int tarjetaId;

    private java.lang.String tarjetaTipo;

    private double ticket;

    private java.lang.String tokenNro;

    private double transaccionId;

    private java.lang.String[] voucher;

    public ITarjetasTransaccion_400RespuestaConsultarTransaccion() {
    }

    public ITarjetasTransaccion_400RespuestaConsultarTransaccion(
           boolean aprobada,
           java.lang.String codRespAdq,
           org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion datosTransaccion,
           boolean esOffline,
           double lote,
           java.lang.String msgRespuesta,
           java.lang.String nroAutorizacion,
           int resp_CodigoRespuesta,
           org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasTransaccion_400TipoEstadoAvance resp_EstadoAvance,
           java.lang.String resp_MensajeError,
           int resp_TokenSegundosReConsultar,
           boolean resp_TransaccionFinalizada,
           int tarjetaId,
           java.lang.String tarjetaTipo,
           double ticket,
           java.lang.String tokenNro,
           double transaccionId,
           java.lang.String[] voucher) {
           this.aprobada = aprobada;
           this.codRespAdq = codRespAdq;
           this.datosTransaccion = datosTransaccion;
           this.esOffline = esOffline;
           this.lote = lote;
           this.msgRespuesta = msgRespuesta;
           this.nroAutorizacion = nroAutorizacion;
           this.resp_CodigoRespuesta = resp_CodigoRespuesta;
           this.resp_EstadoAvance = resp_EstadoAvance;
           this.resp_MensajeError = resp_MensajeError;
           this.resp_TokenSegundosReConsultar = resp_TokenSegundosReConsultar;
           this.resp_TransaccionFinalizada = resp_TransaccionFinalizada;
           this.tarjetaId = tarjetaId;
           this.tarjetaTipo = tarjetaTipo;
           this.ticket = ticket;
           this.tokenNro = tokenNro;
           this.transaccionId = transaccionId;
           this.voucher = voucher;
    }


    /**
     * Gets the aprobada value for this ITarjetasTransaccion_400RespuestaConsultarTransaccion.
     * 
     * @return aprobada
     */
    public boolean isAprobada() {
        return aprobada;
    }


    /**
     * Sets the aprobada value for this ITarjetasTransaccion_400RespuestaConsultarTransaccion.
     * 
     * @param aprobada
     */
    public void setAprobada(boolean aprobada) {
        this.aprobada = aprobada;
    }


    /**
     * Gets the codRespAdq value for this ITarjetasTransaccion_400RespuestaConsultarTransaccion.
     * 
     * @return codRespAdq
     */
    public java.lang.String getCodRespAdq() {
        return codRespAdq;
    }


    /**
     * Sets the codRespAdq value for this ITarjetasTransaccion_400RespuestaConsultarTransaccion.
     * 
     * @param codRespAdq
     */
    public void setCodRespAdq(java.lang.String codRespAdq) {
        this.codRespAdq = codRespAdq;
    }


    /**
     * Gets the datosTransaccion value for this ITarjetasTransaccion_400RespuestaConsultarTransaccion.
     * 
     * @return datosTransaccion
     */
    public org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion getDatosTransaccion() {
        return datosTransaccion;
    }


    /**
     * Sets the datosTransaccion value for this ITarjetasTransaccion_400RespuestaConsultarTransaccion.
     * 
     * @param datosTransaccion
     */
    public void setDatosTransaccion(org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion datosTransaccion) {
        this.datosTransaccion = datosTransaccion;
    }


    /**
     * Gets the esOffline value for this ITarjetasTransaccion_400RespuestaConsultarTransaccion.
     * 
     * @return esOffline
     */
    public boolean isEsOffline() {
        return esOffline;
    }


    /**
     * Sets the esOffline value for this ITarjetasTransaccion_400RespuestaConsultarTransaccion.
     * 
     * @param esOffline
     */
    public void setEsOffline(boolean esOffline) {
        this.esOffline = esOffline;
    }


    /**
     * Gets the lote value for this ITarjetasTransaccion_400RespuestaConsultarTransaccion.
     * 
     * @return lote
     */
    public double getLote() {
        return lote;
    }


    /**
     * Sets the lote value for this ITarjetasTransaccion_400RespuestaConsultarTransaccion.
     * 
     * @param lote
     */
    public void setLote(double lote) {
        this.lote = lote;
    }


    /**
     * Gets the msgRespuesta value for this ITarjetasTransaccion_400RespuestaConsultarTransaccion.
     * 
     * @return msgRespuesta
     */
    public java.lang.String getMsgRespuesta() {
        return msgRespuesta;
    }


    /**
     * Sets the msgRespuesta value for this ITarjetasTransaccion_400RespuestaConsultarTransaccion.
     * 
     * @param msgRespuesta
     */
    public void setMsgRespuesta(java.lang.String msgRespuesta) {
        this.msgRespuesta = msgRespuesta;
    }


    /**
     * Gets the nroAutorizacion value for this ITarjetasTransaccion_400RespuestaConsultarTransaccion.
     * 
     * @return nroAutorizacion
     */
    public java.lang.String getNroAutorizacion() {
        return nroAutorizacion;
    }


    /**
     * Sets the nroAutorizacion value for this ITarjetasTransaccion_400RespuestaConsultarTransaccion.
     * 
     * @param nroAutorizacion
     */
    public void setNroAutorizacion(java.lang.String nroAutorizacion) {
        this.nroAutorizacion = nroAutorizacion;
    }


    /**
     * Gets the resp_CodigoRespuesta value for this ITarjetasTransaccion_400RespuestaConsultarTransaccion.
     * 
     * @return resp_CodigoRespuesta
     */
    public int getResp_CodigoRespuesta() {
        return resp_CodigoRespuesta;
    }


    /**
     * Sets the resp_CodigoRespuesta value for this ITarjetasTransaccion_400RespuestaConsultarTransaccion.
     * 
     * @param resp_CodigoRespuesta
     */
    public void setResp_CodigoRespuesta(int resp_CodigoRespuesta) {
        this.resp_CodigoRespuesta = resp_CodigoRespuesta;
    }


    /**
     * Gets the resp_EstadoAvance value for this ITarjetasTransaccion_400RespuestaConsultarTransaccion.
     * 
     * @return resp_EstadoAvance
     */
    public org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasTransaccion_400TipoEstadoAvance getResp_EstadoAvance() {
        return resp_EstadoAvance;
    }


    /**
     * Sets the resp_EstadoAvance value for this ITarjetasTransaccion_400RespuestaConsultarTransaccion.
     * 
     * @param resp_EstadoAvance
     */
    public void setResp_EstadoAvance(org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasTransaccion_400TipoEstadoAvance resp_EstadoAvance) {
        this.resp_EstadoAvance = resp_EstadoAvance;
    }


    /**
     * Gets the resp_MensajeError value for this ITarjetasTransaccion_400RespuestaConsultarTransaccion.
     * 
     * @return resp_MensajeError
     */
    public java.lang.String getResp_MensajeError() {
        return resp_MensajeError;
    }


    /**
     * Sets the resp_MensajeError value for this ITarjetasTransaccion_400RespuestaConsultarTransaccion.
     * 
     * @param resp_MensajeError
     */
    public void setResp_MensajeError(java.lang.String resp_MensajeError) {
        this.resp_MensajeError = resp_MensajeError;
    }


    /**
     * Gets the resp_TokenSegundosReConsultar value for this ITarjetasTransaccion_400RespuestaConsultarTransaccion.
     * 
     * @return resp_TokenSegundosReConsultar
     */
    public int getResp_TokenSegundosReConsultar() {
        return resp_TokenSegundosReConsultar;
    }


    /**
     * Sets the resp_TokenSegundosReConsultar value for this ITarjetasTransaccion_400RespuestaConsultarTransaccion.
     * 
     * @param resp_TokenSegundosReConsultar
     */
    public void setResp_TokenSegundosReConsultar(int resp_TokenSegundosReConsultar) {
        this.resp_TokenSegundosReConsultar = resp_TokenSegundosReConsultar;
    }


    /**
     * Gets the resp_TransaccionFinalizada value for this ITarjetasTransaccion_400RespuestaConsultarTransaccion.
     * 
     * @return resp_TransaccionFinalizada
     */
    public boolean isResp_TransaccionFinalizada() {
        return resp_TransaccionFinalizada;
    }


    /**
     * Sets the resp_TransaccionFinalizada value for this ITarjetasTransaccion_400RespuestaConsultarTransaccion.
     * 
     * @param resp_TransaccionFinalizada
     */
    public void setResp_TransaccionFinalizada(boolean resp_TransaccionFinalizada) {
        this.resp_TransaccionFinalizada = resp_TransaccionFinalizada;
    }


    /**
     * Gets the tarjetaId value for this ITarjetasTransaccion_400RespuestaConsultarTransaccion.
     * 
     * @return tarjetaId
     */
    public int getTarjetaId() {
        return tarjetaId;
    }


    /**
     * Sets the tarjetaId value for this ITarjetasTransaccion_400RespuestaConsultarTransaccion.
     * 
     * @param tarjetaId
     */
    public void setTarjetaId(int tarjetaId) {
        this.tarjetaId = tarjetaId;
    }


    /**
     * Gets the tarjetaTipo value for this ITarjetasTransaccion_400RespuestaConsultarTransaccion.
     * 
     * @return tarjetaTipo
     */
    public java.lang.String getTarjetaTipo() {
        return tarjetaTipo;
    }


    /**
     * Sets the tarjetaTipo value for this ITarjetasTransaccion_400RespuestaConsultarTransaccion.
     * 
     * @param tarjetaTipo
     */
    public void setTarjetaTipo(java.lang.String tarjetaTipo) {
        this.tarjetaTipo = tarjetaTipo;
    }


    /**
     * Gets the ticket value for this ITarjetasTransaccion_400RespuestaConsultarTransaccion.
     * 
     * @return ticket
     */
    public double getTicket() {
        return ticket;
    }


    /**
     * Sets the ticket value for this ITarjetasTransaccion_400RespuestaConsultarTransaccion.
     * 
     * @param ticket
     */
    public void setTicket(double ticket) {
        this.ticket = ticket;
    }


    /**
     * Gets the tokenNro value for this ITarjetasTransaccion_400RespuestaConsultarTransaccion.
     * 
     * @return tokenNro
     */
    public java.lang.String getTokenNro() {
        return tokenNro;
    }


    /**
     * Sets the tokenNro value for this ITarjetasTransaccion_400RespuestaConsultarTransaccion.
     * 
     * @param tokenNro
     */
    public void setTokenNro(java.lang.String tokenNro) {
        this.tokenNro = tokenNro;
    }


    /**
     * Gets the transaccionId value for this ITarjetasTransaccion_400RespuestaConsultarTransaccion.
     * 
     * @return transaccionId
     */
    public double getTransaccionId() {
        return transaccionId;
    }


    /**
     * Sets the transaccionId value for this ITarjetasTransaccion_400RespuestaConsultarTransaccion.
     * 
     * @param transaccionId
     */
    public void setTransaccionId(double transaccionId) {
        this.transaccionId = transaccionId;
    }


    /**
     * Gets the voucher value for this ITarjetasTransaccion_400RespuestaConsultarTransaccion.
     * 
     * @return voucher
     */
    public java.lang.String[] getVoucher() {
        return voucher;
    }


    /**
     * Sets the voucher value for this ITarjetasTransaccion_400RespuestaConsultarTransaccion.
     * 
     * @param voucher
     */
    public void setVoucher(java.lang.String[] voucher) {
        this.voucher = voucher;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ITarjetasTransaccion_400RespuestaConsultarTransaccion)) return false;
        ITarjetasTransaccion_400RespuestaConsultarTransaccion other = (ITarjetasTransaccion_400RespuestaConsultarTransaccion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.aprobada == other.isAprobada() &&
            ((this.codRespAdq==null && other.getCodRespAdq()==null) || 
             (this.codRespAdq!=null &&
              this.codRespAdq.equals(other.getCodRespAdq()))) &&
            ((this.datosTransaccion==null && other.getDatosTransaccion()==null) || 
             (this.datosTransaccion!=null &&
              this.datosTransaccion.equals(other.getDatosTransaccion()))) &&
            this.esOffline == other.isEsOffline() &&
            this.lote == other.getLote() &&
            ((this.msgRespuesta==null && other.getMsgRespuesta()==null) || 
             (this.msgRespuesta!=null &&
              this.msgRespuesta.equals(other.getMsgRespuesta()))) &&
            ((this.nroAutorizacion==null && other.getNroAutorizacion()==null) || 
             (this.nroAutorizacion!=null &&
              this.nroAutorizacion.equals(other.getNroAutorizacion()))) &&
            this.resp_CodigoRespuesta == other.getResp_CodigoRespuesta() &&
            ((this.resp_EstadoAvance==null && other.getResp_EstadoAvance()==null) || 
             (this.resp_EstadoAvance!=null &&
              this.resp_EstadoAvance.equals(other.getResp_EstadoAvance()))) &&
            ((this.resp_MensajeError==null && other.getResp_MensajeError()==null) || 
             (this.resp_MensajeError!=null &&
              this.resp_MensajeError.equals(other.getResp_MensajeError()))) &&
            this.resp_TokenSegundosReConsultar == other.getResp_TokenSegundosReConsultar() &&
            this.resp_TransaccionFinalizada == other.isResp_TransaccionFinalizada() &&
            this.tarjetaId == other.getTarjetaId() &&
            ((this.tarjetaTipo==null && other.getTarjetaTipo()==null) || 
             (this.tarjetaTipo!=null &&
              this.tarjetaTipo.equals(other.getTarjetaTipo()))) &&
            this.ticket == other.getTicket() &&
            ((this.tokenNro==null && other.getTokenNro()==null) || 
             (this.tokenNro!=null &&
              this.tokenNro.equals(other.getTokenNro()))) &&
            this.transaccionId == other.getTransaccionId() &&
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
        _hashCode += (isAprobada() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCodRespAdq() != null) {
            _hashCode += getCodRespAdq().hashCode();
        }
        if (getDatosTransaccion() != null) {
            _hashCode += getDatosTransaccion().hashCode();
        }
        _hashCode += (isEsOffline() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Double(getLote()).hashCode();
        if (getMsgRespuesta() != null) {
            _hashCode += getMsgRespuesta().hashCode();
        }
        if (getNroAutorizacion() != null) {
            _hashCode += getNroAutorizacion().hashCode();
        }
        _hashCode += getResp_CodigoRespuesta();
        if (getResp_EstadoAvance() != null) {
            _hashCode += getResp_EstadoAvance().hashCode();
        }
        if (getResp_MensajeError() != null) {
            _hashCode += getResp_MensajeError().hashCode();
        }
        _hashCode += getResp_TokenSegundosReConsultar();
        _hashCode += (isResp_TransaccionFinalizada() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getTarjetaId();
        if (getTarjetaTipo() != null) {
            _hashCode += getTarjetaTipo().hashCode();
        }
        _hashCode += new Double(getTicket()).hashCode();
        if (getTokenNro() != null) {
            _hashCode += getTokenNro().hashCode();
        }
        _hashCode += new Double(getTransaccionId()).hashCode();
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
        new org.apache.axis.description.TypeDesc(ITarjetasTransaccion_400RespuestaConsultarTransaccion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ITarjetasTransaccion_400.RespuestaConsultarTransaccion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aprobada");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "Aprobada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codRespAdq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "CodRespAdq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosTransaccion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "DatosTransaccion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ITarjetasTransaccion_400.RespuestaConsultarTransaccion.IDatosTransaccion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esOffline");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "EsOffline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "Lote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msgRespuesta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "MsgRespuesta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroAutorizacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "NroAutorizacion"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ITarjetasTransaccion_400.TipoEstadoAvance"));
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
        elemField.setFieldName("resp_TransaccionFinalizada");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "Resp_TransaccionFinalizada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarjetaId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "TarjetaId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarjetaTipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "TarjetaTipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticket");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "Ticket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenNro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "TokenNro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transaccionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "TransaccionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
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
