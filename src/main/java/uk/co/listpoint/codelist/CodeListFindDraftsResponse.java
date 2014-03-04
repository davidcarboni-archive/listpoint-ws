
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
 *         &lt;element ref="{http://www.listpoint.co.uk/messages/CodeList}CodeListFindDraftsResponse" minOccurs="0"/>
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
    "codeListFindDraftsResponse"
})
@XmlRootElement(name = "CodeListFindDraftsResponse")
public class CodeListFindDraftsResponse {

    @XmlElement(name = "CodeListFindDraftsResponse", namespace = "http://www.listpoint.co.uk/messages/CodeList")
    protected CodeListFindDraftsResponse6Type codeListFindDraftsResponse;

    /**
     * Gets the value of the codeListFindDraftsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CodeListFindDraftsResponse6Type }
     *     
     */
    public CodeListFindDraftsResponse6Type getCodeListFindDraftsResponse() {
        return codeListFindDraftsResponse;
    }

    /**
     * Sets the value of the codeListFindDraftsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeListFindDraftsResponse6Type }
     *     
     */
    public void setCodeListFindDraftsResponse(CodeListFindDraftsResponse6Type value) {
        this.codeListFindDraftsResponse = value;
    }

}
