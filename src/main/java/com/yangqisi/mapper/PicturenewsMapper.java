package com.yangqisi.mapper;

import com.yangqisi.pojo.Picturenews;
import com.yangqisi.pojo.PicturenewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PicturenewsMapper {
    int countByExample(PicturenewsExample example);

    int deleteByExample(PicturenewsExample example);

    int deleteByPrimaryKey(Integer aId);

    int insert(Picturenews record);

    int insertSelective(Picturenews record);

    List<Picturenews> selectByExampleWithBLOBs(PicturenewsExample example);

    List<Picturenews> selectByExample(PicturenewsExample example);

    Picturenews selectByPrimaryKey(Integer aId);

    int updateByExampleSelective(@Param("record") Picturenews record, @Param("example") PicturenewsExample example);

    int updateByExampleWithBLOBs(@Param("record") Picturenews record, @Param("example") PicturenewsExample example);

    int updateByExample(@Param("record") Picturenews record, @Param("example") PicturenewsExample example);

    int updateByPrimaryKeySelective(Picturenews record);

    int updateByPrimaryKeyWithBLOBs(Picturenews record);

    int updateByPrimaryKey(Picturenews record);
}