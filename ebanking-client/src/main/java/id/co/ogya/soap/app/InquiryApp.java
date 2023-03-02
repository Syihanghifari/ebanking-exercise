package id.co.ogya.soap.app;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import id.co.ogya.soap.InquiryBalanceRequest;
import id.co.ogya.soap.InquiryBalanceResponse;
import id.co.ogya.soap.InvalidInputException;
import id.co.ogya.soap.InvalidInputException_Exception;
import id.co.ogya.soap.TransactionService;

public class InquiryApp {
	public static void main(String[] args) {
		final String endpointAddress = "http://localhost:7001/ebanking-client/TransactionServiceImplService";
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(TransactionService.class);
		factory.setAddress(endpointAddress);
		InquiryBalanceRequest data = new InquiryBalanceRequest();
		InquiryBalanceResponse response = new InquiryBalanceResponse();
		TransactionService service = (TransactionService) factory.create();
		System.out.println("connected");
		data.setAccountNo(200L);
		try {
			response = service.cekSaldo(data);
			System.out.println(response.getErrorMessage() + " " + response.getAccountBalance());
		} catch (InvalidInputException_Exception e) {
			InvalidInputException invalidInputException = e.getFaultInfo();
			System.out.println("Exception message : " + invalidInputException.getMessage());
			e.printStackTrace();
		}

	}
}
