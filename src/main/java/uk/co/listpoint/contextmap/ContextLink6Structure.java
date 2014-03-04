
package uk.co.listpoint.contextmap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContextLink6Structure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContextLink6Structure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SourceEDTName" type="{http://www.listpoint.co.uk/schemas/v6}ObjectName6Type"/>
 *         &lt;element name="TargetEDTName" type="{http://www.listpoint.co.uk/schemas/v6}ObjectName6Type"/>
 *         &lt;element name="CodeMapId" type="{http://www.listpoint.co.uk/schemas/v6}ObjectId6Type" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="linkType" type="{http://www.listpoint.co.uk/schemas/v6}Link6Type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContextLink6Structure", namespace = "http://www.listpoint.co.uk/schemas/v6", propOrder = {
    "sourceEDTName",
    "targetEDTName",
    "codeMapId"
})
public class ContextLink6Structure {

    @XmlElement(name = "SourceEDTName", required = true)
    protected String sourceEDTName;
    @XmlElement(name = "TargetEDTName", required = true)
    protected String targetEDTName;
    @XmlElement(name = "CodeMapId")
    protected Integer codeMapId;
    @XmlAttribute(name = "linkType")
    protected Link6Type linkType;

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
     * Gets the value of the codeMapId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodeMapId() {
        return codeMapId;
    }

    /**
     * Sets the value of the codeMapId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodeMapId(Integer value) {
        this.codeMapId = value;
    }

    /**
     * Gets the value of the linkType property.
     * 
     * @return
     *     possible object is
     *     {@link Link6Type }
     *     
     */
    public Link6Type getLinkType() {
        return linkType;
    }

    /**
     * Sets the value of the linkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Link6Type }
     *     
     */
    public void setLinkType(Link6Type value) {
        this.linkType = value;
    }

}
