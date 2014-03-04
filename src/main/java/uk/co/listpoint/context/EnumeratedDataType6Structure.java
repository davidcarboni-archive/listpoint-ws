
package uk.co.listpoint.context;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumeratedDataType6Structure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnumeratedDataType6Structure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersistentURL" type="{http://www.listpoint.co.uk/schemas/v6}URL6Type" minOccurs="0"/>
 *         &lt;element name="DataTypeName" type="{http://www.listpoint.co.uk/schemas/v6}ObjectName6Type"/>
 *         &lt;element name="DataTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CodeListName" type="{http://www.listpoint.co.uk/schemas/v6}FullName6Structure"/>
 *         &lt;element name="LevelNumber" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="ElementValuePolicy" type="{http://www.listpoint.co.uk/schemas/v6}ElementValuePolicy6Type"/>
 *         &lt;element name="EffectiveDatePolicy" type="{http://www.listpoint.co.uk/schemas/v6}EffectiveDatePolicy6Type"/>
 *         &lt;element name="ParentCodeFilter" type="{http://www.listpoint.co.uk/schemas/v6}FullCode6Type" minOccurs="0"/>
 *         &lt;element name="ParentDataTypeName" type="{http://www.listpoint.co.uk/schemas/v6}ObjectName6Type" minOccurs="0"/>
 *         &lt;element name="UsageGuidelines" type="{http://www.listpoint.co.uk/schemas/v6}LongString6Type" minOccurs="0"/>
 *         &lt;element name="TypeLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CodePattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NullCode" type="{http://www.listpoint.co.uk/schemas/v6}Code6Type" minOccurs="0"/>
 *         &lt;element name="NullMeaning" type="{http://www.listpoint.co.uk/schemas/v6}LongString6Type" minOccurs="0"/>
 *         &lt;element name="ConstrainedValue" type="{http://www.listpoint.co.uk/schemas/v6}ConstrainedValue6Structure" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnumeratedDataType6Structure", namespace = "http://www.listpoint.co.uk/schemas/v6", propOrder = {
    "persistentURL",
    "dataTypeName",
    "dataTypeId",
    "codeListName",
    "levelNumber",
    "elementValuePolicy",
    "effectiveDatePolicy",
    "parentCodeFilter",
    "parentDataTypeName",
    "usageGuidelines",
    "typeLength",
    "codePattern",
    "nullCode",
    "nullMeaning",
    "constrainedValue"
})
public class EnumeratedDataType6Structure {

    @XmlElement(name = "PersistentURL")
    protected String persistentURL;
    @XmlElement(name = "DataTypeName", required = true)
    protected String dataTypeName;
    @XmlElement(name = "DataTypeId")
    protected int dataTypeId;
    @XmlElement(name = "CodeListName", required = true)
    protected FullName6Structure codeListName;
    @XmlElement(name = "LevelNumber")
    protected short levelNumber;
    @XmlElement(name = "ElementValuePolicy", required = true)
    protected String elementValuePolicy;
    @XmlElement(name = "EffectiveDatePolicy", required = true)
    protected String effectiveDatePolicy;
    @XmlElement(name = "ParentCodeFilter")
    protected String parentCodeFilter;
    @XmlElement(name = "ParentDataTypeName")
    protected String parentDataTypeName;
    @XmlElement(name = "UsageGuidelines")
    protected String usageGuidelines;
    @XmlElement(name = "TypeLength")
    protected Integer typeLength;
    @XmlElement(name = "CodePattern")
    protected String codePattern;
    @XmlElement(name = "NullCode")
    protected String nullCode;
    @XmlElement(name = "NullMeaning")
    protected String nullMeaning;
    @XmlElement(name = "ConstrainedValue")
    protected List<ConstrainedValue6Structure> constrainedValue;

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
     * Gets the value of the dataTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataTypeName() {
        return dataTypeName;
    }

    /**
     * Sets the value of the dataTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataTypeName(String value) {
        this.dataTypeName = value;
    }

    /**
     * Gets the value of the dataTypeId property.
     * 
     */
    public int getDataTypeId() {
        return dataTypeId;
    }

    /**
     * Sets the value of the dataTypeId property.
     * 
     */
    public void setDataTypeId(int value) {
        this.dataTypeId = value;
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
     * Gets the value of the levelNumber property.
     * 
     */
    public short getLevelNumber() {
        return levelNumber;
    }

    /**
     * Sets the value of the levelNumber property.
     * 
     */
    public void setLevelNumber(short value) {
        this.levelNumber = value;
    }

    /**
     * Gets the value of the elementValuePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementValuePolicy() {
        return elementValuePolicy;
    }

    /**
     * Sets the value of the elementValuePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementValuePolicy(String value) {
        this.elementValuePolicy = value;
    }

    /**
     * Gets the value of the effectiveDatePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveDatePolicy() {
        return effectiveDatePolicy;
    }

    /**
     * Sets the value of the effectiveDatePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveDatePolicy(String value) {
        this.effectiveDatePolicy = value;
    }

    /**
     * Gets the value of the parentCodeFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentCodeFilter() {
        return parentCodeFilter;
    }

    /**
     * Sets the value of the parentCodeFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentCodeFilter(String value) {
        this.parentCodeFilter = value;
    }

    /**
     * Gets the value of the parentDataTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentDataTypeName() {
        return parentDataTypeName;
    }

    /**
     * Sets the value of the parentDataTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentDataTypeName(String value) {
        this.parentDataTypeName = value;
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
     * Gets the value of the typeLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTypeLength() {
        return typeLength;
    }

    /**
     * Sets the value of the typeLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTypeLength(Integer value) {
        this.typeLength = value;
    }

    /**
     * Gets the value of the codePattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodePattern() {
        return codePattern;
    }

    /**
     * Sets the value of the codePattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodePattern(String value) {
        this.codePattern = value;
    }

    /**
     * Gets the value of the nullCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNullCode() {
        return nullCode;
    }

    /**
     * Sets the value of the nullCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNullCode(String value) {
        this.nullCode = value;
    }

    /**
     * Gets the value of the nullMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNullMeaning() {
        return nullMeaning;
    }

    /**
     * Sets the value of the nullMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNullMeaning(String value) {
        this.nullMeaning = value;
    }

    /**
     * Gets the value of the constrainedValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constrainedValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstrainedValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConstrainedValue6Structure }
     * 
     * 
     */
    public List<ConstrainedValue6Structure> getConstrainedValue() {
        if (constrainedValue == null) {
            constrainedValue = new ArrayList<ConstrainedValue6Structure>();
        }
        return this.constrainedValue;
    }

}
