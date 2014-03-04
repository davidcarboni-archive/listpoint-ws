
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
 *         &lt;element ref="{http://www.listpoint.co.uk/messages/Context}ContextUploadResponse" minOccurs="0"/>
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
    "contextUploadResponse"
})
@XmlRootElement(name = "ContextUploadResponse")
public class ContextUploadResponse {

    @XmlElement(name = "ContextUploadResponse", namespace = "http://www.listpoint.co.uk/messages/Context")
    protected ContextUploadResponse6Type contextUploadResponse;

    /**
     * Gets the value of the contextUploadResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ContextUploadResponse6Type }
     *     
     */
    public ContextUploadResponse6Type getContextUploadResponse() {
        return contextUploadResponse;
    }

    /**
     * Sets the value of the contextUploadResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextUploadResponse6Type }
     *     
     */
    public void setContextUploadResponse(ContextUploadResponse6Type value) {
        this.contextUploadResponse = value;
    }

}
