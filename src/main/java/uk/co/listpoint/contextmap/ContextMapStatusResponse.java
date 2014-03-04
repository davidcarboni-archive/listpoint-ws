
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
 *         &lt;element ref="{http://www.listpoint.co.uk/messages/ContextMap}ContextMapStatusResponse" minOccurs="0"/>
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
    "contextMapStatusResponse"
})
@XmlRootElement(name = "ContextMapStatusResponse")
public class ContextMapStatusResponse {

    @XmlElement(name = "ContextMapStatusResponse", namespace = "http://www.listpoint.co.uk/messages/ContextMap")
    protected ContextMapStatusResponse6Type contextMapStatusResponse;

    /**
     * Gets the value of the contextMapStatusResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ContextMapStatusResponse6Type }
     *     
     */
    public ContextMapStatusResponse6Type getContextMapStatusResponse() {
        return contextMapStatusResponse;
    }

    /**
     * Sets the value of the contextMapStatusResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextMapStatusResponse6Type }
     *     
     */
    public void setContextMapStatusResponse(ContextMapStatusResponse6Type value) {
        this.contextMapStatusResponse = value;
    }

}
