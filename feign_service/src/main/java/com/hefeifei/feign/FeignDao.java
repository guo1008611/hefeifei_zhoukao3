package com.hefeifei.feign;

import com.hefeifei.entity.HeTong;
import com.hefeifei.entity.HuiKuan;
import com.hefeifei.vo.HeTongVo;
import com.hefeifei.vo.PageVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("hetong-service")
public interface FeignDao {
    @RequestMapping("list")
    PageVo<HuiKuan> list(HeTongVo heTongVo, @RequestParam("pageNum") int pageNum);
    @RequestMapping("getHeTongList")
    List<HeTong> getHeTong();
    @RequestMapping("getHeTong")
    HeTong getHetong(@RequestParam("hetongId") String hetongId);
    @RequestMapping("add")
    HuiKuan add(@RequestBody HuiKuan huiKuan);
    @RequestMapping("dels")
    void dels(@RequestBody List<HuiKuan> ids);
    @RequestMapping("getById")
    HuiKuan getById(@RequestParam("id") int id);
}
