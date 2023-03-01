package id.co.ogya.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.2
 * 2023-03-01T15:33:37.064+07:00
 * Generated source version: 3.3.2
 *
 */
@WebService(targetNamespace = "http://service.customer.ogya.co.id/", name = "TransactionService")
@XmlSeeAlso({ObjectFactory.class})
public interface TransactionService {

    @WebMethod
    @Action(input = "http://service.customer.ogya.co.id/TransactionService/cekSaldoRequest", output = "http://service.customer.ogya.co.id/TransactionService/cekSaldoResponse", fault = {@FaultAction(className = InvalidInputException_Exception.class, value = "http://service.customer.ogya.co.id/TransactionService/cekSaldo/Fault/InvalidInputException")})
    @RequestWrapper(localName = "cekSaldo", targetNamespace = "http://service.customer.ogya.co.id/", className = "id.co.ogya.client.CekSaldo")
    @ResponseWrapper(localName = "cekSaldoResponse", targetNamespace = "http://service.customer.ogya.co.id/", className = "id.co.ogya.client.CekSaldoResponse")
    @WebResult(name = "return", targetNamespace = "")
    public id.co.ogya.client.InquiryBalanceResponse cekSaldo(

        @WebParam(name = "arg0", targetNamespace = "")
        id.co.ogya.client.InquiryBalanceRequest arg0
    ) throws InvalidInputException_Exception;

    @WebMethod
    @Action(input = "http://service.customer.ogya.co.id/TransactionService/kirimRequest", output = "http://service.customer.ogya.co.id/TransactionService/kirimResponse", fault = {@FaultAction(className = InvalidInputException_Exception.class, value = "http://service.customer.ogya.co.id/TransactionService/kirim/Fault/InvalidInputException")})
    @RequestWrapper(localName = "kirim", targetNamespace = "http://service.customer.ogya.co.id/", className = "id.co.ogya.client.Kirim")
    @ResponseWrapper(localName = "kirimResponse", targetNamespace = "http://service.customer.ogya.co.id/", className = "id.co.ogya.client.KirimResponse")
    @WebResult(name = "return", targetNamespace = "")
    public id.co.ogya.client.TransferResponse kirim(

        @WebParam(name = "arg0", targetNamespace = "")
        id.co.ogya.client.TransferRequest arg0
    ) throws InvalidInputException_Exception;
}
