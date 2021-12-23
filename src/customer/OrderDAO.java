package customer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderDAO {

    private List<Order> orderList = new ArrayList<>();

    public OrderDAO() {
        Customer williams = new Customer(1317, "Williams","15, London Road", "Manchester", "M13 6TR");
        orderList.add(new Order(1000, "MW97", 100, "MicroWare Office", 305, williams, new Date()));
        orderList.add(new Order(1002, "XM21", 5, "XVision Monitor", 712, williams, new Date()));
        Customer smith = new Customer(1036, "Smith","22, Gresham Court", "Wivenhoe", "CO15 7VD");
        orderList.add(new Order(1003, "DS96", 3, "IPhone 22", 410, smith, new Date()));
        orderList.add(new Order(1004, "MW97", 200, "MicroWare Office", 305, smith, new Date()));
        orderList.add(new Order(1005, "ASM2", 20, "Activan", 55, smith, new Date()));

    }

    public List<Order> getAllOrders() {
        return orderList;
    }

}