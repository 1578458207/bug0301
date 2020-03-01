package com.wx.service;

import com.wx.entity.BugProject;
import com.wx.mapper.BugProjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class BugProjectService {

    @Resource
    private BugProjectMapper bugProjectMapper;

    @GetMapping("getProjectall")
    public List<BugProject> getProJectAll(){
       return  bugProjectMapper.getProJectAll();
    }
}
