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
 * <p>Java-Klasse f�r message complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="message">
 *   &lt;complexContent>
 *     &lt;extension base="{}jaxbEntity">
 *       &lt;sequence>
 *         &lt;element name="dm" type="{}distributorMessage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}tl" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="t" use="required" type="{}messageType" />
 *       &lt;attribute name="from" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="to" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="c" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="int" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="elnk" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cat" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ec" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="ts" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pr" type="{}priority" />
 *       &lt;attribute name="o" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="del" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "message", propOrder = {
    "dm",
    "tl"
})
public class Message
    extends JaxbEntity
{

    protected List<DistributorMessage> dm;
    protected TripLabel tl;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "t", required = true)
    protected MessageType t;
    @XmlAttribute(name = "from")
    protected String from;
    @XmlAttribute(name = "to")
    protected String to;
    @XmlAttribute(name = "c")
    protected Integer c;
    @XmlAttribute(name = "int")
    protected String _int;
    @XmlAttribute(name = "ext")
    protected String ext;
    @XmlAttribute(name = "elnk")
    protected String elnk;
    @XmlAttribute(name = "cat")
    protected String cat;
    @XmlAttribute(name = "ec")
    protected Integer ec;
    @XmlAttribute(name = "ts", required = true)
    protected String ts;
    @XmlAttribute(name = "pr")
    protected String pr;
    @XmlAttribute(name = "o")
    protected String o;
    @XmlAttribute(name = "del")
    protected Integer del;

    /**
     * Gets the value of the dm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributorMessage }
     * 
     * 
     */
    public List<DistributorMessage> getDm() {
        if (dm == null) {
            dm = new ArrayList<DistributorMessage>();
        }
        return this.dm;
    }

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
     * Ruft den Wert der t-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MessageType }
     *     
     */
    public MessageType getT() {
        return t;
    }

    /**
     * Legt den Wert der t-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageType }
     *     
     */
    public void setT(MessageType value) {
        this.t = value;
    }

    /**
     * Ruft den Wert der from-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrom() {
        return from;
    }

    /**
     * Legt den Wert der from-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrom(String value) {
        this.from = value;
    }

    /**
     * Ruft den Wert der to-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTo() {
        return to;
    }

    /**
     * Legt den Wert der to-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTo(String value) {
        this.to = value;
    }

    /**
     * Ruft den Wert der c-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getC() {
        return c;
    }

    /**
     * Legt den Wert der c-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setC(Integer value) {
        this.c = value;
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
     * Ruft den Wert der ext-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExt() {
        return ext;
    }

    /**
     * Legt den Wert der ext-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExt(String value) {
        this.ext = value;
    }

    /**
     * Ruft den Wert der elnk-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElnk() {
        return elnk;
    }

    /**
     * Legt den Wert der elnk-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElnk(String value) {
        this.elnk = value;
    }

    /**
     * Ruft den Wert der cat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCat() {
        return cat;
    }

    /**
     * Legt den Wert der cat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCat(String value) {
        this.cat = value;
    }

    /**
     * Ruft den Wert der ec-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEc() {
        return ec;
    }

    /**
     * Legt den Wert der ec-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEc(Integer value) {
        this.ec = value;
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
     * Ruft den Wert der pr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPr() {
        return pr;
    }

    /**
     * Legt den Wert der pr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPr(String value) {
        this.pr = value;
    }

    /**
     * Ruft den Wert der o-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getO() {
        return o;
    }

    /**
     * Legt den Wert der o-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setO(String value) {
        this.o = value;
    }

    /**
     * Ruft den Wert der del-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDel() {
        return del;
    }

    /**
     * Legt den Wert der del-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDel(Integer value) {
        this.del = value;
    }

}
