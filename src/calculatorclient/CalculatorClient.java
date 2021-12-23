package calculatorclient;

public class CalculatorClient {

    public static void main(String[] args) {
        CalculatorService service = new CalculatorService();
        Calculator port = service.getCalculatorPort();
        int add = port.add(1, 1);
        int subtract = port.subtract(5, 3);
        int multiply = port.multiply(2, 1);
        int divide = port.divide(6, 3);
        System.out.println("" + add + subtract + multiply + divide);
    }
}
