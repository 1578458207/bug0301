package com.wx.feign;

import com.wx.entity.BugDetail;
import com.wx.entity.BugProject;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient("BUGSERBICE")
public interface BugFeignClient {
    @GetMapping("getall/{id}")
    public List<BugDetail> getAll(@PathVariable("id") Integer id);
    @PostMapping("add")
    public  Integer addDetail(@RequestBody BugDetail detail);
    @GetMapping("getProjectall")
    public List<BugProject> getProJectAll();

}
