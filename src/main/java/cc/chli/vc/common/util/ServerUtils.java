
package cc.chli.vc.common.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.log4j.Logger;


public class ServerUtils {
	
	private static Logger log = Logger.getLogger(ServerUtils.class);  
	
    public static void readKey() {
        System.out.println("=========PRESS ANY KEY TO EXIT==========");
        try {
            new BufferedReader(new InputStreamReader(System.in)).readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
