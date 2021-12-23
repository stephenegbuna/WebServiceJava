package calcservice;
import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService
public class Calculator {

    //private String message = "Hello, ";

    public Calculator(){

    }

    @WebMethod
    public int add(int x, int y){

        return x+y;
    }

    @WebMethod
    public int subtract(int x, int y){

        return x-y;
    }

    @WebMethod
    public int multiply(int x, int y){

        return x*y;
    }

    @WebMethod
    public int divide(int x, int y){

        return x/y;
    }


}
