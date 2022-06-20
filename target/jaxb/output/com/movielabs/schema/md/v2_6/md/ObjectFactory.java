//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.06.20 at 10:00:36 AM EDT 
//


package com.movielabs.schema.md.v2_6.md;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.movielabs.schema.md.v2_6.md package. 
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

    private final static QName _DisplayName_QNAME = new QName("http://www.movielabs.com/schema/md/v2.6/md", "DisplayName");
    private final static QName _Namespace_QNAME = new QName("http://www.movielabs.com/schema/md/v2.6/md", "Namespace");
    private final static QName _Identifier_QNAME = new QName("http://www.movielabs.com/schema/md/v2.6/md", "Identifier");
    private final static QName _Number_QNAME = new QName("http://www.movielabs.com/schema/md/v2.6/md", "Number");
    private final static QName _Country_QNAME = new QName("http://www.movielabs.com/schema/md/v2.6/md", "country");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.movielabs.schema.md.v2_6.md
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.movielabs.com/schema/md/v2.6/md", name = "DisplayName")
    public JAXBElement<String> createDisplayName(String value) {
        return new JAXBElement<String>(_DisplayName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.movielabs.com/schema/md/v2.6/md", name = "Namespace")
    public JAXBElement<String> createNamespace(String value) {
        return new JAXBElement<String>(_Namespace_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.movielabs.com/schema/md/v2.6/md", name = "Identifier")
    public JAXBElement<String> createIdentifier(String value) {
        return new JAXBElement<String>(_Identifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.movielabs.com/schema/md/v2.6/md", name = "Number")
    public JAXBElement<Short> createNumber(Short value) {
        return new JAXBElement<Short>(_Number_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.movielabs.com/schema/md/v2.6/md", name = "country")
    public JAXBElement<String> createCountry(String value) {
        return new JAXBElement<String>(_Country_QNAME, String.class, null, value);
    }

}