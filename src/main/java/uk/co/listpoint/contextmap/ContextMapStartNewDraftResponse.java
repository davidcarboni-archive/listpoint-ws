
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
 *         &lt;element ref="{http://www.listpoint.co.uk/messages/ContextMap}ContextMapStartNewDraftResponse" minOccurs="0"/>
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
    "contextMapStartNewDraftResponse"
})
@XmlRootElement(name = "ContextMapStartNewDraftResponse")
public class ContextMapStartNewDraftResponse {

    @XmlElement(name = "ContextMapStartNewDraftResponse", namespace = "http://www.listpoint.co.uk/messages/ContextMap")
    protected ContextMapStartNewDraftResponse6Type contextMapStartNewDraftResponse;

    /**
     * Gets the value of the contextMapStartNewDraftResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ContextMapStartNewDraftResponse6Type }
     *     
     */
    public ContextMapStartNewDraftResponse6Type getContextMapStartNewDraftResponse() {
        return contextMapStartNewDraftResponse;
    }

    /**
     * Sets the value of the contextMapStartNewDraftResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextMapStartNewDraftResponse6Type }
     *     
     */
    public void setContextMapStartNewDraftResponse(ContextMapStartNewDraftResponse6Type value) {
        this.contextMapStartNewDraftResponse = value;
    }

}
