package com.hefeifei.service;

import com.hefeifei.entity.HeTong;
import com.hefeifei.entity.HuiKuan;
import com.hefeifei.vo.HeTongVo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MyService {
    Page list(HeTongVo heTongVo, Pageable pageable);
    List<HeTong> getHeTong();
    HeTong getHetong(String hetongId);
    HuiKuan add(HuiKuan huiKuan);
    void dels(List<HuiKuan> ids);
    HuiKuan getById(int id);
}
