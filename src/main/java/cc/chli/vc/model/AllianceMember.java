package cc.chli.vc.model;

public class AllianceMember {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column alliance_member.id
     *
     * @mbg.generated Sun Aug 06 13:05:17 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column alliance_member.alliance_id
     *
     * @mbg.generated Sun Aug 06 13:05:17 CST 2017
     */
    private Integer allianceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column alliance_member.user_id
     *
     * @mbg.generated Sun Aug 06 13:05:17 CST 2017
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column alliance_member.group_id
     *
     * @mbg.generated Sun Aug 06 13:05:17 CST 2017
     */
    private Integer groupId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column alliance_member.privileges
     *
     * @mbg.generated Sun Aug 06 13:05:17 CST 2017
     */
    private String privileges;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column alliance_member.id
     *
     * @return the value of alliance_member.id
     *
     * @mbg.generated Sun Aug 06 13:05:17 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column alliance_member.id
     *
     * @param id the value for alliance_member.id
     *
     * @mbg.generated Sun Aug 06 13:05:17 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column alliance_member.alliance_id
     *
     * @return the value of alliance_member.alliance_id
     *
     * @mbg.generated Sun Aug 06 13:05:17 CST 2017
     */
    public Integer getAllianceId() {
        return allianceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column alliance_member.alliance_id
     *
     * @param allianceId the value for alliance_member.alliance_id
     *
     * @mbg.generated Sun Aug 06 13:05:17 CST 2017
     */
    public void setAllianceId(Integer allianceId) {
        this.allianceId = allianceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column alliance_member.user_id
     *
     * @return the value of alliance_member.user_id
     *
     * @mbg.generated Sun Aug 06 13:05:17 CST 2017
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column alliance_member.user_id
     *
     * @param userId the value for alliance_member.user_id
     *
     * @mbg.generated Sun Aug 06 13:05:17 CST 2017
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column alliance_member.group_id
     *
     * @return the value of alliance_member.group_id
     *
     * @mbg.generated Sun Aug 06 13:05:17 CST 2017
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column alliance_member.group_id
     *
     * @param groupId the value for alliance_member.group_id
     *
     * @mbg.generated Sun Aug 06 13:05:17 CST 2017
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column alliance_member.privileges
     *
     * @return the value of alliance_member.privileges
     *
     * @mbg.generated Sun Aug 06 13:05:17 CST 2017
     */
    public String getPrivileges() {
        return privileges;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column alliance_member.privileges
     *
     * @param privileges the value for alliance_member.privileges
     *
     * @mbg.generated Sun Aug 06 13:05:17 CST 2017
     */
    public void setPrivileges(String privileges) {
        this.privileges = privileges;
    }
}