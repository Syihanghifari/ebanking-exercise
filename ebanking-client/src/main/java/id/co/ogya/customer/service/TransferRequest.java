/**
 * TransferRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package id.co.ogya.customer.service;

public class TransferRequest  implements java.io.Serializable {
    private java.lang.Long accountFrom;

    private java.lang.Long accountTo;

    private java.lang.Long amount;

    private java.lang.String notes;

    public TransferRequest() {
    }

    public TransferRequest(
           java.lang.Long accountFrom,
           java.lang.Long accountTo,
           java.lang.Long amount,
           java.lang.String notes) {
           this.accountFrom = accountFrom;
           this.accountTo = accountTo;
           this.amount = amount;
           this.notes = notes;
    }


    /**
     * Gets the accountFrom value for this TransferRequest.
     * 
     * @return accountFrom
     */
    public java.lang.Long getAccountFrom() {
        return accountFrom;
    }


    /**
     * Sets the accountFrom value for this TransferRequest.
     * 
     * @param accountFrom
     */
    public void setAccountFrom(java.lang.Long accountFrom) {
        this.accountFrom = accountFrom;
    }


    /**
     * Gets the accountTo value for this TransferRequest.
     * 
     * @return accountTo
     */
    public java.lang.Long getAccountTo() {
        return accountTo;
    }


    /**
     * Sets the accountTo value for this TransferRequest.
     * 
     * @param accountTo
     */
    public void setAccountTo(java.lang.Long accountTo) {
        this.accountTo = accountTo;
    }


    /**
     * Gets the amount value for this TransferRequest.
     * 
     * @return amount
     */
    public java.lang.Long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this TransferRequest.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }


    /**
     * Gets the notes value for this TransferRequest.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this TransferRequest.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransferRequest)) return false;
        TransferRequest other = (TransferRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountFrom==null && other.getAccountFrom()==null) || 
             (this.accountFrom!=null &&
              this.accountFrom.equals(other.getAccountFrom()))) &&
            ((this.accountTo==null && other.getAccountTo()==null) || 
             (this.accountTo!=null &&
              this.accountTo.equals(other.getAccountTo()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes())));
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
        if (getAccountFrom() != null) {
            _hashCode += getAccountFrom().hashCode();
        }
        if (getAccountTo() != null) {
            _hashCode += getAccountTo().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransferRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.customer.ogya.co.id/", "transferRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
