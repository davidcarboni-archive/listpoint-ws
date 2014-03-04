
package uk.co.listpoint.context;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ContextStatusResponse6Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContextStatusResponse6Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContextName" type="{http://www.listpoint.co.uk/messages/Context}FullName6Structure" minOccurs="0"/>
 *         &lt;element name="AdminItemStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdminItemType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsOwned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OwnerTeam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsStewarded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="StewardTeam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersistentURLRoot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UsageGuidelines" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PublicationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PublicationPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastChangeDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ChangeReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContextStatusResponse6Type", namespace = "http://www.listpoint.co.uk/messages/Context", propOrder = {
    "contextName",
    "adminItemStatus",
    "adminItemType",
    "isOwned",
    "ownerTeam",
    "isStewarded",
    "stewardTeam",
    "description",
    "persistentURLRoot",
    "usageGuidelines",
    "publicationDate",
    "publicationPolicy",
    "lastUserName",
    "lastChangeDate",
    "changeReason"
})
public class ContextStatusResponse6Type {

    @XmlElement(name = "ContextName")
    protected FullName6Structure2 contextName;
    @XmlElement(name = "AdminItemStatus")
    protected String adminItemStatus;
    @XmlElement(name = "AdminItemType")
    protected String adminItemType;
    @XmlElement(name = "IsOwned")
    protected boolean isOwned;
    @XmlElement(name = "OwnerTeam")
    protected String ownerTeam;
    @XmlElement(name = "IsStewarded")
    protected boolean isStewarded;
    @XmlElement(name = "StewardTeam")
    protected String stewardTeam;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "PersistentURLRoot")
    protected String persistentURLRoot;
    @XmlElement(name = "UsageGuidelines")
    protected String usageGuidelines;
    @XmlElement(name = "PublicationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar publicationDate;
    @XmlElement(name = "PublicationPolicy")
    protected String publicationPolicy;
    @XmlElement(name = "LastUserName")
    protected String lastUserName;
    @XmlElement(name = "LastChangeDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastChangeDate;
    @XmlElement(name = "ChangeReason")
    protected String changeReason;

    /**
     * Gets the value of the contextName property.
     * 
     * @return
     *     possible object is
     *     {@link FullName6Structure2 }
     *     
     */
    public FullName6Structure2 getContextName() {
        return contextName;
    }

    /**
     * Sets the value of the contextName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullName6Structure2 }
     *     
     */
    public void setContextName(FullName6Structure2 value) {
        this.contextName = value;
    }

    /**
     * Gets the value of the adminItemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminItemStatus() {
        return adminItemStatus;
    }

    /**
     * Sets the value of the adminItemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminItemStatus(String value) {
        this.adminItemStatus = value;
    }

    /**
     * Gets the value of the adminItemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminItemType() {
        return adminItemType;
    }

    /**
     * Sets the value of the adminItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminItemType(String value) {
        this.adminItemType = value;
    }

    /**
     * Gets the value of the isOwned property.
     * 
     */
    public boolean isIsOwned() {
        return isOwned;
    }

    /**
     * Sets the value of the isOwned property.
     * 
     */
    public void setIsOwned(boolean value) {
        this.isOwned = value;
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
     * Gets the value of the isStewarded property.
     * 
     */
    public boolean isIsStewarded() {
        return isStewarded;
    }

    /**
     * Sets the value of the isStewarded property.
     * 
     */
    public void setIsStewarded(boolean value) {
        this.isStewarded = value;
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

}
