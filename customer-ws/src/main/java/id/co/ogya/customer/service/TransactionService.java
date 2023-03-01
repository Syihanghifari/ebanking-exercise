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
			if (inquiryBalanceRequest.getAccountNo() == 0 || inquiryBalanceRequest.getAccountNo() == null) {
				response.setErrorCode("OGYA-999");
				response.setErrorMessage("Field  account no  harus diisi");
			} else {
				String simpleDataSourceAccessJNDIName = "EbankingServiceImpl#id.co.ogya.ebanking.ejb.EbankingService";
				try {
					ServiceFactory serviceFactory = new ServiceFactory();
					EbankingService ebankingService = (EbankingService) serviceFactory
							.getService(simpleDataSourceAccessJNDIName);
					response = ebankingService.cekSaldo(inquiryBalanceRequest);
				} catch (Exception e) {
					throw new InvalidInputException("error dari backend", " OGYA-999");
				}
			}
			return response;
		} catch (Exception e) {
			throw new InvalidInputException("error dari backend", " OGYA-999");
		}
	}

	@WebMethod
	public TransferResponse kirim(TransferRequest transferRequest) throws InvalidInputException {
		try {
			TransferResponse response = new TransferResponse();
			if (transferRequest.getAccountFrom() == null || transferRequest.getAccountFrom() == 0L) {
				response.setErrorCode("OGYA-999");
				response.setErrorMessage("Field account from harus diisi");
			} else if (transferRequest.getAccountTo() == null || transferRequest.getAccountTo() == 0L) {
				response.setErrorCode("OGYA-999");
				response.setErrorMessage("Field account to harus diisi");
			} else if (transferRequest.getAmount() == null || transferRequest.getAmount() == 0L) {
				response.setErrorCode("OGYA-999");
				response.setErrorMessage("Field amount harus diisi");
			} else {
				String simpleDataSourceAccessJNDIName = "EbankingServiceImpl#id.co.ogya.ebanking.ejb.EbankingService";
				try {
					ServiceFactory serviceFactory = new ServiceFactory();
					EbankingService ebankingService = (EbankingService) serviceFactory
							.getService(simpleDataSourceAccessJNDIName);
					response = ebankingService.kirim(transferRequest);
				} catch (Exception e) {
					throw new InvalidInputException("error dari backend", " OGYA-999");
				}
			}
			return response;
		} catch (Exception e) {
			throw new InvalidInputException("error dari backend", " OGYA-999");
		}
	}
	
}
