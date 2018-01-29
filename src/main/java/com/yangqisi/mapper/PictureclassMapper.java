package com.yangqisi.mapper;

import com.yangqisi.pojo.Pictureclass;
import com.yangqisi.pojo.PictureclassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PictureclassMapper {
    int countByExample(PictureclassExample example);

    int deleteByExample(PictureclassExample example);

    int deleteByPrimaryKey(Integer classid);

    int insert(Pictureclass record);

    int insertSelective(Pictureclass record);

    List<Pictureclass> selectByExample(PictureclassExample example);

    Pictureclass selectByPrimaryKey(Integer classid);

    int updateByExampleSelective(@Param("record") Pictureclass record, @Param("example") PictureclassExample example);

    int updateByExample(@Param("record") Pictureclass record, @Param("example") PictureclassExample example);

    int updateByPrimaryKeySelective(Pictureclass record);

    int updateByPrimaryKey(Pictureclass record);
}