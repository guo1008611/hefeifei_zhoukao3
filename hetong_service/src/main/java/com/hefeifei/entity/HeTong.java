package com.hefeifei.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HeTong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String kid;
    private String hetongId;
    private int hePrice;
    private String beizhu;
    private int yukuan;

    public int getYukuan() {
        return yukuan;
    }

    public void setYukuan(int yukuan) {
        this.yukuan = yukuan;
    }

    @Override
    public String toString() {
        return "HeTong{" +
                "id=" + id +
                ", kid='" + kid + '\'' +
                ", hetongId='" + hetongId + '\'' +
                ", hePrice=" + hePrice +
                ", beizhu='" + beizhu + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKid() {
        return kid;
    }

    public void setKid(String kid) {
        this.kid = kid;
    }

    public String getHetongId() {
        return hetongId;
    }

    public void setHetongId(String hetongId) {
        this.hetongId = hetongId;
    }

    public int getHePrice() {
        return hePrice;
    }

    public void setHePrice(int hePrice) {
        this.hePrice = hePrice;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }
}
