package athlete;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MarshallAthlete {

    public static void main(String[] args) {

        File file = new File("athlete.xml");

        try {
            JAXBContext ctx = JAXBContext.newInstance(Athlete.class);
            Marshaller marshaller = ctx.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            Athlete athleteBolt = createAthlete();
            marshaller.marshal(athleteBolt, System.out);
            marshaller.marshal(athleteBolt, file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

    public static Athlete createAthlete(){
        Person bolt = new Person("Usain Bolt", 37, "Male");
        List<String> list = new ArrayList<>();
        list.add("6 olympic medals");
        list.add("fastest human");
        list.add("Currently 100m world record");
        return new Athlete(bolt, "Jamaica", list);
    }
}
