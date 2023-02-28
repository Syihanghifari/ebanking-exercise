/**
 * TransactionService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package id.co.ogya.customer.service;

public interface TransactionService extends java.rmi.Remote {
    public id.co.ogya.customer.service.TransferResponse kirim(id.co.ogya.customer.service.TransferRequest arg0) throws java.rmi.RemoteException, id.co.ogya.customer.service.InvalidInputException;
    public id.co.ogya.customer.service.InquiryBalanceResponse cekSaldo(id.co.ogya.customer.service.InquiryBalanceRequest arg0) throws java.rmi.RemoteException, id.co.ogya.customer.service.InvalidInputException;
}
