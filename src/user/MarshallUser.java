package user;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.ArrayList;

public class MarshallUser {

    public static void main(String[] args) {

        ArrayList<Address> addresses = new ArrayList<>();

        User user1 = new User();
        user1.setId(1);
        user1.setName("Stephen");
        user1.setAge(39);
        Address address1 = new Address();
        address1.setPostcode("SW184UD");
        Address address2 = new Address();
        address2.setPostcode("SW18");
        addresses.add(address1);
        addresses.add( address2);

        user1.setAddress(addresses);


        File file1 = new File("user1.xml");

        try {
            JAXBContext ctx = JAXBContext.newInstance(User.class);
            Marshaller marshaller = ctx.createMarshaller();
            // prettified output
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(user1, file1);
            marshaller.marshal(user1, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
