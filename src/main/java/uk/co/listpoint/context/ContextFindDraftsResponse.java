
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
 *         &lt;element ref="{http://www.listpoint.co.uk/messages/Context}ContextFindDraftsResponse" minOccurs="0"/>
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
    "contextFindDraftsResponse"
})
@XmlRootElement(name = "ContextFindDraftsResponse")
public class ContextFindDraftsResponse {

    @XmlElement(name = "ContextFindDraftsResponse", namespace = "http://www.listpoint.co.uk/messages/Context")
    protected ContextFindDraftsResponse6Type contextFindDraftsResponse;

    /**
     * Gets the value of the contextFindDraftsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ContextFindDraftsResponse6Type }
     *     
     */
    public ContextFindDraftsResponse6Type getContextFindDraftsResponse() {
        return contextFindDraftsResponse;
    }

    /**
     * Sets the value of the contextFindDraftsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextFindDraftsResponse6Type }
     *     
     */
    public void setContextFindDraftsResponse(ContextFindDraftsResponse6Type value) {
        this.contextFindDraftsResponse = value;
    }

}
