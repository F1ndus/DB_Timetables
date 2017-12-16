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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r event complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="event">
 *   &lt;complexContent>
 *     &lt;extension base="{}jaxbEntity">
 *       &lt;sequence>
 *         &lt;element ref="{}m" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="cpth" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ppth" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cp" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pp" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ct" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cs" type="{}eventStatus" />
 *       &lt;attribute name="ps" type="{}eventStatus" />
 *       &lt;attribute name="hi" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="clt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="wings" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tra" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pde" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cde" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dc" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="l" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "event", propOrder = {
    "m"
})
public class Event
    extends JaxbEntity
{

    protected List<Message> m;
    @XmlAttribute(name = "cpth")
    protected String cpth;
    @XmlAttribute(name = "ppth")
    protected String ppth;
    @XmlAttribute(name = "cp")
    protected String cp;
    @XmlAttribute(name = "pp")
    protected String pp;
    @XmlAttribute(name = "ct")
    protected String ct;
    @XmlAttribute(name = "pt")
    protected String pt;
    @XmlAttribute(name = "cs")
    protected EventStatus cs;
    @XmlAttribute(name = "ps")
    protected EventStatus ps;
    @XmlAttribute(name = "hi")
    protected Integer hi;
    @XmlAttribute(name = "clt")
    protected String clt;
    @XmlAttribute(name = "wings")
    protected String wings;
    @XmlAttribute(name = "tra")
    protected String tra;
    @XmlAttribute(name = "pde")
    protected String pde;
    @XmlAttribute(name = "cde")
    protected String cde;
    @XmlAttribute(name = "dc")
    protected Integer dc;
    @XmlAttribute(name = "l")
    protected String l;

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
     * Ruft den Wert der cpth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpth() {
        return cpth;
    }

    /**
     * Legt den Wert der cpth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpth(String value) {
        this.cpth = value;
    }

    /**
     * Ruft den Wert der ppth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPpth() {
        return ppth;
    }

    /**
     * Legt den Wert der ppth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPpth(String value) {
        this.ppth = value;
    }

    /**
     * Ruft den Wert der cp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCp() {
        return cp;
    }

    /**
     * Legt den Wert der cp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCp(String value) {
        this.cp = value;
    }

    /**
     * Ruft den Wert der pp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPp() {
        return pp;
    }

    /**
     * Legt den Wert der pp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPp(String value) {
        this.pp = value;
    }

    /**
     * Ruft den Wert der ct-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCt() {
        return ct;
    }

    /**
     * Legt den Wert der ct-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCt(String value) {
        this.ct = value;
    }

    /**
     * Ruft den Wert der pt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPt() {
        return pt;
    }

    /**
     * Legt den Wert der pt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPt(String value) {
        this.pt = value;
    }

    /**
     * Ruft den Wert der cs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EventStatus }
     *     
     */
    public EventStatus getCs() {
        return cs;
    }

    /**
     * Legt den Wert der cs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EventStatus }
     *     
     */
    public void setCs(EventStatus value) {
        this.cs = value;
    }

    /**
     * Ruft den Wert der ps-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EventStatus }
     *     
     */
    public EventStatus getPs() {
        return ps;
    }

    /**
     * Legt den Wert der ps-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EventStatus }
     *     
     */
    public void setPs(EventStatus value) {
        this.ps = value;
    }

    /**
     * Ruft den Wert der hi-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHi() {
        return hi;
    }

    /**
     * Legt den Wert der hi-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHi(Integer value) {
        this.hi = value;
    }

    /**
     * Ruft den Wert der clt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClt() {
        return clt;
    }

    /**
     * Legt den Wert der clt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClt(String value) {
        this.clt = value;
    }

    /**
     * Ruft den Wert der wings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWings() {
        return wings;
    }

    /**
     * Legt den Wert der wings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWings(String value) {
        this.wings = value;
    }

    /**
     * Ruft den Wert der tra-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTra() {
        return tra;
    }

    /**
     * Legt den Wert der tra-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTra(String value) {
        this.tra = value;
    }

    /**
     * Ruft den Wert der pde-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPde() {
        return pde;
    }

    /**
     * Legt den Wert der pde-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPde(String value) {
        this.pde = value;
    }

    /**
     * Ruft den Wert der cde-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCde() {
        return cde;
    }

    /**
     * Legt den Wert der cde-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCde(String value) {
        this.cde = value;
    }

    /**
     * Ruft den Wert der dc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDc() {
        return dc;
    }

    /**
     * Legt den Wert der dc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDc(Integer value) {
        this.dc = value;
    }

    /**
     * Ruft den Wert der l-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getL() {
        return l;
    }

    /**
     * Legt den Wert der l-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setL(String value) {
        this.l = value;
    }

}
