/**
 * ITarjetasCierre_400RespuestaConsultarCierreIDatosProductoMoneda.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador;

public class ITarjetasCierre_400RespuestaConsultarCierreIDatosProductoMoneda  implements java.io.Serializable {
    private java.lang.String monedaISO;

    private org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasCierre_400RespuestaConsultarCierreIDatosProductoMonedaPlan[] planes;

    private java.lang.Integer subTotalCantMoneda;

    private java.lang.Double subTotalMontoMoneda;

    public ITarjetasCierre_400RespuestaConsultarCierreIDatosProductoMoneda() {
    }

    public ITarjetasCierre_400RespuestaConsultarCierreIDatosProductoMoneda(
           java.lang.String monedaISO,
           org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasCierre_400RespuestaConsultarCierreIDatosProductoMonedaPlan[] planes,
           java.lang.Integer subTotalCantMoneda,
           java.lang.Double subTotalMontoMoneda) {
           this.monedaISO = monedaISO;
           this.planes = planes;
           this.subTotalCantMoneda = subTotalCantMoneda;
           this.subTotalMontoMoneda = subTotalMontoMoneda;
    }


    /**
     * Gets the monedaISO value for this ITarjetasCierre_400RespuestaConsultarCierreIDatosProductoMoneda.
     * 
     * @return monedaISO
     */
    public java.lang.String getMonedaISO() {
        return monedaISO;
    }


    /**
     * Sets the monedaISO value for this ITarjetasCierre_400RespuestaConsultarCierreIDatosProductoMoneda.
     * 
     * @param monedaISO
     */
    public void setMonedaISO(java.lang.String monedaISO) {
        this.monedaISO = monedaISO;
    }


    /**
     * Gets the planes value for this ITarjetasCierre_400RespuestaConsultarCierreIDatosProductoMoneda.
     * 
     * @return planes
     */
    public org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasCierre_400RespuestaConsultarCierreIDatosProductoMonedaPlan[] getPlanes() {
        return planes;
    }


    /**
     * Sets the planes value for this ITarjetasCierre_400RespuestaConsultarCierreIDatosProductoMoneda.
     * 
     * @param planes
     */
    public void setPlanes(org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasCierre_400RespuestaConsultarCierreIDatosProductoMonedaPlan[] planes) {
        this.planes = planes;
    }


    /**
     * Gets the subTotalCantMoneda value for this ITarjetasCierre_400RespuestaConsultarCierreIDatosProductoMoneda.
     * 
     * @return subTotalCantMoneda
     */
    public java.lang.Integer getSubTotalCantMoneda() {
        return subTotalCantMoneda;
    }


    /**
     * Sets the subTotalCantMoneda value for this ITarjetasCierre_400RespuestaConsultarCierreIDatosProductoMoneda.
     * 
     * @param subTotalCantMoneda
     */
    public void setSubTotalCantMoneda(java.lang.Integer subTotalCantMoneda) {
        this.subTotalCantMoneda = subTotalCantMoneda;
    }


    /**
     * Gets the subTotalMontoMoneda value for this ITarjetasCierre_400RespuestaConsultarCierreIDatosProductoMoneda.
     * 
     * @return subTotalMontoMoneda
     */
    public java.lang.Double getSubTotalMontoMoneda() {
        return subTotalMontoMoneda;
    }


    /**
     * Sets the subTotalMontoMoneda value for this ITarjetasCierre_400RespuestaConsultarCierreIDatosProductoMoneda.
     * 
     * @param subTotalMontoMoneda
     */
    public void setSubTotalMontoMoneda(java.lang.Double subTotalMontoMoneda) {
        this.subTotalMontoMoneda = subTotalMontoMoneda;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ITarjetasCierre_400RespuestaConsultarCierreIDatosProductoMoneda)) return false;
        ITarjetasCierre_400RespuestaConsultarCierreIDatosProductoMoneda other = (ITarjetasCierre_400RespuestaConsultarCierreIDatosProductoMoneda) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.monedaISO==null && other.getMonedaISO()==null) || 
             (this.monedaISO!=null &&
              this.monedaISO.equals(other.getMonedaISO()))) &&
            ((this.planes==null && other.getPlanes()==null) || 
             (this.planes!=null &&
              java.util.Arrays.equals(this.planes, other.getPlanes()))) &&
            ((this.subTotalCantMoneda==null && other.getSubTotalCantMoneda()==null) || 
             (this.subTotalCantMoneda!=null &&
              this.subTotalCantMoneda.equals(other.getSubTotalCantMoneda()))) &&
            ((this.subTotalMontoMoneda==null && other.getSubTotalMontoMoneda()==null) || 
             (this.subTotalMontoMoneda!=null &&
              this.subTotalMontoMoneda.equals(other.getSubTotalMontoMoneda())));
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
        if (getMonedaISO() != null) {
            _hashCode += getMonedaISO().hashCode();
        }
        if (getPlanes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlanes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlanes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubTotalCantMoneda() != null) {
            _hashCode += getSubTotalCantMoneda().hashCode();
        }
        if (getSubTotalMontoMoneda() != null) {
            _hashCode += getSubTotalMontoMoneda().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ITarjetasCierre_400RespuestaConsultarCierreIDatosProductoMoneda.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ITarjetasCierre_400.RespuestaConsultarCierre.IDatosProductoMoneda"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monedaISO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "MonedaISO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "Planes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ITarjetasCierre_400.RespuestaConsultarCierre.IDatosProductoMonedaPlan"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ITarjetasCierre_400.RespuestaConsultarCierre.IDatosProductoMonedaPlan"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subTotalCantMoneda");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "SubTotalCantMoneda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subTotalMontoMoneda");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "SubTotalMontoMoneda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
