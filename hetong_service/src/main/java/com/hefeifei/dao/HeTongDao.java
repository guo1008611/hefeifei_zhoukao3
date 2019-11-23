package com.hefeifei.dao;

import com.hefeifei.entity.HeTong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface HeTongDao extends JpaRepository<HeTong,Integer>, JpaSpecificationExecutor<HeTong> {
    HeTong findByHetongId(String hetongId);
}
