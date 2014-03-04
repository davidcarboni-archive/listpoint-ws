
package uk.co.listpoint.contextmap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CodeListLevel6Structure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodeListLevel6Structure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodeListName" type="{http://www.listpoint.co.uk/schemas/v6}FullName6Structure"/>
 *         &lt;element name="LevelNumber" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="PersistentURL" type="{http://www.listpoint.co.uk/schemas/v6}URL6Type" minOccurs="0"/>
 *         &lt;element name="Cardinality" type="{http://www.listpoint.co.uk/schemas/v6}Cardinality6Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeListLevel6Structure", namespace = "http://www.listpoint.co.uk/schemas/v6", propOrder = {
    "codeListName",
    "levelNumber",
    "persistentURL",
    "cardinality"
})
public class CodeListLevel6Structure {

    @XmlElement(name = "CodeListName", required = true)
    protected FullName6Structure2 codeListName;
    @XmlElement(name = "LevelNumber")
    protected short levelNumber;
    @XmlElement(name = "PersistentURL")
    protected String persistentURL;
    @XmlElement(name = "Cardinality", required = true)
    protected String cardinality;

    /**
     * Gets the value of the codeListName property.
     * 
     * @return
     *     possible object is
     *     {@link FullName6Structure2 }
     *     
     */
    public FullName6Structure2 getCodeListName() {
        return codeListName;
    }

    /**
     * Sets the value of the codeListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullName6Structure2 }
     *     
     */
    public void setCodeListName(FullName6Structure2 value) {
        this.codeListName = value;
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

    /**
     * Gets the value of the persistentURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersistentURL() {
        return persistentURL;
    }

    /**
     * Sets the value of the persistentURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersistentURL(String value) {
        this.persistentURL = value;
    }

    /**
     * Gets the value of the cardinality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardinality() {
        return cardinality;
    }

    /**
     * Sets the value of the cardinality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardinality(String value) {
        this.cardinality = value;
    }

}
