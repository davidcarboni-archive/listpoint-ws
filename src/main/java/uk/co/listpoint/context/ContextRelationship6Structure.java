
package uk.co.listpoint.context;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContextRelationship6Structure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContextRelationship6Structure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContextName" type="{http://www.listpoint.co.uk/schemas/v6}FullName6Structure"/>
 *       &lt;/sequence>
 *       &lt;attribute name="relationshipType" type="{http://www.listpoint.co.uk/schemas/v6}Relationship6Type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContextRelationship6Structure", namespace = "http://www.listpoint.co.uk/schemas/v6", propOrder = {
    "contextName"
})
public class ContextRelationship6Structure {

    @XmlElement(name = "ContextName", required = true)
    protected FullName6Structure contextName;
    @XmlAttribute(name = "relationshipType")
    protected Relationship6Type relationshipType;

    /**
     * Gets the value of the contextName property.
     * 
     * @return
     *     possible object is
     *     {@link FullName6Structure }
     *     
     */
    public FullName6Structure getContextName() {
        return contextName;
    }

    /**
     * Sets the value of the contextName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullName6Structure }
     *     
     */
    public void setContextName(FullName6Structure value) {
        this.contextName = value;
    }

    /**
     * Gets the value of the relationshipType property.
     * 
     * @return
     *     possible object is
     *     {@link Relationship6Type }
     *     
     */
    public Relationship6Type getRelationshipType() {
        return relationshipType;
    }

    /**
     * Sets the value of the relationshipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Relationship6Type }
     *     
     */
    public void setRelationshipType(Relationship6Type value) {
        this.relationshipType = value;
    }

}
