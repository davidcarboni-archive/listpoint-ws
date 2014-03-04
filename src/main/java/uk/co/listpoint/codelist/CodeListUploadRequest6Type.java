
package uk.co.listpoint.codelist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CodeListUploadRequest6Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodeListUploadRequest6Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.listpoint.co.uk/schemas/v6}CodeList" minOccurs="0"/>
 *         &lt;element name="UploadOptions" type="{http://www.listpoint.co.uk/messages/CodeList}UploadOptions6Structure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeListUploadRequest6Type", namespace = "http://www.listpoint.co.uk/messages/CodeList", propOrder = {
    "codeList",
    "uploadOptions",
    "userName",
    "password"
})
public class CodeListUploadRequest6Type {

    @XmlElement(name = "CodeList", namespace = "http://www.listpoint.co.uk/schemas/v6")
    protected CodeList6Structure codeList;
    @XmlElement(name = "UploadOptions")
    protected List<UploadOptions6Structure> uploadOptions;
    @XmlElement(name = "UserName")
    protected String userName;
    @XmlElement(name = "Password")
    protected String password;

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

    /**
     * Gets the value of the uploadOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uploadOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUploadOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UploadOptions6Structure }
     * 
     * 
     */
    public List<UploadOptions6Structure> getUploadOptions() {
        if (uploadOptions == null) {
            uploadOptions = new ArrayList<UploadOptions6Structure>();
        }
        return this.uploadOptions;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

}
