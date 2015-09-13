package components;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="address")
public class Address{
    private String street;
    private String city;
    private String zipCode;
    private int streetNumber;

    public Address(String street, String city, String zipCode, int streetNumber) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.streetNumber = streetNumber;
    }

    public Address() {
    }

    @XmlElement
    public String getStreet() {
        return street;
    }
    @XmlElement
    public String getCity() {
        return city;
    }
    @XmlElement
    public String getZipCode() {
        return zipCode;
    }
    @XmlElement
    public int getStreetNumber() {
        return streetNumber;
    }
}
