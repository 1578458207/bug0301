package com.wx.controller;

import com.wx.entity.BugDetail;
import com.wx.entity.BugProject;
import com.wx.feign.BugFeignClient;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class BugController {

    @Resource
    private BugFeignClient bugFeignClient;

    @GetMapping("getProjectall")
    public List<BugProject> getProJectAll(){
        return bugFeignClient.getProJectAll();
    }

    @GetMapping("getall")
    public List<BugDetail> getAll(@RequestParam(required = false) Integer id){
        return bugFeignClient.getAll(id);
    }
    @PostMapping("add")
    public  Integer addDetail(BugDetail detail){
        return bugFeignClient.addDetail(detail);
    }
}
