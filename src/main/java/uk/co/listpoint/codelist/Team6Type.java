
package uk.co.listpoint.codelist;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Team6Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Team6Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Not set"/>
 *     &lt;enumeration value="Owner Team"/>
 *     &lt;enumeration value="Steward Team"/>
 *     &lt;enumeration value="Administration Team"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Team6Type", namespace = "http://www.listpoint.co.uk/schemas/v6")
@XmlEnum
public enum Team6Type {

    @XmlEnumValue("Not set")
    NOT_SET("Not set"),
    @XmlEnumValue("Owner Team")
    OWNER_TEAM("Owner Team"),
    @XmlEnumValue("Steward Team")
    STEWARD_TEAM("Steward Team"),
    @XmlEnumValue("Administration Team")
    ADMINISTRATION_TEAM("Administration Team");
    private final String value;

    Team6Type(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Team6Type fromValue(String v) {
        for (Team6Type c: Team6Type.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
