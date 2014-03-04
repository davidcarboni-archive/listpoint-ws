
package uk.co.listpoint.codelist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UploadOptions6Structure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UploadOptions6Structure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NewContentOption" type="{http://www.listpoint.co.uk/messages/CodeList}UploadOption6Type"/>
 *         &lt;element name="MatchingContentOption" type="{http://www.listpoint.co.uk/messages/CodeList}UploadOption6Type"/>
 *         &lt;element name="MissingContentOption" type="{http://www.listpoint.co.uk/messages/CodeList}UploadOption6Type"/>
 *         &lt;element name="LevelNumber" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadOptions6Structure", namespace = "http://www.listpoint.co.uk/messages/CodeList", propOrder = {
    "newContentOption",
    "matchingContentOption",
    "missingContentOption",
    "levelNumber"
})
public class UploadOptions6Structure {

    @XmlElement(name = "NewContentOption", required = true)
    protected UploadOption6Type newContentOption;
    @XmlElement(name = "MatchingContentOption", required = true)
    protected UploadOption6Type matchingContentOption;
    @XmlElement(name = "MissingContentOption", required = true)
    protected UploadOption6Type missingContentOption;
    @XmlElement(name = "LevelNumber")
    protected short levelNumber;

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
     * Gets the value of the levelNumber property.
     * 
     */
    public short getLevelNumber() {
        return levelNumber;
    }

    /**
     * Sets the value of the levelNumber property.
     * 
     */
    public void setLevelNumber(short value) {
        this.levelNumber = value;
    }

}
