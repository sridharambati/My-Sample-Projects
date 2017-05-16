//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.15 at 08:09:49 PM CDT 
//


package trng.imcs.beans;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the trng.imcs.beans package. 
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

    private final static QName _Student_QNAME = new QName("http://IMCS.trng.XMl.xsd/Employee", "Student");
    private final static QName _Marks_QNAME = new QName("http://IMCS.trng.XMl.xsd/Employee", "Marks");
    private final static QName _Address_QNAME = new QName("http://www.example.org/Address", "Address");
    private final static QName _Home_QNAME = new QName("http://www.example.org/Address", "Home");
    private final static QName _Communication_QNAME = new QName("http://www.example.org/Address", "Communication");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: trng.imcs.beans
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link Marks }
     * 
     */
    public Marks createMarks() {
        return new Marks();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Home }
     * 
     */
    public Home createHome() {
        return new Home();
    }

    /**
     * Create an instance of {@link Communication }
     * 
     */
    public Communication createCommunication() {
        return new Communication();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Student }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://IMCS.trng.XMl.xsd/Employee", name = "Student")
    public JAXBElement<Student> createStudent(Student value) {
        return new JAXBElement<Student>(_Student_QNAME, Student.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Marks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://IMCS.trng.XMl.xsd/Employee", name = "Marks")
    public JAXBElement<Marks> createMarks(Marks value) {
        return new JAXBElement<Marks>(_Marks_QNAME, Marks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Address", name = "Address")
    public JAXBElement<Address> createAddress(Address value) {
        return new JAXBElement<Address>(_Address_QNAME, Address.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Home }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Address", name = "Home")
    public JAXBElement<Home> createHome(Home value) {
        return new JAXBElement<Home>(_Home_QNAME, Home.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Communication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Address", name = "Communication")
    public JAXBElement<Communication> createCommunication(Communication value) {
        return new JAXBElement<Communication>(_Communication_QNAME, Communication.class, null, value);
    }

}
