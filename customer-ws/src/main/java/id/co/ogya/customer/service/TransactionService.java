package id.co.ogya.customer.service;

import javax.jws.WebMethod;
import javax.jws.WebService;


import id.co.ogya.ebanking.ejb.request.TransferRequest;

import id.co.ogya.ebanking.ejb.response.TransferResponse;
import id.co.ogya.ebanking.ejb.EbankingService;
import id.co.ogya.ebanking.ejb.util.ServiceFactory;
import id.co.ogya.ebanking.ejb.response.InquiryBalanceResponse;
import id.co.ogya.ebanking.ejb.request.InquiryBalanceRequest;

@WebService
public class TransactionService {
	
	
	
	@WebMethod
	public InquiryBalanceResponse cekSaldo(InquiryBalanceRequest inquiryBalanceRequest) throws InvalidInputException {
		try {
			InquiryBalanceResponse response = new InquiryBalanceResponse();
			if(inquiryBalanceRequest.getAccountNo() <= 0) {
				throw new InvalidInputException("Field <account no> harus diisi", " OGYA-999");
			}else {
				String simpleDataSourceAccessJNDIName =
						"EbankingServiceImpl#id.co.ogya.ebanking.ejb.EbankingService";
				try {
					
					
					ServiceFactory serviceFactory = new ServiceFactory();
					EbankingService ebankingService = (EbankingService) serviceFactory.getService(simpleDataSourceAccessJNDIName);
					boolean isAbleToConnect = ebankingService.isConnected();
					System.out.println("is Able to connect " + isAbleToConnect);
					response = ebankingService.cekSaldo(inquiryBalanceRequest);
					
				}catch(Exception e) {
					throw new InvalidInputException("error dari backend", " OGYA-999");
				}
			}
			return response;
		}catch(Exception e) {
			throw new InvalidInputException("error dari backend", " OGYA-999");
		}
	}
	
	@WebMethod
	public TransferResponse kirim(TransferRequest transferRequest) throws InvalidInputException {
		TransferResponse response = new TransferResponse();
		if (transferRequest.getAccountFrom().equals(null)) {
			throw new InvalidInputException("Field <account from> harus diisi", " OGYA-999");
		} else if (transferRequest.getAccountTo().equals(null)) {
			throw new InvalidInputException("Field <account to> harus diisi", " OGYA-999");
		} else if (transferRequest.getAmount().equals(null) || transferRequest.getAmount().equals(0L)) {
			throw new InvalidInputException("Field <amount> harus diisi", " OGYA-999");
		} else {
			String simpleDataSourceAccessJNDIName =
					"EbankingServiceImpl#id.co.ogya.ebanking.ejb.EbankingService";
			try {
				ServiceFactory serviceFactory = new ServiceFactory();
				EbankingService ebankingService = (EbankingService) serviceFactory.getService(simpleDataSourceAccessJNDIName);
				boolean isAbleToConnect = ebankingService.isConnected();
				System.out.println("is Able to connect " + isAbleToConnect);
				response = ebankingService.kirim(transferRequest);
			} catch (Exception e) {
				throw new InvalidInputException("error dari backend", " OGYA-999");
			}
		}
		return response;
	}
}
