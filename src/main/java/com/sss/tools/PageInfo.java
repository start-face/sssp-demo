package com.sss.tools;

import com.google.common.base.MoreObjects;

import java.util.List;

/**
 * @author FaceFeel
 * @Created 2018-05-12 22:30
 */

public class PageInfo<T> implements java.io.Serializable{

    private int pageSize;
    private int currentPage;
    private long totalCount;
    private int totalPage;
    private List<T> list;

    public PageInfo(int pageSize, int currentPage, long totalCount, int totalPage, List<T> list) {
        this.pageSize = pageSize;
        this.currentPage = currentPage;
        if (currentPage < 1){
            this.currentPage = 1;
        }
        this.totalCount = totalCount;
        this.totalPage = totalPage;
        this.list = list;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("pageSize", pageSize)
                .add("currentPage", currentPage)
                .add("totalCount", totalCount)
                .add("totalPage", totalPage)
                .add("list", list)
                .toString();
    }

    public int getPageSize() {
        return pageSize;
    }

    public PageInfo<T> setPageSize(int pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public PageInfo<T> setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
        if (currentPage == 0){
            this.currentPage = 1;
        }
        return this;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public PageInfo<T> setTotalCount(long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public PageInfo<T> setTotalPage(int totalPage) {
        this.totalPage = totalPage;
        return this;
    }

    public List<T> getList() {
        return list;
    }

    public PageInfo<T> setList(List<T> list) {
        this.list = list;
        return this;
    }
}
