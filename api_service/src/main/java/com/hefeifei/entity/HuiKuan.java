package com.hefeifei.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
@Entity
public class HuiKuan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String hetongId;
    private String huikuanId;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date huiDate;
    private BigDecimal huiprice;
    private String shouName;
    private String beizhu;
    @ManyToOne
    @JoinColumn(name = "hetongId",referencedColumnName = "hetongId",insertable = false,updatable =false )
    private HeTong heTong;

    @Override
    public String toString() {
        return "HuiKuan{" +
                "id=" + id +
                ", hetongId='" + hetongId + '\'' +
                ", huikuanId='" + huikuanId + '\'' +
                ", huiDate=" + huiDate +
                ", huiprice=" + huiprice +
                ", shouName='" + shouName + '\'' +
                ", beizhu='" + beizhu + '\'' +
                ", heTong=" + heTong +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHetongId() {
        return hetongId;
    }

    public void setHetongId(String hetongId) {
        this.hetongId = hetongId;
    }

    public String getHuikuanId() {
        return huikuanId;
    }

    public void setHuikuanId(String huikuanId) {
        this.huikuanId = huikuanId;
    }

    public Date getHuiDate() {
        return huiDate;
    }

    public void setHuiDate(Date huiDate) {
        this.huiDate = huiDate;
    }

    public BigDecimal getHuiprice() {
        return huiprice;
    }

    public void setHuiprice(BigDecimal huiprice) {
        this.huiprice = huiprice;
    }

    public String getShouName() {
        return shouName;
    }

    public void setShouName(String shouName) {
        this.shouName = shouName;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }

    public HeTong getHeTong() {
        return heTong;
    }

    public void setHeTong(HeTong heTong) {
        this.heTong = heTong;
    }
}
