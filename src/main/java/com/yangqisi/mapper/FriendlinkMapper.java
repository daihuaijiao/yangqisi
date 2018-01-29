package com.yangqisi.mapper;

import com.yangqisi.pojo.Friendlink;
import com.yangqisi.pojo.FriendlinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FriendlinkMapper {
    int countByExample(FriendlinkExample example);

    int deleteByExample(FriendlinkExample example);

    int deleteByPrimaryKey(Integer fId);

    int insert(Friendlink record);

    int insertSelective(Friendlink record);

    List<Friendlink> selectByExample(FriendlinkExample example);

    Friendlink selectByPrimaryKey(Integer fId);

    int updateByExampleSelective(@Param("record") Friendlink record, @Param("example") FriendlinkExample example);

    int updateByExample(@Param("record") Friendlink record, @Param("example") FriendlinkExample example);

    int updateByPrimaryKeySelective(Friendlink record);

    int updateByPrimaryKey(Friendlink record);
}