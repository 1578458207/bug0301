package com.wx.mapper;

import com.wx.entity.BugDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BugDetailMapper {
    public List<BugDetail> getAll(@Param("id")Integer id);

    public  Integer addDetail(BugDetail detail);

}
