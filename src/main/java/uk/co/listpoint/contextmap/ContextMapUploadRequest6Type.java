
package uk.co.listpoint.contextmap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContextMapUploadRequest6Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContextMapUploadRequest6Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.listpoint.co.uk/schemas/v6}ContextMap" minOccurs="0"/>
 *         &lt;element name="NewContentOption" type="{http://www.listpoint.co.uk/messages/ContextMap}UploadOption6Type"/>
 *         &lt;element name="MatchingContentOption" type="{http://www.listpoint.co.uk/messages/ContextMap}UploadOption6Type"/>
 *         &lt;element name="MissingContentOption" type="{http://www.listpoint.co.uk/messages/ContextMap}UploadOption6Type"/>
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
@XmlType(name = "ContextMapUploadRequest6Type", namespace = "http://www.listpoint.co.uk/messages/ContextMap", propOrder = {
    "contextMap",
    "newContentOption",
    "matchingContentOption",
    "missingContentOption",
    "userName",
    "password"
})
public class ContextMapUploadRequest6Type {

    @XmlElement(name = "ContextMap", namespace = "http://www.listpoint.co.uk/schemas/v6")
    protected ContextMap6Structure contextMap;
    @XmlElement(name = "NewContentOption", required = true)
    protected UploadOption6Type newContentOption;
    @XmlElement(name = "MatchingContentOption", required = true)
    protected UploadOption6Type matchingContentOption;
    @XmlElement(name = "MissingContentOption", required = true)
    protected UploadOption6Type missingContentOption;
    @XmlElement(name = "UserName")
    protected String userName;
    @XmlElement(name = "Password")
    protected String password;

    /**
     * Gets the value of the contextMap property.
     * 
     * @return
     *     possible object is
     *     {@link ContextMap6Structure }
     *     
     */
    public ContextMap6Structure getContextMap() {
        return contextMap;
    }

    /**
     * Sets the value of the contextMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextMap6Structure }
     *     
     */
    public void setContextMap(ContextMap6Structure value) {
        this.contextMap = value;
    }

    /**
     * Gets the value of the newContentOption property.
     * 
     * @return
     *     possible object is
     *     {@link UploadOption6Type }
     *     
     */
    public UploadOption6Type getNewContentOption() {
        return newContentOption;
    }

    /**
     * Sets the value of the newContentOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadOption6Type }
     *     
     */
    public void setNewContentOption(UploadOption6Type value) {
        this.newContentOption = value;
    }

    /**
     * Gets the value of the matchingContentOption property.
     * 
     * @return
     *     possible object is
     *     {@link UploadOption6Type }
     *     
     */
    public UploadOption6Type getMatchingContentOption() {
        return matchingContentOption;
    }

    /**
     * Sets the value of the matchingContentOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadOption6Type }
     *     
     */
    public void setMatchingContentOption(UploadOption6Type value) {
        this.matchingContentOption = value;
    }

    /**
     * Gets the value of the missingContentOption property.
     * 
     * @return
     *     possible object is
     *     {@link UploadOption6Type }
     *     
     */
    public UploadOption6Type getMissingContentOption() {
        return missingContentOption;
    }

    /**
     * Sets the value of the missingContentOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadOption6Type }
     *     
     */
    public void setMissingContentOption(UploadOption6Type value) {
        this.missingContentOption = value;
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
