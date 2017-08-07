package cc.chli.vc.model;

public class User {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.id
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	private String id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.username
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	private String username;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.password
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	private String password;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.locked
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	private Integer locked;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.salt
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	private String salt;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.id
	 * @return  the value of user.id
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	public String getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.id
	 * @param id  the value for user.id
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.username
	 * @return  the value of user.username
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.username
	 * @param username  the value for user.username
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.password
	 * @return  the value of user.password
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.password
	 * @param password  the value for user.password
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.locked
	 * @return  the value of user.locked
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	public Integer getLocked() {
		return locked;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.locked
	 * @param locked  the value for user.locked
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	public void setLocked(Integer locked) {
		this.locked = locked;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.salt
	 * @return  the value of user.salt
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	public String getSalt() {
		return salt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.salt
	 * @param salt  the value for user.salt
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String generateCredentialsSalt() {
		// TODO Auto-generated method stub
		return username + salt;
	}
}