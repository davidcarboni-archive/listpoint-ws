
package uk.co.listpoint.codelist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Level6Structure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Level6Structure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LevelNumber" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Name" type="{http://www.listpoint.co.uk/schemas/v6}ObjectName6Type"/>
 *         &lt;element name="LevelType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SortPolicy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MaxMeaningLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxFullMeaningLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxDepthCount" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="CodePrefix" type="{http://www.listpoint.co.uk/schemas/v6}CodePrefix6Type" minOccurs="0"/>
 *         &lt;element name="ParentRequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ChildRequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UsageGuidelines" type="{http://www.listpoint.co.uk/schemas/v6}UsageGuidelines6Type" minOccurs="0"/>
 *         &lt;element name="CodeFormat" type="{http://www.listpoint.co.uk/schemas/v6}CodeFormat6Type"/>
 *         &lt;element name="Description" type="{http://www.listpoint.co.uk/schemas/v6}Description6Type" minOccurs="0"/>
 *         &lt;element name="AllowLowerCaseLettersInCodeInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PreserveHistoricCodesInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CVElementCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CVElement" type="{http://www.listpoint.co.uk/schemas/v6}CVElement6Structure" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Level6Structure", namespace = "http://www.listpoint.co.uk/schemas/v6", propOrder = {
    "levelNumber",
    "name",
    "levelType",
    "sortPolicy",
    "maxMeaningLength",
    "maxFullMeaningLength",
    "maxDepthCount",
    "codePrefix",
    "parentRequiredInd",
    "childRequiredInd",
    "usageGuidelines",
    "codeFormat",
    "description",
    "allowLowerCaseLettersInCodeInd",
    "preserveHistoricCodesInd",
    "cvElementCount",
    "cvElement"
})
public class Level6Structure {

    @XmlElement(name = "LevelNumber")
    protected short levelNumber;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "LevelType", required = true)
    protected String levelType;
    @XmlElement(name = "SortPolicy", required = true)
    protected String sortPolicy;
    @XmlElement(name = "MaxMeaningLength")
    protected Integer maxMeaningLength;
    @XmlElement(name = "MaxFullMeaningLength")
    protected Integer maxFullMeaningLength;
    @XmlElement(name = "MaxDepthCount")
    protected Short maxDepthCount;
    @XmlElement(name = "CodePrefix")
    protected String codePrefix;
    @XmlElement(name = "ParentRequiredInd")
    protected boolean parentRequiredInd;
    @XmlElement(name = "ChildRequiredInd")
    protected boolean childRequiredInd;
    @XmlElement(name = "UsageGuidelines")
    protected String usageGuidelines;
    @XmlElement(name = "CodeFormat", required = true)
    protected String codeFormat;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "AllowLowerCaseLettersInCodeInd")
    protected boolean allowLowerCaseLettersInCodeInd;
    @XmlElement(name = "PreserveHistoricCodesInd")
    protected boolean preserveHistoricCodesInd;
    @XmlElement(name = "CVElementCount")
    protected Integer cvElementCount;
    @XmlElement(name = "CVElement")
    protected List<CVElement6Structure> cvElement;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the levelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelType() {
        return levelType;
    }

    /**
     * Sets the value of the levelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelType(String value) {
        this.levelType = value;
    }

    /**
     * Gets the value of the sortPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortPolicy() {
        return sortPolicy;
    }

    /**
     * Sets the value of the sortPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortPolicy(String value) {
        this.sortPolicy = value;
    }

    /**
     * Gets the value of the maxMeaningLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxMeaningLength() {
        return maxMeaningLength;
    }

    /**
     * Sets the value of the maxMeaningLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxMeaningLength(Integer value) {
        this.maxMeaningLength = value;
    }

    /**
     * Gets the value of the maxFullMeaningLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxFullMeaningLength() {
        return maxFullMeaningLength;
    }

    /**
     * Sets the value of the maxFullMeaningLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxFullMeaningLength(Integer value) {
        this.maxFullMeaningLength = value;
    }

    /**
     * Gets the value of the maxDepthCount property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMaxDepthCount() {
        return maxDepthCount;
    }

    /**
     * Sets the value of the maxDepthCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMaxDepthCount(Short value) {
        this.maxDepthCount = value;
    }

    /**
     * Gets the value of the codePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodePrefix() {
        return codePrefix;
    }

    /**
     * Sets the value of the codePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodePrefix(String value) {
        this.codePrefix = value;
    }

    /**
     * Gets the value of the parentRequiredInd property.
     * 
     */
    public boolean isParentRequiredInd() {
        return parentRequiredInd;
    }

    /**
     * Sets the value of the parentRequiredInd property.
     * 
     */
    public void setParentRequiredInd(boolean value) {
        this.parentRequiredInd = value;
    }

    /**
     * Gets the value of the childRequiredInd property.
     * 
     */
    public boolean isChildRequiredInd() {
        return childRequiredInd;
    }

    /**
     * Sets the value of the childRequiredInd property.
     * 
     */
    public void setChildRequiredInd(boolean value) {
        this.childRequiredInd = value;
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
     * Gets the value of the codeFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeFormat() {
        return codeFormat;
    }

    /**
     * Sets the value of the codeFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeFormat(String value) {
        this.codeFormat = value;
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
     * Gets the value of the allowLowerCaseLettersInCodeInd property.
     * 
     */
    public boolean isAllowLowerCaseLettersInCodeInd() {
        return allowLowerCaseLettersInCodeInd;
    }

    /**
     * Sets the value of the allowLowerCaseLettersInCodeInd property.
     * 
     */
    public void setAllowLowerCaseLettersInCodeInd(boolean value) {
        this.allowLowerCaseLettersInCodeInd = value;
    }

    /**
     * Gets the value of the preserveHistoricCodesInd property.
     * 
     */
    public boolean isPreserveHistoricCodesInd() {
        return preserveHistoricCodesInd;
    }

    /**
     * Sets the value of the preserveHistoricCodesInd property.
     * 
     */
    public void setPreserveHistoricCodesInd(boolean value) {
        this.preserveHistoricCodesInd = value;
    }

    /**
     * Gets the value of the cvElementCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCVElementCount() {
        return cvElementCount;
    }

    /**
     * Sets the value of the cvElementCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCVElementCount(Integer value) {
        this.cvElementCount = value;
    }

    /**
     * Gets the value of the cvElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cvElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCVElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CVElement6Structure }
     * 
     * 
     */
    public List<CVElement6Structure> getCVElement() {
        if (cvElement == null) {
            cvElement = new ArrayList<CVElement6Structure>();
        }
        return this.cvElement;
    }

}
