package cc.chli.vc.test;

import net.qiujuer.blink.BlinkClient;
import net.qiujuer.blink.core.SendPacket;
import net.qiujuer.blink.core.listener.SendListener;

import java.io.File;
import java.io.IOException;

import cc.chli.vc.handler.CallBack;
import cc.chli.vc.util.ServerUtils;

/**
 * Blink Client
 */
public class Client {
    private static void send(BlinkClient connect) {
        System.out.println("Client Sending...");

        System.out.println("Send Some String.");
        for (int i = 0; i <= 50; i++) {
            connect.send("Blink String:" + i);
        }

        System.out.println("Send Some Bytes.");
        connect.send(new byte[]{1, 1, 0, 0});
        connect.send(new byte[]{1, 1, 1, 0, 1});

        System.out.println("Send A File.(D:/Data.txt)");
        /*connect.send(new File("F:\\TDDOWNLOAD\\Game\\LIMBO.zip"),
                new SendListener() {
                    @Override
                    public void onSendStart(SendPacket packet) {
                        System.out.println("Send File Start.");
                    }

                    @Override
                    public void onSendProgress(SendPacket packet, float progress) {
                        System.out.println("Send File Progress:" + progress);
                    }

                    @Override
                    public void onSendCompleted(SendPacket packet) {
                        System.out.println("Send File Completed.");
                    }
                });*/
    }

    public static void main(String[] args) throws IOException {

        CallBack callBack = new CallBack();

        BlinkClient connect = new BlinkClient();
        connect.setConnectListener(callBack);
        connect.setReceiveListener(callBack);

        connect.connect("127.0.0.1", 2626);

        send(connect);

        ServerUtils.readKey();

        connect.dispose();
    }
}
