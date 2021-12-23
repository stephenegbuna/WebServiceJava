package customer;

import javax.xml.bind.annotation.*;
import java.util.Date;

@XmlRootElement(name = "order")
@XmlType(propOrder = {"productCode", "quantity", "description", "salesPrice", "customer", "orderDate"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Order {

    @XmlAttribute
    private int orderNr;
    private String productCode;
    private int quantity;
    private String description;
    private double salesPrice;
    private Customer customer;
    private Date orderDate;

    public Order() {
    }

    public Order(int orderNr, String productCode, int quantity, String description, double salesPrice, Customer customer, Date orderDate) {
        this.orderNr = orderNr;
        this.productCode = productCode;
        this.quantity = quantity;
        this.description = description;
        this.salesPrice = salesPrice;
        this.customer = customer;
        this.orderDate = orderDate;
    }

    public int getOrderNr() {
        return orderNr;
    }

    public void setOrderNr(int orderNr) {
        this.orderNr = orderNr;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNr=" + orderNr +
                ", productCode='" + productCode + '\'' +
                ", quantity=" + quantity +
                ", description='" + description + '\'' +
                ", salesPrice=" + salesPrice +
                ", customer=" + customer +
                ", orderDate=" + orderDate +
                '}';
    }
}
