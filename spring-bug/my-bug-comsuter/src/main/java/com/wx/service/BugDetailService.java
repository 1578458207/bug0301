package com.wx.service;

import com.wx.entity.BugDetail;
import com.wx.mapper.BugDetailMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class BugDetailService {
    @Resource
    private BugDetailMapper bugDetailMapper;

    @GetMapping("getall/{id}")
    public List<BugDetail> getAll(@PathVariable("id") Integer id){
        return bugDetailMapper.getAll(id);
    }

    @PostMapping("add")
    public  Integer addDetail(@RequestBody BugDetail detail){
        return bugDetailMapper.addDetail(detail);
    }
}
