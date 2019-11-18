package com.hefeifei.controller;

import com.hefeifei.service.MyService;
import com.hefeifei.vo.HeTongVo;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MyController {
    @Autowired
    private MyService service;
    @RequestMapping("list")
    public Page list(HeTongVo heTongVo, @RequestParam(defaultValue = "1") int pageNum){
        return service.list(heTongVo, PageRequest.of(pageNum-1,3));
    }
}
