package service;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService
public class Hello {

    private String message = "Hello, ";

    public Hello(){

    }

    @WebMethod
    public String sayHello(String name){

        return message + name;
    }


}
