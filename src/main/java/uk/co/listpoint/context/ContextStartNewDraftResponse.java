
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
 *         &lt;element ref="{http://www.listpoint.co.uk/messages/Context}ContextStartNewDraftResponse" minOccurs="0"/>
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
    "contextStartNewDraftResponse"
})
@XmlRootElement(name = "ContextStartNewDraftResponse")
public class ContextStartNewDraftResponse {

    @XmlElement(name = "ContextStartNewDraftResponse", namespace = "http://www.listpoint.co.uk/messages/Context")
    protected ContextStartNewDraftResponse6Type contextStartNewDraftResponse;

    /**
     * Gets the value of the contextStartNewDraftResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ContextStartNewDraftResponse6Type }
     *     
     */
    public ContextStartNewDraftResponse6Type getContextStartNewDraftResponse() {
        return contextStartNewDraftResponse;
    }

    /**
     * Sets the value of the contextStartNewDraftResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextStartNewDraftResponse6Type }
     *     
     */
    public void setContextStartNewDraftResponse(ContextStartNewDraftResponse6Type value) {
        this.contextStartNewDraftResponse = value;
    }

}
