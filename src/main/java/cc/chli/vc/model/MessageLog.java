package cc.chli.vc.model;

import java.util.Date;

public class MessageLog {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column message_log.id
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	private String id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column message_log.type
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	private String type;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column message_log.content
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	private String content;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column message_log.time
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	private Date time;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column message_log.ip
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	private String ip;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column message_log.id
	 * @return  the value of message_log.id
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	public String getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column message_log.id
	 * @param id  the value for message_log.id
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column message_log.type
	 * @return  the value of message_log.type
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	public String getType() {
		return type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column message_log.type
	 * @param type  the value for message_log.type
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column message_log.content
	 * @return  the value of message_log.content
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	public String getContent() {
		return content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column message_log.content
	 * @param content  the value for message_log.content
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column message_log.time
	 * @return  the value of message_log.time
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column message_log.time
	 * @param time  the value for message_log.time
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	public void setTime(Date time) {
		this.time = time;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column message_log.ip
	 * @return  the value of message_log.ip
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column message_log.ip
	 * @param ip  the value for message_log.ip
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}
}