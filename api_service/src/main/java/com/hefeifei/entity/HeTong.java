package com.hefeifei.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class HeTong implements Serializable {
    private static final long serialVersionUID = 5672302424278391105L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String kid;
    private String hetongId;
    private BigDecimal hePrice;
    private String beizhu;
    private BigDecimal yukuan;

    public BigDecimal getYukuan() {
        return yukuan;
    }

    public void setYukuan(BigDecimal yukuan) {
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

    public BigDecimal getHePrice() {
        return hePrice;
    }

    public void setHePrice(BigDecimal hePrice) {
        this.hePrice = hePrice;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }
}
