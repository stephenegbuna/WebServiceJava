package service;

import calcservice.Calculator;

import javax.xml.ws.Endpoint;
import java.io.IOException;

public class HelloPublisher {

    public static void main(String[] args) {

        final String url = "http://localhost:9999/helloService";

        System.out.println("Publishing class Hello at endpoint: " + url);

        //Normally an interface (SEI or Service Endpoint Interface)
        //This is a SIB - Service Implementation Bean

        //Code to establish endpoint
        Endpoint endpoint = Endpoint.publish(url, new Hello());


        //Code to stop this service with another service
        //The stopper is built with this service, so it will stop with it.
        try {
            new HelloStopper(9998, endpoint);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
