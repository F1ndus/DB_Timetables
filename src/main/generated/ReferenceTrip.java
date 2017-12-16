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
 * <p>Java-Klasse f�r referenceTrip complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="referenceTrip">
 *   &lt;complexContent>
 *     &lt;extension base="{}jaxbEntity">
 *       &lt;sequence>
 *         &lt;element name="rtl" type="{}referenceTripLabel" minOccurs="0"/>
 *         &lt;element name="sd" type="{}referenceTripStopLabel" minOccurs="0"/>
 *         &lt;element name="ea" type="{}referenceTripStopLabel" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="c" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "referenceTrip", propOrder = {
    "rtl",
    "sd",
    "ea"
})
public class ReferenceTrip
    extends JaxbEntity
{

    protected ReferenceTripLabel rtl;
    protected ReferenceTripStopLabel sd;
    protected ReferenceTripStopLabel ea;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "c", required = true)
    protected boolean c;

    /**
     * Ruft den Wert der rtl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceTripLabel }
     *     
     */
    public ReferenceTripLabel getRtl() {
        return rtl;
    }

    /**
     * Legt den Wert der rtl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceTripLabel }
     *     
     */
    public void setRtl(ReferenceTripLabel value) {
        this.rtl = value;
    }

    /**
     * Ruft den Wert der sd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceTripStopLabel }
     *     
     */
    public ReferenceTripStopLabel getSd() {
        return sd;
    }

    /**
     * Legt den Wert der sd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceTripStopLabel }
     *     
     */
    public void setSd(ReferenceTripStopLabel value) {
        this.sd = value;
    }

    /**
     * Ruft den Wert der ea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceTripStopLabel }
     *     
     */
    public ReferenceTripStopLabel getEa() {
        return ea;
    }

    /**
     * Legt den Wert der ea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceTripStopLabel }
     *     
     */
    public void setEa(ReferenceTripStopLabel value) {
        this.ea = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der c-Eigenschaft ab.
     * 
     */
    public boolean isC() {
        return c;
    }

    /**
     * Legt den Wert der c-Eigenschaft fest.
     * 
     */
    public void setC(boolean value) {
        this.c = value;
    }

}
