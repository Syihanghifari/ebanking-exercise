package id.co.ogya.soap.app;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import id.co.ogya.soap.InquiryBalanceRequest;
import id.co.ogya.soap.InquiryBalanceResponse;
import id.co.ogya.soap.InvalidInputException_Exception;
import id.co.ogya.soap.TransactionService;
import id.co.ogya.soap.TransferRequest;
import id.co.ogya.soap.TransferResponse;

public class TestApp {
	public static void main(String[] args) throws InvalidInputException_Exception {
		final String endpointAddress = "http://localhost:7001/ebanking-client/TransactionServiceImplService";
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(TransactionService.class);
		factory.setAddress(endpointAddress);
		InquiryBalanceRequest data = new InquiryBalanceRequest();
		InquiryBalanceResponse response = new InquiryBalanceResponse();
		TransactionService service = (TransactionService) factory.create();
		System.out.println("connected");
		data.setAccountNo(200L);
		response = service.cekSaldo(data);
		System.out.println( response.getErrorMessage() +" "+ response.getAccountBalance());
		TransferRequest tf = new TransferRequest();
		TransferResponse responseTf = new TransferResponse();
		tf.setAccountFrom(200L);
		tf.setAccountTo(100L);
		tf.setAmount(50000L);
		tf.setNotes("tester");
		responseTf = service.kirim(tf);
		System.out.println( responseTf.getErrorMessage() + " " + responseTf.getReferenceNumber());
		response = service.cekSaldo(data);
		System.out.println(response.getAccountBalance());
	}
}
