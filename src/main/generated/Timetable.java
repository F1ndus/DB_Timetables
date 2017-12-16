//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.12.16 um 06:26:06 PM CET 
//


package main.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;


/**
 * <p>Java-Klasse f�r timetable complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="timetable">
 *   &lt;complexContent>
 *     &lt;extension base="{}jaxbEntity">
 *       &lt;sequence>
 *         &lt;element ref="{}s" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}m" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="station" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="eva" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "timetable", propOrder = {
    "s",
    "m"
})

@XmlRootElement(name="timetable")
public class Timetable
    extends JaxbEntity
{

    protected List<TimetableStop> s;
    protected List<Message> m;
    @XmlAttribute(name = "station")
    protected String station;
    @XmlAttribute(name = "eva")
    protected String eva;

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
     * Gets the value of the m property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the m property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Message }
     * 
     * 
     */
    public List<Message> getM() {
        if (m == null) {
            m = new ArrayList<Message>();
        }
        return this.m;
    }

    /**
     * Ruft den Wert der station-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStation() {
        return station;
    }

    /**
     * Legt den Wert der station-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStation(String value) {
        this.station = value;
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

}
