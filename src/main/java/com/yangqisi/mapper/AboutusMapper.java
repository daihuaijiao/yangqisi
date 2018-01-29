package com.yangqisi.mapper;

import com.yangqisi.pojo.Aboutus;
import com.yangqisi.pojo.AboutusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AboutusMapper {
    int countByExample(AboutusExample example);

    int deleteByExample(AboutusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Aboutus record);

    int insertSelective(Aboutus record);

    List<Aboutus> selectByExampleWithBLOBs(AboutusExample example);

    List<Aboutus> selectByExample(AboutusExample example);

    Aboutus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Aboutus record, @Param("example") AboutusExample example);

    int updateByExampleWithBLOBs(@Param("record") Aboutus record, @Param("example") AboutusExample example);

    int updateByExample(@Param("record") Aboutus record, @Param("example") AboutusExample example);

    int updateByPrimaryKeySelective(Aboutus record);

    int updateByPrimaryKeyWithBLOBs(Aboutus record);
}