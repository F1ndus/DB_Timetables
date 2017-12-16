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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r stop complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="stop">
 *   &lt;complexContent>
 *     &lt;extension base="{}jaxbEntity">
 *       &lt;sequence>
 *         &lt;element ref="{}conn" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}m" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ar" type="{}event" minOccurs="0"/>
 *         &lt;element name="dp" type="{}event" minOccurs="0"/>
 *         &lt;element name="hd" type="{}historicDelay" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hpc" type="{}historicPlatformChange" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rtr" type="{}referenceTripRelation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stop", propOrder = {
    "conn",
    "m",
    "ar",
    "dp",
    "hd",
    "hpc",
    "rtr"
})
@XmlSeeAlso({
    TripStop.class
})
public abstract class Stop
    extends JaxbEntity
{

    protected List<Connection> conn;
    protected List<Message> m;
    protected Event ar;
    protected Event dp;
    protected List<HistoricDelay> hd;
    protected List<HistoricPlatformChange> hpc;
    protected List<ReferenceTripRelation> rtr;

    /**
     * Gets the value of the conn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Connection }
     * 
     * 
     */
    public List<Connection> getConn() {
        if (conn == null) {
            conn = new ArrayList<Connection>();
        }
        return this.conn;
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
     * Ruft den Wert der ar-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Event }
     *     
     */
    public Event getAr() {
        return ar;
    }

    /**
     * Legt den Wert der ar-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Event }
     *     
     */
    public void setAr(Event value) {
        this.ar = value;
    }

    /**
     * Ruft den Wert der dp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Event }
     *     
     */
    public Event getDp() {
        return dp;
    }

    /**
     * Legt den Wert der dp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Event }
     *     
     */
    public void setDp(Event value) {
        this.dp = value;
    }

    /**
     * Gets the value of the hd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HistoricDelay }
     * 
     * 
     */
    public List<HistoricDelay> getHd() {
        if (hd == null) {
            hd = new ArrayList<HistoricDelay>();
        }
        return this.hd;
    }

    /**
     * Gets the value of the hpc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hpc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHpc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HistoricPlatformChange }
     * 
     * 
     */
    public List<HistoricPlatformChange> getHpc() {
        if (hpc == null) {
            hpc = new ArrayList<HistoricPlatformChange>();
        }
        return this.hpc;
    }

    /**
     * Gets the value of the rtr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rtr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRtr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceTripRelation }
     * 
     * 
     */
    public List<ReferenceTripRelation> getRtr() {
        if (rtr == null) {
            rtr = new ArrayList<ReferenceTripRelation>();
        }
        return this.rtr;
    }

}
