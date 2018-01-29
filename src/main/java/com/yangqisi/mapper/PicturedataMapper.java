package com.yangqisi.mapper;

import com.yangqisi.pojo.Picturedata;
import com.yangqisi.pojo.PicturedataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PicturedataMapper {
    int countByExample(PicturedataExample example);

    int deleteByExample(PicturedataExample example);

    int deleteByPrimaryKey(Integer pId);

    int insert(Picturedata record);

    int insertSelective(Picturedata record);

    List<Picturedata> selectByExampleWithBLOBs(PicturedataExample example);

    List<Picturedata> selectByExample(PicturedataExample example);

    Picturedata selectByPrimaryKey(Integer pId);

    int updateByExampleSelective(@Param("record") Picturedata record, @Param("example") PicturedataExample example);

    int updateByExampleWithBLOBs(@Param("record") Picturedata record, @Param("example") PicturedataExample example);

    int updateByExample(@Param("record") Picturedata record, @Param("example") PicturedataExample example);

    int updateByPrimaryKeySelective(Picturedata record);

    int updateByPrimaryKeyWithBLOBs(Picturedata record);

    int updateByPrimaryKey(Picturedata record);
}