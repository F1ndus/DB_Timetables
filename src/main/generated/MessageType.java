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
 * <p>Java-Klasse f�r messageType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="messageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="h"/>
 *     &lt;enumeration value="q"/>
 *     &lt;enumeration value="f"/>
 *     &lt;enumeration value="d"/>
 *     &lt;enumeration value="i"/>
 *     &lt;enumeration value="u"/>
 *     &lt;enumeration value="r"/>
 *     &lt;enumeration value="c"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "messageType")
@XmlEnum
public enum MessageType {

    @XmlEnumValue("h")
    H("h"),
    @XmlEnumValue("q")
    Q("q"),
    @XmlEnumValue("f")
    F("f"),
    @XmlEnumValue("d")
    D("d"),
    @XmlEnumValue("i")
    I("i"),
    @XmlEnumValue("u")
    U("u"),
    @XmlEnumValue("r")
    R("r"),
    @XmlEnumValue("c")
    C("c");
    private final String value;

    MessageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageType fromValue(String v) {
        for (MessageType c: MessageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
