package user;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement
// required to add attribute
@XmlAccessorType(XmlAccessType.FIELD)
// ordered properties
@XmlType(propOrder = {"name", "age", "address"})
public class User {

    @XmlAttribute
    private int id;
    private String name;
    private int age;
    @XmlElementWrapper(name = "addresses")
    private List<Address> address;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", addresses=" + address +
                '}';
    }
}
