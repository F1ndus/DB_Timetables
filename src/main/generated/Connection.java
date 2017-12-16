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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r connection complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="connection">
 *   &lt;complexContent>
 *     &lt;extension base="{}jaxbEntity">
 *       &lt;sequence>
 *         &lt;element name="ref" type="{}timetableStop" minOccurs="0"/>
 *         &lt;element ref="{}s"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ts" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="eva" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cs" use="required" type="{}connectionStatus" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "connection", propOrder = {
    "ref",
    "s"
})
public class Connection
    extends JaxbEntity
{

    protected TimetableStop ref;
    @XmlElement(required = true)
    protected TimetableStop s;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "ts", required = true)
    protected String ts;
    @XmlAttribute(name = "eva")
    protected String eva;
    @XmlAttribute(name = "cs", required = true)
    protected ConnectionStatus cs;

    /**
     * Ruft den Wert der ref-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimetableStop }
     *     
     */
    public TimetableStop getRef() {
        return ref;
    }

    /**
     * Legt den Wert der ref-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimetableStop }
     *     
     */
    public void setRef(TimetableStop value) {
        this.ref = value;
    }

    /**
     * Ruft den Wert der s-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimetableStop }
     *     
     */
    public TimetableStop getS() {
        return s;
    }

    /**
     * Legt den Wert der s-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimetableStop }
     *     
     */
    public void setS(TimetableStop value) {
        this.s = value;
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
     * Ruft den Wert der ts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTs() {
        return ts;
    }

    /**
     * Legt den Wert der ts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTs(String value) {
        this.ts = value;
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
     * Ruft den Wert der cs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionStatus }
     *     
     */
    public ConnectionStatus getCs() {
        return cs;
    }

    /**
     * Legt den Wert der cs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionStatus }
     *     
     */
    public void setCs(ConnectionStatus value) {
        this.cs = value;
    }

}
