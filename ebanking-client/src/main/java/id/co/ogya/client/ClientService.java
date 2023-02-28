package id.co.ogya.client;

import java.rmi.RemoteException;

import javax.jws.WebMethod;
import javax.jws.WebService;

import id.co.ogya.customer.service.InquiryBalanceRequest;
import id.co.ogya.customer.service.InquiryBalanceResponse;
import id.co.ogya.customer.service.InvalidInputException;
import id.co.ogya.customer.service.TransactionService;
import id.co.ogya.customer.service.TransactionServiceServiceLocator;

@WebService
public class ClientService {
	@WebMethod
	public InquiryBalanceResponse jumlahSaldo(InquiryBalanceRequest inquiryBalanceRequest) throws InvalidInputException, RemoteException {
		InquiryBalanceResponse response = new InquiryBalanceResponse();
		try {
			TransactionServiceServiceLocator locate = new TransactionServiceServiceLocator();
			TransactionService transactionService = locate.getTransactionServicePort();
			response = transactionService.cekSaldo(inquiryBalanceRequest);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return response;
	}
}
