package com.hefeifei.service;

import com.hefeifei.dao.HeTongDao;
import com.hefeifei.dao.HuiKuanDao;
import com.hefeifei.entity.HeTong;
import com.hefeifei.entity.HuiKuan;
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
import java.math.BigDecimal;
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
        System.out.println(heTongVo);
        Specification spec=new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder cb) {
                List<Predicate> list=new ArrayList<>();
                //合同ID
                if(heTongVo.getHetongId()!=null&&heTongVo.getHetongId()!=""){
                    Predicate pr1 = cb.like(root.get("hetongId"), "%"+heTongVo.getHetongId()+"%");
                    list.add(pr1);
                }
                //收款人
                if(heTongVo.getShouName()!=null&&heTongVo.getShouName()!=""){
                    Predicate pr2 = cb.like(root.get("shouName"), "%"+heTongVo.getShouName()+"%");
                    list.add(pr2);
                }
                //备注
                if(heTongVo.getBeizhu()!=null&&heTongVo.getBeizhu()!=""){
                    Predicate pr3 = cb.like(root.get("beizhu"), "%"+heTongVo.getBeizhu()+"%");
                    list.add(pr3);
                }
                //开始日期
                if(heTongVo.getStartDate()!=null){
                    Predicate pr4 = cb.greaterThanOrEqualTo(root.get("huiDate"), heTongVo.getStartDate());
                    list.add(pr4);
                }
                //结束日期
                if(heTongVo.getEndDate()!=null){
                    Predicate pr5 = cb.lessThanOrEqualTo(root.get("huiDate"), heTongVo.getEndDate());
                    list.add(pr5);
                }
                //余款
                if(heTongVo.getYukuan()!=null){
                    Predicate pr7 = cb.equal(root.join("heTong").get("yukuan"), heTongVo.getYukuan());
                    list.add(pr7);
                }
                //回款
                if(heTongVo.getHuiprice()!=null){
                    Predicate pr8 = cb.equal(root.get("huiprice"), heTongVo.getHuiprice());
                    list.add(pr8);
                }
                Predicate predicate = cb.and(list.toArray(new Predicate[list.size()]));
                return predicate;
            }
        };
        return huiKuanDao.findAll(spec,pageable);
    }

    @Override
    public List<HeTong> getHeTong() {
        return heTongDao.findAll();
    }

    @Override
    public HeTong getHetong(String hetongId) {
        return heTongDao.findByHetongId(hetongId);
    }

    @Override
    public HuiKuan add(HuiKuan huiKuan) {
        String hetongId = huiKuan.getHetongId();
        List<HuiKuan> huiKuans = huiKuanDao.findByHetongId(hetongId);
        HeTong heTong =heTongDao.findByHetongId(hetongId);
        BigDecimal price=null;
       price= heTong.getHePrice().subtract(huiKuan.getHuiprice());
        if(huiKuans!=null&&huiKuans.size()>0){
            for (HuiKuan hui:huiKuans) {
                price=price.subtract(hui.getHuiprice());
            }
        }
        heTong.setYukuan(price);
        heTongDao.save(heTong);

        return huiKuanDao.save(huiKuan);
    }

    @Override
    public void dels(List<HuiKuan> ids) {

            huiKuanDao.deleteAll(ids);
    }

    @Override
    public HuiKuan getById(int id) {
        return huiKuanDao.findById(id).get();
    }
}
