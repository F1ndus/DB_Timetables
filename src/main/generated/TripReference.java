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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r tripReference complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="tripReference">
 *   &lt;complexContent>
 *     &lt;extension base="{}jaxbEntity">
 *       &lt;sequence>
 *         &lt;element ref="{}tl" minOccurs="0"/>
 *         &lt;element name="rt" type="{}referenceTrip" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tripReference", propOrder = {
    "tl",
    "rt"
})
public class TripReference
    extends JaxbEntity
{

    protected TripLabel tl;
    protected List<ReferenceTrip> rt;

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
     * Gets the value of the rt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceTrip }
     * 
     * 
     */
    public List<ReferenceTrip> getRt() {
        if (rt == null) {
            rt = new ArrayList<ReferenceTrip>();
        }
        return this.rt;
    }

}
