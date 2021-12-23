package user;

import javax.xml.bind.annotation.XmlType;

@XmlType
public class Address {

    private String postcode;

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
}
