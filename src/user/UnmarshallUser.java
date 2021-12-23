package user;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class UnmarshallUser {

    public static void main(String[] args) {
        File file = new File("user1.xml");

        try {
            JAXBContext ctx = JAXBContext.newInstance(User.class);
            Unmarshaller unmarshaller = ctx.createUnmarshaller();
            User user2 = (User) unmarshaller.unmarshal(file);
            System.out.println(user2);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
