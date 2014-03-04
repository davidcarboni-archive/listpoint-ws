
package uk.co.listpoint.context;

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
 *         &lt;element ref="{http://www.listpoint.co.uk/messages/Context}ContextStatusResponse" minOccurs="0"/>
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
    "contextStatusResponse"
})
@XmlRootElement(name = "ContextStatusResponse")
public class ContextStatusResponse {

    @XmlElement(name = "ContextStatusResponse", namespace = "http://www.listpoint.co.uk/messages/Context")
    protected ContextStatusResponse6Type contextStatusResponse;

    /**
     * Gets the value of the contextStatusResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ContextStatusResponse6Type }
     *     
     */
    public ContextStatusResponse6Type getContextStatusResponse() {
        return contextStatusResponse;
    }

    /**
     * Sets the value of the contextStatusResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextStatusResponse6Type }
     *     
     */
    public void setContextStatusResponse(ContextStatusResponse6Type value) {
        this.contextStatusResponse = value;
    }

}
