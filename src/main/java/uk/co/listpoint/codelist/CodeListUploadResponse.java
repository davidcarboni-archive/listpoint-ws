
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
 *         &lt;element ref="{http://www.listpoint.co.uk/messages/CodeList}CodeListUploadResponse" minOccurs="0"/>
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
    "codeListUploadResponse"
})
@XmlRootElement(name = "CodeListUploadResponse")
public class CodeListUploadResponse {

    @XmlElement(name = "CodeListUploadResponse", namespace = "http://www.listpoint.co.uk/messages/CodeList")
    protected CodeListUploadResponse6Type codeListUploadResponse;

    /**
     * Gets the value of the codeListUploadResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CodeListUploadResponse6Type }
     *     
     */
    public CodeListUploadResponse6Type getCodeListUploadResponse() {
        return codeListUploadResponse;
    }

    /**
     * Sets the value of the codeListUploadResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeListUploadResponse6Type }
     *     
     */
    public void setCodeListUploadResponse(CodeListUploadResponse6Type value) {
        this.codeListUploadResponse = value;
    }

}
