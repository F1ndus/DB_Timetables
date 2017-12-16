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
 * <p>Java-Klasse f�r historicDelay complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="historicDelay">
 *   &lt;complexContent>
 *     &lt;extension base="{}historicChange">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="ar" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dp" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="src" type="{}delaySource" />
 *       &lt;attribute name="cod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "historicDelay")
public class HistoricDelay
    extends HistoricChange
{

    @XmlAttribute(name = "ar")
    protected String ar;
    @XmlAttribute(name = "dp")
    protected String dp;
    @XmlAttribute(name = "src")
    protected DelaySource src;
    @XmlAttribute(name = "cod")
    protected String cod;

    /**
     * Ruft den Wert der ar-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAr() {
        return ar;
    }

    /**
     * Legt den Wert der ar-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAr(String value) {
        this.ar = value;
    }

    /**
     * Ruft den Wert der dp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDp() {
        return dp;
    }

    /**
     * Legt den Wert der dp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDp(String value) {
        this.dp = value;
    }

    /**
     * Ruft den Wert der src-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DelaySource }
     *     
     */
    public DelaySource getSrc() {
        return src;
    }

    /**
     * Legt den Wert der src-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DelaySource }
     *     
     */
    public void setSrc(DelaySource value) {
        this.src = value;
    }

    /**
     * Ruft den Wert der cod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCod() {
        return cod;
    }

    /**
     * Legt den Wert der cod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCod(String value) {
        this.cod = value;
    }

}
