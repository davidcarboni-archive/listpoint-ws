
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
 *         &lt;element ref="{http://www.listpoint.co.uk/messages/CodeList}CodeListStatusResponse" minOccurs="0"/>
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
    "codeListStatusResponse"
})
@XmlRootElement(name = "CodeListStatusResponse")
public class CodeListStatusResponse {

    @XmlElement(name = "CodeListStatusResponse", namespace = "http://www.listpoint.co.uk/messages/CodeList")
    protected CodeListStatusResponse6Type codeListStatusResponse;

    /**
     * Gets the value of the codeListStatusResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CodeListStatusResponse6Type }
     *     
     */
    public CodeListStatusResponse6Type getCodeListStatusResponse() {
        return codeListStatusResponse;
    }

    /**
     * Sets the value of the codeListStatusResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeListStatusResponse6Type }
     *     
     */
    public void setCodeListStatusResponse(CodeListStatusResponse6Type value) {
        this.codeListStatusResponse = value;
    }

}
