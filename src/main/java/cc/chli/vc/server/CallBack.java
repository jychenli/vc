package cc.chli.vc.server;

import net.qiujuer.blink.box.ByteReceivePacket;
import net.qiujuer.blink.box.FileReceivePacket;
import net.qiujuer.blink.box.StringReceivePacket;
import net.qiujuer.blink.core.Connector;
import net.qiujuer.blink.core.PacketType;
import net.qiujuer.blink.core.ReceivePacket;
import net.qiujuer.blink.core.listener.ConnectListener;
import net.qiujuer.blink.core.listener.ReceiveListener;

import java.util.Arrays;

/**
 * Call Back status
 */
public class CallBack implements ReceiveListener, ConnectListener {

    @Override
    public void onReceiveStart(Connector connector, ReceivePacket packet) {
        System.out.println("Receive->start:" + packet.getId() + " " + packet.getPacketType());
    }

    @Override
    public void onReceiveProgress(Connector connector, ReceivePacket packet, float progress) {
        System.out.println("Receive->progress:" + progress);
    }

    @Override
    public void onReceiveCompleted(Connector connector, ReceivePacket packet) {
        if (packet.getPacketType() == PacketType.STRING)
            System.out.println("Receive->end: String:"
                    + packet.getId() + " " + packet.getLength() + " :"
                    + ((StringReceivePacket) packet).getEntity());
        else if (packet.getPacketType() == PacketType.BYTES)
            System.out.println("Receive->end: Bytes:"
                    + packet.getId() + " " + packet.getLength() + " :"
                    + Arrays.toString(((ByteReceivePacket) packet).getEntity()));
        else
            System.out.println("Receive->end: File:"
                    + packet.getId()
                    + " "
                    + packet.getLength()
                    + " :"
                    + ((FileReceivePacket) packet).getEntity()
                    .getPath() + " " + packet.getHash());
    }

    @Override
    public void onConnectClosed(Connector connector) {
        System.out.println("A BlinkDisconnect.");
    }
}
