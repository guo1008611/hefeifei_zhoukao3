package com.hefeifei.dao;

import com.hefeifei.entity.HuiKuan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface HuiKuanDao extends JpaRepository<HuiKuan,Integer>, JpaSpecificationExecutor<HuiKuan> {
    List<HuiKuan> findByHetongId(String hetongId);

}
