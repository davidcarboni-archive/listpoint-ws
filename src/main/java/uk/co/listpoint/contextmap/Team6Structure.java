
package uk.co.listpoint.contextmap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Team6Structure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Team6Structure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Environment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PersistentURL" type="{http://www.listpoint.co.uk/schemas/v6}URL6Type" minOccurs="0"/>
 *         &lt;element name="TeamName" type="{http://www.listpoint.co.uk/schemas/v6}UserName6Type"/>
 *         &lt;element name="TeamFullName" type="{http://www.listpoint.co.uk/schemas/v6}TeamName6Type"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Organization" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TeamType" type="{http://www.listpoint.co.uk/schemas/v6}Team6Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Team6Structure", namespace = "http://www.listpoint.co.uk/schemas/v6", propOrder = {
    "environment",
    "persistentURL",
    "teamName",
    "teamFullName",
    "description",
    "organization",
    "teamType"
})
public class Team6Structure {

    @XmlElement(name = "Environment", required = true)
    protected String environment;
    @XmlElement(name = "PersistentURL")
    protected String persistentURL;
    @XmlElement(name = "TeamName", required = true)
    protected String teamName;
    @XmlElement(name = "TeamFullName", required = true)
    protected String teamFullName;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "Organization", required = true)
    protected String organization;
    @XmlElement(name = "TeamType", required = true)
    protected Team6Type teamType;

    /**
     * Gets the value of the environment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvironment() {
        return environment;
    }

    /**
     * Sets the value of the environment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvironment(String value) {
        this.environment = value;
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
     * Gets the value of the teamName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * Sets the value of the teamName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamName(String value) {
        this.teamName = value;
    }

    /**
     * Gets the value of the teamFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamFullName() {
        return teamFullName;
    }

    /**
     * Sets the value of the teamFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamFullName(String value) {
        this.teamFullName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganization(String value) {
        this.organization = value;
    }

    /**
     * Gets the value of the teamType property.
     * 
     * @return
     *     possible object is
     *     {@link Team6Type }
     *     
     */
    public Team6Type getTeamType() {
        return teamType;
    }

    /**
     * Sets the value of the teamType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Team6Type }
     *     
     */
    public void setTeamType(Team6Type value) {
        this.teamType = value;
    }

}
