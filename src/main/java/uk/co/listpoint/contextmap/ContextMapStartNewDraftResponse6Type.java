
package uk.co.listpoint.contextmap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContextMapStartNewDraftResponse6Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContextMapStartNewDraftResponse6Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NewContextMapName" type="{http://www.listpoint.co.uk/messages/ContextMap}FullName6Structure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContextMapStartNewDraftResponse6Type", namespace = "http://www.listpoint.co.uk/messages/ContextMap", propOrder = {
    "newContextMapName"
})
public class ContextMapStartNewDraftResponse6Type {

    @XmlElement(name = "NewContextMapName")
    protected FullName6Structure newContextMapName;

    /**
     * Gets the value of the newContextMapName property.
     * 
     * @return
     *     possible object is
     *     {@link FullName6Structure }
     *     
     */
    public FullName6Structure getNewContextMapName() {
        return newContextMapName;
    }

    /**
     * Sets the value of the newContextMapName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullName6Structure }
     *     
     */
    public void setNewContextMapName(FullName6Structure value) {
        this.newContextMapName = value;
    }

}
