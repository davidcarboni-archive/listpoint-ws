
package uk.co.listpoint.context;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Context6Structure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Context6Structure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Environment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PersistentURLRoot" type="{http://www.listpoint.co.uk/schemas/v6}URL6Type" minOccurs="0"/>
 *         &lt;element name="PersistentURL" type="{http://www.listpoint.co.uk/schemas/v6}URL6Type" minOccurs="0"/>
 *         &lt;element name="ContextName" type="{http://www.listpoint.co.uk/schemas/v6}FullName6Structure"/>
 *         &lt;element name="ContextType" type="{http://www.listpoint.co.uk/schemas/v6}Context6Type"/>
 *         &lt;element name="AdminStatus" type="{http://www.listpoint.co.uk/schemas/v6}AdminStatus6Type" minOccurs="0"/>
 *         &lt;element name="RegistrationStatus" type="{http://www.listpoint.co.uk/schemas/v6}RegistrationStatus6Type" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.listpoint.co.uk/schemas/v6}LongString6Type" minOccurs="0"/>
 *         &lt;element name="UsageGuidelines" type="{http://www.listpoint.co.uk/schemas/v6}LongString6Type" minOccurs="0"/>
 *         &lt;element name="LastChangeDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LastUserName" type="{http://www.listpoint.co.uk/schemas/v6}UserName6Type" minOccurs="0"/>
 *         &lt;element name="PublicationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PublicationPolicy" type="{http://www.listpoint.co.uk/schemas/v6}PublicationPolicy6Type" minOccurs="0"/>
 *         &lt;element name="ChangeReason" type="{http://www.listpoint.co.uk/schemas/v6}ChangeReason6Type" minOccurs="0"/>
 *         &lt;element name="DocumentationURL" type="{http://www.listpoint.co.uk/schemas/v6}URL6Type" minOccurs="0"/>
 *         &lt;element name="OwnerTeam" type="{http://www.listpoint.co.uk/schemas/v6}TeamName6Type"/>
 *         &lt;element name="StewardTeam" type="{http://www.listpoint.co.uk/schemas/v6}TeamName6Type"/>
 *         &lt;element name="RelatedContext" type="{http://www.listpoint.co.uk/schemas/v6}ContextRelationship6Structure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LiveStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LiveEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="NameSpacePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameSpace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WebSiteURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImageURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnumeratedDataType" type="{http://www.listpoint.co.uk/schemas/v6}EnumeratedDataType6Structure" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Context6Structure", namespace = "http://www.listpoint.co.uk/schemas/v6", propOrder = {
    "environment",
    "persistentURLRoot",
    "persistentURL",
    "contextName",
    "contextType",
    "adminStatus",
    "registrationStatus",
    "description",
    "usageGuidelines",
    "lastChangeDate",
    "lastUserName",
    "publicationDate",
    "publicationPolicy",
    "changeReason",
    "documentationURL",
    "ownerTeam",
    "stewardTeam",
    "relatedContext",
    "liveStartDate",
    "liveEndDate",
    "nameSpacePrefix",
    "nameSpace",
    "webSiteURL",
    "imageURL",
    "enumeratedDataType"
})
public class Context6Structure {

    @XmlElement(name = "Environment", required = true)
    protected String environment;
    @XmlElement(name = "PersistentURLRoot")
    protected String persistentURLRoot;
    @XmlElement(name = "PersistentURL")
    protected String persistentURL;
    @XmlElement(name = "ContextName", required = true)
    protected FullName6Structure contextName;
    @XmlElement(name = "ContextType", required = true)
    protected Context6Type contextType;
    @XmlElement(name = "AdminStatus")
    protected String adminStatus;
    @XmlElement(name = "RegistrationStatus")
    protected String registrationStatus;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "UsageGuidelines")
    protected String usageGuidelines;
    @XmlElement(name = "LastChangeDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastChangeDate;
    @XmlElement(name = "LastUserName")
    protected String lastUserName;
    @XmlElement(name = "PublicationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar publicationDate;
    @XmlElement(name = "PublicationPolicy")
    protected String publicationPolicy;
    @XmlElement(name = "ChangeReason")
    protected String changeReason;
    @XmlElement(name = "DocumentationURL")
    protected String documentationURL;
    @XmlElement(name = "OwnerTeam", required = true)
    protected String ownerTeam;
    @XmlElement(name = "StewardTeam", required = true)
    protected String stewardTeam;
    @XmlElement(name = "RelatedContext")
    protected List<ContextRelationship6Structure> relatedContext;
    @XmlElement(name = "LiveStartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar liveStartDate;
    @XmlElement(name = "LiveEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar liveEndDate;
    @XmlElement(name = "NameSpacePrefix")
    protected String nameSpacePrefix;
    @XmlElement(name = "NameSpace")
    protected String nameSpace;
    @XmlElement(name = "WebSiteURL")
    protected String webSiteURL;
    @XmlElement(name = "ImageURL")
    protected String imageURL;
    @XmlElement(name = "EnumeratedDataType")
    protected List<EnumeratedDataType6Structure> enumeratedDataType;

    /**
     * Gets the value of the environment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvironment() {
        return environment;
    }

    /**
     * Sets the value of the environment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvironment(String value) {
        this.environment = value;
    }

    /**
     * Gets the value of the persistentURLRoot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersistentURLRoot() {
        return persistentURLRoot;
    }

    /**
     * Sets the value of the persistentURLRoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersistentURLRoot(String value) {
        this.persistentURLRoot = value;
    }

    /**
     * Gets the value of the persistentURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersistentURL() {
        return persistentURL;
    }

    /**
     * Sets the value of the persistentURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersistentURL(String value) {
        this.persistentURL = value;
    }

    /**
     * Gets the value of the contextName property.
     * 
     * @return
     *     possible object is
     *     {@link FullName6Structure }
     *     
     */
    public FullName6Structure getContextName() {
        return contextName;
    }

    /**
     * Sets the value of the contextName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullName6Structure }
     *     
     */
    public void setContextName(FullName6Structure value) {
        this.contextName = value;
    }

    /**
     * Gets the value of the contextType property.
     * 
     * @return
     *     possible object is
     *     {@link Context6Type }
     *     
     */
    public Context6Type getContextType() {
        return contextType;
    }

    /**
     * Sets the value of the contextType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Context6Type }
     *     
     */
    public void setContextType(Context6Type value) {
        this.contextType = value;
    }

    /**
     * Gets the value of the adminStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminStatus() {
        return adminStatus;
    }

    /**
     * Sets the value of the adminStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminStatus(String value) {
        this.adminStatus = value;
    }

    /**
     * Gets the value of the registrationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationStatus() {
        return registrationStatus;
    }

    /**
     * Sets the value of the registrationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationStatus(String value) {
        this.registrationStatus = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the usageGuidelines property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageGuidelines() {
        return usageGuidelines;
    }

    /**
     * Sets the value of the usageGuidelines property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageGuidelines(String value) {
        this.usageGuidelines = value;
    }

    /**
     * Gets the value of the lastChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastChangeDate() {
        return lastChangeDate;
    }

    /**
     * Sets the value of the lastChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastChangeDate(XMLGregorianCalendar value) {
        this.lastChangeDate = value;
    }

    /**
     * Gets the value of the lastUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUserName() {
        return lastUserName;
    }

    /**
     * Sets the value of the lastUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUserName(String value) {
        this.lastUserName = value;
    }

    /**
     * Gets the value of the publicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublicationDate() {
        return publicationDate;
    }

    /**
     * Sets the value of the publicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublicationDate(XMLGregorianCalendar value) {
        this.publicationDate = value;
    }

    /**
     * Gets the value of the publicationPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationPolicy() {
        return publicationPolicy;
    }

    /**
     * Sets the value of the publicationPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationPolicy(String value) {
        this.publicationPolicy = value;
    }

    /**
     * Gets the value of the changeReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeReason() {
        return changeReason;
    }

    /**
     * Sets the value of the changeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeReason(String value) {
        this.changeReason = value;
    }

    /**
     * Gets the value of the documentationURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentationURL() {
        return documentationURL;
    }

    /**
     * Sets the value of the documentationURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentationURL(String value) {
        this.documentationURL = value;
    }

    /**
     * Gets the value of the ownerTeam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerTeam() {
        return ownerTeam;
    }

    /**
     * Sets the value of the ownerTeam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerTeam(String value) {
        this.ownerTeam = value;
    }

    /**
     * Gets the value of the stewardTeam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStewardTeam() {
        return stewardTeam;
    }

    /**
     * Sets the value of the stewardTeam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStewardTeam(String value) {
        this.stewardTeam = value;
    }

    /**
     * Gets the value of the relatedContext property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedContext property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedContext().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContextRelationship6Structure }
     * 
     * 
     */
    public List<ContextRelationship6Structure> getRelatedContext() {
        if (relatedContext == null) {
            relatedContext = new ArrayList<ContextRelationship6Structure>();
        }
        return this.relatedContext;
    }

    /**
     * Gets the value of the liveStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLiveStartDate() {
        return liveStartDate;
    }

    /**
     * Sets the value of the liveStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLiveStartDate(XMLGregorianCalendar value) {
        this.liveStartDate = value;
    }

    /**
     * Gets the value of the liveEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLiveEndDate() {
        return liveEndDate;
    }

    /**
     * Sets the value of the liveEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLiveEndDate(XMLGregorianCalendar value) {
        this.liveEndDate = value;
    }

    /**
     * Gets the value of the nameSpacePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameSpacePrefix() {
        return nameSpacePrefix;
    }

    /**
     * Sets the value of the nameSpacePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameSpacePrefix(String value) {
        this.nameSpacePrefix = value;
    }

    /**
     * Gets the value of the nameSpace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameSpace() {
        return nameSpace;
    }

    /**
     * Sets the value of the nameSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameSpace(String value) {
        this.nameSpace = value;
    }

    /**
     * Gets the value of the webSiteURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebSiteURL() {
        return webSiteURL;
    }

    /**
     * Sets the value of the webSiteURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebSiteURL(String value) {
        this.webSiteURL = value;
    }

    /**
     * Gets the value of the imageURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageURL() {
        return imageURL;
    }

    /**
     * Sets the value of the imageURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageURL(String value) {
        this.imageURL = value;
    }

    /**
     * Gets the value of the enumeratedDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enumeratedDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnumeratedDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumeratedDataType6Structure }
     * 
     * 
     */
    public List<EnumeratedDataType6Structure> getEnumeratedDataType() {
        if (enumeratedDataType == null) {
            enumeratedDataType = new ArrayList<EnumeratedDataType6Structure>();
        }
        return this.enumeratedDataType;
    }

}
