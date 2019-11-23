package com.hefeifei.vo;

import com.hefeifei.entity.HeTong;

import java.util.List;

public class PageVo<T> {
    private Integer pageNum;
    private Integer pages;
    private List<T> content;

    public PageVo(Integer pageNum, Integer pages, List<T> content) {
        this.pageNum = pageNum;
        this.pages = pages;
        this.content = content;
    }

    public PageVo() {
    }

    @Override
    public String toString() {
        return "PageVo{" +
                "pageNum=" + pageNum +
                ", pages=" + pages +
                ", content=" + content +
                '}';
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public List<T> getContent() {
        return content;
    }

    public void setContent(List<T> content) {
        this.content = content;
    }
}
