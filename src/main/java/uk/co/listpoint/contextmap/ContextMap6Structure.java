
package uk.co.listpoint.contextmap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ContextMap6Structure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContextMap6Structure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Environment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PersistentURLRoot" type="{http://www.listpoint.co.uk/schemas/v6}URL6Type" minOccurs="0"/>
 *         &lt;element name="PersistentURL" type="{http://www.listpoint.co.uk/schemas/v6}URL6Type" minOccurs="0"/>
 *         &lt;element name="ContextMapName" type="{http://www.listpoint.co.uk/schemas/v6}FullName6Structure"/>
 *         &lt;element name="ContextMapType" type="{http://www.listpoint.co.uk/schemas/v6}ContextMap6Type" minOccurs="0"/>
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
 *         &lt;element name="RelatedContextMap" type="{http://www.listpoint.co.uk/schemas/v6}ContextMapRelationship6Structure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SourceContextName" type="{http://www.listpoint.co.uk/schemas/v6}FullName6Structure"/>
 *         &lt;element name="TargetContextName" type="{http://www.listpoint.co.uk/schemas/v6}FullName6Structure"/>
 *         &lt;element name="LiveStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LiveEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ContextLink" type="{http://www.listpoint.co.uk/schemas/v6}ContextLink6Structure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CodeMap" type="{http://www.listpoint.co.uk/schemas/v6}CodeMap6Structure" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContextMap6Structure", namespace = "http://www.listpoint.co.uk/schemas/v6", propOrder = {
    "environment",
    "persistentURLRoot",
    "persistentURL",
    "contextMapName",
    "contextMapType",
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
    "relatedContextMap",
    "sourceContextName",
    "targetContextName",
    "liveStartDate",
    "liveEndDate",
    "contextLink",
    "codeMap"
})
public class ContextMap6Structure {

    @XmlElement(name = "Environment", required = true)
    protected String environment;
    @XmlElement(name = "PersistentURLRoot")
    protected String persistentURLRoot;
    @XmlElement(name = "PersistentURL")
    protected String persistentURL;
    @XmlElement(name = "ContextMapName", required = true)
    protected FullName6Structure2 contextMapName;
    @XmlElement(name = "ContextMapType")
    protected ContextMap6Type contextMapType;
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
    @XmlElement(name = "RelatedContextMap")
    protected List<ContextMapRelationship6Structure> relatedContextMap;
    @XmlElement(name = "SourceContextName", required = true)
    protected FullName6Structure2 sourceContextName;
    @XmlElement(name = "TargetContextName", required = true)
    protected FullName6Structure2 targetContextName;
    @XmlElement(name = "LiveStartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar liveStartDate;
    @XmlElement(name = "LiveEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar liveEndDate;
    @XmlElement(name = "ContextLink")
    protected List<ContextLink6Structure> contextLink;
    @XmlElement(name = "CodeMap")
    protected List<CodeMap6Structure> codeMap;

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
     * Gets the value of the contextMapName property.
     * 
     * @return
     *     possible object is
     *     {@link FullName6Structure2 }
     *     
     */
    public FullName6Structure2 getContextMapName() {
        return contextMapName;
    }

    /**
     * Sets the value of the contextMapName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullName6Structure2 }
     *     
     */
    public void setContextMapName(FullName6Structure2 value) {
        this.contextMapName = value;
    }

    /**
     * Gets the value of the contextMapType property.
     * 
     * @return
     *     possible object is
     *     {@link ContextMap6Type }
     *     
     */
    public ContextMap6Type getContextMapType() {
        return contextMapType;
    }

    /**
     * Sets the value of the contextMapType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextMap6Type }
     *     
     */
    public void setContextMapType(ContextMap6Type value) {
        this.contextMapType = value;
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
     * Gets the value of the relatedContextMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedContextMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedContextMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContextMapRelationship6Structure }
     * 
     * 
     */
    public List<ContextMapRelationship6Structure> getRelatedContextMap() {
        if (relatedContextMap == null) {
            relatedContextMap = new ArrayList<ContextMapRelationship6Structure>();
        }
        return this.relatedContextMap;
    }

    /**
     * Gets the value of the sourceContextName property.
     * 
     * @return
     *     possible object is
     *     {@link FullName6Structure2 }
     *     
     */
    public FullName6Structure2 getSourceContextName() {
        return sourceContextName;
    }

    /**
     * Sets the value of the sourceContextName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullName6Structure2 }
     *     
     */
    public void setSourceContextName(FullName6Structure2 value) {
        this.sourceContextName = value;
    }

    /**
     * Gets the value of the targetContextName property.
     * 
     * @return
     *     possible object is
     *     {@link FullName6Structure2 }
     *     
     */
    public FullName6Structure2 getTargetContextName() {
        return targetContextName;
    }

    /**
     * Sets the value of the targetContextName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullName6Structure2 }
     *     
     */
    public void setTargetContextName(FullName6Structure2 value) {
        this.targetContextName = value;
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
     * Gets the value of the contextLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contextLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContextLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContextLink6Structure }
     * 
     * 
     */
    public List<ContextLink6Structure> getContextLink() {
        if (contextLink == null) {
            contextLink = new ArrayList<ContextLink6Structure>();
        }
        return this.contextLink;
    }

    /**
     * Gets the value of the codeMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codeMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodeMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeMap6Structure }
     * 
     * 
     */
    public List<CodeMap6Structure> getCodeMap() {
        if (codeMap == null) {
            codeMap = new ArrayList<CodeMap6Structure>();
        }
        return this.codeMap;
    }

}
