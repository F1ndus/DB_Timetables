//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.12.16 um 06:26:06 PM CET 
//


package main.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r tripStop complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="tripStop">
 *   &lt;complexContent>
 *     &lt;extension base="{}stop">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="i" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="eva" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="jt" type="{}junctionType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tripStop")
public class TripStop
    extends Stop
{

    @XmlAttribute(name = "i", required = true)
    protected int i;
    @XmlAttribute(name = "eva", required = true)
    protected String eva;
    @XmlAttribute(name = "jt")
    protected JunctionType jt;

    /**
     * Ruft den Wert der i-Eigenschaft ab.
     * 
     */
    public int getI() {
        return i;
    }

    /**
     * Legt den Wert der i-Eigenschaft fest.
     * 
     */
    public void setI(int value) {
        this.i = value;
    }

    /**
     * Ruft den Wert der eva-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEva() {
        return eva;
    }

    /**
     * Legt den Wert der eva-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEva(String value) {
        this.eva = value;
    }

    /**
     * Ruft den Wert der jt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JunctionType }
     *     
     */
    public JunctionType getJt() {
        return jt;
    }

    /**
     * Legt den Wert der jt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JunctionType }
     *     
     */
    public void setJt(JunctionType value) {
        this.jt = value;
    }

}
