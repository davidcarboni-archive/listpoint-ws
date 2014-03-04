
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
 *         &lt;element ref="{http://www.listpoint.co.uk/schemas/v6}CodeList" minOccurs="0"/>
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
    "codeList"
})
@XmlRootElement(name = "CodeList")
public class CodeList {

    @XmlElement(name = "CodeList", namespace = "http://www.listpoint.co.uk/schemas/v6")
    protected CodeList6Structure codeList;

    /**
     * Gets the value of the codeList property.
     * 
     * @return
     *     possible object is
     *     {@link CodeList6Structure }
     *     
     */
    public CodeList6Structure getCodeList() {
        return codeList;
    }

    /**
     * Sets the value of the codeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeList6Structure }
     *     
     */
    public void setCodeList(CodeList6Structure value) {
        this.codeList = value;
    }

}
