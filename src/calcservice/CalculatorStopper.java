package calcservice;

import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import javax.xml.ws.Endpoint;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CalculatorStopper {

    //@SuppressWarnings("restriction")
    CalculatorStopper(final int port, final Endpoint endpoint) throws IOException {

        final HttpServer server = HttpServer.create(new InetSocketAddress(port), 5);
        final ExecutorService threads = Executors.newFixedThreadPool(2);
        server.setExecutor(threads);
        server.start();

        //communicate with your "container"
        HttpContext context = server.createContext("/stop");
        //now we'll override how the context handles a method
        context.setHandler(new HttpHandler() {
            @Override
            public void handle(HttpExchange msg) throws IOException {
                System.out.println("Shutting down endpoint");
                endpoint.stop();
                System.out.println("Endpoint stopped");
                msg.sendResponseHeaders(200, 0); //that's HTTP 200 and exit code 0
                msg.close();
                server.stop(1);
                threads.shutdown();
            }
        });
    }

}
