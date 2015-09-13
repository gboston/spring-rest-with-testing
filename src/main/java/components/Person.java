package components;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
@XmlRootElement(name="person")
public class Person{
    private String name;
    private String lastName;
    private int age;
    private Address address;
    private Date birthDate;

    public Person() {
    }

    public Person(String name, String lastName, int age, Address address, Date birthDate) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.birthDate = birthDate;
    }
    @XmlElement
    public String getName() {
        return name;
    }
    @XmlElement
    public Address getAddress() {
        return address;
    }
}
