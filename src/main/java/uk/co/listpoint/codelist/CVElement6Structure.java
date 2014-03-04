
package uk.co.listpoint.codelist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CVElement6Structure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CVElement6Structure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://www.listpoint.co.uk/schemas/v6}Code6Type"/>
 *         &lt;element name="ParentCode" type="{http://www.listpoint.co.uk/schemas/v6}ParentCode6Type" minOccurs="0"/>
 *         &lt;element name="Meaning" type="{http://www.listpoint.co.uk/schemas/v6}LongString6Type" minOccurs="0"/>
 *         &lt;element name="FullMeaning" type="{http://www.listpoint.co.uk/schemas/v6}LongString6Type" minOccurs="0"/>
 *         &lt;element name="UsageGuidelines" type="{http://www.listpoint.co.uk/schemas/v6}UsageGuidelines6Type" minOccurs="0"/>
 *         &lt;element name="EffectiveFromDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EffectiveToDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SortOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.listpoint.co.uk/schemas/v6}LongString6Type" minOccurs="0"/>
 *         &lt;element name="LastChangeDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="FullCode" type="{http://www.listpoint.co.uk/schemas/v6}FullCode6Type" minOccurs="0"/>
 *         &lt;element name="SortPolicyOrder" type="{http://www.listpoint.co.uk/schemas/v6}SortPolicyOrder6Type" minOccurs="0"/>
 *         &lt;element name="SortableEffectiveFromDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SortableEffectiveToDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CVElement6Structure", namespace = "http://www.listpoint.co.uk/schemas/v6", propOrder = {
    "code",
    "parentCode",
    "meaning",
    "fullMeaning",
    "usageGuidelines",
    "effectiveFromDate",
    "effectiveToDate",
    "sortOrder",
    "notes",
    "lastChangeDate",
    "fullCode",
    "sortPolicyOrder",
    "sortableEffectiveFromDate",
    "sortableEffectiveToDate"
})
public class CVElement6Structure {

    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "ParentCode")
    protected String parentCode;
    @XmlElement(name = "Meaning")
    protected String meaning;
    @XmlElement(name = "FullMeaning")
    protected String fullMeaning;
    @XmlElement(name = "UsageGuidelines")
    protected String usageGuidelines;
    @XmlElement(name = "EffectiveFromDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveFromDate;
    @XmlElement(name = "EffectiveToDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveToDate;
    @XmlElement(name = "SortOrder")
    protected Integer sortOrder;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "LastChangeDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastChangeDate;
    @XmlElement(name = "FullCode")
    protected String fullCode;
    @XmlElement(name = "SortPolicyOrder")
    protected String sortPolicyOrder;
    @XmlElement(name = "SortableEffectiveFromDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sortableEffectiveFromDate;
    @XmlElement(name = "SortableEffectiveToDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sortableEffectiveToDate;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the parentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentCode() {
        return parentCode;
    }

    /**
     * Sets the value of the parentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentCode(String value) {
        this.parentCode = value;
    }

    /**
     * Gets the value of the meaning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeaning() {
        return meaning;
    }

    /**
     * Sets the value of the meaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeaning(String value) {
        this.meaning = value;
    }

    /**
     * Gets the value of the fullMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullMeaning() {
        return fullMeaning;
    }

    /**
     * Sets the value of the fullMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullMeaning(String value) {
        this.fullMeaning = value;
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
     * Gets the value of the effectiveFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveFromDate() {
        return effectiveFromDate;
    }

    /**
     * Sets the value of the effectiveFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveFromDate(XMLGregorianCalendar value) {
        this.effectiveFromDate = value;
    }

    /**
     * Gets the value of the effectiveToDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveToDate() {
        return effectiveToDate;
    }

    /**
     * Sets the value of the effectiveToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveToDate(XMLGregorianCalendar value) {
        this.effectiveToDate = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSortOrder(Integer value) {
        this.sortOrder = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
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
     * Gets the value of the fullCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullCode() {
        return fullCode;
    }

    /**
     * Sets the value of the fullCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullCode(String value) {
        this.fullCode = value;
    }

    /**
     * Gets the value of the sortPolicyOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortPolicyOrder() {
        return sortPolicyOrder;
    }

    /**
     * Sets the value of the sortPolicyOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortPolicyOrder(String value) {
        this.sortPolicyOrder = value;
    }

    /**
     * Gets the value of the sortableEffectiveFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSortableEffectiveFromDate() {
        return sortableEffectiveFromDate;
    }

    /**
     * Sets the value of the sortableEffectiveFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSortableEffectiveFromDate(XMLGregorianCalendar value) {
        this.sortableEffectiveFromDate = value;
    }

    /**
     * Gets the value of the sortableEffectiveToDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSortableEffectiveToDate() {
        return sortableEffectiveToDate;
    }

    /**
     * Sets the value of the sortableEffectiveToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSortableEffectiveToDate(XMLGregorianCalendar value) {
        this.sortableEffectiveToDate = value;
    }

}
