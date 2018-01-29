package com.yangqisi.mapper;

import com.yangqisi.pojo.Newsclass;
import com.yangqisi.pojo.NewsclassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsclassMapper {
    int countByExample(NewsclassExample example);

    int deleteByExample(NewsclassExample example);

    int deleteByPrimaryKey(Integer classid);

    int insert(Newsclass record);

    int insertSelective(Newsclass record);

    List<Newsclass> selectByExample(NewsclassExample example);

    Newsclass selectByPrimaryKey(Integer classid);

    int updateByExampleSelective(@Param("record") Newsclass record, @Param("example") NewsclassExample example);

    int updateByExample(@Param("record") Newsclass record, @Param("example") NewsclassExample example);

    int updateByPrimaryKeySelective(Newsclass record);

    int updateByPrimaryKey(Newsclass record);
}