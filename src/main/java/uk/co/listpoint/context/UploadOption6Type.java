
package uk.co.listpoint.context;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UploadOption6Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UploadOption6Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Append"/>
 *     &lt;enumeration value="Ignore"/>
 *     &lt;enumeration value="Replace"/>
 *     &lt;enumeration value="Delete"/>
 *     &lt;enumeration value="Retain"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UploadOption6Type", namespace = "http://www.listpoint.co.uk/messages/Context")
@XmlEnum
public enum UploadOption6Type {

    @XmlEnumValue("Append")
    APPEND("Append"),
    @XmlEnumValue("Ignore")
    IGNORE("Ignore"),
    @XmlEnumValue("Replace")
    REPLACE("Replace"),
    @XmlEnumValue("Delete")
    DELETE("Delete"),
    @XmlEnumValue("Retain")
    RETAIN("Retain");
    private final String value;

    UploadOption6Type(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UploadOption6Type fromValue(String v) {
        for (UploadOption6Type c: UploadOption6Type.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
