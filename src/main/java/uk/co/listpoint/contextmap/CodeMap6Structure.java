
package uk.co.listpoint.contextmap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CodeMap6Structure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodeMap6Structure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodeMapId" type="{http://www.listpoint.co.uk/schemas/v6}ObjectId6Type"/>
 *         &lt;element name="BorrowedFromContextMap" type="{http://www.listpoint.co.uk/schemas/v6}FullName6Structure" minOccurs="0"/>
 *         &lt;element name="SourceEDTName" type="{http://www.listpoint.co.uk/schemas/v6}ObjectName6Type"/>
 *         &lt;element name="SourceCodeListLevel" type="{http://www.listpoint.co.uk/schemas/v6}CodeListLevel6Structure" minOccurs="0"/>
 *         &lt;element name="TargetEDTName" type="{http://www.listpoint.co.uk/schemas/v6}ObjectName6Type"/>
 *         &lt;element name="TargetCodeListLevel" type="{http://www.listpoint.co.uk/schemas/v6}CodeListLevel6Structure" minOccurs="0"/>
 *         &lt;element name="CVMapping" type="{http://www.listpoint.co.uk/schemas/v6}CVMapping6Structure" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeMap6Structure", namespace = "http://www.listpoint.co.uk/schemas/v6", propOrder = {
    "codeMapId",
    "borrowedFromContextMap",
    "sourceEDTName",
    "sourceCodeListLevel",
    "targetEDTName",
    "targetCodeListLevel",
    "cvMapping"
})
public class CodeMap6Structure {

    @XmlElement(name = "CodeMapId")
    protected int codeMapId;
    @XmlElement(name = "BorrowedFromContextMap")
    protected FullName6Structure2 borrowedFromContextMap;
    @XmlElement(name = "SourceEDTName", required = true)
    protected String sourceEDTName;
    @XmlElement(name = "SourceCodeListLevel")
    protected CodeListLevel6Structure sourceCodeListLevel;
    @XmlElement(name = "TargetEDTName", required = true)
    protected String targetEDTName;
    @XmlElement(name = "TargetCodeListLevel")
    protected CodeListLevel6Structure targetCodeListLevel;
    @XmlElement(name = "CVMapping")
    protected List<CVMapping6Structure> cvMapping;

    /**
     * Gets the value of the codeMapId property.
     * 
     */
    public int getCodeMapId() {
        return codeMapId;
    }

    /**
     * Sets the value of the codeMapId property.
     * 
     */
    public void setCodeMapId(int value) {
        this.codeMapId = value;
    }

    /**
     * Gets the value of the borrowedFromContextMap property.
     * 
     * @return
     *     possible object is
     *     {@link FullName6Structure2 }
     *     
     */
    public FullName6Structure2 getBorrowedFromContextMap() {
        return borrowedFromContextMap;
    }

    /**
     * Sets the value of the borrowedFromContextMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullName6Structure2 }
     *     
     */
    public void setBorrowedFromContextMap(FullName6Structure2 value) {
        this.borrowedFromContextMap = value;
    }

    /**
     * Gets the value of the sourceEDTName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceEDTName() {
        return sourceEDTName;
    }

    /**
     * Sets the value of the sourceEDTName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceEDTName(String value) {
        this.sourceEDTName = value;
    }

    /**
     * Gets the value of the sourceCodeListLevel property.
     * 
     * @return
     *     possible object is
     *     {@link CodeListLevel6Structure }
     *     
     */
    public CodeListLevel6Structure getSourceCodeListLevel() {
        return sourceCodeListLevel;
    }

    /**
     * Sets the value of the sourceCodeListLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeListLevel6Structure }
     *     
     */
    public void setSourceCodeListLevel(CodeListLevel6Structure value) {
        this.sourceCodeListLevel = value;
    }

    /**
     * Gets the value of the targetEDTName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetEDTName() {
        return targetEDTName;
    }

    /**
     * Sets the value of the targetEDTName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetEDTName(String value) {
        this.targetEDTName = value;
    }

    /**
     * Gets the value of the targetCodeListLevel property.
     * 
     * @return
     *     possible object is
     *     {@link CodeListLevel6Structure }
     *     
     */
    public CodeListLevel6Structure getTargetCodeListLevel() {
        return targetCodeListLevel;
    }

    /**
     * Sets the value of the targetCodeListLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeListLevel6Structure }
     *     
     */
    public void setTargetCodeListLevel(CodeListLevel6Structure value) {
        this.targetCodeListLevel = value;
    }

    /**
     * Gets the value of the cvMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cvMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCVMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CVMapping6Structure }
     * 
     * 
     */
    public List<CVMapping6Structure> getCVMapping() {
        if (cvMapping == null) {
            cvMapping = new ArrayList<CVMapping6Structure>();
        }
        return this.cvMapping;
    }

}
