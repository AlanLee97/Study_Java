package com.shop.entity;

import java.util.List;

/**
 * PageBean用来封装分页的各个数据
 * 属性1：当前页号，不与dao交互
 * 属性2：页面大小，不与dao交互
 * 属性3：数据库中查询到的总记录数，与dao交互
 * 属性4：总页号，不与dao交互
 * 属性5：页面内容，用List封装，与dao交互
 */
public class PageBean<T> {
    private int currentPageNo;  //当前页号
    private int pageNums;   //页面数量
    private int allRecord;  //数据库中查询到的总记录数
    private int allPage;    //总页号
    private List<T> pageContent;  //页面内容

    public PageBean() {
    }

    public int getCurrentPageNo() {
        return currentPageNo;
    }

    public void setCurrentPageNo(int currentPageNo) {
        this.currentPageNo = currentPageNo;
    }

    public int getPageNums() {
        return pageNums;
    }

    public void setPageNums(int pageNums) {
        this.pageNums = pageNums;
    }

    public int getAllRecord() {
        return allRecord;
    }

    public void setAllRecord(int allRecord) {
        this.allRecord = allRecord;
    }

    public int getAllPage() {
        return allPage;
    }

    public void setAllPage(int allPage) {
        this.allPage = allPage;
    }

    public List<T> getPageContent() {
        return pageContent;
    }

    public void setPageContent(List<T> pageContent) {
        this.pageContent = pageContent;
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "currentPageNo=" + currentPageNo +
                ", pageNums=" + pageNums +
                ", allRecord=" + allRecord +
                ", allPage=" + allPage +
                ", pageContent=" + pageContent +
                '}';
    }
}
