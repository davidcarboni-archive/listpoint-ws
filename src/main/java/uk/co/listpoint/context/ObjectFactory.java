
package uk.co.listpoint.context;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uk.co.listpoint.context package. 
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

    private final static QName _ContextStatusResponse_QNAME = new QName("http://www.listpoint.co.uk/messages/Context", "ContextStatusResponse");
    private final static QName _ContextFindDraftsResponse_QNAME = new QName("http://www.listpoint.co.uk/messages/Context", "ContextFindDraftsResponse");
    private final static QName _ContextDeleteResponse_QNAME = new QName("http://www.listpoint.co.uk/messages/Context", "ContextDeleteResponse");
    private final static QName _ContextUploadResponse_QNAME = new QName("http://www.listpoint.co.uk/messages/Context", "ContextUploadResponse");
    private final static QName _Context_QNAME = new QName("http://www.listpoint.co.uk/schemas/v6", "Context");
    private final static QName _ContextStartNewDraftResponse_QNAME = new QName("http://www.listpoint.co.uk/messages/Context", "ContextStartNewDraftResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uk.co.listpoint.context
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link ContextFindDraftsResponse }
     * 
     */
    public ContextFindDraftsResponse createContextFindDraftsResponse() {
        return new ContextFindDraftsResponse();
    }

    /**
     * Create an instance of {@link ContextFindDraftsResponse6Type }
     * 
     */
    public ContextFindDraftsResponse6Type createContextFindDraftsResponse6Type() {
        return new ContextFindDraftsResponse6Type();
    }

    /**
     * Create an instance of {@link ContextStatusResponse }
     * 
     */
    public ContextStatusResponse createContextStatusResponse() {
        return new ContextStatusResponse();
    }

    /**
     * Create an instance of {@link ContextStatusResponse6Type }
     * 
     */
    public ContextStatusResponse6Type createContextStatusResponse6Type() {
        return new ContextStatusResponse6Type();
    }

    /**
     * Create an instance of {@link Context }
     * 
     */
    public Context createContext() {
        return new Context();
    }

    /**
     * Create an instance of {@link Context6Structure }
     * 
     */
    public Context6Structure createContext6Structure() {
        return new Context6Structure();
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
     * Create an instance of {@link ContextDeleteResponse }
     * 
     */
    public ContextDeleteResponse createContextDeleteResponse() {
        return new ContextDeleteResponse();
    }

    /**
     * Create an instance of {@link ContextDeleteDraftResponse6Type }
     * 
     */
    public ContextDeleteDraftResponse6Type createContextDeleteDraftResponse6Type() {
        return new ContextDeleteDraftResponse6Type();
    }

    /**
     * Create an instance of {@link ContextUploadResponse }
     * 
     */
    public ContextUploadResponse createContextUploadResponse() {
        return new ContextUploadResponse();
    }

    /**
     * Create an instance of {@link ContextUploadResponse6Type }
     * 
     */
    public ContextUploadResponse6Type createContextUploadResponse6Type() {
        return new ContextUploadResponse6Type();
    }

    /**
     * Create an instance of {@link Upload }
     * 
     */
    public Upload createUpload() {
        return new Upload();
    }

    /**
     * Create an instance of {@link ContextUploadRequest6Type }
     * 
     */
    public ContextUploadRequest6Type createContextUploadRequest6Type() {
        return new ContextUploadRequest6Type();
    }

    /**
     * Create an instance of {@link ContextStartNewDraftResponse }
     * 
     */
    public ContextStartNewDraftResponse createContextStartNewDraftResponse() {
        return new ContextStartNewDraftResponse();
    }

    /**
     * Create an instance of {@link ContextStartNewDraftResponse6Type }
     * 
     */
    public ContextStartNewDraftResponse6Type createContextStartNewDraftResponse6Type() {
        return new ContextStartNewDraftResponse6Type();
    }

    /**
     * Create an instance of {@link Download }
     * 
     */
    public Download createDownload() {
        return new Download();
    }

    /**
     * Create an instance of {@link Team6Structure }
     * 
     */
    public Team6Structure createTeam6Structure() {
        return new Team6Structure();
    }

    /**
     * Create an instance of {@link EnumeratedDataType6Structure }
     * 
     */
    public EnumeratedDataType6Structure createEnumeratedDataType6Structure() {
        return new EnumeratedDataType6Structure();
    }

    /**
     * Create an instance of {@link FullName6Structure }
     * 
     */
    public FullName6Structure createFullName6Structure() {
        return new FullName6Structure();
    }

    /**
     * Create an instance of {@link ContextRelationship6Structure }
     * 
     */
    public ContextRelationship6Structure createContextRelationship6Structure() {
        return new ContextRelationship6Structure();
    }

    /**
     * Create an instance of {@link ConstrainedValue6Structure }
     * 
     */
    public ConstrainedValue6Structure createConstrainedValue6Structure() {
        return new ConstrainedValue6Structure();
    }

    /**
     * Create an instance of {@link FullName6Structure2 }
     * 
     */
    public FullName6Structure2 createFullName6Structure2() {
        return new FullName6Structure2();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContextStatusResponse6Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.listpoint.co.uk/messages/Context", name = "ContextStatusResponse")
    public JAXBElement<ContextStatusResponse6Type> createContextStatusResponse(ContextStatusResponse6Type value) {
        return new JAXBElement<ContextStatusResponse6Type>(_ContextStatusResponse_QNAME, ContextStatusResponse6Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContextFindDraftsResponse6Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.listpoint.co.uk/messages/Context", name = "ContextFindDraftsResponse")
    public JAXBElement<ContextFindDraftsResponse6Type> createContextFindDraftsResponse(ContextFindDraftsResponse6Type value) {
        return new JAXBElement<ContextFindDraftsResponse6Type>(_ContextFindDraftsResponse_QNAME, ContextFindDraftsResponse6Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContextDeleteDraftResponse6Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.listpoint.co.uk/messages/Context", name = "ContextDeleteResponse")
    public JAXBElement<ContextDeleteDraftResponse6Type> createContextDeleteResponse(ContextDeleteDraftResponse6Type value) {
        return new JAXBElement<ContextDeleteDraftResponse6Type>(_ContextDeleteResponse_QNAME, ContextDeleteDraftResponse6Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContextUploadResponse6Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.listpoint.co.uk/messages/Context", name = "ContextUploadResponse")
    public JAXBElement<ContextUploadResponse6Type> createContextUploadResponse(ContextUploadResponse6Type value) {
        return new JAXBElement<ContextUploadResponse6Type>(_ContextUploadResponse_QNAME, ContextUploadResponse6Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Context6Structure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.listpoint.co.uk/schemas/v6", name = "Context")
    public JAXBElement<Context6Structure> createContext(Context6Structure value) {
        return new JAXBElement<Context6Structure>(_Context_QNAME, Context6Structure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContextStartNewDraftResponse6Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.listpoint.co.uk/messages/Context", name = "ContextStartNewDraftResponse")
    public JAXBElement<ContextStartNewDraftResponse6Type> createContextStartNewDraftResponse(ContextStartNewDraftResponse6Type value) {
        return new JAXBElement<ContextStartNewDraftResponse6Type>(_ContextStartNewDraftResponse_QNAME, ContextStartNewDraftResponse6Type.class, null, value);
    }

}
