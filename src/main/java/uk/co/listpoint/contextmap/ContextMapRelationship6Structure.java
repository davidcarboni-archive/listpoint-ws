
package uk.co.listpoint.contextmap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContextMapRelationship6Structure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContextMapRelationship6Structure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContextMapName" type="{http://www.listpoint.co.uk/schemas/v6}FullName6Structure"/>
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
@XmlType(name = "ContextMapRelationship6Structure", namespace = "http://www.listpoint.co.uk/schemas/v6", propOrder = {
    "contextMapName"
})
public class ContextMapRelationship6Structure {

    @XmlElement(name = "ContextMapName", required = true)
    protected FullName6Structure2 contextMapName;
    @XmlAttribute(name = "relationshipType")
    protected Relationship6Type relationshipType;

    /**
     * Gets the value of the contextMapName property.
     * 
     * @return
     *     possible object is
     *     {@link FullName6Structure2 }
     *     
     */
    public FullName6Structure2 getContextMapName() {
        return contextMapName;
    }

    /**
     * Sets the value of the contextMapName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullName6Structure2 }
     *     
     */
    public void setContextMapName(FullName6Structure2 value) {
        this.contextMapName = value;
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
