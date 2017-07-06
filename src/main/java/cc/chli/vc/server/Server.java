package cc.chli.vc.server;

import net.qiujuer.blink.BlinkServer;
import net.qiujuer.blink.core.Connector;

import java.io.IOException;

import org.apache.log4j.Logger;

import cc.chli.vc.util.ServerUtils;

/**
 * Test Server
 */
public class Server {
	
	private static Logger log = Logger.getLogger(Server.class);  
	
	public Server(){
		try{
			final CallBack callBack = new CallBack();
	
	        BlinkServer accept = new BlinkServer(new BlinkServer.ServerListener() {
	            @Override
	            public void onConnectClosed(Connector connector) {
	                System.out.println("onConnectClosed:" + connector.getId());
	            }
	
	            @Override
	            public void onConnectCreated(Connector connector) {
	                connector.setReceiveListener(callBack);
	                System.out.println("onConnectCreated:" + connector.getId());
	            }
	        });
	        accept.bind(2626);
	
	        log.info("server start.....");
	        //ServerUtils.readKey();
	
	        //accept.dispose();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
    
}
