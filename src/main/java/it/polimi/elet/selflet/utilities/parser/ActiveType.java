//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.31 at 02:00:19 PM CEST 
//


package it.polimi.elet.selflet.utilities.parser;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for activeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="activeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="mainService" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "activeType")
public class ActiveType {

    @XmlAttribute(required = true)
    protected String mainService;

    /**
     * Gets the value of the mainService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainService() {
        return mainService;
    }

    /**
     * Sets the value of the mainService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainService(String value) {
        this.mainService = value;
    }

}
