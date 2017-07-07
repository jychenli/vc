package cc.chli.vc.test;

import net.qiujuer.blink.BlinkClient;

import java.io.IOException;
import java.util.Date;


import cc.chli.vc.constants.MessageType;
import cc.chli.vc.handler.CallBack;
import cc.chli.vc.model.Message;
import cc.chli.vc.util.JsonUtils;
import cc.chli.vc.util.ServerUtils;
import cc.chli.vc.util.StringUtilsExtend;

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
        
        Message m = new Message();
        m.setId(StringUtilsExtend.getUUID());
        m.setTime(new Date());
        m.setType(MessageType.HEART_BEAT);
        m.setContent("1");

        connect.send(JsonUtils.encode(m));
        System.out.println("Send Some Bytes.");
        connect.send(new byte[]{1, 1, 0, 0});
        connect.send(new byte[]{1, 1, 1, 0, 1});

        System.out.println("Send A File.(D:/Data.txt)");
       /* connect.send(new File("F:\\TDDOWNLOAD\\Game\\LIMBO.zip"),
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
