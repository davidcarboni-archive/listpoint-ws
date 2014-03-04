
package uk.co.listpoint.codelist;

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
 *         &lt;element ref="{http://www.listpoint.co.uk/messages/CodeList}CodeListDeleteResponse" minOccurs="0"/>
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
    "codeListDeleteResponse"
})
@XmlRootElement(name = "CodeListDeleteResponse")
public class CodeListDeleteResponse {

    @XmlElement(name = "CodeListDeleteResponse", namespace = "http://www.listpoint.co.uk/messages/CodeList")
    protected CodeListDeleteDraftResponse6Type codeListDeleteResponse;

    /**
     * Gets the value of the codeListDeleteResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CodeListDeleteDraftResponse6Type }
     *     
     */
    public CodeListDeleteDraftResponse6Type getCodeListDeleteResponse() {
        return codeListDeleteResponse;
    }

    /**
     * Sets the value of the codeListDeleteResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeListDeleteDraftResponse6Type }
     *     
     */
    public void setCodeListDeleteResponse(CodeListDeleteDraftResponse6Type value) {
        this.codeListDeleteResponse = value;
    }

}
