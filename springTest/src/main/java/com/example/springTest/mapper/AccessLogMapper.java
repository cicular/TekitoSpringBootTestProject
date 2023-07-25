package com.example.springTest.mapper;

import com.example.springTest.model.AccessLog;
import com.example.springTest.model.AccessLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface AccessLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.access_log
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    long countByExample(AccessLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.access_log
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    int deleteByExample(AccessLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.access_log
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    int deleteByPrimaryKey(Long logId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.access_log
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    int insert(AccessLog row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.access_log
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    int insertSelective(AccessLog row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.access_log
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    List<AccessLog> selectByExampleWithRowbounds(AccessLogExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.access_log
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    List<AccessLog> selectByExample(AccessLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.access_log
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    AccessLog selectByPrimaryKey(Long logId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.access_log
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    int updateByExampleSelective(@Param("row") AccessLog row, @Param("example") AccessLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.access_log
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    int updateByExample(@Param("row") AccessLog row, @Param("example") AccessLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.access_log
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    int updateByPrimaryKeySelective(AccessLog row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.access_log
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    int updateByPrimaryKey(AccessLog row);
}