
package id.co.ogya.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the id.co.ogya.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CekSaldo_QNAME = new QName("http://service.customer.ogya.co.id/", "cekSaldo");
    private final static QName _CekSaldoResponse_QNAME = new QName("http://service.customer.ogya.co.id/", "cekSaldoResponse");
    private final static QName _InvalidInputException_QNAME = new QName("http://service.customer.ogya.co.id/", "InvalidInputException");
    private final static QName _Kirim_QNAME = new QName("http://service.customer.ogya.co.id/", "kirim");
    private final static QName _KirimResponse_QNAME = new QName("http://service.customer.ogya.co.id/", "kirimResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: id.co.ogya.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CekSaldo }
     * 
     */
    public CekSaldo createCekSaldo() {
        return new CekSaldo();
    }

    /**
     * Create an instance of {@link CekSaldoResponse }
     * 
     */
    public CekSaldoResponse createCekSaldoResponse() {
        return new CekSaldoResponse();
    }

    /**
     * Create an instance of {@link InvalidInputException }
     * 
     */
    public InvalidInputException createInvalidInputException() {
        return new InvalidInputException();
    }

    /**
     * Create an instance of {@link Kirim }
     * 
     */
    public Kirim createKirim() {
        return new Kirim();
    }

    /**
     * Create an instance of {@link KirimResponse }
     * 
     */
    public KirimResponse createKirimResponse() {
        return new KirimResponse();
    }

    /**
     * Create an instance of {@link InquiryBalanceRequest }
     * 
     */
    public InquiryBalanceRequest createInquiryBalanceRequest() {
        return new InquiryBalanceRequest();
    }

    /**
     * Create an instance of {@link InquiryBalanceResponse }
     * 
     */
    public InquiryBalanceResponse createInquiryBalanceResponse() {
        return new InquiryBalanceResponse();
    }

    /**
     * Create an instance of {@link TransferRequest }
     * 
     */
    public TransferRequest createTransferRequest() {
        return new TransferRequest();
    }

    /**
     * Create an instance of {@link TransferResponse }
     * 
     */
    public TransferResponse createTransferResponse() {
        return new TransferResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CekSaldo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CekSaldo }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.customer.ogya.co.id/", name = "cekSaldo")
    public JAXBElement<CekSaldo> createCekSaldo(CekSaldo value) {
        return new JAXBElement<CekSaldo>(_CekSaldo_QNAME, CekSaldo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CekSaldoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CekSaldoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.customer.ogya.co.id/", name = "cekSaldoResponse")
    public JAXBElement<CekSaldoResponse> createCekSaldoResponse(CekSaldoResponse value) {
        return new JAXBElement<CekSaldoResponse>(_CekSaldoResponse_QNAME, CekSaldoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidInputException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InvalidInputException }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.customer.ogya.co.id/", name = "InvalidInputException")
    public JAXBElement<InvalidInputException> createInvalidInputException(InvalidInputException value) {
        return new JAXBElement<InvalidInputException>(_InvalidInputException_QNAME, InvalidInputException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Kirim }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Kirim }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.customer.ogya.co.id/", name = "kirim")
    public JAXBElement<Kirim> createKirim(Kirim value) {
        return new JAXBElement<Kirim>(_Kirim_QNAME, Kirim.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KirimResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KirimResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.customer.ogya.co.id/", name = "kirimResponse")
    public JAXBElement<KirimResponse> createKirimResponse(KirimResponse value) {
        return new JAXBElement<KirimResponse>(_KirimResponse_QNAME, KirimResponse.class, null, value);
    }

}
