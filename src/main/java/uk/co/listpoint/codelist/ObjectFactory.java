
package uk.co.listpoint.codelist;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uk.co.listpoint.codelist package. 
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

    private final static QName _CodeListDeleteResponse_QNAME = new QName("http://www.listpoint.co.uk/messages/CodeList", "CodeListDeleteResponse");
    private final static QName _CodeList_QNAME = new QName("http://www.listpoint.co.uk/schemas/v6", "CodeList");
    private final static QName _CodeListStartNewDraftResponse_QNAME = new QName("http://www.listpoint.co.uk/messages/CodeList", "CodeListStartNewDraftResponse");
    private final static QName _CodeListStatusResponse_QNAME = new QName("http://www.listpoint.co.uk/messages/CodeList", "CodeListStatusResponse");
    private final static QName _CodeListUploadResponse_QNAME = new QName("http://www.listpoint.co.uk/messages/CodeList", "CodeListUploadResponse");
    private final static QName _CodeListFindDraftsResponse_QNAME = new QName("http://www.listpoint.co.uk/messages/CodeList", "CodeListFindDraftsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uk.co.listpoint.codelist
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CodeList6Structure }
     * 
     */
    public CodeList6Structure createCodeList6Structure() {
        return new CodeList6Structure();
    }

    /**
     * Create an instance of {@link Team6Structure }
     * 
     */
    public Team6Structure createTeam6Structure() {
        return new Team6Structure();
    }

    /**
     * Create an instance of {@link Level6Structure }
     * 
     */
    public Level6Structure createLevel6Structure() {
        return new Level6Structure();
    }

    /**
     * Create an instance of {@link CVElement6Structure }
     * 
     */
    public CVElement6Structure createCVElement6Structure() {
        return new CVElement6Structure();
    }

    /**
     * Create an instance of {@link CodeListRelationship6Structure }
     * 
     */
    public CodeListRelationship6Structure createCodeListRelationship6Structure() {
        return new CodeListRelationship6Structure();
    }

    /**
     * Create an instance of {@link FullName6Structure }
     * 
     */
    public FullName6Structure createFullName6Structure() {
        return new FullName6Structure();
    }

    /**
     * Create an instance of {@link FindDrafts }
     * 
     */
    public FindDrafts createFindDrafts() {
        return new FindDrafts();
    }

    /**
     * Create an instance of {@link CodeListDeleteResponse }
     * 
     */
    public CodeListDeleteResponse createCodeListDeleteResponse() {
        return new CodeListDeleteResponse();
    }

    /**
     * Create an instance of {@link CodeListDeleteDraftResponse6Type }
     * 
     */
    public CodeListDeleteDraftResponse6Type createCodeListDeleteDraftResponse6Type() {
        return new CodeListDeleteDraftResponse6Type();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
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
     * Create an instance of {@link CodeListStatusResponse }
     * 
     */
    public CodeListStatusResponse createCodeListStatusResponse() {
        return new CodeListStatusResponse();
    }

    /**
     * Create an instance of {@link CodeListStatusResponse6Type }
     * 
     */
    public CodeListStatusResponse6Type createCodeListStatusResponse6Type() {
        return new CodeListStatusResponse6Type();
    }

    /**
     * Create an instance of {@link CodeListUploadResponse }
     * 
     */
    public CodeListUploadResponse createCodeListUploadResponse() {
        return new CodeListUploadResponse();
    }

    /**
     * Create an instance of {@link CodeListUploadResponse6Type }
     * 
     */
    public CodeListUploadResponse6Type createCodeListUploadResponse6Type() {
        return new CodeListUploadResponse6Type();
    }

    /**
     * Create an instance of {@link CodeList }
     * 
     */
    public CodeList createCodeList() {
        return new CodeList();
    }

    /**
     * Create an instance of {@link CodeListStartNewDraftResponse }
     * 
     */
    public CodeListStartNewDraftResponse createCodeListStartNewDraftResponse() {
        return new CodeListStartNewDraftResponse();
    }

    /**
     * Create an instance of {@link CodeListStartNewDraftResponse6Type }
     * 
     */
    public CodeListStartNewDraftResponse6Type createCodeListStartNewDraftResponse6Type() {
        return new CodeListStartNewDraftResponse6Type();
    }

    /**
     * Create an instance of {@link CodeListFindDraftsResponse }
     * 
     */
    public CodeListFindDraftsResponse createCodeListFindDraftsResponse() {
        return new CodeListFindDraftsResponse();
    }

    /**
     * Create an instance of {@link CodeListFindDraftsResponse6Type }
     * 
     */
    public CodeListFindDraftsResponse6Type createCodeListFindDraftsResponse6Type() {
        return new CodeListFindDraftsResponse6Type();
    }

    /**
     * Create an instance of {@link Upload }
     * 
     */
    public Upload createUpload() {
        return new Upload();
    }

    /**
     * Create an instance of {@link CodeListUploadRequest6Type }
     * 
     */
    public CodeListUploadRequest6Type createCodeListUploadRequest6Type() {
        return new CodeListUploadRequest6Type();
    }

    /**
     * Create an instance of {@link Download }
     * 
     */
    public Download createDownload() {
        return new Download();
    }

    /**
     * Create an instance of {@link UploadOptions6Structure }
     * 
     */
    public UploadOptions6Structure createUploadOptions6Structure() {
        return new UploadOptions6Structure();
    }

    /**
     * Create an instance of {@link FullName6Structure2 }
     * 
     */
    public FullName6Structure2 createFullName6Structure2() {
        return new FullName6Structure2();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeListDeleteDraftResponse6Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.listpoint.co.uk/messages/CodeList", name = "CodeListDeleteResponse")
    public JAXBElement<CodeListDeleteDraftResponse6Type> createCodeListDeleteResponse(CodeListDeleteDraftResponse6Type value) {
        return new JAXBElement<CodeListDeleteDraftResponse6Type>(_CodeListDeleteResponse_QNAME, CodeListDeleteDraftResponse6Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeList6Structure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.listpoint.co.uk/schemas/v6", name = "CodeList")
    public JAXBElement<CodeList6Structure> createCodeList(CodeList6Structure value) {
        return new JAXBElement<CodeList6Structure>(_CodeList_QNAME, CodeList6Structure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeListStartNewDraftResponse6Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.listpoint.co.uk/messages/CodeList", name = "CodeListStartNewDraftResponse")
    public JAXBElement<CodeListStartNewDraftResponse6Type> createCodeListStartNewDraftResponse(CodeListStartNewDraftResponse6Type value) {
        return new JAXBElement<CodeListStartNewDraftResponse6Type>(_CodeListStartNewDraftResponse_QNAME, CodeListStartNewDraftResponse6Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeListStatusResponse6Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.listpoint.co.uk/messages/CodeList", name = "CodeListStatusResponse")
    public JAXBElement<CodeListStatusResponse6Type> createCodeListStatusResponse(CodeListStatusResponse6Type value) {
        return new JAXBElement<CodeListStatusResponse6Type>(_CodeListStatusResponse_QNAME, CodeListStatusResponse6Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeListUploadResponse6Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.listpoint.co.uk/messages/CodeList", name = "CodeListUploadResponse")
    public JAXBElement<CodeListUploadResponse6Type> createCodeListUploadResponse(CodeListUploadResponse6Type value) {
        return new JAXBElement<CodeListUploadResponse6Type>(_CodeListUploadResponse_QNAME, CodeListUploadResponse6Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeListFindDraftsResponse6Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.listpoint.co.uk/messages/CodeList", name = "CodeListFindDraftsResponse")
    public JAXBElement<CodeListFindDraftsResponse6Type> createCodeListFindDraftsResponse(CodeListFindDraftsResponse6Type value) {
        return new JAXBElement<CodeListFindDraftsResponse6Type>(_CodeListFindDraftsResponse_QNAME, CodeListFindDraftsResponse6Type.class, null, value);
    }

}
