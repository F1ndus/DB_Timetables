//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.12.16 um 06:26:06 PM CET 
//


package main.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r distributorType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="distributorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="s"/>
 *     &lt;enumeration value="r"/>
 *     &lt;enumeration value="f"/>
 *     &lt;enumeration value="x"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "distributorType")
@XmlEnum
public enum DistributorType {

    @XmlEnumValue("s")
    S("s"),
    @XmlEnumValue("r")
    R("r"),
    @XmlEnumValue("f")
    F("f"),
    @XmlEnumValue("x")
    X("x");
    private final String value;

    DistributorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DistributorType fromValue(String v) {
        for (DistributorType c: DistributorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
