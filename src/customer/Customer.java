package customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"street", "town", "name", "postcode"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Customer {

    @XmlAttribute
    private int customerNr;
    private String street;
    private String town;
    private String name;
    private String postcode;

    public Customer() {
    }

    public Customer(int customerNr, String street, String town, String name, String postcode) {
        this.customerNr = customerNr;
        this.street = street;
        this.town = town;
        this.name = name;
        this.postcode = postcode;
    }

    public int getCustomerNr() {
        return customerNr;
    }

    public void setCustomerNr(int customerNr) {
        this.customerNr = customerNr;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNr=" + customerNr +
                ", street='" + street + '\'' +
                ", town='" + town + '\'' +
                ", name='" + name + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }
}
