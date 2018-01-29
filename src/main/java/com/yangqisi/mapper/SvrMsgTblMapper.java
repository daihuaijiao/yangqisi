package com.yangqisi.mapper;

import com.yangqisi.pojo.SvrMsgTbl;
import com.yangqisi.pojo.SvrMsgTblExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SvrMsgTblMapper {
    int countByExample(SvrMsgTblExample example);

    int deleteByExample(SvrMsgTblExample example);

    int insert(SvrMsgTbl record);

    int insertSelective(SvrMsgTbl record);

    List<SvrMsgTbl> selectByExample(SvrMsgTblExample example);

    int updateByExampleSelective(@Param("record") SvrMsgTbl record, @Param("example") SvrMsgTblExample example);

    int updateByExample(@Param("record") SvrMsgTbl record, @Param("example") SvrMsgTblExample example);
}