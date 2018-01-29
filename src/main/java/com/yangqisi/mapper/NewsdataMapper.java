package com.yangqisi.mapper;

import com.yangqisi.pojo.Newsdata;
import com.yangqisi.pojo.NewsdataExample;
import com.yangqisi.pojo.NewsdataWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsdataMapper {
    int countByExample(NewsdataExample example);

    int deleteByExample(NewsdataExample example);

    int deleteByPrimaryKey(Integer dId);

    int insert(NewsdataWithBLOBs record);

    int insertSelective(NewsdataWithBLOBs record);

    List<NewsdataWithBLOBs> selectByExampleWithBLOBs(NewsdataExample example);

    List<Newsdata> selectByExample(NewsdataExample example);

    NewsdataWithBLOBs selectByPrimaryKey(Integer dId);

    int updateByExampleSelective(@Param("record") NewsdataWithBLOBs record, @Param("example") NewsdataExample example);
    int updateByExampleSelective(@Param("record") Newsdata record, @Param("example") NewsdataExample example);

    int updateByExampleWithBLOBs(@Param("record") NewsdataWithBLOBs record, @Param("example") NewsdataExample example);

    int updateByExample(@Param("record") Newsdata record, @Param("example") NewsdataExample example);

    int updateByPrimaryKeySelective(NewsdataWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(NewsdataWithBLOBs record);

    int updateByPrimaryKey(Newsdata record);
}