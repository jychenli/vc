package cc.chli.vc.constants;

import org.codehaus.jackson.annotate.JsonValue;

/**
 * 消息对象类型
 * @author jeremy
 *
 */
public enum MessageType {

	HEART_BEAT("heartbeat"), COMMADN("command"), ERROR("error");

	private String name;

	private MessageType(String name) {
		this.name = name;
	}

	@JsonValue
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
