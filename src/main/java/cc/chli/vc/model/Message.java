package cc.chli.vc.model;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnore;

import cc.chli.vc.constants.MessageType;
import net.qiujuer.blink.core.Connector;

public class Message {

	private String id;

	private MessageType type;

	private String content;

	private Date time;
	
	private Connector connector;

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}



	public MessageType getType() {
		return type;
	}

	public void setType(MessageType type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@JsonIgnore
	public Connector getConnector() {
		return connector;
	}

	public void setConnector(Connector connector) {
		this.connector = connector;
	}

}
