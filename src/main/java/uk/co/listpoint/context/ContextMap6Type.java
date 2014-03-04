
package uk.co.listpoint.context;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContextMap6Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContextMap6Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Self-to-self"/>
 *     &lt;enumeration value="Interface"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContextMap6Type", namespace = "http://www.listpoint.co.uk/schemas/v6")
@XmlEnum
public enum ContextMap6Type {

    @XmlEnumValue("Self-to-self")
    SELF_TO_SELF("Self-to-self"),
    @XmlEnumValue("Interface")
    INTERFACE("Interface");
    private final String value;

    ContextMap6Type(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContextMap6Type fromValue(String v) {
        for (ContextMap6Type c: ContextMap6Type.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
