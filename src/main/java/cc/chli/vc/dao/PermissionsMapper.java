package cc.chli.vc.dao;

import cc.chli.vc.model.Permissions;
import cc.chli.vc.model.PermissionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PermissionsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissions
     *
     * @mbg.generated Sun Aug 06 13:05:17 CST 2017
     */
    long countByExample(PermissionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissions
     *
     * @mbg.generated Sun Aug 06 13:05:17 CST 2017
     */
    int deleteByExample(PermissionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissions
     *
     * @mbg.generated Sun Aug 06 13:05:17 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissions
     *
     * @mbg.generated Sun Aug 06 13:05:17 CST 2017
     */
    int insert(Permissions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissions
     *
     * @mbg.generated Sun Aug 06 13:05:17 CST 2017
     */
    int insertSelective(Permissions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissions
     *
     * @mbg.generated Sun Aug 06 13:05:17 CST 2017
     */
    List<Permissions> selectByExample(PermissionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissions
     *
     * @mbg.generated Sun Aug 06 13:05:17 CST 2017
     */
    Permissions selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissions
     *
     * @mbg.generated Sun Aug 06 13:05:17 CST 2017
     */
    int updateByExampleSelective(@Param("record") Permissions record, @Param("example") PermissionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissions
     *
     * @mbg.generated Sun Aug 06 13:05:17 CST 2017
     */
    int updateByExample(@Param("record") Permissions record, @Param("example") PermissionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissions
     *
     * @mbg.generated Sun Aug 06 13:05:17 CST 2017
     */
    int updateByPrimaryKeySelective(Permissions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissions
     *
     * @mbg.generated Sun Aug 06 13:05:17 CST 2017
     */
    int updateByPrimaryKey(Permissions record);
}