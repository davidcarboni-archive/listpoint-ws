
package uk.co.listpoint.contextmap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Relationship6Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Relationship6Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Supersedes"/>
 *     &lt;enumeration value="Based on"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Relationship6Type", namespace = "http://www.listpoint.co.uk/schemas/v6")
@XmlEnum
public enum Relationship6Type {

    @XmlEnumValue("Supersedes")
    SUPERSEDES("Supersedes"),
    @XmlEnumValue("Based on")
    BASED_ON("Based on");
    private final String value;

    Relationship6Type(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Relationship6Type fromValue(String v) {
        for (Relationship6Type c: Relationship6Type.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
