package com.hefeifei.service;

import com.hefeifei.vo.HeTongVo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface MyService {
    Page list(HeTongVo heTongVo, Pageable pageable);
}
