package com.hefeifei.controller;

import com.hefeifei.entity.HeTong;
import com.hefeifei.entity.HuiKuan;
import com.hefeifei.service.MyService;
import com.hefeifei.vo.HeTongVo;
import com.hefeifei.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class MyController {
    @Autowired
    private MyService service;
    @RequestMapping(value = "list",method = RequestMethod.POST)
    public PageVo<HuiKuan> list(@RequestBody HeTongVo heTongVo, @RequestParam(defaultValue = "1") int pageNum){
        Page list = service.list(heTongVo, PageRequest.of(pageNum - 1, 3));

        return new PageVo<>(list.getSize(),list.getTotalPages(),list.getContent());
    }
    @RequestMapping("getHeTongList")
    public List<HeTong> getHeTongList(){
        return service.getHeTong();
    }
    @RequestMapping("getHeTong")
    public HeTong getHeTong(String hetongId){
        return service.getHetong(hetongId);
    }
    @RequestMapping("add")
    public HuiKuan add(@RequestBody HuiKuan huiKuan){
        return service.add(huiKuan);
    }
    @RequestMapping("dels")
    public void add(@RequestBody List<HuiKuan> ids){
         service.dels(ids);
    }
    @RequestMapping("getById")
    public HuiKuan getById(int id){
        return service.getById(id);
    }
}
