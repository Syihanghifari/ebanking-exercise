package id.co.ogya.soap.app;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import id.co.ogya.soap.InvalidInputException;
import id.co.ogya.soap.InvalidInputException_Exception;
import id.co.ogya.soap.TransactionService;
import id.co.ogya.soap.TransferRequest;
import id.co.ogya.soap.TransferResponse;

public class TransferApp {
	public static void main(String[] args) {
		final String endpointAddress = "http://localhost:7001/ebanking-client/TransactionServiceImplService";
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(TransactionService.class);
		factory.setAddress(endpointAddress);
		TransactionService service = (TransactionService) factory.create();
		System.out.println("connected");
		TransferRequest tf = new TransferRequest();
		TransferResponse responseTf = new TransferResponse();
		tf.setAccountFrom(200L);
		tf.setAccountTo(100L);
		tf.setAmount(5000L);
		tf.setNotes("tester");
		try {
			responseTf = service.kirim(tf);
			System.out.println(responseTf.getErrorMessage() + " " + responseTf.getReferenceNumber());
		} catch (InvalidInputException_Exception e) {
			InvalidInputException invalidInputException = e.getFaultInfo();
			System.out.println("Exception message : " + invalidInputException.getMessage());
			e.printStackTrace();
		}

	}
}
