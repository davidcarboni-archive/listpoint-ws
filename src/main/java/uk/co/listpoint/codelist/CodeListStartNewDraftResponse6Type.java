
package uk.co.listpoint.codelist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CodeListStartNewDraftResponse6Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodeListStartNewDraftResponse6Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NewCodeListName" type="{http://www.listpoint.co.uk/messages/CodeList}FullName6Structure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeListStartNewDraftResponse6Type", namespace = "http://www.listpoint.co.uk/messages/CodeList", propOrder = {
    "newCodeListName"
})
public class CodeListStartNewDraftResponse6Type {

    @XmlElement(name = "NewCodeListName")
    protected FullName6Structure2 newCodeListName;

    /**
     * Gets the value of the newCodeListName property.
     * 
     * @return
     *     possible object is
     *     {@link FullName6Structure2 }
     *     
     */
    public FullName6Structure2 getNewCodeListName() {
        return newCodeListName;
    }

    /**
     * Sets the value of the newCodeListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullName6Structure2 }
     *     
     */
    public void setNewCodeListName(FullName6Structure2 value) {
        this.newCodeListName = value;
    }

}
