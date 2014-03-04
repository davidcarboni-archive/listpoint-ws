
package uk.co.listpoint.contextmap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CodeList6Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CodeList6Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="List"/>
 *     &lt;enumeration value="Hierarchy"/>
 *     &lt;enumeration value="Tree"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CodeList6Type", namespace = "http://www.listpoint.co.uk/schemas/v6")
@XmlEnum
public enum CodeList6Type {

    @XmlEnumValue("List")
    LIST("List"),
    @XmlEnumValue("Hierarchy")
    HIERARCHY("Hierarchy"),
    @XmlEnumValue("Tree")
    TREE("Tree");
    private final String value;

    CodeList6Type(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CodeList6Type fromValue(String v) {
        for (CodeList6Type c: CodeList6Type.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
