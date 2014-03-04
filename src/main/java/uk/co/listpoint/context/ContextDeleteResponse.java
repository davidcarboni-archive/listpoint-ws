
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
 *         &lt;element ref="{http://www.listpoint.co.uk/messages/Context}ContextDeleteResponse" minOccurs="0"/>
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
    "contextDeleteResponse"
})
@XmlRootElement(name = "ContextDeleteResponse")
public class ContextDeleteResponse {

    @XmlElement(name = "ContextDeleteResponse", namespace = "http://www.listpoint.co.uk/messages/Context")
    protected ContextDeleteDraftResponse6Type contextDeleteResponse;

    /**
     * Gets the value of the contextDeleteResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ContextDeleteDraftResponse6Type }
     *     
     */
    public ContextDeleteDraftResponse6Type getContextDeleteResponse() {
        return contextDeleteResponse;
    }

    /**
     * Sets the value of the contextDeleteResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextDeleteDraftResponse6Type }
     *     
     */
    public void setContextDeleteResponse(ContextDeleteDraftResponse6Type value) {
        this.contextDeleteResponse = value;
    }

}
