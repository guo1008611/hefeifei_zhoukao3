package com.hefeifei.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.domain.Page;

@FeignClient("hetong-service")
public interface FeignDao {

    Page list();
}
