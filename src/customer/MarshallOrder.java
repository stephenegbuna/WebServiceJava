package customer;



import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.List;

public class MarshallOrder {


    public static void main(String[] args) {

        File file = new File("order.xml");

        OrderDAO orderDAO = new OrderDAO();
        List<Order> orders = orderDAO.getAllOrders();

        try {
            JAXBContext ctx = JAXBContext.newInstance(Order.class);
            Marshaller marshaller = ctx.createMarshaller();
            // prettified output
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            for (Order order1: orders){

                marshaller.marshal(order1, file);
                marshaller.marshal(order1, System.out);
            }

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }


}
