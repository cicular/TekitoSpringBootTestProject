package com.example.springTest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.springTest.model.CommentsExample;
import com.example.springTest.model.CommentsRank;

@Mapper
public interface CommentsMapperExtends extends CommentsMapper{

    List<CommentsRank> selectCommentRank(CommentsExample example);

    List<CommentsRank> selectCommentCharsRank(CommentsExample example);
}
