package com.wx.mapper;

import com.wx.entity.BugProject;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BugProjectMapper {
    //系统
    public List<BugProject> getProJectAll();

}
