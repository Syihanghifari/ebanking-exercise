/**
 * TransactionServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package id.co.ogya.customer.service;

public class TransactionServiceServiceLocator extends org.apache.axis.client.Service implements id.co.ogya.customer.service.TransactionServiceService {

    public TransactionServiceServiceLocator() {
    }


    public TransactionServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TransactionServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TransactionServicePort
    private java.lang.String TransactionServicePort_address = "http://192.168.56.1:7001/ebanking-ws/TransactionServiceService";

    public java.lang.String getTransactionServicePortAddress() {
        return TransactionServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TransactionServicePortWSDDServiceName = "TransactionServicePort";

    public java.lang.String getTransactionServicePortWSDDServiceName() {
        return TransactionServicePortWSDDServiceName;
    }

    public void setTransactionServicePortWSDDServiceName(java.lang.String name) {
        TransactionServicePortWSDDServiceName = name;
    }

    public id.co.ogya.customer.service.TransactionService getTransactionServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TransactionServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTransactionServicePort(endpoint);
    }

    public id.co.ogya.customer.service.TransactionService getTransactionServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            id.co.ogya.customer.service.TransactionServicePortBindingStub _stub = new id.co.ogya.customer.service.TransactionServicePortBindingStub(portAddress, this);
            _stub.setPortName(getTransactionServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTransactionServicePortEndpointAddress(java.lang.String address) {
        TransactionServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (id.co.ogya.customer.service.TransactionService.class.isAssignableFrom(serviceEndpointInterface)) {
                id.co.ogya.customer.service.TransactionServicePortBindingStub _stub = new id.co.ogya.customer.service.TransactionServicePortBindingStub(new java.net.URL(TransactionServicePort_address), this);
                _stub.setPortName(getTransactionServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("TransactionServicePort".equals(inputPortName)) {
            return getTransactionServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.customer.ogya.co.id/", "TransactionServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.customer.ogya.co.id/", "TransactionServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TransactionServicePort".equals(portName)) {
            setTransactionServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
