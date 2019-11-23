package com.hefeifei.controller;

import com.hefeifei.entity.HeTong;
import com.hefeifei.entity.HuiKuan;
import com.hefeifei.feign.FeignDao;
import com.hefeifei.vo.HeTongVo;
import com.hefeifei.vo.PageVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.hibernate.type.DateType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;

@RestController
@CrossOrigin
@Api(tags = "合同操作接口")
public class feignController {
    @Autowired
    private FeignDao feignDao;
    @RequestMapping("list")
   @ApiOperation(value = "查询列表")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "body",name = "heTongVo",value = "列表查询json对象",dataType = "HeTongVo",required = true),
            @ApiImplicitParam(paramType = "query",name="pageNum",value="分页页数",dataType = "int",required = true)
    })
    public PageVo<HuiKuan> list( HeTongVo heTongVo, @RequestParam(defaultValue = "1") int pageNum){
        System.out.println(heTongVo);
        System.out.println("list");
        return feignDao.list(heTongVo, pageNum);
    }
    @RequestMapping("getHeTongList")
    public List<HeTong> getHeTongList(){
        System.out.println("hetongList");
        return feignDao.getHeTong();
    }
    @RequestMapping("getHeTong")
    public HeTong getHeTong(String hetongId){
        System.out.println("hetong");
        return feignDao.getHetong(hetongId);
    }
    @RequestMapping("add")
    public HuiKuan add(@RequestBody HuiKuan huiKuan){
        System.out.println("add");
        return feignDao.add(huiKuan);
    }
    @RequestMapping("dels")
    public void add(@RequestBody List<HuiKuan> ids){
        System.out.println("del");
        feignDao.dels(ids);
    }
    @RequestMapping("getById")
    public HuiKuan getById(int id){
        System.out.println("getById");
        return feignDao.getById(id);
    }
}
