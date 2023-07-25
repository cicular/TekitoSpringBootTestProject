package com.example.springTest.mapper;

import com.example.springTest.model.Comments;
import com.example.springTest.model.CommentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface CommentsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.comments
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    long countByExample(CommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.comments
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    int deleteByExample(CommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.comments
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    int deleteByPrimaryKey(Long commentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.comments
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    int insert(Comments row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.comments
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    int insertSelective(Comments row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.comments
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    List<Comments> selectByExampleWithRowbounds(CommentsExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.comments
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    List<Comments> selectByExample(CommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.comments
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    Comments selectByPrimaryKey(Long commentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.comments
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    int updateByExampleSelective(@Param("row") Comments row, @Param("example") CommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.comments
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    int updateByExample(@Param("row") Comments row, @Param("example") CommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.comments
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    int updateByPrimaryKeySelective(Comments row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.comments
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    int updateByPrimaryKey(Comments row);
}