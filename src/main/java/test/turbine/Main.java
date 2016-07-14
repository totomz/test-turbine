package test.turbine;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.turbine.init.TurbineInit;
import com.netflix.turbine.streaming.servlet.TurbineStreamServlet;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);
    
    public static void main(String[] args) throws Exception {
        
        log.info("Starting turbine server");
        
        int port = 8080;
        
     // Starting the Hystrix event metrics server
        Server server = new Server(port);
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.NO_SESSIONS);

        
        server.setHandler(context);
        final TurbineStreamServlet servlet = new TurbineStreamServlet();
        final ServletHolder holder = new ServletHolder(servlet);
        
        context.addServlet(holder, "/turbine.stream");
        context.addServlet(new ServletHolder(new SimpleServlet()), "/ciao");
        server.start();
        
        TurbineInit.init();
        
        log.info("Running on http://0.0.0.0:" + port + "/turbine.stream");
    }
    
}
