package com.hefeifei.dao;

import com.hefeifei.entity.HuiKuan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface HuiKuanDao extends JpaRepository<HuiKuan,Integer>, JpaSpecificationExecutor<HuiKuan> {
}
