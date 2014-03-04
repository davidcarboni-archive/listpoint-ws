
package uk.co.listpoint.contextmap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.listpoint.co.uk/schemas/v6}ContextMap" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "contextMap"
})
@XmlRootElement(name = "ContextMap")
public class ContextMap {

    @XmlElement(name = "ContextMap", namespace = "http://www.listpoint.co.uk/schemas/v6")
    protected ContextMap6Structure contextMap;

    /**
     * Gets the value of the contextMap property.
     * 
     * @return
     *     possible object is
     *     {@link ContextMap6Structure }
     *     
     */
    public ContextMap6Structure getContextMap() {
        return contextMap;
    }

    /**
     * Sets the value of the contextMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextMap6Structure }
     *     
     */
    public void setContextMap(ContextMap6Structure value) {
        this.contextMap = value;
    }

}
