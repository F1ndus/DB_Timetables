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
 * <p>Java-Klasse f�r tripType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="tripType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="p"/>
 *     &lt;enumeration value="e"/>
 *     &lt;enumeration value="z"/>
 *     &lt;enumeration value="s"/>
 *     &lt;enumeration value="h"/>
 *     &lt;enumeration value="n"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tripType")
@XmlEnum
public enum TripType {

    @XmlEnumValue("p")
    P("p"),
    @XmlEnumValue("e")
    E("e"),
    @XmlEnumValue("z")
    Z("z"),
    @XmlEnumValue("s")
    S("s"),
    @XmlEnumValue("h")
    H("h"),
    @XmlEnumValue("n")
    N("n");
    private final String value;

    TripType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TripType fromValue(String v) {
        for (TripType c: TripType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
