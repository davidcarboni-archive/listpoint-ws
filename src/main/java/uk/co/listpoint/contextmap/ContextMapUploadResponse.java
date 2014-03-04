
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
 *         &lt;element ref="{http://www.listpoint.co.uk/messages/ContextMap}ContextMapUploadResponse" minOccurs="0"/>
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
    "contextMapUploadResponse"
})
@XmlRootElement(name = "ContextMapUploadResponse")
public class ContextMapUploadResponse {

    @XmlElement(name = "ContextMapUploadResponse", namespace = "http://www.listpoint.co.uk/messages/ContextMap")
    protected ContextMapUploadResponse6Type contextMapUploadResponse;

    /**
     * Gets the value of the contextMapUploadResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ContextMapUploadResponse6Type }
     *     
     */
    public ContextMapUploadResponse6Type getContextMapUploadResponse() {
        return contextMapUploadResponse;
    }

    /**
     * Sets the value of the contextMapUploadResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextMapUploadResponse6Type }
     *     
     */
    public void setContextMapUploadResponse(ContextMapUploadResponse6Type value) {
        this.contextMapUploadResponse = value;
    }

}
