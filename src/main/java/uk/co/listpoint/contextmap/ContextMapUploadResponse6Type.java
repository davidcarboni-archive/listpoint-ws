
package uk.co.listpoint.contextmap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContextMapUploadResponse6Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContextMapUploadResponse6Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContextMapId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContextMapUploadResponse6Type", namespace = "http://www.listpoint.co.uk/messages/ContextMap", propOrder = {
    "contextMapId"
})
public class ContextMapUploadResponse6Type {

    @XmlElement(name = "ContextMapId")
    protected int contextMapId;

    /**
     * Gets the value of the contextMapId property.
     * 
     */
    public int getContextMapId() {
        return contextMapId;
    }

    /**
     * Sets the value of the contextMapId property.
     * 
     */
    public void setContextMapId(int value) {
        this.contextMapId = value;
    }

}
