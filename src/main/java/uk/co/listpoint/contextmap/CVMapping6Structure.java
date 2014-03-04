
package uk.co.listpoint.contextmap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CVMapping6Structure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CVMapping6Structure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SourceMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Target" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TargetMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CVMapping6Structure", namespace = "http://www.listpoint.co.uk/schemas/v6", propOrder = {
    "source",
    "sourceMeaning",
    "target",
    "targetMeaning"
})
public class CVMapping6Structure {

    @XmlElement(name = "Source", required = true)
    protected String source;
    @XmlElement(name = "SourceMeaning")
    protected String sourceMeaning;
    @XmlElement(name = "Target", required = true)
    protected String target;
    @XmlElement(name = "TargetMeaning")
    protected String targetMeaning;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the sourceMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceMeaning() {
        return sourceMeaning;
    }

    /**
     * Sets the value of the sourceMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceMeaning(String value) {
        this.sourceMeaning = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
    }

    /**
     * Gets the value of the targetMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetMeaning() {
        return targetMeaning;
    }

    /**
     * Sets the value of the targetMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetMeaning(String value) {
        this.targetMeaning = value;
    }

}
