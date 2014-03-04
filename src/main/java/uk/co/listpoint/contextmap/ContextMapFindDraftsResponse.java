
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
 *         &lt;element ref="{http://www.listpoint.co.uk/messages/ContextMap}ContextMapFindDraftsResponse" minOccurs="0"/>
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
    "contextMapFindDraftsResponse"
})
@XmlRootElement(name = "ContextMapFindDraftsResponse")
public class ContextMapFindDraftsResponse {

    @XmlElement(name = "ContextMapFindDraftsResponse", namespace = "http://www.listpoint.co.uk/messages/ContextMap")
    protected ContextMapFindDraftsResponse6Type contextMapFindDraftsResponse;

    /**
     * Gets the value of the contextMapFindDraftsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ContextMapFindDraftsResponse6Type }
     *     
     */
    public ContextMapFindDraftsResponse6Type getContextMapFindDraftsResponse() {
        return contextMapFindDraftsResponse;
    }

    /**
     * Sets the value of the contextMapFindDraftsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextMapFindDraftsResponse6Type }
     *     
     */
    public void setContextMapFindDraftsResponse(ContextMapFindDraftsResponse6Type value) {
        this.contextMapFindDraftsResponse = value;
    }

}
