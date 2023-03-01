package id.co.ogya.client.impl;

import javax.jws.WebMethod;
import javax.jws.WebService;

import id.co.ogya.client.TransferRequest;
import id.co.ogya.client.TransferResponse;
import id.co.ogya.ebanking.ejb.EbankingService;
import id.co.ogya.ebanking.ejb.util.ServiceFactory;
import id.co.ogya.client.InquiryBalanceResponse;
import id.co.ogya.client.InquiryBalanceRequest;


import id.co.ogya.client.InvalidInputException_Exception;
import id.co.ogya.client.TransactionService;

@WebService(endpointInterface = "id.co.ogya.client.TransactionService")
public class TransactionServiceImpl implements TransactionService {
	
	@WebMethod
	public InquiryBalanceResponse cekSaldo(InquiryBalanceRequest inquiryBalanceRequest) throws InvalidInputException_Exception {
		try {
			id.co.ogya.ebanking.ejb.response.InquiryBalanceResponse dataResponse = new id.co.ogya.ebanking.ejb.response.InquiryBalanceResponse();
			id.co.ogya.ebanking.ejb.request.InquiryBalanceRequest data = new id.co.ogya.ebanking.ejb.request.InquiryBalanceRequest();
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
					data.setAccountNo(inquiryBalanceRequest.getAccountNo());
					dataResponse =  ebankingService.cekSaldo(data);
					response.setAccountBalance(dataResponse.getAccountBalance());
					response.setErrorCode(dataResponse.getErrorCode());
					response.setErrorMessage(dataResponse.getErrorMessage());
				} catch (Exception e) {
					throw new InvalidInputException_Exception("error dari backend", e);
				}
			}
			return response;
		} catch (Exception e) {
			throw new InvalidInputException_Exception("error dari backend", e);
		}
	}
	@WebMethod
	public TransferResponse kirim(TransferRequest transferRequest) throws InvalidInputException_Exception{
		TransferResponse response =new TransferResponse();
		id.co.ogya.ebanking.ejb.request.TransferRequest data = new id.co.ogya.ebanking.ejb.request.TransferRequest();
		id.co.ogya.ebanking.ejb.response.TransferResponse dataResponse = new id.co.ogya.ebanking.ejb.response.TransferResponse();
		try {
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
					data.setAccountFrom(transferRequest.getAccountFrom());
					data.setAccountTo(transferRequest.getAccountTo());
					data.setAmount(transferRequest.getAmount());
					data.setNotes(transferRequest.getNotes());
					dataResponse = ebankingService.kirim(data);
					response.setErrorCode(dataResponse.getErrorCode());
					response.setErrorMessage(dataResponse.getErrorMessage());
					response.setReferenceNumber(dataResponse.getReferenceNumber());
				} catch (Exception e) {
					throw new InvalidInputException_Exception("error dari backend", e);
				}
			}
			return response;
		} catch (Exception e) {
			throw new InvalidInputException_Exception("error dari backend", e);
		}
	}
}
