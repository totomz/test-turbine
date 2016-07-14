package test.turbine;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import com.netflix.turbine.discovery.Instance;
//import com.netflix.turbine.discovery.InstanceDiscovery;

import it.myideas.chabotto.Chabotto;

public class ChabottoInstanceDiscovery /*implements InstanceDiscovery*/{

    private static final Logger log = LoggerFactory.getLogger(ChabottoInstanceDiscovery.class);
    
//    public Collection<Instance> getInstanceList() throws Exception {
//
//        log.info("Discoverying instances");
//        
//        return Stream.concat(
//                Chabotto.listInstances("aservice-hystrix"), 
//                Chabotto.listInstances("bclient-hystrix"))
//            .map(uri -> {System.out.println("Discovered: " + uri.getHost() + ":" + uri.getPort()); return uri;})
//            .map(uri -> {return  new Instance(uri.getHost() + ":" + uri.getPort(), "pippotest" , true);})
//            .collect(Collectors.toList());
//        
//    }

}
