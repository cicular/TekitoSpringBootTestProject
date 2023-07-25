package com.example.springTest.mapper;

import com.example.springTest.model.Articles;
import com.example.springTest.model.ArticlesExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface ArticlesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.articles
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    long countByExample(ArticlesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.articles
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    int deleteByExample(ArticlesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.articles
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    int deleteByPrimaryKey(Long articleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.articles
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    int insert(Articles row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.articles
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    int insertSelective(Articles row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.articles
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    List<Articles> selectByExampleWithRowbounds(ArticlesExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.articles
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    List<Articles> selectByExample(ArticlesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.articles
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    Articles selectByPrimaryKey(Long articleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.articles
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    int updateByExampleSelective(@Param("row") Articles row, @Param("example") ArticlesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.articles
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    int updateByExample(@Param("row") Articles row, @Param("example") ArticlesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.articles
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    int updateByPrimaryKeySelective(Articles row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.articles
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    int updateByPrimaryKey(Articles row);
}