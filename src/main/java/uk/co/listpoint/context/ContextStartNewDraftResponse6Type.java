
package uk.co.listpoint.context;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContextStartNewDraftResponse6Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContextStartNewDraftResponse6Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NewContextName" type="{http://www.listpoint.co.uk/messages/Context}FullName6Structure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContextStartNewDraftResponse6Type", namespace = "http://www.listpoint.co.uk/messages/Context", propOrder = {
    "newContextName"
})
public class ContextStartNewDraftResponse6Type {

    @XmlElement(name = "NewContextName")
    protected FullName6Structure2 newContextName;

    /**
     * Gets the value of the newContextName property.
     * 
     * @return
     *     possible object is
     *     {@link FullName6Structure2 }
     *     
     */
    public FullName6Structure2 getNewContextName() {
        return newContextName;
    }

    /**
     * Sets the value of the newContextName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullName6Structure2 }
     *     
     */
    public void setNewContextName(FullName6Structure2 value) {
        this.newContextName = value;
    }

}
