//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.09.23 at 09:27:22 PM MSK 
//


package com.epolsoft.sv_conf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="svConf" type="{http://epolsoft.com/sv_conf}svConf"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "svConf"
})
@XmlRootElement(name = "getSvConfByNameResponse")
public class GetSvConfByNameResponse {

    @XmlElement(required = true)
    protected SvConf svConf;

    /**
     * Gets the value of the svConf property.
     * 
     * @return
     *     possible object is
     *     {@link SvConf }
     *     
     */
    public SvConf getSvConf() {
        return svConf;
    }

    /**
     * Sets the value of the svConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvConf }
     *     
     */
    public void setSvConf(SvConf value) {
        this.svConf = value;
    }

}
