package id.co.ogya.client;

import java.rmi.RemoteException;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import id.co.ogya.client.*;

@WebService
public class ClientService {
	
	
	@WebMethod
	public InquiryBalanceResponse jumlahSaldo(InquiryBalanceRequest inquiryBalanceRequest) throws  RemoteException {
		InquiryBalanceResponse response = new InquiryBalanceResponse();
		TransactionServiceService service = new TransactionServiceService();
		try {
			TransactionService callMethod = service.getTransactionServicePort();
			response = callMethod.cekSaldo(inquiryBalanceRequest);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return response;
	}
}
