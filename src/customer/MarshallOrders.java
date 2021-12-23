package customer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class MarshallOrders {

    public static void main(String[] args) {
        Orders orders = new Orders();
        orders.setOrders(new ArrayList<>());

        JAXBContext ctx;

        try {
            FileOutputStream out = new FileOutputStream("orders.xml");
            OrderDAO dao = new OrderDAO();
            orders.getOrders().addAll(dao.getAllOrders());
            ctx = JAXBContext.newInstance(Orders.class);
            Marshaller marshaller = ctx.createMarshaller();
            //beautify with JAXB_FORMATTED_OUTPUT
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(orders, System.out);
            marshaller.marshal(orders, out);
            out.close();
        } catch (JAXBException | IOException e) {
            e.printStackTrace();
        }
    }
}
