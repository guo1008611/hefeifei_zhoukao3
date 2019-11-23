package com.hefeifei.vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class HeTongVo {
    private String hetongId;
    private String shouName;
    private String beizhu;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endDate;
    private Integer yukuan;
    private Integer huiprice;

    @Override
    public String toString() {
        return "HeTongVo{" +
                "hetongId='" + hetongId + '\'' +
                ", shouName='" + shouName + '\'' +
                ", beizhu='" + beizhu + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", yukuan=" + yukuan +
                ", huiprice=" + huiprice +
                '}';
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getYukuan() {
        return yukuan;
    }

    public void setYukuan(Integer yukuan) {
        this.yukuan = yukuan;
    }

    public Integer getHuiprice() {
        return huiprice;
    }

    public void setHuiprice(Integer huiprice) {
        this.huiprice = huiprice;
    }

    public String getHetongId() {
        return hetongId;
    }

    public void setHetongId(String hetongId) {
        this.hetongId = hetongId;
    }
}
