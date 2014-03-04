
package uk.co.listpoint.context;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContextUploadResponse6Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContextUploadResponse6Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContextId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContextUploadResponse6Type", namespace = "http://www.listpoint.co.uk/messages/Context", propOrder = {
    "contextId"
})
public class ContextUploadResponse6Type {

    @XmlElement(name = "ContextId")
    protected int contextId;

    /**
     * Gets the value of the contextId property.
     * 
     */
    public int getContextId() {
        return contextId;
    }

    /**
     * Sets the value of the contextId property.
     * 
     */
    public void setContextId(int value) {
        this.contextId = value;
    }

}
