
package uk.co.listpoint.codelist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CodeList6Structure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodeList6Structure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Environment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PersistentURLRoot" type="{http://www.listpoint.co.uk/schemas/v6}URL6Type" minOccurs="0"/>
 *         &lt;element name="PersistentURL" type="{http://www.listpoint.co.uk/schemas/v6}URL6Type" minOccurs="0"/>
 *         &lt;element name="CodeListName" type="{http://www.listpoint.co.uk/schemas/v6}FullName6Structure"/>
 *         &lt;element name="CodeListType" type="{http://www.listpoint.co.uk/schemas/v6}CodeList6Type"/>
 *         &lt;element name="AdminStatus" type="{http://www.listpoint.co.uk/schemas/v6}AdminStatus6Type" minOccurs="0"/>
 *         &lt;element name="RegistrationStatus" type="{http://www.listpoint.co.uk/schemas/v6}RegistrationStatus6Type" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.listpoint.co.uk/schemas/v6}LongString6Type" minOccurs="0"/>
 *         &lt;element name="UsageGuidelines" type="{http://www.listpoint.co.uk/schemas/v6}LongString6Type" minOccurs="0"/>
 *         &lt;element name="LastChangeDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LastUserName" type="{http://www.listpoint.co.uk/schemas/v6}UserName6Type" minOccurs="0"/>
 *         &lt;element name="PublicationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PublicationPolicy" type="{http://www.listpoint.co.uk/schemas/v6}PublicationPolicy6Type" minOccurs="0"/>
 *         &lt;element name="ChangeReason" type="{http://www.listpoint.co.uk/schemas/v6}ChangeReason6Type" minOccurs="0"/>
 *         &lt;element name="DataSourceURL" type="{http://www.listpoint.co.uk/schemas/v6}URL6Type" minOccurs="0"/>
 *         &lt;element name="OwnerTeam" type="{http://www.listpoint.co.uk/schemas/v6}TeamName6Type" minOccurs="0"/>
 *         &lt;element name="StewardTeam" type="{http://www.listpoint.co.uk/schemas/v6}TeamName6Type" minOccurs="0"/>
 *         &lt;element name="RelatedCodeList" type="{http://www.listpoint.co.uk/schemas/v6}CodeListRelationship6Structure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AllowDoubleSpacesInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AllowDuplicateMeaningsInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AllowEmptyMeaningsInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AllowNonAlphaNumFirstCharInMeaningsInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ValidationErrorCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Level" type="{http://www.listpoint.co.uk/schemas/v6}Level6Structure" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeList6Structure", namespace = "http://www.listpoint.co.uk/schemas/v6", propOrder = {
    "environment",
    "persistentURLRoot",
    "persistentURL",
    "codeListName",
    "codeListType",
    "adminStatus",
    "registrationStatus",
    "description",
    "usageGuidelines",
    "lastChangeDate",
    "lastUserName",
    "publicationDate",
    "publicationPolicy",
    "changeReason",
    "dataSourceURL",
    "ownerTeam",
    "stewardTeam",
    "relatedCodeList",
    "allowDoubleSpacesInd",
    "allowDuplicateMeaningsInd",
    "allowEmptyMeaningsInd",
    "allowNonAlphaNumFirstCharInMeaningsInd",
    "validationErrorCount",
    "level"
})
public class CodeList6Structure {

    @XmlElement(name = "Environment", required = true)
    protected String environment;
    @XmlElement(name = "PersistentURLRoot")
    protected String persistentURLRoot;
    @XmlElement(name = "PersistentURL")
    protected String persistentURL;
    @XmlElement(name = "CodeListName", required = true)
    protected FullName6Structure codeListName;
    @XmlElement(name = "CodeListType", required = true)
    protected CodeList6Type codeListType;
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
    @XmlElement(name = "DataSourceURL")
    protected String dataSourceURL;
    @XmlElement(name = "OwnerTeam")
    protected String ownerTeam;
    @XmlElement(name = "StewardTeam")
    protected String stewardTeam;
    @XmlElement(name = "RelatedCodeList")
    protected List<CodeListRelationship6Structure> relatedCodeList;
    @XmlElement(name = "AllowDoubleSpacesInd")
    protected boolean allowDoubleSpacesInd;
    @XmlElement(name = "AllowDuplicateMeaningsInd")
    protected boolean allowDuplicateMeaningsInd;
    @XmlElement(name = "AllowEmptyMeaningsInd")
    protected boolean allowEmptyMeaningsInd;
    @XmlElement(name = "AllowNonAlphaNumFirstCharInMeaningsInd")
    protected boolean allowNonAlphaNumFirstCharInMeaningsInd;
    @XmlElement(name = "ValidationErrorCount")
    protected Integer validationErrorCount;
    @XmlElement(name = "Level")
    protected List<Level6Structure> level;

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
     * Gets the value of the codeListName property.
     * 
     * @return
     *     possible object is
     *     {@link FullName6Structure }
     *     
     */
    public FullName6Structure getCodeListName() {
        return codeListName;
    }

    /**
     * Sets the value of the codeListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullName6Structure }
     *     
     */
    public void setCodeListName(FullName6Structure value) {
        this.codeListName = value;
    }

    /**
     * Gets the value of the codeListType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeList6Type }
     *     
     */
    public CodeList6Type getCodeListType() {
        return codeListType;
    }

    /**
     * Sets the value of the codeListType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeList6Type }
     *     
     */
    public void setCodeListType(CodeList6Type value) {
        this.codeListType = value;
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
     * Gets the value of the dataSourceURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSourceURL() {
        return dataSourceURL;
    }

    /**
     * Sets the value of the dataSourceURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSourceURL(String value) {
        this.dataSourceURL = value;
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
     * Gets the value of the relatedCodeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedCodeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedCodeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeListRelationship6Structure }
     * 
     * 
     */
    public List<CodeListRelationship6Structure> getRelatedCodeList() {
        if (relatedCodeList == null) {
            relatedCodeList = new ArrayList<CodeListRelationship6Structure>();
        }
        return this.relatedCodeList;
    }

    /**
     * Gets the value of the allowDoubleSpacesInd property.
     * 
     */
    public boolean isAllowDoubleSpacesInd() {
        return allowDoubleSpacesInd;
    }

    /**
     * Sets the value of the allowDoubleSpacesInd property.
     * 
     */
    public void setAllowDoubleSpacesInd(boolean value) {
        this.allowDoubleSpacesInd = value;
    }

    /**
     * Gets the value of the allowDuplicateMeaningsInd property.
     * 
     */
    public boolean isAllowDuplicateMeaningsInd() {
        return allowDuplicateMeaningsInd;
    }

    /**
     * Sets the value of the allowDuplicateMeaningsInd property.
     * 
     */
    public void setAllowDuplicateMeaningsInd(boolean value) {
        this.allowDuplicateMeaningsInd = value;
    }

    /**
     * Gets the value of the allowEmptyMeaningsInd property.
     * 
     */
    public boolean isAllowEmptyMeaningsInd() {
        return allowEmptyMeaningsInd;
    }

    /**
     * Sets the value of the allowEmptyMeaningsInd property.
     * 
     */
    public void setAllowEmptyMeaningsInd(boolean value) {
        this.allowEmptyMeaningsInd = value;
    }

    /**
     * Gets the value of the allowNonAlphaNumFirstCharInMeaningsInd property.
     * 
     */
    public boolean isAllowNonAlphaNumFirstCharInMeaningsInd() {
        return allowNonAlphaNumFirstCharInMeaningsInd;
    }

    /**
     * Sets the value of the allowNonAlphaNumFirstCharInMeaningsInd property.
     * 
     */
    public void setAllowNonAlphaNumFirstCharInMeaningsInd(boolean value) {
        this.allowNonAlphaNumFirstCharInMeaningsInd = value;
    }

    /**
     * Gets the value of the validationErrorCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValidationErrorCount() {
        return validationErrorCount;
    }

    /**
     * Sets the value of the validationErrorCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValidationErrorCount(Integer value) {
        this.validationErrorCount = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the level property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Level6Structure }
     * 
     * 
     */
    public List<Level6Structure> getLevel() {
        if (level == null) {
            level = new ArrayList<Level6Structure>();
        }
        return this.level;
    }

}
