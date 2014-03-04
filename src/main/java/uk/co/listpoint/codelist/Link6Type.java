
package uk.co.listpoint.codelist;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Link6Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Link6Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Direct"/>
 *     &lt;enumeration value="Unmapped"/>
 *     &lt;enumeration value="Mapped"/>
 *     &lt;enumeration value="Borrowed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Link6Type", namespace = "http://www.listpoint.co.uk/schemas/v6")
@XmlEnum
public enum Link6Type {

    @XmlEnumValue("Direct")
    DIRECT("Direct"),
    @XmlEnumValue("Unmapped")
    UNMAPPED("Unmapped"),
    @XmlEnumValue("Mapped")
    MAPPED("Mapped"),
    @XmlEnumValue("Borrowed")
    BORROWED("Borrowed");
    private final String value;

    Link6Type(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Link6Type fromValue(String v) {
        for (Link6Type c: Link6Type.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
