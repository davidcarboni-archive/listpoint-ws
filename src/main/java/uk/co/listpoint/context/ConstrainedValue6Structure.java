
package uk.co.listpoint.context;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ConstrainedValue6Structure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConstrainedValue6Structure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ParentCode" type="{http://www.listpoint.co.uk/schemas/v6}FullCode6Type" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.listpoint.co.uk/schemas/v6}LongString6Type"/>
 *         &lt;element name="Code" type="{http://www.listpoint.co.uk/schemas/v6}FullCode6Type"/>
 *         &lt;element name="Meaning" type="{http://www.listpoint.co.uk/schemas/v6}LongString6Type" minOccurs="0"/>
 *         &lt;element name="EffectiveFromDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EffectiveToDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SortOrder" type="{http://www.listpoint.co.uk/schemas/v6}FullCode6Type"/>
 *         &lt;element name="UsageGuidelines" type="{http://www.listpoint.co.uk/schemas/v6}LongString6Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConstrainedValue6Structure", namespace = "http://www.listpoint.co.uk/schemas/v6", propOrder = {
    "parentCode",
    "value",
    "code",
    "meaning",
    "effectiveFromDate",
    "effectiveToDate",
    "sortOrder",
    "usageGuidelines"
})
public class ConstrainedValue6Structure {

    @XmlElement(name = "ParentCode")
    protected String parentCode;
    @XmlElement(name = "Value", required = true)
    protected String value;
    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "Meaning")
    protected String meaning;
    @XmlElement(name = "EffectiveFromDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveFromDate;
    @XmlElement(name = "EffectiveToDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveToDate;
    @XmlElement(name = "SortOrder", required = true)
    protected String sortOrder;
    @XmlElement(name = "UsageGuidelines")
    protected String usageGuidelines;

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
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

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
     *     {@link String }
     *     
     */
    public String getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortOrder(String value) {
        this.sortOrder = value;
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

}
