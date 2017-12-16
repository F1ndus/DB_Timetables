//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.12.16 um 06:26:06 PM CET 
//


package main.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r referenceTripRelation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="referenceTripRelation">
 *   &lt;complexContent>
 *     &lt;extension base="{}jaxbEntity">
 *       &lt;sequence>
 *         &lt;element name="rt" type="{}referenceTrip" minOccurs="0"/>
 *         &lt;element name="rts" type="{}referenceTripRelationToStop" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "referenceTripRelation", propOrder = {
    "rt",
    "rts"
})
public class ReferenceTripRelation
    extends JaxbEntity
{

    protected ReferenceTrip rt;
    @XmlSchemaType(name = "string")
    protected ReferenceTripRelationToStop rts;

    /**
     * Ruft den Wert der rt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceTrip }
     *     
     */
    public ReferenceTrip getRt() {
        return rt;
    }

    /**
     * Legt den Wert der rt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceTrip }
     *     
     */
    public void setRt(ReferenceTrip value) {
        this.rt = value;
    }

    /**
     * Ruft den Wert der rts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceTripRelationToStop }
     *     
     */
    public ReferenceTripRelationToStop getRts() {
        return rts;
    }

    /**
     * Legt den Wert der rts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceTripRelationToStop }
     *     
     */
    public void setRts(ReferenceTripRelationToStop value) {
        this.rts = value;
    }

}
