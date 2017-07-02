package cc.chli.vc.handler;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;

public class HandlerTwo extends IoHandlerAdapter{

	@Override
	public void messageReceived(IoSession session, Object message) throws Exception {
		// TODO Auto-generated method stub
		super.messageReceived(session, message);
	}

	
}
