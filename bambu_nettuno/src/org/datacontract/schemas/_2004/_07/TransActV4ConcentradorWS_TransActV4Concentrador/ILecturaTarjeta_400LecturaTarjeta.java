/**
 * ILecturaTarjeta_400LecturaTarjeta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador;

public class ILecturaTarjeta_400LecturaTarjeta  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ILecturaTarjeta_400Configuracion configuracion;

    private java.lang.String empCod;

    private java.lang.String empHASH;

    private java.lang.Integer multiEmp;

    private java.lang.String termCod;

    public ILecturaTarjeta_400LecturaTarjeta() {
    }

    public ILecturaTarjeta_400LecturaTarjeta(
           org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ILecturaTarjeta_400Configuracion configuracion,
           java.lang.String empCod,
           java.lang.String empHASH,
           java.lang.Integer multiEmp,
           java.lang.String termCod) {
           this.configuracion = configuracion;
           this.empCod = empCod;
           this.empHASH = empHASH;
           this.multiEmp = multiEmp;
           this.termCod = termCod;
    }


    /**
     * Gets the configuracion value for this ILecturaTarjeta_400LecturaTarjeta.
     * 
     * @return configuracion
     */
    public org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ILecturaTarjeta_400Configuracion getConfiguracion() {
        return configuracion;
    }


    /**
     * Sets the configuracion value for this ILecturaTarjeta_400LecturaTarjeta.
     * 
     * @param configuracion
     */
    public void setConfiguracion(org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ILecturaTarjeta_400Configuracion configuracion) {
        this.configuracion = configuracion;
    }


    /**
     * Gets the empCod value for this ILecturaTarjeta_400LecturaTarjeta.
     * 
     * @return empCod
     */
    public java.lang.String getEmpCod() {
        return empCod;
    }


    /**
     * Sets the empCod value for this ILecturaTarjeta_400LecturaTarjeta.
     * 
     * @param empCod
     */
    public void setEmpCod(java.lang.String empCod) {
        this.empCod = empCod;
    }


    /**
     * Gets the empHASH value for this ILecturaTarjeta_400LecturaTarjeta.
     * 
     * @return empHASH
     */
    public java.lang.String getEmpHASH() {
        return empHASH;
    }


    /**
     * Sets the empHASH value for this ILecturaTarjeta_400LecturaTarjeta.
     * 
     * @param empHASH
     */
    public void setEmpHASH(java.lang.String empHASH) {
        this.empHASH = empHASH;
    }


    /**
     * Gets the multiEmp value for this ILecturaTarjeta_400LecturaTarjeta.
     * 
     * @return multiEmp
     */
    public java.lang.Integer getMultiEmp() {
        return multiEmp;
    }


    /**
     * Sets the multiEmp value for this ILecturaTarjeta_400LecturaTarjeta.
     * 
     * @param multiEmp
     */
    public void setMultiEmp(java.lang.Integer multiEmp) {
        this.multiEmp = multiEmp;
    }


    /**
     * Gets the termCod value for this ILecturaTarjeta_400LecturaTarjeta.
     * 
     * @return termCod
     */
    public java.lang.String getTermCod() {
        return termCod;
    }


    /**
     * Sets the termCod value for this ILecturaTarjeta_400LecturaTarjeta.
     * 
     * @param termCod
     */
    public void setTermCod(java.lang.String termCod) {
        this.termCod = termCod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ILecturaTarjeta_400LecturaTarjeta)) return false;
        ILecturaTarjeta_400LecturaTarjeta other = (ILecturaTarjeta_400LecturaTarjeta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
        if (getTermCod() != null) {
            _hashCode += getTermCod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ILecturaTarjeta_400LecturaTarjeta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ILecturaTarjeta_400.LecturaTarjeta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configuracion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "Configuracion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TransActV4ConcentradorWS.TransActV4Concentrador", "ILecturaTarjeta_400.Configuracion"));
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
