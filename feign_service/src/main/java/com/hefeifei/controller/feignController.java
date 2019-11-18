package com.hefeifei.controller;

import com.hefeifei.feign.FeignDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;

@RestController
@CrossOrigin
public class feignController {
    @Autowired
    private FeignDao feignDao;
    @RequestMapping("list")
    public Page list(){
        return feignDao.list();
    }
}
