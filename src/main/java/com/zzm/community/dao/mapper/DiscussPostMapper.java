package com.zzm.community.dao.mapper;

import com.zzm.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    List<DiscussPost> selectDiscussPosts(int userId, int offset,int limit);

    // 用于给参数去别名，如果方法只有一个参数，并且在<if>里使用，就必须加别名
    int selectDiscussPostRows(@Param("userId")int userId);
}
