//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.12.16 um 06:26:06 PM CET 
//


package main.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r delaySource.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="delaySource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="NA"/>
 *     &lt;enumeration value="NM"/>
 *     &lt;enumeration value="V"/>
 *     &lt;enumeration value="IA"/>
 *     &lt;enumeration value="IM"/>
 *     &lt;enumeration value="A"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "delaySource")
@XmlEnum
public enum DelaySource {

    L,
    NA,
    NM,
    V,
    IA,
    IM,
    A;

    public String value() {
        return name();
    }

    public static DelaySource fromValue(String v) {
        return valueOf(v);
    }

}
