package com.fbc.framework.common.model.request;

import lombok.Data;
import lombok.ToString;

/**
 * Created by mrt on 2018/3/5.
 */
@Data
@ToString
public abstract class Pageable {

    private int pageNo;
    private int pageSize;

    public Pageable() {
        this.pageNo = 1;
        this.pageSize = 10;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
