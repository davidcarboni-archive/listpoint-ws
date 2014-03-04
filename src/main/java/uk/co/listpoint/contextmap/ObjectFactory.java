
package uk.co.listpoint.contextmap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uk.co.listpoint.contextmap package. 
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

    private final static QName _ContextMap_QNAME = new QName("http://www.listpoint.co.uk/schemas/v6", "ContextMap");
    private final static QName _ContextMapStatusResponse_QNAME = new QName("http://www.listpoint.co.uk/messages/ContextMap", "ContextMapStatusResponse");
    private final static QName _ContextMapDeleteResponse_QNAME = new QName("http://www.listpoint.co.uk/messages/ContextMap", "ContextMapDeleteResponse");
    private final static QName _ContextMapStartNewDraftResponse_QNAME = new QName("http://www.listpoint.co.uk/messages/ContextMap", "ContextMapStartNewDraftResponse");
    private final static QName _ContextMapFindDraftsResponse_QNAME = new QName("http://www.listpoint.co.uk/messages/ContextMap", "ContextMapFindDraftsResponse");
    private final static QName _ContextMapUploadResponse_QNAME = new QName("http://www.listpoint.co.uk/messages/ContextMap", "ContextMapUploadResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uk.co.listpoint.contextmap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ContextMapDeleteDraftResponse6Type }
     * 
     */
    public ContextMapDeleteDraftResponse6Type createContextMapDeleteDraftResponse6Type() {
        return new ContextMapDeleteDraftResponse6Type();
    }

    /**
     * Create an instance of {@link ContextMapStatusResponse6Type }
     * 
     */
    public ContextMapStatusResponse6Type createContextMapStatusResponse6Type() {
        return new ContextMapStatusResponse6Type();
    }

    /**
     * Create an instance of {@link ContextMapUploadResponse6Type }
     * 
     */
    public ContextMapUploadResponse6Type createContextMapUploadResponse6Type() {
        return new ContextMapUploadResponse6Type();
    }

    /**
     * Create an instance of {@link ContextMapFindDraftsResponse6Type }
     * 
     */
    public ContextMapFindDraftsResponse6Type createContextMapFindDraftsResponse6Type() {
        return new ContextMapFindDraftsResponse6Type();
    }

    /**
     * Create an instance of {@link ContextMapStartNewDraftResponse6Type }
     * 
     */
    public ContextMapStartNewDraftResponse6Type createContextMapStartNewDraftResponse6Type() {
        return new ContextMapStartNewDraftResponse6Type();
    }

    /**
     * Create an instance of {@link ContextMapUploadRequest6Type }
     * 
     */
    public ContextMapUploadRequest6Type createContextMapUploadRequest6Type() {
        return new ContextMapUploadRequest6Type();
    }

    /**
     * Create an instance of {@link FullName6Structure }
     * 
     */
    public FullName6Structure createFullName6Structure() {
        return new FullName6Structure();
    }

    /**
     * Create an instance of {@link ContextMap6Structure }
     * 
     */
    public ContextMap6Structure createContextMap6Structure() {
        return new ContextMap6Structure();
    }

    /**
     * Create an instance of {@link Team6Structure }
     * 
     */
    public Team6Structure createTeam6Structure() {
        return new Team6Structure();
    }

    /**
     * Create an instance of {@link CodeMap6Structure }
     * 
     */
    public CodeMap6Structure createCodeMap6Structure() {
        return new CodeMap6Structure();
    }

    /**
     * Create an instance of {@link FullName6Structure2 }
     * 
     */
    public FullName6Structure2 createFullName6Structure2() {
        return new FullName6Structure2();
    }

    /**
     * Create an instance of {@link CodeListLevel6Structure }
     * 
     */
    public CodeListLevel6Structure createCodeListLevel6Structure() {
        return new CodeListLevel6Structure();
    }

    /**
     * Create an instance of {@link ContextMapRelationship6Structure }
     * 
     */
    public ContextMapRelationship6Structure createContextMapRelationship6Structure() {
        return new ContextMapRelationship6Structure();
    }

    /**
     * Create an instance of {@link CVMapping6Structure }
     * 
     */
    public CVMapping6Structure createCVMapping6Structure() {
        return new CVMapping6Structure();
    }

    /**
     * Create an instance of {@link ContextLink6Structure }
     * 
     */
    public ContextLink6Structure createContextLink6Structure() {
        return new ContextLink6Structure();
    }

    /**
     * Create an instance of {@link FindDrafts }
     * 
     */
    public FindDrafts createFindDrafts() {
        return new FindDrafts();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link ContextMapDeleteResponse }
     * 
     */
    public ContextMapDeleteResponse createContextMapDeleteResponse() {
        return new ContextMapDeleteResponse();
    }

    /**
     * Create an instance of {@link DeleteDraft }
     * 
     */
    public DeleteDraft createDeleteDraft() {
        return new DeleteDraft();
    }

    /**
     * Create an instance of {@link StartNewDraft }
     * 
     */
    public StartNewDraft createStartNewDraft() {
        return new StartNewDraft();
    }

    /**
     * Create an instance of {@link ContextMapStatusResponse }
     * 
     */
    public ContextMapStatusResponse createContextMapStatusResponse() {
        return new ContextMapStatusResponse();
    }

    /**
     * Create an instance of {@link ContextMapUploadResponse }
     * 
     */
    public ContextMapUploadResponse createContextMapUploadResponse() {
        return new ContextMapUploadResponse();
    }

    /**
     * Create an instance of {@link ContextMapFindDraftsResponse }
     * 
     */
    public ContextMapFindDraftsResponse createContextMapFindDraftsResponse() {
        return new ContextMapFindDraftsResponse();
    }

    /**
     * Create an instance of {@link ContextMapStartNewDraftResponse }
     * 
     */
    public ContextMapStartNewDraftResponse createContextMapStartNewDraftResponse() {
        return new ContextMapStartNewDraftResponse();
    }

    /**
     * Create an instance of {@link ContextMap }
     * 
     */
    public ContextMap createContextMap() {
        return new ContextMap();
    }

    /**
     * Create an instance of {@link Upload }
     * 
     */
    public Upload createUpload() {
        return new Upload();
    }

    /**
     * Create an instance of {@link Download }
     * 
     */
    public Download createDownload() {
        return new Download();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContextMap6Structure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.listpoint.co.uk/schemas/v6", name = "ContextMap")
    public JAXBElement<ContextMap6Structure> createContextMap(ContextMap6Structure value) {
        return new JAXBElement<ContextMap6Structure>(_ContextMap_QNAME, ContextMap6Structure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContextMapStatusResponse6Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.listpoint.co.uk/messages/ContextMap", name = "ContextMapStatusResponse")
    public JAXBElement<ContextMapStatusResponse6Type> createContextMapStatusResponse(ContextMapStatusResponse6Type value) {
        return new JAXBElement<ContextMapStatusResponse6Type>(_ContextMapStatusResponse_QNAME, ContextMapStatusResponse6Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContextMapDeleteDraftResponse6Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.listpoint.co.uk/messages/ContextMap", name = "ContextMapDeleteResponse")
    public JAXBElement<ContextMapDeleteDraftResponse6Type> createContextMapDeleteResponse(ContextMapDeleteDraftResponse6Type value) {
        return new JAXBElement<ContextMapDeleteDraftResponse6Type>(_ContextMapDeleteResponse_QNAME, ContextMapDeleteDraftResponse6Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContextMapStartNewDraftResponse6Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.listpoint.co.uk/messages/ContextMap", name = "ContextMapStartNewDraftResponse")
    public JAXBElement<ContextMapStartNewDraftResponse6Type> createContextMapStartNewDraftResponse(ContextMapStartNewDraftResponse6Type value) {
        return new JAXBElement<ContextMapStartNewDraftResponse6Type>(_ContextMapStartNewDraftResponse_QNAME, ContextMapStartNewDraftResponse6Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContextMapFindDraftsResponse6Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.listpoint.co.uk/messages/ContextMap", name = "ContextMapFindDraftsResponse")
    public JAXBElement<ContextMapFindDraftsResponse6Type> createContextMapFindDraftsResponse(ContextMapFindDraftsResponse6Type value) {
        return new JAXBElement<ContextMapFindDraftsResponse6Type>(_ContextMapFindDraftsResponse_QNAME, ContextMapFindDraftsResponse6Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContextMapUploadResponse6Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.listpoint.co.uk/messages/ContextMap", name = "ContextMapUploadResponse")
    public JAXBElement<ContextMapUploadResponse6Type> createContextMapUploadResponse(ContextMapUploadResponse6Type value) {
        return new JAXBElement<ContextMapUploadResponse6Type>(_ContextMapUploadResponse_QNAME, ContextMapUploadResponse6Type.class, null, value);
    }

}
