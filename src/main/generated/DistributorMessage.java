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
 * <p>Java-Klasse f�r distributorMessage complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="distributorMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="t" type="{}distributorType" />
 *       &lt;attribute name="n" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="int" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ts" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "distributorMessage")
public class DistributorMessage {

    @XmlAttribute(name = "t")
    protected DistributorType t;
    @XmlAttribute(name = "n")
    protected String n;
    @XmlAttribute(name = "int")
    protected String _int;
    @XmlAttribute(name = "ts")
    protected String ts;

    /**
     * Ruft den Wert der t-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DistributorType }
     *     
     */
    public DistributorType getT() {
        return t;
    }

    /**
     * Legt den Wert der t-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributorType }
     *     
     */
    public void setT(DistributorType value) {
        this.t = value;
    }

    /**
     * Ruft den Wert der n-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getN() {
        return n;
    }

    /**
     * Legt den Wert der n-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setN(String value) {
        this.n = value;
    }

    /**
     * Ruft den Wert der int-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInt() {
        return _int;
    }

    /**
     * Legt den Wert der int-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInt(String value) {
        this._int = value;
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

}
