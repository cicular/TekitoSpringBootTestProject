package com.example.springTest.mapper;

import com.example.springTest.model.ArticlesExample;
import com.example.springTest.model.ArticlesInfo;
import com.example.springTest.model.CommentsExample;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

/*
 * 手動で作成
 */
@Mapper
public interface ArticlesMapperExtends extends ArticlesMapper{

    List<ArticlesInfo> selectByCommmentWord(CommentsExample example, RowBounds rowBounds);

    List<ArticlesInfo> selectUrls(ArticlesExample example);
}
