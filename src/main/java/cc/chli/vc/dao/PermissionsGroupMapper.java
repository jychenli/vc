package cc.chli.vc.dao;

import cc.chli.vc.model.PermissionsGroup;
import cc.chli.vc.model.PermissionsGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PermissionsGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissions_group
     *
     * @mbg.generated Sun Aug 06 13:05:17 CST 2017
     */
    long countByExample(PermissionsGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissions_group
     *
     * @mbg.generated Sun Aug 06 13:05:17 CST 2017
     */
    int deleteByExample(PermissionsGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissions_group
     *
     * @mbg.generated Sun Aug 06 13:05:17 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissions_group
     *
     * @mbg.generated Sun Aug 06 13:05:17 CST 2017
     */
    int insert(PermissionsGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissions_group
     *
     * @mbg.generated Sun Aug 06 13:05:17 CST 2017
     */
    int insertSelective(PermissionsGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissions_group
     *
     * @mbg.generated Sun Aug 06 13:05:17 CST 2017
     */
    List<PermissionsGroup> selectByExample(PermissionsGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissions_group
     *
     * @mbg.generated Sun Aug 06 13:05:17 CST 2017
     */
    PermissionsGroup selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissions_group
     *
     * @mbg.generated Sun Aug 06 13:05:17 CST 2017
     */
    int updateByExampleSelective(@Param("record") PermissionsGroup record, @Param("example") PermissionsGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissions_group
     *
     * @mbg.generated Sun Aug 06 13:05:17 CST 2017
     */
    int updateByExample(@Param("record") PermissionsGroup record, @Param("example") PermissionsGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissions_group
     *
     * @mbg.generated Sun Aug 06 13:05:17 CST 2017
     */
    int updateByPrimaryKeySelective(PermissionsGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissions_group
     *
     * @mbg.generated Sun Aug 06 13:05:17 CST 2017
     */
    int updateByPrimaryKey(PermissionsGroup record);
}