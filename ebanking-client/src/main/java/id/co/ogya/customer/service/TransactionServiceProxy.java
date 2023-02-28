package id.co.ogya.customer.service;

public class TransactionServiceProxy implements id.co.ogya.customer.service.TransactionService {
  private String _endpoint = null;
  private id.co.ogya.customer.service.TransactionService transactionService = null;
  
  public TransactionServiceProxy() {
    _initTransactionServiceProxy();
  }
  
  public TransactionServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initTransactionServiceProxy();
  }
  
  private void _initTransactionServiceProxy() {
    try {
      transactionService = (new id.co.ogya.customer.service.TransactionServiceServiceLocator()).getTransactionServicePort();
      if (transactionService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)transactionService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)transactionService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (transactionService != null)
      ((javax.xml.rpc.Stub)transactionService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public id.co.ogya.customer.service.TransactionService getTransactionService() {
    if (transactionService == null)
      _initTransactionServiceProxy();
    return transactionService;
  }
  
  public id.co.ogya.customer.service.TransferResponse kirim(id.co.ogya.customer.service.TransferRequest arg0) throws java.rmi.RemoteException, id.co.ogya.customer.service.InvalidInputException{
    if (transactionService == null)
      _initTransactionServiceProxy();
    return transactionService.kirim(arg0);
  }
  
  public id.co.ogya.customer.service.InquiryBalanceResponse cekSaldo(id.co.ogya.customer.service.InquiryBalanceRequest arg0) throws java.rmi.RemoteException, id.co.ogya.customer.service.InvalidInputException{
    if (transactionService == null)
      _initTransactionServiceProxy();
    return transactionService.cekSaldo(arg0);
  }
  
  
}