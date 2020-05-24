/**
 * ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador;

public class ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion  implements java.io.Serializable {
    private int cuotas;

    private boolean decretoLeyAplicado;

    private double decretoLeyMonto;

    private java.lang.String decretoLeyNro;

    private int emisorId;

    private org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccionExtendida extendida;

    private java.lang.String monedaISO;

    private double monto;

    private double montoCashBack;

    private double montoPropina;

    private java.lang.String operacion;

    private boolean tarjetaAlimentacion;

    private boolean tarjetaExtranjera;

    private java.lang.String tarjetaIIN;

    private java.lang.String tarjetaNro;

    private boolean tarjetaPrestaciones;

    public ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion() {
    }

    public ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion(
           int cuotas,
           boolean decretoLeyAplicado,
           double decretoLeyMonto,
           java.lang.String decretoLeyNro,
           int emisorId,
           org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccionExtendida extendida,
           java.lang.String monedaISO,
           double monto,
           double montoCashBack,
           double montoPropina,
           java.lang.String operacion,
           boolean tarjetaAlimentacion,
           boolean tarjetaExtranjera,
           java.lang.String tarjetaIIN,
           java.lang.String tarjetaNro,
           boolean tarjetaPrestaciones) {
           this.cuotas = cuotas;
           this.decretoLeyAplicado = decretoLeyAplicado;
           this.decretoLeyMonto = decretoLeyMonto;
           this.decretoLeyNro = decretoLeyNro;
           this.emisorId = emisorId;
           this.extendida = extendida;
           this.monedaISO = monedaISO;
           this.monto = monto;
           this.montoCashBack = montoCashBack;
           this.montoPropina = montoPropina;
           this.operacion = operacion;
           this.tarjetaAlimentacion = tarjetaAlimentacion;
           this.tarjetaExtranjera = tarjetaExtranjera;
           this.tarjetaIIN = tarjetaIIN;
           this.tarjetaNro = tarjetaNro;
           this.tarjetaPrestaciones = tarjetaPrestaciones;
    }


    /**
     * Gets the cuotas value for this ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion.
     * 
     * @return cuotas
     */
    public int getCuotas() {
        return cuotas;
    }


    /**
     * Sets the cuotas value for this ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion.
     * 
     * @param cuotas
     */
    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }


    /**
     * Gets the decretoLeyAplicado value for this ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion.
     * 
     * @return decretoLeyAplicado
     */
    public boolean isDecretoLeyAplicado() {
        return decretoLeyAplicado;
    }


    /**
     * Sets the decretoLeyAplicado value for this ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion.
     * 
     * @param decretoLeyAplicado
     */
    public void setDecretoLeyAplicado(boolean decretoLeyAplicado) {
        this.decretoLeyAplicado = decretoLeyAplicado;
    }


    /**
     * Gets the decretoLeyMonto value for this ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion.
     * 
     * @return decretoLeyMonto
     */
    public double getDecretoLeyMonto() {
        return decretoLeyMonto;
    }


    /**
     * Sets the decretoLeyMonto value for this ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion.
     * 
     * @param decretoLeyMonto
     */
    public void setDecretoLeyMonto(double decretoLeyMonto) {
        this.decretoLeyMonto = decretoLeyMonto;
    }


    /**
     * Gets the decretoLeyNro value for this ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion.
     * 
     * @return decretoLeyNro
     */
    public java.lang.String getDecretoLeyNro() {
        return decretoLeyNro;
    }


    /**
     * Sets the decretoLeyNro value for this ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion.
     * 
     * @param decretoLeyNro
     */
    public void setDecretoLeyNro(java.lang.String decretoLeyNro) {
        this.decretoLeyNro = decretoLeyNro;
    }


    /**
     * Gets the emisorId value for this ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion.
     * 
     * @return emisorId
     */
    public int getEmisorId() {
        return emisorId;
    }


    /**
     * Sets the emisorId value for this ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion.
     * 
     * @param emisorId
     */
    public void setEmisorId(int emisorId) {
        this.emisorId = emisorId;
    }


    /**
     * Gets the extendida value for this ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion.
     * 
     * @return extendida
     */
    public org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccionExtendida getExtendida() {
        return extendida;
    }


    /**
     * Sets the extendida value for this ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion.
     * 
     * @param extendida
     */
    public void setExtendida(org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccionExtendida extendida) {
        this.extendida = extendida;
    }


    /**
     * Gets the monedaISO value for this ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion.
     * 
     * @return monedaISO
     */
    public java.lang.String getMonedaISO() {
        return monedaISO;
    }


    /**
     * Sets the monedaISO value for this ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion.
     * 
     * @param monedaISO
     */
    public void setMonedaISO(java.lang.String monedaISO) {
        this.monedaISO = monedaISO;
    }


    /**
     * Gets the monto value for this ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion.
     * 
     * @return monto
     */
    public double getMonto() {
        return monto;
    }


    /**
     * Sets the monto value for this ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion.
     * 
     * @param monto
     */
    public void setMonto(double monto) {
        this.monto = monto;
    }


    /**
     * Gets the montoCashBack value for this ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion.
     * 
     * @return montoCashBack
     */
    public double getMontoCashBack() {
        return montoCashBack;
    }


    /**
     * Sets the montoCashBack value for this ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion.
     * 
     * @param montoCashBack
     */
    public void setMontoCashBack(double montoCashBack) {
        this.montoCashBack = montoCashBack;
    }


    /**
     * Gets the montoPropina value for this ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion.
     * 
     * @return montoPropina
     */
    public double getMontoPropina() {
        return montoPropina;
    }


    /**
     * Sets the montoPropina value for this ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion.
     * 
     * @param montoPropina
     */
    public void setMontoPropina(double montoPropina) {
        this.montoPropina = montoPropina;
    }


    /**
     * Gets the operacion value for this ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion.
     * 
     * @return operacion
     */
    public java.lang.String getOperacion() {
        return operacion;
    }


    /**
     * Sets the operacion value for this ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion.
     * 
     * @param operacion
     */
    public void setOperacion(java.lang.String operacion) {
        this.operacion = operacion;
    }


    /**
     * Gets the tarjetaAlimentacion value for this ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion.
     * 
     * @return tarjetaAlimentacion
     */
    public boolean isTarjetaAlimentacion() {
        return tarjetaAlimentacion;
    }


    /**
     * Sets the tarjetaAlimentacion value for this ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion.
     * 
     * @param tarjetaAlimentacion
     */
    public void setTarjetaAlimentacion(boolean tarjetaAlimentacion) {
        this.tarjetaAlimentacion = tarjetaAlimentacion;
    }


    /**
     * Gets the tarjetaExtranjera value for this ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion.
     * 
     * @return tarjetaExtranjera
     */
    public boolean isTarjetaExtranjera() {
        return tarjetaExtranjera;
    }


    /**
     * Sets the tarjetaExtranjera value for this ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion.
     * 
     * @param tarjetaExtranjera
     */
    public void setTarjetaExtranjera(boolean tarjetaExtranjera) {
        this.tarjetaExtranjera = tarjetaExtranjera;
    }


    /**
     * Gets the tarjetaIIN value for this ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion.
     * 
     * @return tarjetaIIN
     */
    public java.lang.String getTarjetaIIN() {
        return tarjetaIIN;
    }


    /**
     * Sets the tarjetaIIN value for this ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion.
     * 
     * @param tarjetaIIN
     */
    public void setTarjetaIIN(java.lang.String tarjetaIIN) {
        this.tarjetaIIN = tarjetaIIN;
    }


    /**
     * Gets the tarjetaNro value for this ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion.
     * 
     * @return tarjetaNro
     */
    public java.lang.String getTarjetaNro() {
        return tarjetaNro;
    }


    /**
     * Sets the tarjetaNro value for this ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion.
     * 
     * @param tarjetaNro
     */
    public void setTarjetaNro(java.lang.String tarjetaNro) {
        this.tarjetaNro = tarjetaNro;
    }


    /**
     * Gets the tarjetaPrestaciones value for this ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion.
     * 
     * @return tarjetaPrestaciones
     */
    public boolean isTarjetaPrestaciones() {
        return tarjetaPrestaciones;
    }


    /**
     * Sets the tarjetaPrestaciones value for this ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion.
     * 
     * @param tarjetaPrestaciones
     */
    public void setTarjetaPrestaciones(boolean tarjetaPrestaciones) {
        this.tarjetaPrestaciones = tarjetaPrestaciones;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion)) return false;
        ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion other = (ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.cuotas == other.getCuotas() &&
            this.decretoLeyAplicado == other.isDecretoLeyAplicado() &&
            this.decretoLeyMonto == other.getDecretoLeyMonto() &&
            ((this.decretoLeyNro==null && other.getDecretoLeyNro()==null) || 
             (this.decretoLeyNro!=null &&
              this.decretoLeyNro.equals(other.getDecretoLeyNro()))) &&
            this.emisorId == other.getEmisorId() &&
            ((this.extendida==null && other.getExtendida()==null) || 
             (this.extendida!=null &&
              this.extendida.equals(other.getExtendida()))) &&
            ((this.monedaISO==null && other.getMonedaISO()==null) || 
             (this.monedaISO!=null &&
              this.monedaISO.equals(other.getMonedaISO()))) &&
            this.monto == other.getMonto() &&
            this.montoCashBack == other.getMontoCashBack() &&
            this.montoPropina == other.getMontoPropina() &&
            ((this.operacion==null && other.getOperacion()==null) || 
             (this.operacion!=null &&
              this.operacion.equals(other.getOperacion()))) &&
            this.tarjetaAlimentacion == other.isTarjetaAlimentacion() &&
            this.tarjetaExtranjera == other.isTarjetaExtranjera() &&
            ((this.tarjetaIIN==null && other.getTarjetaIIN()==null) || 
             (this.tarjetaIIN!=null &&
              this.tarjetaIIN.equals(other.getTarjetaIIN()))) &&
            ((this.tarjetaNro==null && other.getTarjetaNro()==null) || 
             (this.tarjetaNro!=null &&
              this.tarjetaNro.equals(other.getTarjetaNro()))) &&
            this.tarjetaPrestaciones == other.isTarjetaPrestaciones();
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
        _hashCode += getCuotas();
        _hashCode += (isDecretoLeyAplicado() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Double(getDecretoLeyMonto()).hashCode();
        if (getDecretoLeyNro() != null) {
            _hashCode += getDecretoLeyNro().hashCode();
        }
        _hashCode += getEmisorId();
        if (getExtendida() != null) {
            _hashCode += getExtendida().hashCode();
        }
        if (getMonedaISO() != null) {
            _hashCode += getMonedaISO().hashCode();
        }
        _hashCode += new Double(getMonto()).hashCode();
        _hashCode += new Double(getMontoCashBack()).hashCode();
        _hashCode += new Double(getMontoPropina()).hashCode();
        if (getOperacion() != null) {
            _hashCode += getOperacion().hashCode();
        }
        _hashCode += (isTarjetaAlimentacion() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isTarjetaExtranjera() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTarjetaIIN() != null) {
            _hashCode += getTarjetaIIN().hashCode();
        }
        if (getTarjetaNro() != null) {
            _hashCode += getTarjetaNro().hashCode();
        }
        _hashCode += (isTarjetaPrestaciones() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ITarjetasTransaccion_400RespuestaConsultarTransaccionIDatosTransaccion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ITarjetasTransaccion_400.RespuestaConsultarTransaccion.IDatosTransaccion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuotas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "Cuotas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("decretoLeyAplicado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "DecretoLeyAplicado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("decretoLeyMonto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "DecretoLeyMonto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("decretoLeyNro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "DecretoLeyNro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emisorId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "EmisorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extendida");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "Extendida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ITarjetasTransaccion_400.RespuestaConsultarTransaccion.IDatosTransaccionExtendida"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monedaISO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "MonedaISO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "Monto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("montoCashBack");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "MontoCashBack"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("montoPropina");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "MontoPropina"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "Operacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarjetaAlimentacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "TarjetaAlimentacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarjetaExtranjera");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "TarjetaExtranjera"));
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
        elemField.setFieldName("tarjetaNro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "TarjetaNro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarjetaPrestaciones");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "TarjetaPrestaciones"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
