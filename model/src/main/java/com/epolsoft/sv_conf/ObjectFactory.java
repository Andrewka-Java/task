//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.09.23 at 06:26:27 PM MSK 
//


package com.epolsoft.sv_conf;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.epolsoft.sv_conf package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.epolsoft.sv_conf
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddSvConfRequest }
     * 
     */
    public AddSvConfRequest createAddSvConfRequest() {
        return new AddSvConfRequest();
    }

    /**
     * Create an instance of {@link SvConf }
     * 
     */
    public SvConf createSvConf() {
        return new SvConf();
    }

    /**
     * Create an instance of {@link GetAllSvConfResponse }
     * 
     */
    public GetAllSvConfResponse createGetAllSvConfResponse() {
        return new GetAllSvConfResponse();
    }

    /**
     * Create an instance of {@link UpdateSvConfRequest }
     * 
     */
    public UpdateSvConfRequest createUpdateSvConfRequest() {
        return new UpdateSvConfRequest();
    }

    /**
     * Create an instance of {@link GetAllSvConfRequest }
     * 
     */
    public GetAllSvConfRequest createGetAllSvConfRequest() {
        return new GetAllSvConfRequest();
    }

    /**
     * Create an instance of {@link DeleteSvConfRequest }
     * 
     */
    public DeleteSvConfRequest createDeleteSvConfRequest() {
        return new DeleteSvConfRequest();
    }

}
