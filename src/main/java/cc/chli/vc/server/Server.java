package cc.chli.vc.server;

import net.qiujuer.blink.BlinkConnect;
import net.qiujuer.blink.BlinkServer;
import net.qiujuer.blink.box.StringSendPacket;
import net.qiujuer.blink.core.Connector;

import java.io.IOException;

import org.apache.log4j.Logger;


import cc.chli.vc.handler.CallBack;

/**
 * Test Server
 */
public class Server {
	
	
	private BlinkServer accept;
	
	private static Logger log = Logger.getLogger(Server.class);
	
	public void initialize(){
		try{
			final CallBack callBack = new CallBack();
	
	         accept = new BlinkServer(new BlinkServer.ServerListener() {
	            @Override
	            public void onConnectClosed(Connector connector) {
	                System.out.println("onConnectClosed:" + connector.getId());
	            }
	
	            @Override
	            public void onConnectCreated(Connector connector) {
	                connector.setReceiveListener(callBack);
	                System.out.println("onConnectCreated:" + connector.getId());
	               
	                //BlinkConnect conn = (BlinkConnect)connector;
	             /*   try{
	                StringSendPacket entity = new StringSendPacket("ssss", null);
	                    connector.send(entity);
	                }catch(Exception ex){
	                	ex.printStackTrace();
	                }*/
	                accept.getConnectors().get(0).send("ssss");
	                
	            }
	        });
	        accept.bind(2626);
	        
	        
	
	        log.debug("server start.....");
	        //ServerUtils.readKey();
	
	        //accept.dispose();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	public void destroy(){
		if(accept!=null && accept.isAlive())
		accept.dispose();
	}
    
}
