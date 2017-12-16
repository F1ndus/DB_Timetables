//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.12.16 um 06:26:06 PM CET 
//


package main.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r trip complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="trip">
 *   &lt;complexContent>
 *     &lt;extension base="{}jaxbEntity">
 *       &lt;sequence>
 *         &lt;element ref="{}tl"/>
 *         &lt;element ref="{}s" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trip", propOrder = {
    "tl",
    "s"
})
public class Trip
    extends JaxbEntity
{

    @XmlElement(required = true)
    protected TripLabel tl;
    protected List<TimetableStop> s;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Ruft den Wert der tl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TripLabel }
     *     
     */
    public TripLabel getTl() {
        return tl;
    }

    /**
     * Legt den Wert der tl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TripLabel }
     *     
     */
    public void setTl(TripLabel value) {
        this.tl = value;
    }

    /**
     * Gets the value of the s property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the s property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimetableStop }
     * 
     * 
     */
    public List<TimetableStop> getS() {
        if (s == null) {
            s = new ArrayList<TimetableStop>();
        }
        return this.s;
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

}
