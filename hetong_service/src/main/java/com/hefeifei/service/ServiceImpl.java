package com.hefeifei.service;

import com.hefeifei.dao.HeTongDao;
import com.hefeifei.dao.HuiKuanDao;
import com.hefeifei.entity.HeTong;
import com.hefeifei.vo.HeTongVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceImpl implements MyService {
    @Autowired
    private HeTongDao heTongDao;
    @Autowired
    private HuiKuanDao huiKuanDao;

    @Override
    public Page list(HeTongVo heTongVo, Pageable pageable) {
        Specification spec=new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder cb) {
                List<Specification> list=new ArrayList<>();
                Predicate predicate = cb.and(new Predicate[list.size()]);
                return predicate;
            }
        };
        return huiKuanDao.findAll(spec,pageable);
    }
}
