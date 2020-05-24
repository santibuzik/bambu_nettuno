/**
 * ILecturaTarjeta_400TipoEstadoAvance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador;

public class ILecturaTarjeta_400TipoEstadoAvance implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ILecturaTarjeta_400TipoEstadoAvance(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ESTADOAVANCE_SINDEFINIR = "ESTADOAVANCE_SINDEFINIR";
    public static final java.lang.String _ESTADOAVANCE_PENDIENTE_PROCESO = "ESTADOAVANCE_PENDIENTE_PROCESO";
    public static final java.lang.String _ESTADOAVANCE_ENPROCESO = "ESTADOAVANCE_ENPROCESO";
    public static final java.lang.String _ESTADOAVANCE_PROCESADA_SIN_CONFIRMAR = "ESTADOAVANCE_PROCESADA_SIN_CONFIRMAR";
    public static final java.lang.String _ESTADOAVANCE_FINALIZADA_CORRECTAMENTE = "ESTADOAVANCE_FINALIZADA_CORRECTAMENTE";
    public static final java.lang.String _ESTADOAVANCE_FINALIZADA_ERROR = "ESTADOAVANCE_FINALIZADA_ERROR";
    public static final java.lang.String _ESTADOAVANCE_CANCELADA = "ESTADOAVANCE_CANCELADA";
    public static final ILecturaTarjeta_400TipoEstadoAvance ESTADOAVANCE_SINDEFINIR = new ILecturaTarjeta_400TipoEstadoAvance(_ESTADOAVANCE_SINDEFINIR);
    public static final ILecturaTarjeta_400TipoEstadoAvance ESTADOAVANCE_PENDIENTE_PROCESO = new ILecturaTarjeta_400TipoEstadoAvance(_ESTADOAVANCE_PENDIENTE_PROCESO);
    public static final ILecturaTarjeta_400TipoEstadoAvance ESTADOAVANCE_ENPROCESO = new ILecturaTarjeta_400TipoEstadoAvance(_ESTADOAVANCE_ENPROCESO);
    public static final ILecturaTarjeta_400TipoEstadoAvance ESTADOAVANCE_PROCESADA_SIN_CONFIRMAR = new ILecturaTarjeta_400TipoEstadoAvance(_ESTADOAVANCE_PROCESADA_SIN_CONFIRMAR);
    public static final ILecturaTarjeta_400TipoEstadoAvance ESTADOAVANCE_FINALIZADA_CORRECTAMENTE = new ILecturaTarjeta_400TipoEstadoAvance(_ESTADOAVANCE_FINALIZADA_CORRECTAMENTE);
    public static final ILecturaTarjeta_400TipoEstadoAvance ESTADOAVANCE_FINALIZADA_ERROR = new ILecturaTarjeta_400TipoEstadoAvance(_ESTADOAVANCE_FINALIZADA_ERROR);
    public static final ILecturaTarjeta_400TipoEstadoAvance ESTADOAVANCE_CANCELADA = new ILecturaTarjeta_400TipoEstadoAvance(_ESTADOAVANCE_CANCELADA);
    public java.lang.String getValue() { return _value_;}
    public static ILecturaTarjeta_400TipoEstadoAvance fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ILecturaTarjeta_400TipoEstadoAvance enumeration = (ILecturaTarjeta_400TipoEstadoAvance)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ILecturaTarjeta_400TipoEstadoAvance fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ILecturaTarjeta_400TipoEstadoAvance.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ILecturaTarjeta_400.TipoEstadoAvance"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
