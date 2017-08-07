package cc.chli.vc.dao;

import cc.chli.vc.model.MessageLog;
import cc.chli.vc.model.MessageLogExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

public interface MessageLogMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table message_log
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	long countByExample(MessageLogExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table message_log
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	int deleteByExample(MessageLogExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table message_log
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table message_log
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	int insert(MessageLog record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table message_log
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	int insertSelective(MessageLog record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table message_log
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	List<MessageLog> selectByExample(MessageLogExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table message_log
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	MessageLog selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table message_log
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	int updateByExampleSelective(@Param("record") MessageLog record, @Param("example") MessageLogExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table message_log
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	int updateByExample(@Param("record") MessageLog record, @Param("example") MessageLogExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table message_log
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	int updateByPrimaryKeySelective(MessageLog record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table message_log
	 * @mbg.generated  Sun Aug 06 13:05:17 CST 2017
	 */
	int updateByPrimaryKey(MessageLog record);
}