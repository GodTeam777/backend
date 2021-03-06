package com.zhaolian.demo.data.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Education implements Serializable {
    private BigDecimal eduserid;

    private String schoolname;

    private Date beginDate;

    private Date endDate;

    private String degree;

    private String spath;

    private BigDecimal status;

    private static final long serialVersionUID = 1L;

    public BigDecimal getEduserid() {
        return eduserid;
    }

    public void setEduserid(BigDecimal eduserid) {
        this.eduserid = eduserid;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getSpath() {
        return spath;
    }

    public void setSpath(String spath) {
        this.spath = spath;
    }

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", eduserid=").append(eduserid);
        sb.append(", schoolname=").append(schoolname);
        sb.append(", beginDate=").append(beginDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", degree=").append(degree);
        sb.append(", spath=").append(spath);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}